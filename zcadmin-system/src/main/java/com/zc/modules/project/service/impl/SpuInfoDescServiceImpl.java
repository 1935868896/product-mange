package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SpuInfoDescMapper;
import com.zc.modules.project.entity.SpuInfoDesc;
import com.zc.modules.project.service.SpuInfoDescService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * spu介绍 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescMapper, SpuInfoDesc> implements SpuInfoDescService {

    private final SpuInfoDescMapper spuInfoDescMapper;

    /**
     * 查询spu介绍信息
     *
     * @param id spu介绍ID
     * @return spu介绍信息
     */
    @Override
    public SpuInfoDesc selectByPrimaryKey(Long id) {
        return spuInfoDescMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询spu介绍列表
     *
     * @param record spu介绍信息
     * @return spu介绍集合
     */
    @Override
    public List<SpuInfoDesc> selectListBySelective(SpuInfoDesc record) {
        return spuInfoDescMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询spu介绍列表
     *
     * @param record spu介绍信息
     * @param page mybatis-plus 分页对象
     * @return spu介绍集合
     */
    @Override
    public IPage<SpuInfoDesc> selectPageBySelective(SpuInfoDesc record, Page page) {
        return spuInfoDescMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询spu介绍列表
     *
     * @param ids spu介绍主键List集合
     * @return spu介绍集合
     */
    @Override
    public List<SpuInfoDesc> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return spuInfoDescMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record spu介绍 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SpuInfoDesc record) {
        return spuInfoDescMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record spu介绍 信息
     * @return 插入数量
     */
    @Override
    public int insert(SpuInfoDesc record) {
        return spuInfoDescMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record spu介绍 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SpuInfoDesc record) {
        return spuInfoDescMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList spu介绍集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SpuInfoDesc> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuInfoDesc>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuInfoDesc> records : list) {
            int count = spuInfoDescMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu介绍 信息
     * @return 修改数量
     */
    @Override
    public int update(SpuInfoDesc record) {
        return spuInfoDescMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu介绍 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SpuInfoDesc record) {
        return spuInfoDescMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu介绍 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SpuInfoDesc> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuInfoDesc>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuInfoDesc> records : list) {
            int count = spuInfoDescMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu介绍 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SpuInfoDesc> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuInfoDesc>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuInfoDesc> records : listLists) {
            int count = spuInfoDescMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id spu介绍 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return spuInfoDescMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu介绍 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return spuInfoDescMapper.deleteByPrimaryKeys(ids);
    }

}
