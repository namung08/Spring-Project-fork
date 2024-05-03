package com.travel.booking.domain.odsay.city;

import com.travel.booking.domain.odsay.ApiDefault;
import com.travel.booking.domain.odsay.OdsayConfig;
//import com.travel.booking.domain.odsay.bus.BusTerminalDTO;
import lombok.RequiredArgsConstructor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CityInfoServiceServiceImpl implements CityInfoService {
    private final OdsayConfig odsayConfig;
    // 도시 코드 얻기 위한 메소드
    @Override
    public List<CityDTO> getCityList() {
        List<CityDTO> cityDtoList = new ArrayList<>();
        StringBuilder urlBuilder =  new ApiDefault(odsayConfig).getURLBuilder("/searchCID",0,odsayConfig.getEtcKey());
        try {
            String result = new ApiDefault(odsayConfig).getResult(urlBuilder);
            System.out.println(result);
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(result);
            JSONObject resultJson = (JSONObject) jsonObject.get("result");
            JSONArray cid = (JSONArray) resultJson.get("CID");
            for (int i = 0; i < cid.size(); i++) {
                JSONObject cityJson = (JSONObject) cid.get(i);
                String cityName = (String) cityJson.get("cityName");
                String cityRegion = (String) cityJson.get("cityRegion");
                String cityCode = (String) cityJson.get("cityCode");
                CityDTO cityDTO = new CityDTO();
                cityDTO.setCityName(cityName);
                cityDTO.setCityRegion(cityRegion);
                cityDTO.setCityCode(cityCode);
                cityDtoList.add(cityDTO);
            }
            return cityDtoList;
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
