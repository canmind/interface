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
    <title>获取搜索分类接口</title>
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
code: 0,
data: [
{
id: 1,
name: "二手手机",
sort: 1,
suntype: [
{
id: 11,
name: "苹果",
sort: 1,
suntype: null,
tagname: "iphone"
},
{
id: 12,
name: "三星",
sort: 2,
suntype: null,
tagname: "s4"
},
{
id: 13,
name: "诺基亚",
sort: 2,
suntype: null,
tagname: "1110"
}
],
tagname: "手机号码"
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
<table align="center" border="1" cellpadding="5px" width="40%">
    <tr>
        <td>id</td>
        <td>主键</td>
    </tr>
    <tr>
        <td>name</td>
        <td>名称</td>
    </tr>
       <tr>
        <td>sort</td>
        <td>排序</td>
    </tr>
      <tr>
        <td>tagname</td>
        <td>显示名称</td>
    </tr>
     <tr>
        <td>suntype</td>
        <td>子类型 可以NULL</td>
    </tr>
    
</table>
</body>
</html>
