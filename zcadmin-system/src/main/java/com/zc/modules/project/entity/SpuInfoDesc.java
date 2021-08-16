package com.zc.modules.project.entity;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.zc.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;
import java.util.Date;

/**
 * spu介绍表 pms_spu_info_desc
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(description="spu介绍",parent=BaseEntity.class)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpuInfoDesc extends BaseEntity{

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value="商品id",name="spuId")
    private Long spuId;

    @ApiModelProperty(value="商品介绍",name="decript")
    private String decript;

}
