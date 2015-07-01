<%@ page language="java" import="java.util.*" pageEncoding="utf-8" session="false"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta charset="utf-8">  
<title>上传图片</title>  
</head>  
<body>  
<form action="<%=request.getContextPath()%>/user/upload.json" method="post" enctype="multipart/form-data">  
<input type="file" name="file" /> 
<input type="file" name="file" />
<input type="file" name="file" />
<input type="submit" value="Submit" /></form>  
</body>  
</html>