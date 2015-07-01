<%--
  Created by IntelliJ IDEA.
  User: mabowen
  Date: 14-10-9
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接口文档</title>
</head>
<body>
<h3 align="center">020接口示例API说明</h3>
<table align="center" border="1" cellpadding="5px">

    <%-- 读取类型接口开始--%>
    <tr>
        <td rowspan="9" align="center">读取类型接口</td>

        <td><a href="../interface/app/update.jsp">/app/update.json</a></td>
        <td>获取升级信息接口</td>
    </tr>

    <tr>
        <td><a href="../interface/app/recommend.jsp">/app/apps.json</a></td>
        <td>获取好应用推荐接口</td>
    </tr>
    <tr>
        <td><a href="../interface/app/help.jsp">/app/help.json</a></td>
        <td>获取设置页面帮助信息接口</td>
    </tr>
    <tr>
        <td><a href="../interface/user/login.jsp">/user/login.json</a></td>
        <td>登录接口</td>
    </tr>
     <tr>
        <td><a href="../interface/user/logout.jsp">/user/logout.json</a></td>
        <td>退出接口</td>
    </tr>
    <tr>
        <td><a href="../interface/user/register.jsp">/user/register.json</a></td>
        <td>注册接口</td>
    </tr>
    <tr>
        <td><a href="../interface/search/tag.jsp">/search/tag.json</a></td>
        <td>搜索热词接口</td>
    </tr>
     <tr>
        <td><a href="../interface/search/type.jsp">/search/type.json</a></td>
        <td>搜索热词接口</td>
    </tr>
    <tr>
        <td><a href="../interface/search/result.jsp">/search/search.json</a></td>
        <td>搜索结果接口</td>
    </tr>

    <%-- 提交类型接口开始--%>
    <tr>
        <td rowspan="2" align="center">提交类型接口</td>
		<td><a href="../interface/app/feedback.jsp">/app/feedback.json</a></td>
		  <td>提交用户反馈接口</td>
		</tr>
    <tr>
      
        <td><a href="../interface/user/upload.jsp">/user/upload.json</a></td>
         <td>商品信息上传接口</td>
    </tr>
</table>
</body>
</html>
