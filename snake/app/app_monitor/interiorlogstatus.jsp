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
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<meta http-equiv=refresh content="5">
<title>��Ϸ������ʵʱ���</title>
</head>
<body>
<p><a href="serverstatus.jsp">���ܼ��</a>&nbsp;<a
	href="scenestatus.jsp">����״̬���</a>&nbsp;<a
	href="processstatus.jsp">PROCESS״̬���</a></p>
	
<table width="60%" border="1" style="border-collapse: collapse">
	<tr>
		<td>������ID</td>
		<td>�ڲ���־�����߳������</td>
		<td>�ڲ���־�����̵߳�ǰʹ����</td>
		<td>�ڲ���־����״̬</td>
		<td>�ڲ���־�����ַ</td>
		<td>�ⲿ��־�����߳������</td>
		<td>�ⲿ��־�����̵߳�ǰʹ����</td>
		<td>�ⲿ��־����״̬</td>
		<td>�ⲿ��־�����ַ</td>
	</tr>
	<tr>
		<td><%=gameserver.sid%></td>
		<td><%=HttpInteriorLogService.getInstance().getHttplogthread().getThreadsize()%></td>
		<td><%=HttpInteriorLogService.getInstance().getHttplogthread().getRunstatusthread()%></td>
		<td><%=HttpInteriorLogService.getInstance().isInteriorhttplog() == true ? "��" : "��" %></td>
		<td><%=HttpInteriorLogService.getInstance().getInteriorLogaddress() %></td>
		<td><%=HttpLogService.getInstance().getHttplogthread().getThreadsize()%></td>
		<td><%=HttpLogService.getInstance().getHttplogthread().getRunstatusthread()%></td>
		<td><%=HttpLogService.getInstance().isIsopen() == true ? "��" : "��" %></td>
		<td><%=HttpLogService.getInstance().getAddress() %></td>
	</tr>
</table>
<a href="updatelogparam.jsp">������־����</a>
<br/>

</body>
</html>