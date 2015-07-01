<%--
  Created by IntelliJ IDEA.
  User: mabowen
  Date: 14-10-9
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交用户反馈接口</title>
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
        <td>suggest</td>
        <td>【必填】</td>
        <td>建议正文信息</td>
    </tr>
    <tr>
        <td>contact</td>
        <td>【非必填】</td>
        <td>联系方式</td>
    </tr>
</table>

<h3 align="center">返回示例</h3>
<table align="center" border="1" cellpadding="5px" width="40%">
    <tr>
        <td>示例</td>
        <td>
            <pre>
                {
                    "message": "操作成功",
                    "code": 0,
                    "data": null
                }
            </pre>
        </td>
    </tr>
</table>


<h3 align="center">返回参数说明</h3>

</body>
</html>
