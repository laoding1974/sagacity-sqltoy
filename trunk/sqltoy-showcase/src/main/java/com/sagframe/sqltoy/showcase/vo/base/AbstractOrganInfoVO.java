/**
 *@Generated by sagacity-quickvo 4.13
 */
package com.sagframe.sqltoy.showcase.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.time.LocalDateTime;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sqltoy_organ_info,Remark:机构信息表  
 */
@Entity(tableName="sqltoy_organ_info",pk_constraint="PRIMARY")
public abstract class AbstractOrganInfoVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //organId,organName,organCode,costNo,organPid,nodeRoute,nodeLevel,isLeaf,showIndex,createBy,createTime,updateBy,updateTime,status
	 
	 //not null properties
	 //organId,organName,organCode,organPid,showIndex,createBy,createTime,updateBy,updateTime,status

	/**
	 * 
	 */
	private static final long serialVersionUID = 686784626121428119L;
	
	/**
	 * 机构ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="ORGAN_ID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organId;
	
	/**
	 * 机构名称
	 */
	@Column(name="ORGAN_NAME",length=100L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organName;
	
	/**
	 * 机构代码
	 */
	@Column(name="ORGAN_CODE",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organCode;
	
	/**
	 * 成本中心代码
	 */
	@Column(name="COST_NO",length=20L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String costNo;
	
	/**
	 * 父机构ID
	 */
	@Column(name="ORGAN_PID",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String organPid;
	
	/**
	 * 节点路径
	 */
	@Column(name="NODE_ROUTE",length=200L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String nodeRoute;
	
	/**
	 * 节点等级
	 */
	@Column(name="NODE_LEVEL",length=1L,type=java.sql.Types.INTEGER,nullable=true)
	protected Integer nodeLevel;
	
	/**
	 * 是否叶子节点
	 */
	@Column(name="IS_LEAF",length=1L,type=java.sql.Types.INTEGER,nullable=true)
	protected Integer isLeaf;
	
	/**
	 * 显示顺序
	 */
	@Column(name="SHOW_INDEX",length=8L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer showIndex;
	
	/**
	 * 创建人
	 */
	@Column(name="CREATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String createBy;
	
	/**
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime createTime;
	
	/**
	 * 最后修改人
	 */
	@Column(name="UPDATE_BY",length=22L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String updateBy;
	
	/**
	 * 最后修改时间
	 */
	@Column(name="UPDATE_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime updateTime;
	
	/**
	 * 状态
	 */
	@Column(name="STATUS",length=1L,defaultValue="1",type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	

	/** default constructor */
	public AbstractOrganInfoVO() {
	}
	
	/** pk constructor */
	public AbstractOrganInfoVO(String organId)
	{
		this.organId=organId;
	}

	/** minimal constructor */
	public AbstractOrganInfoVO(String organId,String organName,String organCode,String organPid,Integer showIndex,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.organId=organId;
		this.organName=organName;
		this.organCode=organCode;
		this.organPid=organPid;
		this.showIndex=showIndex;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}

	/** full constructor */
	public AbstractOrganInfoVO(String organId,String organName,String organCode,String costNo,String organPid,String nodeRoute,Integer nodeLevel,Integer isLeaf,Integer showIndex,String createBy,LocalDateTime createTime,String updateBy,LocalDateTime updateTime,Integer status)
	{
		this.organId=organId;
		this.organName=organName;
		this.organCode=organCode;
		this.costNo=costNo;
		this.organPid=organPid;
		this.nodeRoute=nodeRoute;
		this.nodeLevel=nodeLevel;
		this.isLeaf=isLeaf;
		this.showIndex=showIndex;
		this.createBy=createBy;
		this.createTime=createTime;
		this.updateBy=updateBy;
		this.updateTime=updateTime;
		this.status=status;
	}
	
	/**
	 *@param organId the organId to set
	 */
	public AbstractOrganInfoVO setOrganId(String organId) {
		this.organId=organId;
		return this;
	}
		
	/**
	 *@return the OrganId
	 */
	public String getOrganId() {
	    return this.organId;
	}
	
	/**
	 *@param organName the organName to set
	 */
	public AbstractOrganInfoVO setOrganName(String organName) {
		this.organName=organName;
		return this;
	}
		
	/**
	 *@return the OrganName
	 */
	public String getOrganName() {
	    return this.organName;
	}
	
	/**
	 *@param organCode the organCode to set
	 */
	public AbstractOrganInfoVO setOrganCode(String organCode) {
		this.organCode=organCode;
		return this;
	}
		
	/**
	 *@return the OrganCode
	 */
	public String getOrganCode() {
	    return this.organCode;
	}
	
	/**
	 *@param costNo the costNo to set
	 */
	public AbstractOrganInfoVO setCostNo(String costNo) {
		this.costNo=costNo;
		return this;
	}
		
	/**
	 *@return the CostNo
	 */
	public String getCostNo() {
	    return this.costNo;
	}
	
	/**
	 *@param organPid the organPid to set
	 */
	public AbstractOrganInfoVO setOrganPid(String organPid) {
		this.organPid=organPid;
		return this;
	}
		
	/**
	 *@return the OrganPid
	 */
	public String getOrganPid() {
	    return this.organPid;
	}
	
	/**
	 *@param nodeRoute the nodeRoute to set
	 */
	public AbstractOrganInfoVO setNodeRoute(String nodeRoute) {
		this.nodeRoute=nodeRoute;
		return this;
	}
		
	/**
	 *@return the NodeRoute
	 */
	public String getNodeRoute() {
	    return this.nodeRoute;
	}
	
	/**
	 *@param nodeLevel the nodeLevel to set
	 */
	public AbstractOrganInfoVO setNodeLevel(Integer nodeLevel) {
		this.nodeLevel=nodeLevel;
		return this;
	}
		
	/**
	 *@return the NodeLevel
	 */
	public Integer getNodeLevel() {
	    return this.nodeLevel;
	}
	
	/**
	 *@param isLeaf the isLeaf to set
	 */
	public AbstractOrganInfoVO setIsLeaf(Integer isLeaf) {
		this.isLeaf=isLeaf;
		return this;
	}
		
	/**
	 *@return the IsLeaf
	 */
	public Integer getIsLeaf() {
	    return this.isLeaf;
	}
	
	/**
	 *@param showIndex the showIndex to set
	 */
	public AbstractOrganInfoVO setShowIndex(Integer showIndex) {
		this.showIndex=showIndex;
		return this;
	}
		
	/**
	 *@return the ShowIndex
	 */
	public Integer getShowIndex() {
	    return this.showIndex;
	}
	
	/**
	 *@param createBy the createBy to set
	 */
	public AbstractOrganInfoVO setCreateBy(String createBy) {
		this.createBy=createBy;
		return this;
	}
		
	/**
	 *@return the CreateBy
	 */
	public String getCreateBy() {
	    return this.createBy;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public AbstractOrganInfoVO setCreateTime(LocalDateTime createTime) {
		this.createTime=createTime;
		return this;
	}
		
	/**
	 *@return the CreateTime
	 */
	public LocalDateTime getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param updateBy the updateBy to set
	 */
	public AbstractOrganInfoVO setUpdateBy(String updateBy) {
		this.updateBy=updateBy;
		return this;
	}
		
	/**
	 *@return the UpdateBy
	 */
	public String getUpdateBy() {
	    return this.updateBy;
	}
	
	/**
	 *@param updateTime the updateTime to set
	 */
	public AbstractOrganInfoVO setUpdateTime(LocalDateTime updateTime) {
		this.updateTime=updateTime;
		return this;
	}
		
	/**
	 *@return the UpdateTime
	 */
	public LocalDateTime getUpdateTime() {
	    return this.updateTime;
	}
	
	/**
	 *@param status the status to set
	 */
	public AbstractOrganInfoVO setStatus(Integer status) {
		this.status=status;
		return this;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("organId=").append(getOrganId()).append("\n");
		columnsBuffer.append("organName=").append(getOrganName()).append("\n");
		columnsBuffer.append("organCode=").append(getOrganCode()).append("\n");
		columnsBuffer.append("costNo=").append(getCostNo()).append("\n");
		columnsBuffer.append("organPid=").append(getOrganPid()).append("\n");
		columnsBuffer.append("nodeRoute=").append(getNodeRoute()).append("\n");
		columnsBuffer.append("nodeLevel=").append(getNodeLevel()).append("\n");
		columnsBuffer.append("isLeaf=").append(getIsLeaf()).append("\n");
		columnsBuffer.append("showIndex=").append(getShowIndex()).append("\n");
		columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
		columnsBuffer.append("updateTime=").append(getUpdateTime()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		return columnsBuffer.toString();
	}
}
