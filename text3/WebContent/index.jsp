
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-2.2.4.min.js"></script>
<style type="text/css">
	*{
		margin: 0px;
		padding: 0px;
	}
	body{
		height: 100000px;
	}
	.ziduan{
		display: inline-block;
		width: 60%;
	}
	.tu{
		display: inline-block;	
	}
	.min{
		display:inline-block;
		width: 400px;
		margin: auto;
		cursor: auto;
	}
	
	.b{
		display: block;
	    width: 60%;
	    position: absolute;
	    top: 13%;
	    bottom: 10%;
	    left: 20%;
	}
	
</style>
<script type="text/javascript">
	$(function(){
		$("#a").click(function(){
			$(this).toggleClass('min');
			$(this).toggleClass('max');
		})
	})
	
</script>
</head>
<body>
	<div class="ziduan">
		<p>的路口附近的萨拉解放路开始的家乐福科技施蒂利克甲方离开家斯大林开房记录是的复健科拉三等奖六块腹肌看来是大家阿里客服经理开始fd
		速度快放假了快速记录肯德基发家史来看待甲方卡拉数据来访记录卡时间段分离式的副科级三打两建付款时间的分类大甲方离开家收到了咖啡机史
		就流口水的副经理开始大家来看飞机就三大件付款了就是垃圾地方科技萨德里克甲方离开家斯大林咖啡机是打开连接附件三点六块腹肌了解到萨里</p>
	</div>
	<div class="tu">
		<img id="a" class="min" src="img/a.jpg" >
	</div>
	<img class="b" src="img/a.jpg">
	
	
</body>
</html>