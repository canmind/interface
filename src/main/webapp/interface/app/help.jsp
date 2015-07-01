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
        <td>location</td>
        <td>【非必填】</td>
        <td>不传时默认按通用下发</td>
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
code: 0,
data: [
{
answer: [
{
content: "用支付宝支付，可选择绑定支付宝账户以便支付更便利。",
sort: 1
},
{
content: "用银行卡支付，需要开通网银。",
sort: 2
}
],
ask: "支持哪些支付方式？",
sort: 1
}
],
message: "操作成功"
}
            </pre>
        </td>
    </tr>
</table>
<br>

<h3 align="center">返回参数说明</h3>
<table align="center" border="1" cellpadding="5px">
    <tr>
        <td>ask</td>
        <td>问</td>
    </tr>
    <tr>
        <td>sort</td>
        <td>序号</td>
    </tr>
    <tr>
        <td>answer 集合</td>
        <td>回答</td>
    </tr>
    <tr>
        <td>content</td>
        <td>回答内容</td>
    </tr>
</table>
</body>
</html>
