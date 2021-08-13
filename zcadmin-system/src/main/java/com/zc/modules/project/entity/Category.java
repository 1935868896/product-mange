package com.zc.modules.project.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;

import java.util.Date;

/**
 * 商品三级分类表 pms_category
 *
 * @author Zhang C
 * @date 2021-08-13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="商品三级分类",parent=BaseEntity.class)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="分类id",name="catId")
    private Long catId;

    @ApiModelProperty(value="分类名称",name="name")
    private String name;

    @ApiModelProperty(value="父分类id",name="parentCid")
    private Long parentCid;

    @ApiModelProperty(value="层级",name="catLevel")
    private Integer catLevel;

    @ApiModelProperty(value="是否显示[0-不显示，1显示]",name="showStatus")
    private Integer showStatus;

    @ApiModelProperty(value="排序",name="sort")
    private Integer sort;

    @ApiModelProperty(value="图标地址",name="icon")
    private String icon;

    @ApiModelProperty(value="计量单位",name="productUnit")
    private String productUnit;

    @ApiModelProperty(value="商品数量",name="productCount")
    private Integer productCount;

}
