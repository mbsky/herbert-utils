package net.snake.gamemodel.guide.persistence;

import java.sql.SQLException;
import java.util.List;

import net.snake.gamemodel.guide.bean.CharacterMsg;

import com.ibatis.sqlmap.client.SqlMapClient;

public class CharacterMsgDAO {

	private SqlMapClient sqlMapClient;

	public CharacterMsgDAO(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	@SuppressWarnings("rawtypes")
	public List selectByCharacterId(int characterId) throws SQLException {
		List list = sqlMapClient.queryForList(
				"t_character_msg.selectByCharacterId", characterId);
		return list;
	}

	public int deleteByCharacterId(int characterId) throws SQLException {
		int rows = sqlMapClient.delete("t_character_msg.deleteByCharacterId",
				characterId);
		return rows;
	}

	public Integer insert(CharacterMsg record) throws SQLException {
		Object newKey = sqlMapClient.insert("t_character_msg.insert", record);
		return (Integer) newKey;
	}

}
