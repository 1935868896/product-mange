package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * spu属性值表 pms_product_attr_value
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="spu属性值",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAttrValue extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="id",name="id")
    private Long id;

    @ApiModelProperty(value="商品id",name="spuId")
    private Long spuId;

    @ApiModelProperty(value="属性id",name="attrId")
    private Long attrId;

    @ApiModelProperty(value="属性名",name="attrName")
    private String attrName;

    @ApiModelProperty(value="属性值",name="attrValue")
    private String attrValue;

    @ApiModelProperty(value="顺序",name="attrSort")
    private Integer attrSort;

    @ApiModelProperty(value="快速展示【是否展示在介绍上；0-否 1-是】",name="quickShow")
    private Integer quickShow;

}
