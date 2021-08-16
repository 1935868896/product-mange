package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SkuInfoMapper;
import com.zc.modules.project.entity.SkuInfo;
import com.zc.modules.project.service.SkuInfoService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * sku 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoMapper, SkuInfo> implements SkuInfoService {

    private final SkuInfoMapper skuInfoMapper;

    /**
     * 查询sku信息
     *
     * @param id skuID
     * @return sku信息
     */
    @Override
    public SkuInfo selectByPrimaryKey(Long id) {
        return skuInfoMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询sku列表
     *
     * @param record sku信息
     * @return sku集合
     */
    @Override
    public List<SkuInfo> selectListBySelective(SkuInfo record) {
        return skuInfoMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询sku列表
     *
     * @param record sku信息
     * @param page mybatis-plus 分页对象
     * @return sku集合
     */
    @Override
    public IPage<SkuInfo> selectPageBySelective(SkuInfo record, Page page) {
        return skuInfoMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询sku列表
     *
     * @param ids sku主键List集合
     * @return sku集合
     */
    @Override
    public List<SkuInfo> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return skuInfoMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record sku 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SkuInfo record) {
        return skuInfoMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record sku 信息
     * @return 插入数量
     */
    @Override
    public int insert(SkuInfo record) {
        return skuInfoMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record sku 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SkuInfo record) {
        return skuInfoMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList sku集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SkuInfo> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuInfo>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuInfo> records : list) {
            int count = skuInfoMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record sku 信息
     * @return 修改数量
     */
    @Override
    public int update(SkuInfo record) {
        return skuInfoMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record sku 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SkuInfo record) {
        return skuInfoMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList sku 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SkuInfo> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuInfo>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuInfo> records : list) {
            int count = skuInfoMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList sku 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SkuInfo> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuInfo>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuInfo> records : listLists) {
            int count = skuInfoMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id sku 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return skuInfoMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids sku 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return skuInfoMapper.deleteByPrimaryKeys(ids);
    }

}
