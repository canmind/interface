<%--
  Created by IntelliJ IDEA.
  User: mabowen
  Date: 14-10-9
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜索结果接口</title>
</head>
<body>
<h3 align="center">请求参数</h3>
<table align="center" border="1" width="40%">
    <tr>
        <td>token</td>
        <td>【必填】</td>
        <td>客户端登录接口时下发的token</td>
    </tr>
    <tr>
        <td>type</td>
        <td>【必填】</td>
        <td>搜索类型：0---正常全量搜索，1---按地区搜索，2---按类别搜索</td>
    </tr>
    <tr>
        <td>key</td>
        <td>【必填】</td>
        <td>搜索关键词</td>
    </tr>
</table>
<br>

<h3 align="center">返回示例</h3>
<table align="center" border="1" cellpadding="5px" width="40%">
    <tr>
        <td>示例</td>
        <td>
            <pre>
    {

    "message": "操作成功",
    "code": 0,
    "data": [
        {
            "location": "39.112,113.40",
            "id": "0",
            "title": "折扣iphone6",
            "images": [
                "www.sina.com",
                "www.sina.com",
                "www.sina.com",
                "www.sina.com",
                "www.sina.com"
            ],
            "user": {
                "address": "北京市立水桥",
                "location": "39.112,119.40",
                "id": "1234",
                "level": 2,
                "phone": "123456789",
                "sex": null,
                "scores": 100,
                "logo": null,
                "ota": null,
                "username": "陈海峰是演员",
                "token": "1412958105994"
            },
            "hot": 0,
            "price": 208,
            "desc": "iphone6是很好的"
        },
            </pre>
        </td>
    </tr>
</table>


<h3 align="center">返回参数说明</h3>
</body>
</html>
