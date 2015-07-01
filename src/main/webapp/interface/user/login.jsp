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
    <title>登录接口</title>
</head>
<body>
<h3 align="center">请求参数</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>version</td>
        <td>【必填】</td>
        <td>APP版本号</td>
    </tr>
    <tr>
        <td>platform</td>
        <td>【必填】</td>
        <td>平台信息</td>
    </tr>
    <tr>
        <td>channel</td>
        <td>【必填】</td>
        <td>渠道号</td>
    </tr>
    <tr>
        <td>model</td>
        <td>【非必填】</td>
        <td>手机型号</td>
    </tr>
    <tr>
        <td>deviceid</td>
        <td>【必填】</td>
        <td>设备ID</td>
    </tr>
    <tr>
        <td>type</td>
        <td>【必填】</td>
        <td>登录类型：1-游客、2-020用户、3-qq、4-微信、5-新浪</td>
    </tr>
</table>
<br>

<h3 align="center">返回示例</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>示例</td>
        <td>
            <pre>
    {
    "message": "操作成功",
    "code": 0,
    "data": {
        "address": "北京市立水桥",
        "location": "39.112,119.40",
        "id": "1234",
        "level": 2,
        "username": "陈海峰是演员",
        "token": "1412868903771",
        "phone": "123456789",
        "sex": null,
        "scores": 100,
        "logo": null,
        "ota": null
        }
    }
            </pre>
        </td>
    </tr>
</table>
<br>

<h3 align="center">返回参数说明</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>address</td>
        <td>用户注册的地址</td>
    </tr>
    <tr>
        <td>location</td>
        <td>用户注册的地理位置</td>
    </tr>
    <tr>
        <td>id</td>
        <td>用户ID</td>
    </tr>
    <tr>
        <td>level</td>
        <td>用户等级</td>
    </tr>
    <tr>
        <td>username</td>
        <td>用户名</td>
    </tr>
    <tr>
        <td>token</td>
        <td>token信息</td>
    </tr>
    <tr>
        <td>phone</td>
        <td>用户手机号</td>
    </tr>
    <tr>
        <td>sex</td>
        <td>性别</td>
    </tr>
    <tr>
        <td>scores</td>
        <td>用户积分</td>
    </tr>
    <tr>
        <td>logo</td>
        <td>用户头像</td>
    </tr>
    <tr>
        <td>ota</td>
        <td>推送相关信息、接入后有用</td>
    </tr>
</table>
</body>
</html>
