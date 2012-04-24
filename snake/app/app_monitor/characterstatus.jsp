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
<%@page import="net.snake.bean.character.Horse"%>
<%@page import="net.snake.ai.eyeshot.CharacterEyeShotManager"%>

<%
	GameServer gameserver = (GameServer) application
			.getAttribute("GameServer");
	Collection<VLineServer> lines = GameServer.vlineServerManager
	.getLineServersList();
	int cntPursuit = 0;
	int cntJiaoYi = 0;
	int cntTeam = 0;
	int cntFriend = 0;
	int cntYoulong = 0;
	int cntHorseSkill = 0;
	int cntHorseEye = 0;
	int cntCharacterEye = 0;
	int cntInstanceChar = 0;
	int cntCharacterBuff = 0;
	int cntCharacterEnmity = 0;
		for (VLineServer line : lines) 
		{
			Collection<Character> col = line.getOnlineManager().getCharacterList();
			for (Iterator<Character> iterator = col.iterator(); iterator.hasNext();) {
				Character character = iterator.next();
				try{
					cntPursuit = cntPursuit + character.getPursuitPointManager().getArroundWithMeInFightMonsterPositions().size();
						try{
							cntJiaoYi = cntJiaoYi + (character.getMyTradeController()).getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
						try{
							cntTeam = cntTeam + character.getMyTeamManager().getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
						try{
							cntFriend = cntFriend + character.getMyFriendManager().getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
						try{
								cntYoulong = cntYoulong + character.getCatchYoulongActionController().getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}	
					Collection<Horse> horsecol = character.getCharacterHorseController().getAllHorse();
					
						try{
							cntCharacterEye = cntCharacterEye + ((CharacterEyeShotManager)character.getEyeShotManager()).getAllEyeObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
						try{
							cntInstanceChar = cntInstanceChar + character.getMyCharacterInstanceManager().getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}	
						try{
							cntCharacterBuff = cntCharacterBuff + character.getEffectController().getBuffList().size();
						} catch(Exception e){
							e.printStackTrace();
						}
				
						try{
							cntCharacterEnmity = cntCharacterEnmity + character.getEnmityManager().getAllObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}	
					for (Iterator<Horse> horseInter = horsecol.iterator(); horseInter.hasNext();) {
						Horse horse = horseInter.next();
						try{
							cntHorseSkill = cntHorseSkill +  horse.getAllSkillObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
						try{
							cntHorseEye = cntHorseEye + horse.getAllEyeObjInHeap();
						} catch(Exception e){
							e.printStackTrace();
						}
					}
				} catch(Exception e){
					e.printStackTrace();
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
		<td>��ɫ׷������������ͳ��</td>
		<td>��ɫ���׹���������ͳ��</td>
		<td>��ɫ��ӹ���������ͳ��</td>
		<td>��ɫ���ѹ���������ͳ��</td>
		<td>��ɫ����֮�й���������ͳ��</td>
		<td>��ɫ��Ұ����������ͳ��</td>
		<td>��ɫ��������������ͳ��</td>
		<td>��ɫbuff����������ͳ��</td>
		<td>��ɫ��޹���������ͳ��</td>
		
		<td>���＼�ܹ���������ͳ��</td>
		<td>������Ұ����������ͳ��</td>
	</tr>
	<tr>
		<td><%=cntPursuit%></td>
		<td><%=cntJiaoYi%></td>
		<td><%=cntTeam%></td>
		<td><%=cntFriend%></td>
		<td><%=cntYoulong%></td>
		
		<td><%=cntCharacterEye%></td>
		<td><%=cntInstanceChar%></td>
		<td><%=cntCharacterBuff%></td>
		<td><%=cntCharacterEnmity%></td>
		<td><%=cntHorseSkill%></td>
		<td><%=cntHorseEye%></td>
	</tr>
</table>
<br/>
</body>
</html>