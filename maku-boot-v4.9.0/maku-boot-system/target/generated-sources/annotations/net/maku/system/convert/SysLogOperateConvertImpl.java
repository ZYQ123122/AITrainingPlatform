package net.maku.system.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.system.entity.SysLogOperateEntity;
import net.maku.system.vo.SysLogOperateVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:32+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class SysLogOperateConvertImpl implements SysLogOperateConvert {

    @Override
    public SysLogOperateEntity convert(SysLogOperateVO vo) {
        if ( vo == null ) {
            return null;
        }

        SysLogOperateEntity sysLogOperateEntity = new SysLogOperateEntity();

        sysLogOperateEntity.setAddress( vo.getAddress() );
        sysLogOperateEntity.setCreateTime( vo.getCreateTime() );
        sysLogOperateEntity.setDuration( vo.getDuration() );
        sysLogOperateEntity.setId( vo.getId() );
        sysLogOperateEntity.setIp( vo.getIp() );
        sysLogOperateEntity.setModule( vo.getModule() );
        sysLogOperateEntity.setName( vo.getName() );
        sysLogOperateEntity.setOperateType( vo.getOperateType() );
        sysLogOperateEntity.setRealName( vo.getRealName() );
        sysLogOperateEntity.setReqMethod( vo.getReqMethod() );
        sysLogOperateEntity.setReqParams( vo.getReqParams() );
        sysLogOperateEntity.setReqUri( vo.getReqUri() );
        sysLogOperateEntity.setResultMsg( vo.getResultMsg() );
        sysLogOperateEntity.setStatus( vo.getStatus() );
        sysLogOperateEntity.setUserAgent( vo.getUserAgent() );
        sysLogOperateEntity.setUserId( vo.getUserId() );

        return sysLogOperateEntity;
    }

    @Override
    public SysLogOperateVO convert(SysLogOperateEntity entity) {
        if ( entity == null ) {
            return null;
        }

        SysLogOperateVO sysLogOperateVO = new SysLogOperateVO();

        sysLogOperateVO.setAddress( entity.getAddress() );
        sysLogOperateVO.setCreateTime( entity.getCreateTime() );
        sysLogOperateVO.setDuration( entity.getDuration() );
        sysLogOperateVO.setId( entity.getId() );
        sysLogOperateVO.setIp( entity.getIp() );
        sysLogOperateVO.setModule( entity.getModule() );
        sysLogOperateVO.setName( entity.getName() );
        sysLogOperateVO.setOperateType( entity.getOperateType() );
        sysLogOperateVO.setRealName( entity.getRealName() );
        sysLogOperateVO.setReqMethod( entity.getReqMethod() );
        sysLogOperateVO.setReqParams( entity.getReqParams() );
        sysLogOperateVO.setReqUri( entity.getReqUri() );
        sysLogOperateVO.setResultMsg( entity.getResultMsg() );
        sysLogOperateVO.setStatus( entity.getStatus() );
        sysLogOperateVO.setUserAgent( entity.getUserAgent() );
        sysLogOperateVO.setUserId( entity.getUserId() );

        return sysLogOperateVO;
    }

    @Override
    public List<SysLogOperateVO> convertList(List<SysLogOperateEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<SysLogOperateVO> list1 = new ArrayList<SysLogOperateVO>( list.size() );
        for ( SysLogOperateEntity sysLogOperateEntity : list ) {
            list1.add( convert( sysLogOperateEntity ) );
        }

        return list1;
    }
}
