package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.ProductAttrValueMapper;
import com.zc.modules.project.entity.ProductAttrValue;
import com.zc.modules.project.service.ProductAttrValueService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * spu属性值 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueMapper, ProductAttrValue> implements ProductAttrValueService {

    private final ProductAttrValueMapper productAttrValueMapper;

    /**
     * 查询spu属性值信息
     *
     * @param id spu属性值ID
     * @return spu属性值信息
     */
    @Override
    public ProductAttrValue selectByPrimaryKey(Long id) {
        return productAttrValueMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询spu属性值列表
     *
     * @param record spu属性值信息
     * @return spu属性值集合
     */
    @Override
    public List<ProductAttrValue> selectListBySelective(ProductAttrValue record) {
        return productAttrValueMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询spu属性值列表
     *
     * @param record spu属性值信息
     * @param page mybatis-plus 分页对象
     * @return spu属性值集合
     */
    @Override
    public IPage<ProductAttrValue> selectPageBySelective(ProductAttrValue record, Page page) {
        return productAttrValueMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询spu属性值列表
     *
     * @param ids spu属性值主键List集合
     * @return spu属性值集合
     */
    @Override
    public List<ProductAttrValue> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return productAttrValueMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record spu属性值 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(ProductAttrValue record) {
        return productAttrValueMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record spu属性值 信息
     * @return 插入数量
     */
    @Override
    public int insert(ProductAttrValue record) {
        return productAttrValueMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record spu属性值 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(ProductAttrValue record) {
        return productAttrValueMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList spu属性值集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<ProductAttrValue> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<ProductAttrValue>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<ProductAttrValue> records : list) {
            int count = productAttrValueMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu属性值 信息
     * @return 修改数量
     */
    @Override
    public int update(ProductAttrValue record) {
        return productAttrValueMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu属性值 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(ProductAttrValue record) {
        return productAttrValueMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu属性值 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<ProductAttrValue> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<ProductAttrValue>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<ProductAttrValue> records : list) {
            int count = productAttrValueMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu属性值 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<ProductAttrValue> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<ProductAttrValue>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<ProductAttrValue> records : listLists) {
            int count = productAttrValueMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id spu属性值 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return productAttrValueMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu属性值 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return productAttrValueMapper.deleteByPrimaryKeys(ids);
    }

}
