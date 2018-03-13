<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆成功</title>
</head>
<body>
    <table>
        <tr><td>您的用户名为：</td><td><s:property value="user.userName"/></td></tr>
         <tr><td>您的密码为：</td><td><s:property value="user.password"/></td></tr>
    </table>
</body>
</html>