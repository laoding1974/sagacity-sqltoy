/**
 *@Generated by sagacity-quickvo 4.12
 */
package ${quickVO.voPackage}.${quickVO.abstractPath};

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
<#if (quickVO.type=="TABLE")>
import org.sagacity.sqltoy.config.annotation.Id;
</#if>
import org.sagacity.sqltoy.config.annotation.Column;
<#if (quickVO.swaggerModel)>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
<#if (quickVO.hasBusinessId==true)>
import org.sagacity.sqltoy.config.annotation.BusinessId;
</#if>
<#if (quickVO.imports?exists && quickVO.imports?size>0)>
<#list quickVO.imports as import>
import ${import};
</#list>
</#if>

<#if (quickVO.exportTables?exists)>
import org.sagacity.sqltoy.config.annotation.OneToMany;
import java.util.List;
import java.util.ArrayList;
<#list quickVO.exportTables as exportTable>
import ${quickVO.voPackage}.${exportTable.pkRefTableJavaName?cap_first};
</#list>
</#if>

/**
 * @project <#if (quickVO.projectName?exists)>${quickVO.projectName}</#if>
 * @version <#if (quickVO.version?exists)>${quickVO.version}</#if>
 * Table: ${quickVO.tableName}<#if (quickVO.tableRemark?exists && quickVO.tableRemark!='')>,Remark:${quickVO.tableRemark}</#if>  
 */
