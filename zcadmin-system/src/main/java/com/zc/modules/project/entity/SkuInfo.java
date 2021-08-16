package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

    import java.math.BigDecimal;
/**
 * sku表 pms_sku_info
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="sku",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkuInfo extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="skuId",name="skuId")
    private Long skuId;

    @ApiModelProperty(value="spuId",name="spuId")
    private Long spuId;

    @ApiModelProperty(value="sku名称",name="skuName")
    private String skuName;

    @ApiModelProperty(value="sku介绍描述",name="skuDesc")
    private String skuDesc;

    @ApiModelProperty(value="所属分类id",name="catalogId")
    private Long catalogId;

    @ApiModelProperty(value="品牌id",name="brandId")
    private Long brandId;

    @ApiModelProperty(value="默认图片",name="skuDefaultImg")
    private String skuDefaultImg;

    @ApiModelProperty(value="标题",name="skuTitle")
    private String skuTitle;

    @ApiModelProperty(value="副标题",name="skuSubtitle")
    private String skuSubtitle;

    @ApiModelProperty(value="价格",name="price")
    private BigDecimal price;

    @ApiModelProperty(value="销量",name="saleCount")
    private Long saleCount;

}
