package com.zc.modules.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zc.modules.project.mapper.SpuInfoMapper;
import com.zc.modules.project.entity.SpuInfo;
import com.zc.modules.project.service.SpuInfoService;
import com.zc.utils.SqlListHandleUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * spu 服务层实现
 *
 * @author Zhang C
 * @date 2021-08-16
 */
@Service
@RequiredArgsConstructor
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoMapper, SpuInfo> implements SpuInfoService {

    private final SpuInfoMapper spuInfoMapper;

    /**
     * 查询spu信息
     *
     * @param id spuID
     * @return spu信息
     */
    @Override
    public SpuInfo selectByPrimaryKey(Long id) {
        return spuInfoMapper.selectByPrimaryKey(id);
    }


    /**
     * 根据条件,查询spu列表
     *
     * @param record spu信息
     * @return spu集合
     */
    @Override
    public List<SpuInfo> selectListBySelective(SpuInfo record) {
        return spuInfoMapper.selectListBySelective(record);
    }

    /**
     * 根据条件,分页查询spu列表
     *
     * @param record spu信息
     * @param page mybatis-plus 分页对象
     * @return spu集合
     */
    @Override
    public IPage<SpuInfo> selectPageBySelective(SpuInfo record, Page page) {
        return spuInfoMapper.selectPageBySelective(record, page);
    }

    /**
     * 根据主键集合,批量查询spu列表
     *
     * @param ids spu主键List集合
     * @return spu集合
     */
    @Override
    public List<SpuInfo> selectByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return null;
        }
        return spuInfoMapper.selectByPrimaryKeys(ids);
    }


    /**
     * 查询符合条件的语句数量
     *
     * @param record spu 信息
     * @return 查询结果数量
     */
    @Override
    public int selectCountBySelective(SpuInfo record) {
        return spuInfoMapper.selectCountBySelective(record);
    }

    /**
     * 插入单条数据
     *
     * @param record spu 信息
     * @return 插入数量
     */
    @Override
    public int insert(SpuInfo record) {
        return spuInfoMapper.insert(record);
    }

    /**
     * 条件插入单条数据
     *
     * @param record spu 信息
     * @return 插入数量
     */
    @Override
    public int insertSelective(SpuInfo record) {
        return spuInfoMapper.insertSelective(record);
    }

    /**
     * 批量插入多条数据
     *
     * @param recordList spu集合
     * @return 插入数量
     */
    @Override
    @Transactional
    public int insertBatch(List<SpuInfo> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuInfo>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuInfo> records : list) {
            int count = spuInfoMapper.insertBatch(records);
            result = result + count;
        }
        return result;
    }

    /**
     * 修改单条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param record spu 信息
     * @return 修改数量
     */
    @Override
    public int update(SpuInfo record) {
        return spuInfoMapper.update(record);
    }
    /**
     * 修改单条数据,仅修改存在数值的属性
     *
     * @param record spu 信息
     * @return 修改数量
     */
    @Override
    public int updateBySelective(SpuInfo record) {
        return spuInfoMapper.updateBySelective(record);
    }
    /**
     * 修改多条数据,若部分属性为null,则将数据库中的数据也修改为null
     *
     * @param recordList spu 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatch(List<SpuInfo> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuInfo>> list = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuInfo> records : list) {
            int count = spuInfoMapper.updateBatch(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 修改多条数据,仅修改存在数值的属性
     *
     * @param recordList spu 集合
     * @return 修改数量
     */
    @Override
    @Transactional
    public int updateBatchBySelective(List<SpuInfo> recordList) {
        int result = 0;
        if (recordList == null || recordList.size() <= 0) {
            return result;
        }
        List<List<SpuInfo>> listLists = SqlListHandleUtils.splitList(recordList, 50);
        for (List<SpuInfo> records : listLists) {
            int count = spuInfoMapper.updateBatchSelective(records);
            result = result + count;
        }
        return result;
    }
    /**
     * 根据主键删除数据
     *
     * @param id spu 主键
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKey(Long id) {
        return spuInfoMapper.deleteByPrimaryKey(id);
    }
    /**
     * 根据主键集合删除数据
     *
     * @param ids spu 主键集合
     * @return 删除数量
     */
    @Override
    public int deleteByPrimaryKeys(List<Long> ids) {
        if (ids == null || ids.size() <= 0) {
            return 0;
        }
        return spuInfoMapper.deleteByPrimaryKeys(ids);
    }

}