<#if (quickVO.swaggerModel)>
@ApiModel(value="${quickVO.voName}"<#if (quickVO.tableRemark?exists && quickVO.tableRemark!='')>,description="${quickVO.tableRemark}"</#if>)
</#if>
@Entity(tableName="${quickVO.tableName}"<#if (quickVO.pkConstraint?exists)>,pk_constraint="${quickVO.pkConstraint}"</#if><#if (quickVO.schema?exists && quickVO.schema!='')>,schema="${quickVO.schema}"</#if>)
public abstract class Abstract${quickVO.voName} implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties <#assign paramCnt="0"/>
	 //<#list quickVO.columns as column><#if (paramCnt=='1')>,</#if><#assign paramCnt='1'/>${column.colJavaName?uncap_first}</#list>
	 
	 //not null properties<#assign paramCnt="0"/>
	 //<#list quickVO.columns as column><#if (column.nullable=='0')><#if (paramCnt=='1')>,</#if><#assign paramCnt='1'/>${column.colJavaName?uncap_first}</#if></#list>

	/**
	 * 
	 */
	private static final long serialVersionUID = ${quickVO.abstractVOSerialUID}L;
	
<#list quickVO.columns as column>
	/**
	 * jdbcType:${column.colType!""}
	 * ${column.colRemark!""}
	 */
	<#if (quickVO.swaggerModel)>
	@ApiModelProperty(value="${column.colRemark}"<#if (column.nullable=='0')>,allowEmptyValue=false<#else>,allowEmptyValue=true</#if>)
	</#if>
	<#if (column.pkFlag?exists && column.pkFlag=='1')>
	@Id<#if (column.businessIdConfig?exists)><#else><#if (quickVO.singlePk=='1')>(strategy="${column.strategy}"<#if (column.sequence?exists && column.sequence!='')>,sequence="${column.sequence}"</#if><#if (column.generator?exists && column.generator!='')>,generator="${column.generator}"</#if>)</#if></#if>
	</#if>
	<#if (column.businessIdConfig?exists)>
	<#assign businessId=column.businessIdConfig/>
	@BusinessId(generator="${businessId.generator}"<#if (businessId.signature?exists)>,signature="${businessId.signature}"</#if><#if (businessId.relatedColumns?exists)>,relatedColumns={<#list businessId.relatedColumns as relatedCol><#if (relatedCol_index>0)>,</#if>"${relatedCol}"</#list>}</#if><#if (businessId.length?exists)>,length=${businessId.length}</#if><#if (businessId.sequenceSize?exists)>,sequenceSize=${businessId.sequenceSize}</#if>)
	</#if>
	@Column(name="${column.colName}"<#if (column.precision?exists)>,length=${column.precision?c}L</#if><#if (column.defaultValue?exists)>,defaultValue="${column.defaultValue}"</#if>,type=java.sql.Types.<#if (column.dataType?upper_case=='INT')>INTEGER<#else>${column.dataType?upper_case}</#if>,nullable=<#if (column.nullable=='0')>false<#else>true</#if><#if column.autoIncrement=='true'>,autoIncrement=true</#if>)
	protected ${column.resultType} ${column.colJavaName?uncap_first};
	
</#list>

<#if (quickVO.exportTables?exists)>
<#list quickVO.exportTables as exportTable>
	/**
	 * 主键关联子表信息
	 */
	@OneToMany(fields={${exportTable.pkColJavaName}},mappedTable="${exportTable.pkRefTableName}",mappedColumns={${exportTable.pkRefColName}},mappedFields={${exportTable.pkRefColJavaName}}<#if (exportTable.load?exists)>,load="${exportTable.load}"</#if><#if (exportTable.updateSql?exists)>,update="${exportTable.updateSql}"</#if><#if (exportTable.deleteRule==0)>,delete=false</#if>)
	protected List<${exportTable.pkRefTableJavaName?cap_first}> ${exportTable.pkRefTableJavaName?uncap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s=new ArrayList<${exportTable.pkRefTableJavaName?cap_first}>();

</#list>
</#if>
<#if (quickVO.type=='TABLE')>
	/** default constructor */
	public Abstract${quickVO.voName}() {
	}
	
<#if (quickVO.singlePk=='1'||quickVO.singlePk=='0')>
<#assign paramCnt="0"/> 
	/** pk constructor */
	public Abstract${quickVO.voName}(<#list quickVO.columns as column><#if (column.pkFlag=='1')><#if (paramCnt=='1')>,</#if><#assign paramCnt='1'/>${column.resultType} ${column.colJavaName?uncap_first}</#if></#list>)
	{
		<#list quickVO.columns as column>
		<#if (column.pkFlag=='1')>
		this.${column.colJavaName?uncap_first}=${column.colJavaName?uncap_first};
		</#if>
		</#list>
	}
</#if>

<#if (quickVO.pkSizeEqualNotNullSize=='0' && quickVO.fullNotNull=='0')>	
<#assign paramCnt="0"/> 
	/** minimal constructor */
	public Abstract${quickVO.voName}(<#list quickVO.columns as column><#if (column.nullable=='0')><#if (paramCnt=='1')>,</#if><#assign paramCnt='1'/>${column.resultType} ${column.colJavaName?uncap_first}</#if></#list>)
	{
		<#list quickVO.columns as column>
		<#if (column.nullable=='0')>
		this.${column.colJavaName?uncap_first}=${column.colJavaName?uncap_first};
		</#if>
		</#list>
	}
</#if>

<#if (quickVO.pkIsAllColumn=='0')>
<#assign paramCnt="0"/>	
	/** full constructor */
	public Abstract${quickVO.voName}(<#list quickVO.columns as column><#if (paramCnt=='1')>,</#if><#assign paramCnt='1'/>${column.resultType} ${column.colJavaName?uncap_first}</#list>)
	{
		<#list quickVO.columns as column>
		this.${column.colJavaName?uncap_first}=${column.colJavaName?uncap_first};
		</#list>
	}
</#if>
</#if>
<#list quickVO.columns as column>
	
	/**
	 *@param ${column.colJavaName?uncap_first} the ${column.colJavaName?uncap_first} to set
	 */
	<#if (quickVO.returnSelf==true)>
	public Abstract${quickVO.voName} set${column.colJavaName?cap_first}(${column.resultType} ${column.colJavaName?uncap_first}) {
		this.${column.colJavaName?uncap_first}=${column.colJavaName?uncap_first};
		return this;
	}
	<#else>
	public void set${column.colJavaName?cap_first}(${column.resultType} ${column.colJavaName?uncap_first}) {
		this.${column.colJavaName?uncap_first}=${column.colJavaName?uncap_first};
	}
	</#if>
		
	/**
	 *@return the ${column.colJavaName}
	 */
	public ${column.resultType} get${column.colJavaName?cap_first}() {
	    return this.${column.colJavaName?uncap_first};
	}
</#list>


<#if (quickVO.exportTables?exists)>
<#list quickVO.exportTables as exportTable>
	/**
	 * @return the ${exportTable.pkRefTableJavaName?uncap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s
	 */
	public List<${exportTable.pkRefTableJavaName?cap_first}> get${exportTable.pkRefTableJavaName?cap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s() {
		return this.${exportTable.pkRefTableJavaName?uncap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s;
	}
	
	public void set${exportTable.pkRefTableJavaName?cap_first}s(List<${exportTable.pkRefTableJavaName?cap_first}> ${exportTable.pkRefTableJavaName?uncap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s)	{
		this.${exportTable.pkRefTableJavaName?uncap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s=${exportTable.pkRefTableJavaName?uncap_first}<#if exportTable.pkRefTableJavaName?ends_with("s")>e</#if>s;
	}
</#list>
</#if>

	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		<#list quickVO.columns as column>
		columnsBuffer.append("${column.colJavaName?uncap_first}=").append(get${column.colJavaName?cap_first}()).append("\n");
		</#list>
		return columnsBuffer.toString();
	}
}