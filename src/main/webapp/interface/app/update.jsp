<%--
  Created by IntelliJ IDEA.
  User: mabowen
  Date: 14-10-9
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>升级接口</title>
</head>
<body>
<h3 align="center">请求参数</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>token</td>
        <td>【必填】</td>
        <td>客户端登录接口时下发的token</td>
    </tr>
    <tr>
        <td>version</td>
        <td>【必填】</td>
        <td>app版本号</td>
    </tr>
    <tr>
        <td>platform</td>
        <td>【必填】</td>
        <td>平台</td>
    </tr>
    <tr>
        <td>channel</td>
        <td>【必填】</td>
        <td>渠道号</td>
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
        "force": 1,
        "effective": false,
        "url": "www.baidu.com"
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
        <td>effective</td>
        <td>true时为升级信息有效，false时无效</td>
    </tr>
    <tr>
        <td>force</td>
        <td>0时为非强制升级，1时为强制升级</td>
    </tr>
    <tr>
        <td>url</td>
        <td>apk的更新包下载地址</td>
    </tr>
</table>
</body>
</html>
