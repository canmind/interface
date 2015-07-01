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
    <title>获取好应用推荐接口</title>
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
code: 0,
data: [
{
clkurl: "https://itunes.apple.com/cn/app/tao-bao-taobao-for-iphone/id387682726?mt=8",
date: "2014年09月16日",
desc: "手机淘宝（iPhone版）是阿里巴巴专为iPhone手机用户推出的满足其生活消费和线上购物需求的软件，具有查看附近的生活优惠信息、商品搜索、浏览、购买、支付、收藏、物流查询、旺旺沟通等在线功能，成为了用户方便快捷的生活消费入口。",
icon: "http://a5.mzstatic.com/us/r30/Purple3/v4/8c/f0/e5/8cf0e533-e6d8-545e-7e31-bfa7b3d26f68/mzl.sdnpemnu.350x350-75.jpg",
id: 1,
name: "淘宝 - Taobao for iPhone 随时随地，想淘就淘",
platform: "",
size: "39.3 MB",
total: 1000,
url: "https://itunes.apple.com/cn/app/tao-bao-taobao-for-iphone/id387682726?mt=8",
version: "4.8.1"
},
{
clkurl: "https://itunes.apple.com/cn/app/jing-dong/id414245413?mt=8",
date: "2014年08月29日",
desc: "京东是中国最大的综合网购平台，正品行货、机打发票、售后上门取件、省钱又放心，商品品类覆盖家电、数码通讯、电脑、家居百货、服装服饰、母婴、图书、食品等12大类数万个品牌百万种优质商品，是网购用户的首选平台。",
icon: "http://a5.mzstatic.com/us/r30/Purple3/v4/8c/f0/e5/8cf0e533-e6d8-545e-7e31-bfa7b3d26f68/mzl.sdnpemnu.350x350-75.jpg",
id: 2,
name: "京东",
platform: "",
size: "29.0 MB",
total: 1010,
url: "https://itunes.apple.com/cn/app/jing-dong/id414245413?mt=8",
version: "3.8.0"
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
        <td>clkurl</td>
        <td>点击下载地址</td>
    </tr>
    <tr>
        <td>date</td>
        <td>发布日期</td>
    </tr>
    <tr>
        <td>desc</td>
        <td>描述</td>
    </tr>
    <tr>
        <td>icon</td>
        <td>图标</td>
    </tr>
      <tr>
        <td>id</td>
        <td>主键</td>
    </tr>
     <tr>
        <td>name</td>
        <td>名称</td>
    </tr>
    <tr>
        <td>size</td>
        <td>大小</td>
    </tr>
     <tr>
        <td>total</td>
        <td>下载量</td>
    </tr>
     <tr>
        <td>version</td>
        <td>版本号</td>
    </tr>
</table>
</body>
</html>
