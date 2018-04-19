package cn.hfbin.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BlogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
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

        public Criteria andBlogsIdIsNull() {
            addCriterion("blogs_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIsNotNull() {
            addCriterion("blogs_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsIdEqualTo(Integer value) {
            addCriterion("blogs_id =", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotEqualTo(Integer value) {
            addCriterion("blogs_id <>", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThan(Integer value) {
            addCriterion("blogs_id >", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_id >=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThan(Integer value) {
            addCriterion("blogs_id <", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_id <=", value, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdIn(List<Integer> values) {
            addCriterion("blogs_id in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotIn(List<Integer> values) {
            addCriterion("blogs_id not in", values, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_id not between", value1, value2, "blogsId");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleIsNull() {
            addCriterion("blogs_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleIsNotNull() {
            addCriterion("blogs_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleEqualTo(String value) {
            addCriterion("blogs_title =", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotEqualTo(String value) {
            addCriterion("blogs_title <>", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleGreaterThan(String value) {
            addCriterion("blogs_title >", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_title >=", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleLessThan(String value) {
            addCriterion("blogs_title <", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleLessThanOrEqualTo(String value) {
            addCriterion("blogs_title <=", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleLike(String value) {
            addCriterion("blogs_title like", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotLike(String value) {
            addCriterion("blogs_title not like", value, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleIn(List<String> values) {
            addCriterion("blogs_title in", values, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotIn(List<String> values) {
            addCriterion("blogs_title not in", values, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleBetween(String value1, String value2) {
            addCriterion("blogs_title between", value1, value2, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTitleNotBetween(String value1, String value2) {
            addCriterion("blogs_title not between", value1, value2, "blogsTitle");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIsNull() {
            addCriterion("blogs_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIsNotNull() {
            addCriterion("blogs_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeEqualTo(String value) {
            addCriterion("blogs_type =", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotEqualTo(String value) {
            addCriterion("blogs_type <>", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeGreaterThan(String value) {
            addCriterion("blogs_type >", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_type >=", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeLessThan(String value) {
            addCriterion("blogs_type <", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeLessThanOrEqualTo(String value) {
            addCriterion("blogs_type <=", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeLike(String value) {
            addCriterion("blogs_type like", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotLike(String value) {
            addCriterion("blogs_type not like", value, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeIn(List<String> values) {
            addCriterion("blogs_type in", values, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotIn(List<String> values) {
            addCriterion("blogs_type not in", values, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeBetween(String value1, String value2) {
            addCriterion("blogs_type between", value1, value2, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsTypeNotBetween(String value1, String value2) {
            addCriterion("blogs_type not between", value1, value2, "blogsType");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprIsNull() {
            addCriterion("blogs_copr is null");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprIsNotNull() {
            addCriterion("blogs_copr is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprEqualTo(String value) {
            addCriterion("blogs_copr =", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprNotEqualTo(String value) {
            addCriterion("blogs_copr <>", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprGreaterThan(String value) {
            addCriterion("blogs_copr >", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprGreaterThanOrEqualTo(String value) {
            addCriterion("blogs_copr >=", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprLessThan(String value) {
            addCriterion("blogs_copr <", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprLessThanOrEqualTo(String value) {
            addCriterion("blogs_copr <=", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprLike(String value) {
            addCriterion("blogs_copr like", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprNotLike(String value) {
            addCriterion("blogs_copr not like", value, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprIn(List<String> values) {
            addCriterion("blogs_copr in", values, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprNotIn(List<String> values) {
            addCriterion("blogs_copr not in", values, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprBetween(String value1, String value2) {
            addCriterion("blogs_copr between", value1, value2, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogsCoprNotBetween(String value1, String value2) {
            addCriterion("blogs_copr not between", value1, value2, "blogsCopr");
            return (Criteria) this;
        }

        public Criteria andBlogBossIsNull() {
            addCriterion("blog_boss is null");
            return (Criteria) this;
        }

        public Criteria andBlogBossIsNotNull() {
            addCriterion("blog_boss is not null");
            return (Criteria) this;
        }

        public Criteria andBlogBossEqualTo(String value) {
            addCriterion("blog_boss =", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossNotEqualTo(String value) {
            addCriterion("blog_boss <>", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossGreaterThan(String value) {
            addCriterion("blog_boss >", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossGreaterThanOrEqualTo(String value) {
            addCriterion("blog_boss >=", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossLessThan(String value) {
            addCriterion("blog_boss <", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossLessThanOrEqualTo(String value) {
            addCriterion("blog_boss <=", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossLike(String value) {
            addCriterion("blog_boss like", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossNotLike(String value) {
            addCriterion("blog_boss not like", value, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossIn(List<String> values) {
            addCriterion("blog_boss in", values, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossNotIn(List<String> values) {
            addCriterion("blog_boss not in", values, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossBetween(String value1, String value2) {
            addCriterion("blog_boss between", value1, value2, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogBossNotBetween(String value1, String value2) {
            addCriterion("blog_boss not between", value1, value2, "blogBoss");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewIsNull() {
            addCriterion("blogs_page_view is null");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewIsNotNull() {
            addCriterion("blogs_page_view is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewEqualTo(Integer value) {
            addCriterion("blogs_page_view =", value, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewNotEqualTo(Integer value) {
            addCriterion("blogs_page_view <>", value, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewGreaterThan(Integer value) {
            addCriterion("blogs_page_view >", value, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogs_page_view >=", value, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewLessThan(Integer value) {
            addCriterion("blogs_page_view <", value, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewLessThanOrEqualTo(Integer value) {
            addCriterion("blogs_page_view <=", value, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewIn(List<Integer> values) {
            addCriterion("blogs_page_view in", values, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewNotIn(List<Integer> values) {
            addCriterion("blogs_page_view not in", values, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewBetween(Integer value1, Integer value2) {
            addCriterion("blogs_page_view between", value1, value2, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsPageViewNotBetween(Integer value1, Integer value2) {
            addCriterion("blogs_page_view not between", value1, value2, "blogsPageView");
            return (Criteria) this;
        }

        public Criteria andBlogsDataIsNull() {
            addCriterion("blogs_data is null");
            return (Criteria) this;
        }

        public Criteria andBlogsDataIsNotNull() {
            addCriterion("blogs_data is not null");
            return (Criteria) this;
        }

        public Criteria andBlogsDataEqualTo(Date value) {
            addCriterionForJDBCDate("blogs_data =", value, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("blogs_data <>", value, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataGreaterThan(Date value) {
            addCriterionForJDBCDate("blogs_data >", value, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("blogs_data >=", value, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataLessThan(Date value) {
            addCriterionForJDBCDate("blogs_data <", value, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("blogs_data <=", value, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataIn(List<Date> values) {
            addCriterionForJDBCDate("blogs_data in", values, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("blogs_data not in", values, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("blogs_data between", value1, value2, "blogsData");
            return (Criteria) this;
        }

        public Criteria andBlogsDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("blogs_data not between", value1, value2, "blogsData");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}