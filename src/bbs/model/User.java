package bbs.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class User implements java.io.Serializable {
	//属性
	private Integer id;	//用户唯一id
	private String username;//用户名
	private String password;
	private String sex;
	private String email;
	private String userAvatarURL;//头像url
	private Timestamp createTime;//创建时间
	private Timestamp updateTime;//更新时间
	private Integer level;//用户等级
	private String activeCode;//激活码
	private Integer hasActive;//激活状态,0为未激活,1为激活
	private String signature;//签名
	private Integer privilege;//用户权限,0为普通用户,1为管理员
	//关联属性
	private Set topics = new HashSet(0);//保存 帖子 实体
	private Set replys = new HashSet(0);//保存 跟帖 实体
	private Set notices = new HashSet(0);//保存 发布的公告 实体
	private Set blackList = new HashSet(0);//保存 黑名单 实体
	private Set loginLog = new HashSet(0);//保存 用户日志 实体
	private Set bestTopics = new HashSet(0);//保存 精华帖 实体

	//构造函数

	/** 默认构造 */
	public User() {
	}

	/** 最小构造 */
	public User(String username, String password, String email,
			Timestamp createTime,Integer level, Integer privilege) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.createTime = createTime;
		this.level = level;
		this.privilege = privilege;
	}

	/** 完全构造 */
	public User(String username, String password, String sex, String email, String userAvatarURL,
				Timestamp createTime, Timestamp updateTime, Integer level, String activeCode,
				Integer hasActive, String signature, Integer privilege, Set topics, Set replys,
				Set notices, Set blackList, Set loginLog, Set bestTopics) {
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.userAvatarURL = userAvatarURL;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.email = email;
		this.signature = signature;
		this.level = level;
		this.activeCode = activeCode;
		this.hasActive = hasActive;
		this.privilege = privilege;
		this.topics = topics;
		this.replys = replys;
		this.notices = notices;
		this.blackList = blackList;
		this.loginLog = loginLog;
		this.bestTopics = bestTopics;
	}


	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getActiveCode() {
		return this.activeCode;
	}

	public void setActiveCode(String activeCode) {
		this.activeCode = activeCode;
	}

	public Integer getHasActive() {
		return this.hasActive;
	}

	public void setHasActive(Integer hasActive) {
		this.hasActive = hasActive;
	}

	public String getUserAvatarURL() {
		return userAvatarURL;
	}

	public void setUserAvatarURL(String userAvatarURL) {
		this.userAvatarURL = userAvatarURL;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}

	public Set getTopics() {
		return topics;
	}

	public void setTopics(Set topics) {
		this.topics = topics;
	}

	public Set getReplys() {
		return replys;
	}

	public void setReplys(Set replys) {
		this.replys = replys;
	}

	public Set getNotices() {
		return notices;
	}

	public void setNotices(Set notices) {
		this.notices = notices;
	}

	public Set getBlackList() {
		return blackList;
	}

	public void setBlackList(Set blackList) {
		this.blackList = blackList;
	}

	public Set getLoginLog() {
		return loginLog;
	}

	public void setLoginLog(Set loginLog) {
		this.loginLog = loginLog;
	}

	public Set getBestTopics() {
		return bestTopics;
	}

	public void setBestTopics(Set bestTopics) {
		this.bestTopics = bestTopics;
	}
}
