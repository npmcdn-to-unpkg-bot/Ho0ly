<%--
  Created by IntelliJ IDEA.
  User: chenu
  Date: 2016/7/6
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>用户主页</title>
    <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.css">
    <script type="text/javascript" src="http://apps.bdimg.com/libs/vue/1.0.14/vue.js"></script>
    <script src="//cdn.bootcss.com/vue-resource/0.9.3/vue-resource.js"></script>
</head>
<body>

<div class="container" id="total">
    <div class="row">
        <div class="col-md-12">
            <ul id="myTab" class="nav nav-tabs" role="tablist">
                <li class="active" v-on:click="display" ><a href="#forum" role="tab" data-toggle="tab">查看信息</a></li>

                <li v-on:click="change"><a href="#rule" role="tab" data-toggle="tab"> 修改信息</a></li>

                <li class="dropdown pull-right">
                    <a href="#" data-toggle="dropdown" class="dropdown-toggle">${user.uname}<strong class="caret"></strong></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="/logout">注销</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div id="blank" class="row clearfix">

    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12" v-if="location==1">
                <ol>
                    <li>
                        ${user.uid}
                    </li>
                    <li>
                        ${user.uname}
                    </li>
                    <li>
                        ${user.password}
                    </li>
                    <li>
                        ${user.email}
                    </li>
                    <li>
                        ${user.groupId}
                    </li>
                </ol>
            </div>
            <div class="span12" v-if="location==2">
                <form class="form-horizontal" method="post" action="/user/updateMyself">
                    <div class="control-group">
                        <label class="control-label" for="inputUserName">用户名</label>
                        <div class="controls">
                            <input id="inputUserName" type="text" value="${user.uname}" name="uname"/>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputEmail">邮箱</label>
                        <div class="controls">
                            <input id="inputEmail" type="text" value="${user.email}" name="email"/>
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputPassword">密码</label>
                        <div class="controls">
                            <input id="inputPassword" type="password" value="${user.password}" name="password"/>
                        </div>
                    </div>
                    <div class="control-group">
                        <div class="controls">
                            <br>
                            <label></label> <button type="submit" v-on:click="submit"  class="btn btn-primary">提交</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>




</div>
<script type="text/javascript">

    vm1 = new Vue({
        el: '#total',
        data: {
            location:1,
            mySelf:''

        },
//        ready:function () {
//            this.$http.get('/user/getMyInfo',function (data) {
//                alert(JSON.stringify(data));
//                this.$set('mySelf',data);
//            });
//        },
        methods: {
            change:function (item) {
                this.location=2;
            },
            display:function () {
                this.location=1;
            }
        }
    });
</script>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</body>
</html>
