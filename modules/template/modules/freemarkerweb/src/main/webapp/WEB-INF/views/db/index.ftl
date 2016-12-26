<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <link rel="stylesheet" type="text/css" href="/static/thirdpart/jquery-easyui/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="/static/thirdpart/jquery-easyui/themes/icon.css" />

    <script type="text/javascript" src="/static/js/jquery-1.8.0.js"></script>
    <script type="text/javascript" src="/static/js/jquery.form.js"></script>
    <script type="text/javascript" src="/static/js/jquery.cookie.min.js"></script>
    <script type="text/javascript" src="/static/js/base/date-util.js"></script>
    <script type="text/javascript" src="/static/js/base/string-util.js"></script>
    <script type="text/javascript" src="/static/js/base/popups-util.js"></script>

    <script type="text/javascript" src="/static/thirdpart/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/static/thirdpart/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/static/js/index.js"></script>

    <style type="text/css">
        div#main{ position: absolute;}
        div#head{ height: 60px;background-color:#02AADB;}
        .logo{padding-left:15px;}
        .logo h2{color:#FFF;}
        #menu{width:180px;}
    </style>
</head>
<body>
<div id="main" fit="true" class="easyui-layout">
    <div id="head" data-options="region:'north'">
        <div class="logo" ><h2>DB管理后台</h2></div>

    </div>
    <div id="menu" data-options="region:'west',title:'菜单',split:true">
        <ul id="menuTree"></ul>
    </div>
    <div id="panel" data-options="region:'center'">
        <div id="tabs" class="easyui-tabs" fit="true">
        </div>
    </div>
</div>
</body>
</html>
