<%--
  Created by IntelliJ IDEA.
  User: chenu
  Date: 2016/7/5
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>login</title>
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css">
    <script type="text/javascript" src="http://apps.bdimg.com/libs/vue/1.0.14/vue.js"></script>
    <script src="//cdn.bootcss.com/vue-resource/0.9.3/vue-resource.js"></script>
</head>
<body>
<div class="container-fluid" id="total">
    <div class="row-fluid">
        <div class="span12" v-if="location==1">
        <form class="form-horizontal" method="post" action="/login">
            <div class="control-group">
                <label class="control-label" for="inputUsername">用户名</label>
                <div class="controls">
                    <input id="inputUsername" type="text" name="username"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">密码</label>
                <div class="controls">
                    <input id="inputPassword" type="password" name="password"/>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">
                    <br> <button type="submit" class="btn btn-primary">登录</button>
                    <a class="btn btn-success" href="/user/register">注册</a>
                </div>
            </div>
        </form>
    </div>
    </div>
</div>
<script type="text/javascript">

    vm1 = new Vue({
        el: '#total',
        data: {
            location:1,
        }
    });
</script>
</body>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</html>
