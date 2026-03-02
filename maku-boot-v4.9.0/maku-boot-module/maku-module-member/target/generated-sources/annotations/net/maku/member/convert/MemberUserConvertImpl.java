package net.maku.member.convert;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import net.maku.member.entity.MemberUserEntity;
import net.maku.member.vo.MemberUserVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-02-10T16:08:40+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
public class MemberUserConvertImpl implements MemberUserConvert {

    @Override
    public MemberUserEntity convert(MemberUserVO vo) {
        if ( vo == null ) {
            return null;
        }

        MemberUserEntity memberUserEntity = new MemberUserEntity();

        memberUserEntity.setAvatar( vo.getAvatar() );
        memberUserEntity.setBirthday( vo.getBirthday() );
        memberUserEntity.setCreateTime( vo.getCreateTime() );
        memberUserEntity.setGender( vo.getGender() );
        memberUserEntity.setId( vo.getId() );
        memberUserEntity.setLastLoginIp( vo.getLastLoginIp() );
        memberUserEntity.setLastLoginTime( vo.getLastLoginTime() );
        memberUserEntity.setMobile( vo.getMobile() );
        memberUserEntity.setNickName( vo.getNickName() );
        memberUserEntity.setRemark( vo.getRemark() );
        memberUserEntity.setStatus( vo.getStatus() );

        return memberUserEntity;
    }

    @Override
    public MemberUserVO convert(MemberUserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MemberUserVO memberUserVO = new MemberUserVO();

        memberUserVO.setAvatar( entity.getAvatar() );
        memberUserVO.setBirthday( entity.getBirthday() );
        memberUserVO.setCreateTime( entity.getCreateTime() );
        memberUserVO.setGender( entity.getGender() );
        memberUserVO.setId( entity.getId() );
        memberUserVO.setLastLoginIp( entity.getLastLoginIp() );
        memberUserVO.setLastLoginTime( entity.getLastLoginTime() );
        memberUserVO.setMobile( entity.getMobile() );
        memberUserVO.setNickName( entity.getNickName() );
        memberUserVO.setRemark( entity.getRemark() );
        memberUserVO.setStatus( entity.getStatus() );

        return memberUserVO;
    }

    @Override
    public List<MemberUserVO> convertList(List<MemberUserEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<MemberUserVO> list1 = new ArrayList<MemberUserVO>( list.size() );
        for ( MemberUserEntity memberUserEntity : list ) {
            list1.add( convert( memberUserEntity ) );
        }

        return list1;
    }
}
