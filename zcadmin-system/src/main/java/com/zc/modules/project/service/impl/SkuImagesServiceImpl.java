package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SkuImagesMapper;
import com.zc.modules.project.entity.SkuImages;
import com.zc.modules.project.service.SkuImagesService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * sku图片 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesMapper, SkuImages> implements SkuImagesService {

    private final SkuImagesMapper skuImagesMapper;

    /**
     * 查询sku图片信息
     *
     * @param id sku图片ID
     * @return sku图片信息
     */
    @Override
    public SkuImages selectByPrimaryKey(Long id) {
        return skuImagesMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询sku图片列表
     *
     * @param record sku图片信息
     * @return sku图片集合
     */
    @Override
    public List<SkuImages> selectListBySelective(SkuImages record) {
        return skuImagesMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询sku图片列表
     *
     * @param record sku图片信息
     * @param page mybatis-plus 分页对象
     * @return sku图片集合
     */
    @Override
    public IPage<SkuImages> selectPageBySelective(SkuImages record, Page page) {
        return skuImagesMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询sku图片列表
     *
     * @param ids sku图片主键List集合
     * @return sku图片集合
     */
    @Override
    public List<SkuImages> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return skuImagesMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record sku图片 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SkuImages record) {
        return skuImagesMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record sku图片 信息
     * @return 插入数量
     */
    @Override
    public int insert(SkuImages record) {
        return skuImagesMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record sku图片 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SkuImages record) {
        return skuImagesMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList sku图片集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SkuImages> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuImages>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuImages> records : list) {
            int count = skuImagesMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record sku图片 信息
     * @return 修改数量
     */
    @Override
    public int update(SkuImages record) {
        return skuImagesMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record sku图片 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SkuImages record) {
        return skuImagesMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList sku图片 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SkuImages> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuImages>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuImages> records : list) {
            int count = skuImagesMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList sku图片 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SkuImages> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SkuImages>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SkuImages> records : listLists) {
            int count = skuImagesMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id sku图片 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return skuImagesMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids sku图片 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return skuImagesMapper.deleteByPrimaryKeys(ids);
    }

}
