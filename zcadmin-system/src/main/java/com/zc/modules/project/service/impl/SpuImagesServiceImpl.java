package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SpuImagesMapper;
import com.zc.modules.project.entity.SpuImages;
import com.zc.modules.project.service.SpuImagesService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * spu图片 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesMapper, SpuImages> implements SpuImagesService {

    private final SpuImagesMapper spuImagesMapper;

    /**
     * 查询spu图片信息
     *
     * @param id spu图片ID
     * @return spu图片信息
     */
    @Override
    public SpuImages selectByPrimaryKey(Long id) {
        return spuImagesMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询spu图片列表
     *
     * @param record spu图片信息
     * @return spu图片集合
     */
    @Override
    public List<SpuImages> selectListBySelective(SpuImages record) {
        return spuImagesMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询spu图片列表
     *
     * @param record spu图片信息
     * @param page mybatis-plus 分页对象
     * @return spu图片集合
     */
    @Override
    public IPage<SpuImages> selectPageBySelective(SpuImages record, Page page) {
        return spuImagesMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询spu图片列表
     *
     * @param ids spu图片主键List集合
     * @return spu图片集合
     */
    @Override
    public List<SpuImages> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return spuImagesMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record spu图片 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SpuImages record) {
        return spuImagesMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record spu图片 信息
     * @return 插入数量
     */
    @Override
    public int insert(SpuImages record) {
        return spuImagesMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record spu图片 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SpuImages record) {
        return spuImagesMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList spu图片集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SpuImages> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuImages>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuImages> records : list) {
            int count = spuImagesMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu图片 信息
     * @return 修改数量
     */
    @Override
    public int update(SpuImages record) {
        return spuImagesMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu图片 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SpuImages record) {
        return spuImagesMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu图片 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SpuImages> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuImages>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuImages> records : list) {
            int count = spuImagesMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu图片 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SpuImages> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuImages>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuImages> records : listLists) {
            int count = spuImagesMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id spu图片 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return spuImagesMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu图片 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return spuImagesMapper.deleteByPrimaryKeys(ids);
    }

}
