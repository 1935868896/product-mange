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
 * spu表 pms_spu_info
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="spu",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpuInfo extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="商品id",name="id")
    private Long id;

    @ApiModelProperty(value="商品名称",name="spuName")
    private String spuName;

    @ApiModelProperty(value="商品描述",name="spuDescription")
    private String spuDescription;

    @ApiModelProperty(value="所属分类id",name="catalogId")
    private Long catalogId;

    @ApiModelProperty(value="品牌id",name="brandId")
    private Long brandId;

    @ApiModelProperty(value="",name="weight")
    private BigDecimal weight;

    @ApiModelProperty(value="上架状态[0 - 下架，1 - 上架]",name="publishStatus")
    private Integer publishStatus;

}
