package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * sku图片表 pms_sku_images
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="sku图片",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkuImages extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="id",name="id")
    private Long id;

    @ApiModelProperty(value="sku_id",name="skuId")
    private Long skuId;

    @ApiModelProperty(value="图片地址",name="imgUrl")
    private String imgUrl;

    @ApiModelProperty(value="排序",name="imgSort")
    private Integer imgSort;

    @ApiModelProperty(value="默认图[0 - 不是默认图，1 - 是默认图]",name="defaultImg")
    private Integer defaultImg;

}
