package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * 商品属性表 pms_attr
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="商品属性",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attr extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="属性id",name="attrId")
    private Long attrId;

    @ApiModelProperty(value="属性名",name="attrName")
    private String attrName;

    @ApiModelProperty(value="是否需要检索[0-不需要，1-需要]",name="searchType")
    private Integer searchType;

    @ApiModelProperty(value="属性图标",name="icon")
    private String icon;

    @ApiModelProperty(value="可选值列表[用逗号分隔]",name="valueSelect")
    private String valueSelect;

    @ApiModelProperty(value="属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]",name="attrType")
    private Integer attrType;

    @ApiModelProperty(value="启用状态[0 - 禁用，1 - 启用]",name="enable")
    private Long enable;

    @ApiModelProperty(value="所属分类",name="catelogId")
    private Long catelogId;

    @ApiModelProperty(value="快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整",name="showDesc")
    private Integer showDesc;

    @ApiModelProperty(value="",name="valueType")
    private Integer valueType;

}
