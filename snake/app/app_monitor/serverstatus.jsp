<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="net.snake.bean.character.Character"%>
<%@page import="java.util.Collection"%>
<html>
<%@ page language="java" contentType="text/html; charset=GB18030"
	session="false"%>
	<%@page import="java.util.Iterator"%>
<%@page import="java.util.Comparator"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="net.snake.bean.scenes.Scene"%>
<%@page import="net.snake.serverenv.vline.VLineServer"%>
<%@page import="net.snake.GameServer"%>
<%@page import="net.snake.serverenv.security.SecurityManage"%>

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

	int totalCharacter = gameserver.vlineServerManager.getOnlineCount();
	int characterInScene = 0;

	int horseInScene = 0;
	for (VLineServer vlineserver : gameserver.vlineServerManager
			.getLineServersList()) {
		characterInScene += vlineserver.getSceneManager()
				.getCharacterCount();
		horseInScene += vlineserver.getSceneManager()
				.getShowHorseCount();
	}
	int instanceCount=gameserver.vlineServerManager.getAllInstanceCount();
	int instanceCharactersCount=gameserver.vlineServerManager.getAllInstanceCharacterCount();
	int instanceDownLineCharactersCount=gameserver.vlineServerManager.getAllInstanceDownLineCharacterCount();
%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<meta http-equiv=refresh content="5">
<title>��Ϸ������ʵʱ���</title>
</head>
<body>
<p><a href="serverstatus.jsp">���ܼ��</a>&nbsp;<a
	href="scenestatus.jsp">����״̬���</a>&nbsp;<a
	href="processstatus.jsp">PROCESS״̬���</a>
	<a href="characterstatus.jsp">��ɫ״̬���</a>
	<a href="monsterstatus.jsp">����״̬���</a>
	<a href="monsterstatus.jsp">������Ʒ״̬���</a>
	</p>
	
<table width="60%" border="1" style="border-collapse: collapse">
	<tr>
		<td>������ID</td>
		<td>���������߳���</td>
		<td>�ܽ�ɫ��</td>
		<td>���糡���еĽ�ɫ��</td>
		<td>�л����������������еĽ�ɫ��</td>
		<td>��ս�е�������</td>
		<td>��������</td>
		<td>�����е��ܽ�ɫ��</td>
		<td>�����е��ܵ��߽�ɫ��</td>
	</tr>
	<tr>
		<td><%=gameserver.sid%></td>
		<td><%=gameserver.concurrentMsgProcessorcount.intValue()%></td>
		<td><%=totalCharacter%></td>
		<td><%=characterInScene%></td>
		<td><%=totalCharacter - characterInScene-instanceCharactersCount%>
		<td><%=horseInScene%></td>
		<td><%=instanceCount%>
		<td><%=instanceCharactersCount%></td>
		<td><%=instanceDownLineCharactersCount%></td>
	</tr>
</table>
<br/>
<table width="60%" border="1" style="border-collapse: collapse">
	<tr>
		<td>����ID</td>
		<td>֡��</td>
		<td>���߽�ɫ��</td>
		<td>��ս������</td>
		<td>������</td>
	    <td>��������</td>
		<td>�����еĽ�ɫ��</td>
		<td>�����е��ߵĽ�ɫ��</td>
	</tr>
	<%
		ArrayList<VLineServer> vlineserverlist = new ArrayList<VLineServer>(
				gameserver.vlineServerManager.getLineServersList());
		Collections.sort(vlineserverlist, new Comparator<VLineServer>() {
			public int compare(VLineServer o1, VLineServer o2) {
				return o1.getLineid() < o2.getLineid() ? -1 : (o1
						.getLineid() == o2.getLineid() ? 0 : 1);
			}
		});
		for (VLineServer vlineserver : vlineserverlist) {
	%>
	<tr>
		<td><%=vlineserver.getLinename()%>[<%=vlineserver.getLineid()%>][�˿�:<%=gameserver.serverentry.getLoginserverport()%>]</td>
		<td><%=vlineserver.getFrameRate()%></td>
		<td><%=vlineserver.getOnlineManager().getplayercount()%></td>
		<td><%=vlineserver.getSceneManager().getShowHorseCount()%></td>
		<td><%=vlineserver.getSceneManager().getMonsterCount()%></td>
		<td><%=vlineserver.getRuningInstanceManager().getInstanceCollection().size()%></td>
		<td><%=vlineserver.getRuningInstanceManager().getOnlineCount()%></td>
		<td><%=vlineserver.getRuningInstanceManager().getInstanceDownLineRoleCount()%></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>