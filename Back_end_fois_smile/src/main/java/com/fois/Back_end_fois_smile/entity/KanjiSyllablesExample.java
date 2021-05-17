package com.fois.Back_end_fois_smile.entity;

import java.util.ArrayList;
import java.util.List;

public class KanjiSyllablesExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public KanjiSyllablesExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table schema01.kanji_syllables
     * @mbg.generated  Thu May 06 20:20:23 ICT 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.kanji_syllables
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

        public Criteria andMaamIsNull() {
            addCriterion("maam is null");
            return (Criteria) this;
        }

        public Criteria andMaamIsNotNull() {
            addCriterion("maam is not null");
            return (Criteria) this;
        }

        public Criteria andMaamEqualTo(String value) {
            addCriterion("maam =", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamNotEqualTo(String value) {
            addCriterion("maam <>", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamGreaterThan(String value) {
            addCriterion("maam >", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamGreaterThanOrEqualTo(String value) {
            addCriterion("maam >=", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamLessThan(String value) {
            addCriterion("maam <", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamLessThanOrEqualTo(String value) {
            addCriterion("maam <=", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamLike(String value) {
            addCriterion("maam like", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamNotLike(String value) {
            addCriterion("maam not like", value, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamIn(List<String> values) {
            addCriterion("maam in", values, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamNotIn(List<String> values) {
            addCriterion("maam not in", values, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamBetween(String value1, String value2) {
            addCriterion("maam between", value1, value2, "maam");
            return (Criteria) this;
        }

        public Criteria andMaamNotBetween(String value1, String value2) {
            addCriterion("maam not between", value1, value2, "maam");
            return (Criteria) this;
        }

        public Criteria andTenamIsNull() {
            addCriterion("tenam is null");
            return (Criteria) this;
        }

        public Criteria andTenamIsNotNull() {
            addCriterion("tenam is not null");
            return (Criteria) this;
        }

        public Criteria andTenamEqualTo(String value) {
            addCriterion("tenam =", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamNotEqualTo(String value) {
            addCriterion("tenam <>", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamGreaterThan(String value) {
            addCriterion("tenam >", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamGreaterThanOrEqualTo(String value) {
            addCriterion("tenam >=", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamLessThan(String value) {
            addCriterion("tenam <", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamLessThanOrEqualTo(String value) {
            addCriterion("tenam <=", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamLike(String value) {
            addCriterion("tenam like", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamNotLike(String value) {
            addCriterion("tenam not like", value, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamIn(List<String> values) {
            addCriterion("tenam in", values, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamNotIn(List<String> values) {
            addCriterion("tenam not in", values, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamBetween(String value1, String value2) {
            addCriterion("tenam between", value1, value2, "tenam");
            return (Criteria) this;
        }

        public Criteria andTenamNotBetween(String value1, String value2) {
            addCriterion("tenam not between", value1, value2, "tenam");
            return (Criteria) this;
        }

        public Criteria andMachuIsNull() {
            addCriterion("machu is null");
            return (Criteria) this;
        }

        public Criteria andMachuIsNotNull() {
            addCriterion("machu is not null");
            return (Criteria) this;
        }

        public Criteria andMachuEqualTo(String value) {
            addCriterion("machu =", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotEqualTo(String value) {
            addCriterion("machu <>", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuGreaterThan(String value) {
            addCriterion("machu >", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuGreaterThanOrEqualTo(String value) {
            addCriterion("machu >=", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuLessThan(String value) {
            addCriterion("machu <", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuLessThanOrEqualTo(String value) {
            addCriterion("machu <=", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuLike(String value) {
            addCriterion("machu like", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotLike(String value) {
            addCriterion("machu not like", value, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuIn(List<String> values) {
            addCriterion("machu in", values, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotIn(List<String> values) {
            addCriterion("machu not in", values, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuBetween(String value1, String value2) {
            addCriterion("machu between", value1, value2, "machu");
            return (Criteria) this;
        }

        public Criteria andMachuNotBetween(String value1, String value2) {
            addCriterion("machu not between", value1, value2, "machu");
            return (Criteria) this;
        }

        public Criteria andMaloaiamIsNull() {
            addCriterion("maloaiam is null");
            return (Criteria) this;
        }

        public Criteria andMaloaiamIsNotNull() {
            addCriterion("maloaiam is not null");
            return (Criteria) this;
        }

        public Criteria andMaloaiamEqualTo(String value) {
            addCriterion("maloaiam =", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamNotEqualTo(String value) {
            addCriterion("maloaiam <>", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamGreaterThan(String value) {
            addCriterion("maloaiam >", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamGreaterThanOrEqualTo(String value) {
            addCriterion("maloaiam >=", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamLessThan(String value) {
            addCriterion("maloaiam <", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamLessThanOrEqualTo(String value) {
            addCriterion("maloaiam <=", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamLike(String value) {
            addCriterion("maloaiam like", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamNotLike(String value) {
            addCriterion("maloaiam not like", value, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamIn(List<String> values) {
            addCriterion("maloaiam in", values, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamNotIn(List<String> values) {
            addCriterion("maloaiam not in", values, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamBetween(String value1, String value2) {
            addCriterion("maloaiam between", value1, value2, "maloaiam");
            return (Criteria) this;
        }

        public Criteria andMaloaiamNotBetween(String value1, String value2) {
            addCriterion("maloaiam not between", value1, value2, "maloaiam");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table schema01.kanji_syllables
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
     * This class corresponds to the database table schema01.kanji_syllables
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 07 09:40:31 ICT 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}