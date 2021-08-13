package com.zc.modules.project.vo;

import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * @author ZhangC
 * @create 2021-08-13-16:28
 */
@EqualsAndHashCode()
@Data
@ApiModel(description="商品信息",parent= BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryVo {
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

    @ApiModelProperty(value="子数据",name="child")
    private List<CategoryVo> child;
}
