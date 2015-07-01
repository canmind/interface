<%--
  Created by IntelliJ IDEA.
  User: mabowen
  Date: 14-10-10
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>获取搜索热词接口</title>
</head>
<body>
<h3 align="center">请求参数</h3>
<table align="center" border="1" cellpadding="5px" width="40%">
    <tr>
        <td>token</td>
        <td>【必填】</td>
        <td>客户端登录接口时下发的token</td>
    </tr>
    <tr>
        <td>location</td>
        <td>【非必填】</td>
        <td>不传时默认按通用下发</td>
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
            "hot": 1008,
            "tag": "演员"
        }
        ]
    }
            </pre>
        </td>
    </tr>
</table>
<br>


<h3 align="center">返回参数说明</h3>
<table align="center" border="1" cellpadding="5px" width="40%">
    <tr>
        <td>hot</td>
        <td>标签热度值</td>
    </tr>
    <tr>
        <td>tag</td>
        <td>标签信息</td>
    </tr>
</table>
</body>
</html>
