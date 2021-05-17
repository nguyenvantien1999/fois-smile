package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public CommentExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMablIsNull() {
            addCriterion("mabl is null");
            return (Criteria) this;
        }

        public Criteria andMablIsNotNull() {
            addCriterion("mabl is not null");
            return (Criteria) this;
        }

        public Criteria andMablEqualTo(Integer value) {
            addCriterion("mabl =", value, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablNotEqualTo(Integer value) {
            addCriterion("mabl <>", value, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablGreaterThan(Integer value) {
            addCriterion("mabl >", value, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablGreaterThanOrEqualTo(Integer value) {
            addCriterion("mabl >=", value, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablLessThan(Integer value) {
            addCriterion("mabl <", value, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablLessThanOrEqualTo(Integer value) {
            addCriterion("mabl <=", value, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablIn(List<Integer> values) {
            addCriterion("mabl in", values, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablNotIn(List<Integer> values) {
            addCriterion("mabl not in", values, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablBetween(Integer value1, Integer value2) {
            addCriterion("mabl between", value1, value2, "mabl");
            return (Criteria) this;
        }

        public Criteria andMablNotBetween(Integer value1, Integer value2) {
            addCriterion("mabl not between", value1, value2, "mabl");
            return (Criteria) this;
        }

        public Criteria andNdblIsNull() {
            addCriterion("ndbl is null");
            return (Criteria) this;
        }

        public Criteria andNdblIsNotNull() {
            addCriterion("ndbl is not null");
            return (Criteria) this;
        }

        public Criteria andNdblEqualTo(String value) {
            addCriterion("ndbl =", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblNotEqualTo(String value) {
            addCriterion("ndbl <>", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblGreaterThan(String value) {
            addCriterion("ndbl >", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblGreaterThanOrEqualTo(String value) {
            addCriterion("ndbl >=", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblLessThan(String value) {
            addCriterion("ndbl <", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblLessThanOrEqualTo(String value) {
            addCriterion("ndbl <=", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblLike(String value) {
            addCriterion("ndbl like", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblNotLike(String value) {
            addCriterion("ndbl not like", value, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblIn(List<String> values) {
            addCriterion("ndbl in", values, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblNotIn(List<String> values) {
            addCriterion("ndbl not in", values, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblBetween(String value1, String value2) {
            addCriterion("ndbl between", value1, value2, "ndbl");
            return (Criteria) this;
        }

        public Criteria andNdblNotBetween(String value1, String value2) {
            addCriterion("ndbl not between", value1, value2, "ndbl");
            return (Criteria) this;
        }

        public Criteria andThoigianIsNull() {
            addCriterion("thoigian is null");
            return (Criteria) this;
        }

        public Criteria andThoigianIsNotNull() {
            addCriterion("thoigian is not null");
            return (Criteria) this;
        }

        public Criteria andThoigianEqualTo(Date value) {
            addCriterionForJDBCDate("thoigian =", value, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianNotEqualTo(Date value) {
            addCriterionForJDBCDate("thoigian <>", value, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianGreaterThan(Date value) {
            addCriterionForJDBCDate("thoigian >", value, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("thoigian >=", value, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianLessThan(Date value) {
            addCriterionForJDBCDate("thoigian <", value, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("thoigian <=", value, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianIn(List<Date> values) {
            addCriterionForJDBCDate("thoigian in", values, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianNotIn(List<Date> values) {
            addCriterionForJDBCDate("thoigian not in", values, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("thoigian between", value1, value2, "thoigian");
            return (Criteria) this;
        }

        public Criteria andThoigianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("thoigian not between", value1, value2, "thoigian");
            return (Criteria) this;
        }

        public Criteria andMatkIsNull() {
            addCriterion("matk is null");
            return (Criteria) this;
        }

        public Criteria andMatkIsNotNull() {
            addCriterion("matk is not null");
            return (Criteria) this;
        }

        public Criteria andMatkEqualTo(Integer value) {
            addCriterion("matk =", value, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkNotEqualTo(Integer value) {
            addCriterion("matk <>", value, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkGreaterThan(Integer value) {
            addCriterion("matk >", value, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkGreaterThanOrEqualTo(Integer value) {
            addCriterion("matk >=", value, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkLessThan(Integer value) {
            addCriterion("matk <", value, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkLessThanOrEqualTo(Integer value) {
            addCriterion("matk <=", value, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkIn(List<Integer> values) {
            addCriterion("matk in", values, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkNotIn(List<Integer> values) {
            addCriterion("matk not in", values, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkBetween(Integer value1, Integer value2) {
            addCriterion("matk between", value1, value2, "matk");
            return (Criteria) this;
        }

        public Criteria andMatkNotBetween(Integer value1, Integer value2) {
            addCriterion("matk not between", value1, value2, "matk");
            return (Criteria) this;
        }

        public Criteria andMabhIsNull() {
            addCriterion("mabh is null");
            return (Criteria) this;
        }

        public Criteria andMabhIsNotNull() {
            addCriterion("mabh is not null");
            return (Criteria) this;
        }

        public Criteria andMabhEqualTo(String value) {
            addCriterion("mabh =", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotEqualTo(String value) {
            addCriterion("mabh <>", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhGreaterThan(String value) {
            addCriterion("mabh >", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhGreaterThanOrEqualTo(String value) {
            addCriterion("mabh >=", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhLessThan(String value) {
            addCriterion("mabh <", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhLessThanOrEqualTo(String value) {
            addCriterion("mabh <=", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhLike(String value) {
            addCriterion("mabh like", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotLike(String value) {
            addCriterion("mabh not like", value, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhIn(List<String> values) {
            addCriterion("mabh in", values, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotIn(List<String> values) {
            addCriterion("mabh not in", values, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhBetween(String value1, String value2) {
            addCriterion("mabh between", value1, value2, "mabh");
            return (Criteria) this;
        }

        public Criteria andMabhNotBetween(String value1, String value2) {
            addCriterion("mabh not between", value1, value2, "mabh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.comment
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schema01.comment
     *
     * @mbg.generated do_not_delete_during_merge Thu May 06 15:26:34 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}