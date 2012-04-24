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
<%@page import="net.snake.bean.characterinstance.InstanceController"%>

<%
	GameServer gameserver = (GameServer) application
			.getAttribute("GameServer");
	Collection<VLineServer> lines = GameServer.vlineServerManager
	.getLineServersList();
	int cntPursuit = 0;
	int cntwhocatchme = 0;
	int cntdropGoods = 0;
	int cntbuff = 0;
	int cntEnmity = 0;
		for (VLineServer line : lines) 
		{
			SceneManager sm = line.getSceneManager();
			
			Collection<Scene> worldSceneCol = sm.getWorldSceneList();
			
			for(Scene scene: worldSceneCol) {
				Collection<SceneMonster> monsterCol =  scene.getSceneObjByClass(SceneMonster.class);
				for(SceneMonster smonter:monsterCol) {
					try{
					cntPursuit = cntPursuit + smonter.getPursuitPointManager().getArroundWithMeInFightMonsterPositions().size();
					} catch(Exception e){
						e.printStackTrace();
					}
					try{
					cntwhocatchme = cntwhocatchme + (smonter.getWhoCatchMeManager() != null ? smonter.getWhoCatchMeManager().getCharactersList().size() : 0);
					} catch(Exception e){
						e.printStackTrace();
					}
					try{
					cntdropGoods = cntdropGoods + (smonter.getDropGoodManager().getCharacter() != null ? 1: 0);
					} catch(Exception e){
						e.printStackTrace();
					}
					try{
					cntbuff = cntbuff + smonter.getEffectController().getBuffList().size();
					} catch(Exception e){
						e.printStackTrace();
					}
					try{
					cntEnmity = cntEnmity + smonter.getEnmityManager().getAllObjInHeap();
					} catch(Exception e){
						e.printStackTrace();
					}
				}
			} 
			
			Collection<InstanceController> instanceControllerSceneCol = line.getRuningInstanceManager().getInstanceCollection();
			for(InstanceController ic: instanceControllerSceneCol) {
				Collection<Scene> scenes = ic.getSceneCollection();
				for(Scene scene: scenes) {
					Collection<SceneMonster> monsterCol =  scene.getSceneObjByClass(SceneMonster.class);
					for(SceneMonster smonter:monsterCol) {
							try{
							cntPursuit = cntPursuit + smonter.getPursuitPointManager().getArroundWithMeInFightMonsterPositions().size();
							} catch(Exception e){
								e.printStackTrace();
							}
							try{
							cntwhocatchme = cntwhocatchme + (smonter.getWhoCatchMeManager() != null ? smonter.getWhoCatchMeManager().getCharactersList().size() : 0);
							} catch(Exception e){
								e.printStackTrace();
							}
							try{
							cntdropGoods = cntdropGoods + (smonter.getDropGoodManager().getCharacter() != null ? 1: 0);
							} catch(Exception e){
								e.printStackTrace();
							}
							try{
							cntbuff = cntbuff + smonter.getEffectController().getBuffList().size();
							} catch(Exception e){
								e.printStackTrace();
							}
							try{
							cntEnmity = cntEnmity + smonter.getEnmityManager().getAllObjInHeap();
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
		<td>����׷������������ͳ��</td>
		<td>���������������ͳ��</td>
		<td>����������������ͳ��</td>
		<td>����buff����������ͳ��</td>
		<td>�����޹���������ͳ��</td>
	</tr>
	<tr>
		<td><%=cntPursuit%></td>
		<td><%=cntwhocatchme%></td>
		<td><%=cntdropGoods%></td>
		<td><%=cntbuff%></td>
		<td><%=cntEnmity%></td>
	</tr>
</table>
<br/>
</body>
</html>