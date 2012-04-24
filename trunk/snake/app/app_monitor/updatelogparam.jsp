<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page language="java" contentType="text/html; charset=GB18030"
	session="false"%>
<%@page import="net.snake.GameServer"%>
<%@page import="net.snake.serverenv.security.SecurityManage"%>
<%@page import="net.snake.commons.httplog.HttpInteriorLogService" %>
<%@page import="net.snake.log.HttpLogService" %>

<%
	GameServer gameserver = (GameServer) application
			.getAttribute("GameServer");
	SecurityManage sm = gameserver.securityManage;
	if (sm == null) {
		response.getWriter().println("������δ��ȫ��ʼ��");
		return;
	}
	String address = request.getRemoteAddr();
	if (address==null||address.equals("")||!sm.checkManageIP(address)) {
		response.setStatus(404,"�Ƿ�����");
		return;
	}
	HttpInteriorLogService.getInstance().reloadInstance();
	HttpLogService.getInstance().reloadInstance();
	
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<meta http-equiv=refresh content="5">
<title>��Ϸ������ʵʱ���</title>
</head>
<body>
<p><a href="serverstatus.jsp">���ܼ��</a>&nbsp;<a
	href="scenestatus.jsp">����״̬���</a>&nbsp;<a
	href="processstatus.jsp">PROCESS״̬���</a>&nbsp;
	<a href="interiorlogstatus.jsp">��־���</a>
	</p>
	


<br/>

</body>
</html>