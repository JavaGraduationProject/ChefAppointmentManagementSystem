package com.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.entity.Repair;
@Service("repairService")
public interface RepairService {
	// 插入数据 调用repairDAO里的insertRepair配置
	public int insertRepair(Repair repair);

	// 更新数据 调用repairDAO里的updateRepair配置
	public int updateRepair(Repair repair);

	// 删除数据 调用repairDAO里的deleteRepair配置
	public int deleteRepair(String repairid);

	// 查询全部数据 调用repairDAO里的getAllRepair配置
	public List<Repair> getAllRepair();

	// 按照Repair类里面的字段名称精确查询 调用repairDAO里的getRepairByCond配置
	public List<Repair> getRepairByCond(Repair repair);

	// 按照Repair类里面的字段名称模糊查询 调用repairDAO里的getRepairByLike配置
	public List<Repair> getRepairByLike(Repair repair);

	// 按主键查询表返回单一的Repair实例 调用repairDAO里的getRepairById配置
	public Repair getRepairById(String repairid);

}

