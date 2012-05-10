package net.snake.dao.achieve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AchieveExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_achieve
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table t_achieve
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public AchieveExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	protected AchieveExample(AchieveExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table t_achieve
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table t_achieve
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;
		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}
		public boolean isValid() {
			return criteriaWithoutValue.size() > 0 || criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0 || criteriaWithBetweenValue.size() > 0;
		}
		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}
		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}
		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}
		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}
		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}
		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}
		protected void addCriterion(String condition, List values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}
		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}
		public Criteria andIdIsNull() {
			addCriterion("f_id is null");
			return this;
		}
		public Criteria andIdIsNotNull() {
			addCriterion("f_id is not null");
			return this;
		}
		public Criteria andIdEqualTo(Integer value) {
			addCriterion("f_id =", value, "id");
			return this;
		}
		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("f_id <>", value, "id");
			return this;
		}
		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("f_id >", value, "id");
			return this;
		}
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_id >=", value, "id");
			return this;
		}
		public Criteria andIdLessThan(Integer value) {
			addCriterion("f_id <", value, "id");
			return this;
		}
		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("f_id <=", value, "id");
			return this;
		}
		public Criteria andIdIn(List values) {
			addCriterion("f_id in", values, "id");
			return this;
		}
		public Criteria andIdNotIn(List values) {
			addCriterion("f_id not in", values, "id");
			return this;
		}
		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("f_id between", value1, value2, "id");
			return this;
		}
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("f_id not between", value1, value2, "id");
			return this;
		}
		public Criteria andTitleIsNull() {
			addCriterion("f_title is null");
			return this;
		}
		public Criteria andTitleIsNotNull() {
			addCriterion("f_title is not null");
			return this;
		}
		public Criteria andTitleEqualTo(String value) {
			addCriterion("f_title =", value, "title");
			return this;
		}
		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("f_title <>", value, "title");
			return this;
		}
		public Criteria andTitleGreaterThan(String value) {
			addCriterion("f_title >", value, "title");
			return this;
		}
		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("f_title >=", value, "title");
			return this;
		}
		public Criteria andTitleLessThan(String value) {
			addCriterion("f_title <", value, "title");
			return this;
		}
		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("f_title <=", value, "title");
			return this;
		}
		public Criteria andTitleLike(String value) {
			addCriterion("f_title like", value, "title");
			return this;
		}
		public Criteria andTitleNotLike(String value) {
			addCriterion("f_title not like", value, "title");
			return this;
		}
		public Criteria andTitleIn(List values) {
			addCriterion("f_title in", values, "title");
			return this;
		}
		public Criteria andTitleNotIn(List values) {
			addCriterion("f_title not in", values, "title");
			return this;
		}
		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("f_title between", value1, value2, "title");
			return this;
		}
		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("f_title not between", value1, value2, "title");
			return this;
		}
		public Criteria andKindIsNull() {
			addCriterion("f_kind is null");
			return this;
		}
		public Criteria andKindIsNotNull() {
			addCriterion("f_kind is not null");
			return this;
		}
		public Criteria andKindEqualTo(Integer value) {
			addCriterion("f_kind =", value, "kind");
			return this;
		}
		public Criteria andKindNotEqualTo(Integer value) {
			addCriterion("f_kind <>", value, "kind");
			return this;
		}
		public Criteria andKindGreaterThan(Integer value) {
			addCriterion("f_kind >", value, "kind");
			return this;
		}
		public Criteria andKindGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_kind >=", value, "kind");
			return this;
		}
		public Criteria andKindLessThan(Integer value) {
			addCriterion("f_kind <", value, "kind");
			return this;
		}
		public Criteria andKindLessThanOrEqualTo(Integer value) {
			addCriterion("f_kind <=", value, "kind");
			return this;
		}
		public Criteria andKindIn(List values) {
			addCriterion("f_kind in", values, "kind");
			return this;
		}
		public Criteria andKindNotIn(List values) {
			addCriterion("f_kind not in", values, "kind");
			return this;
		}
		public Criteria andKindBetween(Integer value1, Integer value2) {
			addCriterion("f_kind between", value1, value2, "kind");
			return this;
		}
		public Criteria andKindNotBetween(Integer value1, Integer value2) {
			addCriterion("f_kind not between", value1, value2, "kind");
			return this;
		}
		public Criteria andChildKindIsNull() {
			addCriterion("f_child_kind is null");
			return this;
		}
		public Criteria andChildKindIsNotNull() {
			addCriterion("f_child_kind is not null");
			return this;
		}
		public Criteria andChildKindEqualTo(Integer value) {
			addCriterion("f_child_kind =", value, "childKind");
			return this;
		}
		public Criteria andChildKindNotEqualTo(Integer value) {
			addCriterion("f_child_kind <>", value, "childKind");
			return this;
		}
		public Criteria andChildKindGreaterThan(Integer value) {
			addCriterion("f_child_kind >", value, "childKind");
			return this;
		}
		public Criteria andChildKindGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_child_kind >=", value, "childKind");
			return this;
		}
		public Criteria andChildKindLessThan(Integer value) {
			addCriterion("f_child_kind <", value, "childKind");
			return this;
		}
		public Criteria andChildKindLessThanOrEqualTo(Integer value) {
			addCriterion("f_child_kind <=", value, "childKind");
			return this;
		}
		public Criteria andChildKindIn(List values) {
			addCriterion("f_child_kind in", values, "childKind");
			return this;
		}
		public Criteria andChildKindNotIn(List values) {
			addCriterion("f_child_kind not in", values, "childKind");
			return this;
		}
		public Criteria andChildKindBetween(Integer value1, Integer value2) {
			addCriterion("f_child_kind between", value1, value2, "childKind");
			return this;
		}
		public Criteria andChildKindNotBetween(Integer value1, Integer value2) {
			addCriterion("f_child_kind not between", value1, value2, "childKind");
			return this;
		}
		public Criteria andDescIsNull() {
			addCriterion("f_desc is null");
			return this;
		}
		public Criteria andDescIsNotNull() {
			addCriterion("f_desc is not null");
			return this;
		}
		public Criteria andDescEqualTo(String value) {
			addCriterion("f_desc =", value, "desc");
			return this;
		}
		public Criteria andDescNotEqualTo(String value) {
			addCriterion("f_desc <>", value, "desc");
			return this;
		}
		public Criteria andDescGreaterThan(String value) {
			addCriterion("f_desc >", value, "desc");
			return this;
		}
		public Criteria andDescGreaterThanOrEqualTo(String value) {
			addCriterion("f_desc >=", value, "desc");
			return this;
		}
		public Criteria andDescLessThan(String value) {
			addCriterion("f_desc <", value, "desc");
			return this;
		}
		public Criteria andDescLessThanOrEqualTo(String value) {
			addCriterion("f_desc <=", value, "desc");
			return this;
		}
		public Criteria andDescLike(String value) {
			addCriterion("f_desc like", value, "desc");
			return this;
		}
		public Criteria andDescNotLike(String value) {
			addCriterion("f_desc not like", value, "desc");
			return this;
		}
		public Criteria andDescIn(List values) {
			addCriterion("f_desc in", values, "desc");
			return this;
		}
		public Criteria andDescNotIn(List values) {
			addCriterion("f_desc not in", values, "desc");
			return this;
		}
		public Criteria andDescBetween(String value1, String value2) {
			addCriterion("f_desc between", value1, value2, "desc");
			return this;
		}
		public Criteria andDescNotBetween(String value1, String value2) {
			addCriterion("f_desc not between", value1, value2, "desc");
			return this;
		}
		public Criteria andAchieveCountIsNull() {
			addCriterion("f_achieve_count is null");
			return this;
		}
		public Criteria andAchieveCountIsNotNull() {
			addCriterion("f_achieve_count is not null");
			return this;
		}
		public Criteria andAchieveCountEqualTo(Integer value) {
			addCriterion("f_achieve_count =", value, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountNotEqualTo(Integer value) {
			addCriterion("f_achieve_count <>", value, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountGreaterThan(Integer value) {
			addCriterion("f_achieve_count >", value, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_achieve_count >=", value, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountLessThan(Integer value) {
			addCriterion("f_achieve_count <", value, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountLessThanOrEqualTo(Integer value) {
			addCriterion("f_achieve_count <=", value, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountIn(List values) {
			addCriterion("f_achieve_count in", values, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountNotIn(List values) {
			addCriterion("f_achieve_count not in", values, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountBetween(Integer value1, Integer value2) {
			addCriterion("f_achieve_count between", value1, value2, "achieveCount");
			return this;
		}
		public Criteria andAchieveCountNotBetween(Integer value1, Integer value2) {
			addCriterion("f_achieve_count not between", value1, value2, "achieveCount");
			return this;
		}
		public Criteria andPointIsNull() {
			addCriterion("f_point is null");
			return this;
		}
		public Criteria andPointIsNotNull() {
			addCriterion("f_point is not null");
			return this;
		}
		public Criteria andPointEqualTo(Integer value) {
			addCriterion("f_point =", value, "point");
			return this;
		}
		public Criteria andPointNotEqualTo(Integer value) {
			addCriterion("f_point <>", value, "point");
			return this;
		}
		public Criteria andPointGreaterThan(Integer value) {
			addCriterion("f_point >", value, "point");
			return this;
		}
		public Criteria andPointGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_point >=", value, "point");
			return this;
		}
		public Criteria andPointLessThan(Integer value) {
			addCriterion("f_point <", value, "point");
			return this;
		}
		public Criteria andPointLessThanOrEqualTo(Integer value) {
			addCriterion("f_point <=", value, "point");
			return this;
		}
		public Criteria andPointIn(List values) {
			addCriterion("f_point in", values, "point");
			return this;
		}
		public Criteria andPointNotIn(List values) {
			addCriterion("f_point not in", values, "point");
			return this;
		}
		public Criteria andPointBetween(Integer value1, Integer value2) {
			addCriterion("f_point between", value1, value2, "point");
			return this;
		}
		public Criteria andPointNotBetween(Integer value1, Integer value2) {
			addCriterion("f_point not between", value1, value2, "point");
			return this;
		}
		public Criteria andBeizhuIsNull() {
			addCriterion("f_beizhu is null");
			return this;
		}
		public Criteria andBeizhuIsNotNull() {
			addCriterion("f_beizhu is not null");
			return this;
		}
		public Criteria andBeizhuEqualTo(String value) {
			addCriterion("f_beizhu =", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuNotEqualTo(String value) {
			addCriterion("f_beizhu <>", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuGreaterThan(String value) {
			addCriterion("f_beizhu >", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
			addCriterion("f_beizhu >=", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuLessThan(String value) {
			addCriterion("f_beizhu <", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuLessThanOrEqualTo(String value) {
			addCriterion("f_beizhu <=", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuLike(String value) {
			addCriterion("f_beizhu like", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuNotLike(String value) {
			addCriterion("f_beizhu not like", value, "beizhu");
			return this;
		}
		public Criteria andBeizhuIn(List values) {
			addCriterion("f_beizhu in", values, "beizhu");
			return this;
		}
		public Criteria andBeizhuNotIn(List values) {
			addCriterion("f_beizhu not in", values, "beizhu");
			return this;
		}
		public Criteria andBeizhuBetween(String value1, String value2) {
			addCriterion("f_beizhu between", value1, value2, "beizhu");
			return this;
		}
		public Criteria andBeizhuNotBetween(String value1, String value2) {
			addCriterion("f_beizhu not between", value1, value2, "beizhu");
			return this;
		}
		public Criteria andIcoIsNull() {
			addCriterion("f_ico is null");
			return this;
		}
		public Criteria andIcoIsNotNull() {
			addCriterion("f_ico is not null");
			return this;
		}
		public Criteria andIcoEqualTo(Integer value) {
			addCriterion("f_ico =", value, "ico");
			return this;
		}
		public Criteria andIcoNotEqualTo(Integer value) {
			addCriterion("f_ico <>", value, "ico");
			return this;
		}
		public Criteria andIcoGreaterThan(Integer value) {
			addCriterion("f_ico >", value, "ico");
			return this;
		}
		public Criteria andIcoGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_ico >=", value, "ico");
			return this;
		}
		public Criteria andIcoLessThan(Integer value) {
			addCriterion("f_ico <", value, "ico");
			return this;
		}
		public Criteria andIcoLessThanOrEqualTo(Integer value) {
			addCriterion("f_ico <=", value, "ico");
			return this;
		}
		public Criteria andIcoIn(List values) {
			addCriterion("f_ico in", values, "ico");
			return this;
		}
		public Criteria andIcoNotIn(List values) {
			addCriterion("f_ico not in", values, "ico");
			return this;
		}
		public Criteria andIcoBetween(Integer value1, Integer value2) {
			addCriterion("f_ico between", value1, value2, "ico");
			return this;
		}
		public Criteria andIcoNotBetween(Integer value1, Integer value2) {
			addCriterion("f_ico not between", value1, value2, "ico");
			return this;
		}
		public Criteria andGoodIdIsNull() {
			addCriterion("f_good_id is null");
			return this;
		}
		public Criteria andGoodIdIsNotNull() {
			addCriterion("f_good_id is not null");
			return this;
		}
		public Criteria andGoodIdEqualTo(Integer value) {
			addCriterion("f_good_id =", value, "goodId");
			return this;
		}
		public Criteria andGoodIdNotEqualTo(Integer value) {
			addCriterion("f_good_id <>", value, "goodId");
			return this;
		}
		public Criteria andGoodIdGreaterThan(Integer value) {
			addCriterion("f_good_id >", value, "goodId");
			return this;
		}
		public Criteria andGoodIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_good_id >=", value, "goodId");
			return this;
		}
		public Criteria andGoodIdLessThan(Integer value) {
			addCriterion("f_good_id <", value, "goodId");
			return this;
		}
		public Criteria andGoodIdLessThanOrEqualTo(Integer value) {
			addCriterion("f_good_id <=", value, "goodId");
			return this;
		}
		public Criteria andGoodIdIn(List values) {
			addCriterion("f_good_id in", values, "goodId");
			return this;
		}
		public Criteria andGoodIdNotIn(List values) {
			addCriterion("f_good_id not in", values, "goodId");
			return this;
		}
		public Criteria andGoodIdBetween(Integer value1, Integer value2) {
			addCriterion("f_good_id between", value1, value2, "goodId");
			return this;
		}
		public Criteria andGoodIdNotBetween(Integer value1, Integer value2) {
			addCriterion("f_good_id not between", value1, value2, "goodId");
			return this;
		}
		public Criteria andIsnoticeIsNull() {
			addCriterion("f_isnotice is null");
			return this;
		}
		public Criteria andIsnoticeIsNotNull() {
			addCriterion("f_isnotice is not null");
			return this;
		}
		public Criteria andIsnoticeEqualTo(Integer value) {
			addCriterion("f_isnotice =", value, "isnotice");
			return this;
		}
		public Criteria andIsnoticeNotEqualTo(Integer value) {
			addCriterion("f_isnotice <>", value, "isnotice");
			return this;
		}
		public Criteria andIsnoticeGreaterThan(Integer value) {
			addCriterion("f_isnotice >", value, "isnotice");
			return this;
		}
		public Criteria andIsnoticeGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_isnotice >=", value, "isnotice");
			return this;
		}
		public Criteria andIsnoticeLessThan(Integer value) {
			addCriterion("f_isnotice <", value, "isnotice");
			return this;
		}
		public Criteria andIsnoticeLessThanOrEqualTo(Integer value) {
			addCriterion("f_isnotice <=", value, "isnotice");
			return this;
		}
		public Criteria andIsnoticeIn(List values) {
			addCriterion("f_isnotice in", values, "isnotice");
			return this;
		}
		public Criteria andIsnoticeNotIn(List values) {
			addCriterion("f_isnotice not in", values, "isnotice");
			return this;
		}
		public Criteria andIsnoticeBetween(Integer value1, Integer value2) {
			addCriterion("f_isnotice between", value1, value2, "isnotice");
			return this;
		}
		public Criteria andIsnoticeNotBetween(Integer value1, Integer value2) {
			addCriterion("f_isnotice not between", value1, value2, "isnotice");
			return this;
		}
		public Criteria andNameIsNull() {
			addCriterion("f_name is null");
			return this;
		}
		public Criteria andNameIsNotNull() {
			addCriterion("f_name is not null");
			return this;
		}
		public Criteria andNameEqualTo(String value) {
			addCriterion("f_name =", value, "name");
			return this;
		}
		public Criteria andNameNotEqualTo(String value) {
			addCriterion("f_name <>", value, "name");
			return this;
		}
		public Criteria andNameGreaterThan(String value) {
			addCriterion("f_name >", value, "name");
			return this;
		}
		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("f_name >=", value, "name");
			return this;
		}
		public Criteria andNameLessThan(String value) {
			addCriterion("f_name <", value, "name");
			return this;
		}
		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("f_name <=", value, "name");
			return this;
		}
		public Criteria andNameLike(String value) {
			addCriterion("f_name like", value, "name");
			return this;
		}
		public Criteria andNameNotLike(String value) {
			addCriterion("f_name not like", value, "name");
			return this;
		}
		public Criteria andNameIn(List values) {
			addCriterion("f_name in", values, "name");
			return this;
		}
		public Criteria andNameNotIn(List values) {
			addCriterion("f_name not in", values, "name");
			return this;
		}
		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("f_name between", value1, value2, "name");
			return this;
		}
		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("f_name not between", value1, value2, "name");
			return this;
		}
		public Criteria andModelTypeIsNull() {
			addCriterion("f_model_type is null");
			return this;
		}
		public Criteria andModelTypeIsNotNull() {
			addCriterion("f_model_type is not null");
			return this;
		}
		public Criteria andModelTypeEqualTo(Integer value) {
			addCriterion("f_model_type =", value, "modelType");
			return this;
		}
		public Criteria andModelTypeNotEqualTo(Integer value) {
			addCriterion("f_model_type <>", value, "modelType");
			return this;
		}
		public Criteria andModelTypeGreaterThan(Integer value) {
			addCriterion("f_model_type >", value, "modelType");
			return this;
		}
		public Criteria andModelTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("f_model_type >=", value, "modelType");
			return this;
		}
		public Criteria andModelTypeLessThan(Integer value) {
			addCriterion("f_model_type <", value, "modelType");
			return this;
		}
		public Criteria andModelTypeLessThanOrEqualTo(Integer value) {
			addCriterion("f_model_type <=", value, "modelType");
			return this;
		}
		public Criteria andModelTypeIn(List values) {
			addCriterion("f_model_type in", values, "modelType");
			return this;
		}
		public Criteria andModelTypeNotIn(List values) {
			addCriterion("f_model_type not in", values, "modelType");
			return this;
		}
		public Criteria andModelTypeBetween(Integer value1, Integer value2) {
			addCriterion("f_model_type between", value1, value2, "modelType");
			return this;
		}
		public Criteria andModelTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("f_model_type not between", value1, value2, "modelType");
			return this;
		}
		public Criteria andTitleI18nIsNull() {
			addCriterion("f_title_i18n is null");
			return this;
		}
		public Criteria andTitleI18nIsNotNull() {
			addCriterion("f_title_i18n is not null");
			return this;
		}
		public Criteria andTitleI18nEqualTo(String value) {
			addCriterion("f_title_i18n =", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nNotEqualTo(String value) {
			addCriterion("f_title_i18n <>", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nGreaterThan(String value) {
			addCriterion("f_title_i18n >", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nGreaterThanOrEqualTo(String value) {
			addCriterion("f_title_i18n >=", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nLessThan(String value) {
			addCriterion("f_title_i18n <", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nLessThanOrEqualTo(String value) {
			addCriterion("f_title_i18n <=", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nLike(String value) {
			addCriterion("f_title_i18n like", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nNotLike(String value) {
			addCriterion("f_title_i18n not like", value, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nIn(List values) {
			addCriterion("f_title_i18n in", values, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nNotIn(List values) {
			addCriterion("f_title_i18n not in", values, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nBetween(String value1, String value2) {
			addCriterion("f_title_i18n between", value1, value2, "titleI18n");
			return this;
		}
		public Criteria andTitleI18nNotBetween(String value1, String value2) {
			addCriterion("f_title_i18n not between", value1, value2, "titleI18n");
			return this;
		}
		public Criteria andDescI18nIsNull() {
			addCriterion("f_desc_i18n is null");
			return this;
		}
		public Criteria andDescI18nIsNotNull() {
			addCriterion("f_desc_i18n is not null");
			return this;
		}
		public Criteria andDescI18nEqualTo(String value) {
			addCriterion("f_desc_i18n =", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nNotEqualTo(String value) {
			addCriterion("f_desc_i18n <>", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nGreaterThan(String value) {
			addCriterion("f_desc_i18n >", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nGreaterThanOrEqualTo(String value) {
			addCriterion("f_desc_i18n >=", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nLessThan(String value) {
			addCriterion("f_desc_i18n <", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nLessThanOrEqualTo(String value) {
			addCriterion("f_desc_i18n <=", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nLike(String value) {
			addCriterion("f_desc_i18n like", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nNotLike(String value) {
			addCriterion("f_desc_i18n not like", value, "descI18n");
			return this;
		}
		public Criteria andDescI18nIn(List values) {
			addCriterion("f_desc_i18n in", values, "descI18n");
			return this;
		}
		public Criteria andDescI18nNotIn(List values) {
			addCriterion("f_desc_i18n not in", values, "descI18n");
			return this;
		}
		public Criteria andDescI18nBetween(String value1, String value2) {
			addCriterion("f_desc_i18n between", value1, value2, "descI18n");
			return this;
		}
		public Criteria andDescI18nNotBetween(String value1, String value2) {
			addCriterion("f_desc_i18n not between", value1, value2, "descI18n");
			return this;
		}
		public Criteria andBeizhuI18nIsNull() {
			addCriterion("f_beizhu_i18n is null");
			return this;
		}
		public Criteria andBeizhuI18nIsNotNull() {
			addCriterion("f_beizhu_i18n is not null");
			return this;
		}
		public Criteria andBeizhuI18nEqualTo(String value) {
			addCriterion("f_beizhu_i18n =", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nNotEqualTo(String value) {
			addCriterion("f_beizhu_i18n <>", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nGreaterThan(String value) {
			addCriterion("f_beizhu_i18n >", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nGreaterThanOrEqualTo(String value) {
			addCriterion("f_beizhu_i18n >=", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nLessThan(String value) {
			addCriterion("f_beizhu_i18n <", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nLessThanOrEqualTo(String value) {
			addCriterion("f_beizhu_i18n <=", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nLike(String value) {
			addCriterion("f_beizhu_i18n like", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nNotLike(String value) {
			addCriterion("f_beizhu_i18n not like", value, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nIn(List values) {
			addCriterion("f_beizhu_i18n in", values, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nNotIn(List values) {
			addCriterion("f_beizhu_i18n not in", values, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nBetween(String value1, String value2) {
			addCriterion("f_beizhu_i18n between", value1, value2, "beizhuI18n");
			return this;
		}
		public Criteria andBeizhuI18nNotBetween(String value1, String value2) {
			addCriterion("f_beizhu_i18n not between", value1, value2, "beizhuI18n");
			return this;
		}
		public Criteria andNameI18nIsNull() {
			addCriterion("f_name_i18n is null");
			return this;
		}
		public Criteria andNameI18nIsNotNull() {
			addCriterion("f_name_i18n is not null");
			return this;
		}
		public Criteria andNameI18nEqualTo(String value) {
			addCriterion("f_name_i18n =", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nNotEqualTo(String value) {
			addCriterion("f_name_i18n <>", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nGreaterThan(String value) {
			addCriterion("f_name_i18n >", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nGreaterThanOrEqualTo(String value) {
			addCriterion("f_name_i18n >=", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nLessThan(String value) {
			addCriterion("f_name_i18n <", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nLessThanOrEqualTo(String value) {
			addCriterion("f_name_i18n <=", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nLike(String value) {
			addCriterion("f_name_i18n like", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nNotLike(String value) {
			addCriterion("f_name_i18n not like", value, "nameI18n");
			return this;
		}
		public Criteria andNameI18nIn(List values) {
			addCriterion("f_name_i18n in", values, "nameI18n");
			return this;
		}
		public Criteria andNameI18nNotIn(List values) {
			addCriterion("f_name_i18n not in", values, "nameI18n");
			return this;
		}
		public Criteria andNameI18nBetween(String value1, String value2) {
			addCriterion("f_name_i18n between", value1, value2, "nameI18n");
			return this;
		}
		public Criteria andNameI18nNotBetween(String value1, String value2) {
			addCriterion("f_name_i18n not between", value1, value2, "nameI18n");
			return this;
		}
	}
}