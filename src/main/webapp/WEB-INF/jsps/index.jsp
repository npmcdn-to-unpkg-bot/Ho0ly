<%@ taglib prefix="v-on" uri="http://www.springframework.org/tags/form" %>
<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>-->
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>主页</title>
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript" src="https://unpkg.com/vue/dist/vue.js"></script>

</head>
<body>
<div id="example">
    <button v-on:v-on:click="greet">Greet</button>
</div>
<script>
    aew =Vue({
        el: '#example',
        methods:{
            greet: function (event) {
                // 方法内 `this` 指向 vm
                alert('Hello ' + this.name + '!')
                // `event` 是原生 DOM 事件
                alert(event.target.tagName)
                $.ajax({ url: "/oauth/token?client_id=mobile_1&client_secret=secret_1&grant_type=password&username=admin&password=123456", success: function(data){
                    alert(JSON.stringify(data));
                }});
            }
        }
    })
</script>


</body>
</html>