package com.ground.entity.callback;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.ground.core.callback.IPreparedStatementSetter;
import org.apache.log4j.Logger;


public class EntitySpecFieldStatmentSetterImpl<T> implements IPreparedStatementSetter {

	private static Logger m_logger = Logger.getLogger(EntitySpecFieldStatmentSetterImpl.class);
	
	private T entity;
	
	private List<Field> fields;
	
	public EntitySpecFieldStatmentSetterImpl(T entity)
	{
		this.entity=entity;
	}
	public EntitySpecFieldStatmentSetterImpl(T entity,List<Field> fields)
	{
		this(entity);
		this.fields=fields;
	}
	
	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	@Override
	public void setValues(PreparedStatement ps)
			throws SQLException {
		try{
			int index=1;
			for(Field field:fields)
			{
		        Class<?> returnClass =(Class<?>)field.getGenericType();
				field.setAccessible(true);
			    Object value = field.get(entity);
                if (m_logger.isDebugEnabled()) {
                    m_logger.debug("field " + field.getName() + "'value is: " + value);
                }
			    SetterUtil.invokeSet(ps,returnClass,value,index);
				index++;
			}
		}catch(Exception e)
		{
			m_logger.error(e.getMessage());
			e.printStackTrace(System.out);
		}
	}

}
