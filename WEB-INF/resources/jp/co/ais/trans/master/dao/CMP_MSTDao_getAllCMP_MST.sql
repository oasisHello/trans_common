SELECT ENV_MST.KAI_CODE, CMP_MST.CMP_KMK_NAME, CMP_MST.CMP_HKM_NAME, CMP_MST.CMP_UKM_NAME, CMP_MST.KNR_NAME_1, CMP_MST.KNR_NAME_2, CMP_MST.KNR_NAME_3, CMP_MST.KNR_NAME_4, CMP_MST.KNR_NAME_5, CMP_MST.KNR_NAME_6, CMP_MST.CMP_HM_NAME_1, CMP_MST.CMP_HM_NAME_2, CMP_MST.CMP_HM_NAME_3, CMP_MST.JID_1, CMP_MST.JID_2, CMP_MST.JID_3, CMP_MST.CUR_CODE, CMP_MST.CMP_UKM_KBN, CMP_MST.KNR_KBN_1, CMP_MST.KNR_KBN_2, CMP_MST.KNR_KBN_3, CMP_MST.KNR_KBN_4, CMP_MST.KNR_KBN_5, CMP_MST.KNR_KBN_6, CMP_MST.CMP_HM_KBN_1, CMP_MST.CMP_HM_KBN_2, CMP_MST.CMP_HM_KBN_3, CMP_MST.CMP_KISYU, CMP_MST.AUTO_NO_KETA, CMP_MST.PRINT_KBN, CMP_MST.PRINT_DEF, CMP_MST.CMP_G_SHONIN_FLG, CMP_MST.CMP_K_SHONIN_FLG, CMP_MST.RATE_KBN, CMP_MST.KU_KBN, CMP_MST.KB_KBN, CMP_MST.PRG_ID, CMP_MST.USR_ID, CMP_MST.INP_DATE, CMP_MST.UPD_DATE 

FROM ENV_MST LEFT OUTER JOIN  CMP_MST
ON CMP_MST.KAI_CODE = ENV_MST.KAI_CODE

 WHERE 
 	1 = 1
 	
 	/*IF kaiCode != null && kaiCode !="" */
 		AND ENV_MST.KAI_CODE =  /*kaiCode*/ 
 	/*END*/ 
 
 ORDER BY ENV_MST.KAI_CODE