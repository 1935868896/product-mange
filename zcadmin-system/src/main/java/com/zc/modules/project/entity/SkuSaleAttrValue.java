package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * sku销售属性&值表 pms_sku_sale_attr_value
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="sku销售属性&值",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkuSaleAttrValue extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="id",name="id")
    private Long id;

    @ApiModelProperty(value="sku_id",name="skuId")
    private Long skuId;

    @ApiModelProperty(value="attr_id",name="attrId")
    private Long attrId;

    @ApiModelProperty(value="销售属性名",name="attrName")
    private String attrName;

    @ApiModelProperty(value="销售属性值",name="attrValue")
    private String attrValue;

    @ApiModelProperty(value="顺序",name="attrSort")
    private Integer attrSort;

}
