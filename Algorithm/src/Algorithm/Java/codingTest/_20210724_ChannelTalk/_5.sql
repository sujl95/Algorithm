-- 코드를 입력하세요
SELECT RES AS '후기 수', COUNT(RES) AS '공간 수'
FROM (
         SELECT P.ID, CASE
                          WHEN P.CNT = 0 THEN '0'
                          WHEN P.CNT > 0 AND P.CNT < 50 THEN '< 50'
                          WHEN P.CNT > 50 AND P.CNT < 100 THEN '< 100'
                          WHEN P.CNT >= 100 THEN '>= 100'
             END AS RES
         FROM (
                  SELECT P.ID, IFNULL(PR.CNT,0) AS CNT FROM PLACES P
                                                                LEFT JOIN (
                      SELECT PLACE_ID, COUNT(*) AS CNT
                      FROM PLACE_REVIEWS
                      GROUP BY PLACE_ID
                      ORDER BY PLACE_ID
                  ) PR ON P.ID = PR.PLACE_ID
              ) P
         GROUP BY P.ID,
                  CASE
                      WHEN P.CNT = 0 THEN '0'
                      WHEN P.CNT > 0 AND P.CNT < 50 THEN '< 50'
                      WHEN P.CNT > 50 AND P.CNT < 100 THEN '< 100'
                      WHEN P.CNT >= 100 THEN '>= 100'
                      END) P
GROUP BY P.RES
ORDER BY FIELD(RES, '0', '< 50','< 100', '>= 100')
;