<%--
  Created by IntelliJ IDEA.
  User: mabowen
  Date: 14-10-9
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品上传接口</title>
</head>
<body>
<h3 align="center">请求参数</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>token</td>
        <td>【必填】</td>
        <td>token</td>
    </tr>
   <tr>
        <td>title</td>
        <td>【必填】</td>
        <td>标题</td>
    </tr>
    <tr>
        <td>desc</td>
        <td>【必填】</td>
        <td>描述</td>
    </tr>
    <tr>
        <td>location</td>
        <td>【必填】</td>
        <td>位置</td>
    </tr>
    <tr>
        <td>file 多个</td>
        <td>【必填】</td>
        <td>图片</td>
    </tr>
     <tr>
        <td>price</td>
        <td>【必填】</td>
        <td>价格</td>
    </tr>
</table>
<br>

<h3 align="center">返回示例</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>示例</td>
        <td>
            <pre>
  {"message":"操作成功","data":null,"code":0}
            </pre>
        </td>
    </tr>
</table>
<br>

<h3 align="center">返回参数说明</h3>
<table align="center" border="1" cellpadding="5px">

</table>
</body>
</html>
