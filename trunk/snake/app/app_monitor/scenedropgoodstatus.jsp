<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="net.snake.bean.monster.SceneMonster"%>
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
<%@page import="net.snake.bean.SceneManager"%>
<%@page import="net.snake.bean.monsterlostgoods.SceneDropGood"%>
<%@page import="net.snake.bean.characterinstance.InstanceController"%>



<%
	GameServer gameserver = (GameServer) application
			.getAttribute("GameServer");
	Collection<VLineServer> lines = GameServer.vlineServerManager
	.getLineServersList();
	int cntObject = 0;
		for (VLineServer line : lines) 
		{
			SceneManager sm = line.getSceneManager();
			
			Collection<Scene> worldSceneCol = sm.getWorldSceneList();
			
			for(Scene scene: worldSceneCol) {
				Collection<SceneDropGood> monsterCol =  scene.getSceneObjByClass(SceneDropGood.class);
				for(SceneDropGood good:monsterCol) {
					try{
						cntObject = cntObject + good.getAllObjInHeap();
					} catch(Exception e){
						e.printStackTrace();
					}
				}
			} 
			
			Collection<InstanceController> instanceControllerSceneCol = line.getRuningInstanceManager().getInstanceCollection();
			for(InstanceController ic: instanceControllerSceneCol) {
				Collection<Scene> scenes = ic.getSceneCollection();
				for(Scene scene: scenes) {
					Collection<SceneDropGood> monsterCol =  scene.getSceneObjByClass(SceneDropGood.class);
					for(SceneDropGood good:monsterCol) {
						try{
							cntObject = cntObject + good.getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
					}
				} 
			}
			
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
	<a href="characterstatus.jsp">��ɫ״̬���</a>
	<a href="monsterstatus.jsp">����״̬���</a>
	<a href="scenedropgoodstatus.jsp">������Ʒ״̬���</a>
<table width="60%" border="1" style="border-collapse: collapse">
	<tr>
		<td>������Ʒ���ж�������</td>
	</tr>
	<tr>
		<td><%=cntObject%></td>
	</tr>
</table>
<br/>
</body>
</html>