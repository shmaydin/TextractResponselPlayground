package data

    object TextractResponseString {
        val textractFirstTwoPages = """{
  "documentMetadata": { "pages": 2 },
  "jobStatus": "SUCCEEDED",
  "nextToken": "I+wbHPpaLBtajWyCwc8x5yAEQIdgKNLMeAFTuMg4JZ0rAAQyVkw92IeVN1yvqVpNRvkXXxIqCLNsYsKpkC6I4AM2wsXTIynRvZLT3AGMp6PtcdXRqiElnUvxa869ru0S4OAB5vQ=",
  "blocks": [
    {
      "blockType": "PAGE",
      "confidence": null,
      "text": null,
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": { "width": 1.0, "height": 1.0, "left": 0.0, "top": 0.0 },
        "polygon": [
          { "x": 0.0, "y": 8.297335e-7 },
          { "x": 1.0, "y": 0.0 },
          { "x": 1.0, "y": 1.0 },
          { "x": 1.1032571e-6, "y": 1.0 }
        ]
      },
      "id": "ce123df5-6b29-4fb9-9f07-f3c2f44fc7cd",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "4c37a23a-0f47-4fe5-8639-ed5a5f7aa010",
            "177a2601-f7dc-4adb-bfde-5b915f84ec9d",
            "4da70dba-c208-4d21-965a-98a34576cf67",
            "c724a507-64da-4dcc-ab74-13cc7f46a54a",
            "37e5f352-d331-49ff-83be-7270d0278e60",
            "98268c55-e2fc-49b6-a4d0-dc9d5d911b80",
            "851df78f-517d-4a2b-b7ed-58a9b03fba10",
            "f38318b8-25dc-4d34-8b75-2b51e00723e3",
            "4443e532-294c-4547-855d-12d78f328ece",
            "180cb995-d7ae-4bc9-b376-d675f0fe372e",
            "e031d2d6-afa7-4783-a26b-f187c6659c16",
            "23e6aca8-dc7d-47ec-bbde-cd51b183bc2d",
            "1a8dc8b6-d7ed-4cb3-972d-e0addb0c1d41",
            "ec079cfd-28dc-40b0-9b83-d3ef90c9220e",
            "c85e217e-d5ca-4117-b104-a9ab6ae11b52",
            "c8405a2f-f7d3-485c-af68-7b419a407b86",
            "48e7e229-8842-4daf-aa44-e0d5e3a371f8",
            "57cd302a-2256-4dc6-8bbf-1b33a491655b",
            "cba644be-0e91-4655-ad48-151f98bd7167",
            "5b91a8b5-15c3-48e9-859c-03b58301a38d",
            "d65d9995-adb8-4519-b13d-1f52894a557b",
            "0c4ee1d5-2042-4ec6-ade8-efc9e33d1e11",
            "c9c61c6d-c3dc-48e3-bffe-fddb575df974",
            "f1bf0cae-1572-465a-95a2-cc02da3660d0",
            "e7c47e83-8f1e-4ee3-8200-68bd7a74ad7a",
            "ed829ad5-7e26-46f4-a37e-c0020ed6142f",
            "cdb2fe96-4eb6-48a8-a1e7-abc596ca15a1",
            "84d91a4f-b91d-4914-be95-e11535eaf487",
            "5a7ccf51-dd71-45bd-8926-b359a414c6c4",
            "afea6499-0189-4f51-b5f7-4589bc8e787e",
            "1f16c4ee-bf85-43f4-a438-9623697ea077",
            "027c1672-b77f-4551-bc62-727ccc72231c",
            "a6c9044c-2639-47ed-8007-34f0b776deb7",
            "df9f1746-9dc3-4ecf-ac58-35e891350a16",
            "2667877b-fcd9-400f-8403-30f9102936bd",
            "19d74929-2a4f-4292-92e2-e5f6b0770361",
            "b2d538b4-7159-4aeb-b2ea-59f4c94e36d1",
            "12279a5a-cd01-4187-9065-93021457aa65",
            "05f742e4-d3f3-48c6-afc4-970c290e0d49",
            "0a83b5d0-2342-41c0-8772-aac2de52e137",
            "149909e8-dfdd-4b2e-b090-9ea64ba664f1",
            "94207c65-9302-43c6-9da5-bf618c01b8d2",
            "fa107206-27ff-4abc-a231-50b94f826039",
            "6fd58a05-bcf3-4bc4-8dd4-2f33a518a1ed",
            "99a23616-8800-4ef1-89bc-42f8410c2900",
            "bfaa5d5c-f192-4fb3-8102-8cd8b38a478c",
            "e50ce816-2c3d-4163-b425-6ed30a6cf402",
            "6449f71c-bb27-41a5-a04a-7da5cc000b4c",
            "8a090da9-4309-4004-8e22-6a250e21ea52",
            "cac40589-fe35-4548-993a-15774af316a3",
            "2098d992-6052-415f-add1-ad95aef2de6a",
            "ec3ade44-502e-4f50-8a65-374d072dbba0",
            "e51b694c-5315-4fe3-b658-d4be8479a12f",
            "11de8187-d8fe-4521-b654-c13ede1abcae",
            "c8e510bf-b73e-4c4e-9162-b2aaaee4c6d6",
            "431d0916-d404-4099-a947-926d39b47430",
            "1e5f1ad5-3c80-4295-a99a-8d550a5226dc",
            "e8a7c593-bc09-4b00-8c45-b236bb5bfedb",
            "cbbf29ef-a3ab-49c7-9004-5ee821df5dfc",
            "b55f879a-42be-4f20-894e-5ea1e4069d1f",
            "93f0e54c-2c25-4086-b0f2-3442f0f8b8a3",
            "d90b3cb7-327e-4074-9098-87890567ea5d",
            "f0d2ef9a-8f3f-4ac2-a37a-1613bfe03cf7",
            "7b8bea80-e837-4749-b246-11c133c07131",
            "5c36ba48-e55f-4698-b892-ea3f324980e2",
            "958c86b3-1627-4abf-b38f-7f6d85f7864b",
            "f1ccd3b8-e45a-4f81-97e1-3e5ad5777834",
            "0b829b92-ba24-450a-b015-e6401fc72da1",
            "54b56708-2b81-4c21-a09e-2269eb2907f2",
            "f48b01a2-af46-40a0-b6ff-b292ec428582",
            "389d40ba-9178-4d40-b3a3-348c3adbbf68",
            "56eccca9-0058-4066-8ec4-2b561bea4ebe",
            "40aca2ac-4477-4a54-9058-5f2d3f1f2050",
            "05680c33-d57c-4ea1-8fe4-6be2d9ae0aad",
            "94e0800b-a067-4bd6-a3b1-c8fcb9879843",
            "ae03799f-3ed9-4182-8a2d-4439f7a5c841",
            "3c5c214e-d412-4034-b6ef-8e9221cfa2ca",
            "7d58a381-4f78-4956-985a-dd0c3dc9725b",
            "1ce9582a-b1f4-4525-b9d1-f1c0df0b3133",
            "07411efc-5d16-4ca6-bb46-a458c91243df",
            "a9411e30-d1c8-478d-b600-18aa7e98e2a1",
            "a8af249a-393e-41e7-b908-ca4a92981503",
            "c747ef57-3747-4269-995f-48fd5e2f55ec",
            "c1d5601e-2faf-4a30-babc-9b5866e4a9d7",
            "3f5aa576-ca2e-4802-a4e7-7d9e0a8ef10d",
            "bd11e3e5-5789-4e3a-bcdc-2e9d0e7faff2",
            "a693cb49-f716-4a34-b35a-caf417008177",
            "a4c7ad8b-5d50-46e1-adab-c004ce5e625e",
            "8f9a64ec-3c58-45df-aa9d-87904c690f75",
            "de43090a-73a9-4dbe-89bd-9d6f0ff298c7",
            "5a8eeae3-05a7-4a9b-9994-a9978defe955",
            "cf3b9454-7b9e-462e-94f4-7799bbdb7eab",
            "aae6af18-abea-4913-b1ab-0ca36ec1136b",
            "625986c3-320c-41f7-9049-c3cdc8ecbff5",
            "27d2e4e1-83eb-4f4d-9016-6f6ba190a441",
            "11b9b3ac-f021-42e5-8607-15f94266b1b1",
            "24c1ba72-14f1-4ee1-9c1f-c054d969df19",
            "51e0fcf3-d0f7-4791-b9de-0a54f5a6f94c",
            "d85e38bc-f408-464a-b4bf-aca397acfc03",
            "fe3c6198-72c6-4c50-9bd9-42377b080b84",
            "a2ce01e4-c6f7-435b-9cc8-62188866a195",
            "8cf34933-4a7a-4b63-83d9-e2e11be1bf10",
            "ec70f91f-82c5-4252-b773-cc7d0ab07f0f",
            "908b01e6-f9e0-4f3f-bc0d-aa2e8f9083e8",
            "b223325c-c8fb-40a4-94b8-3a12a8ff715b",
            "f1d59638-4764-44a1-a225-886730c482f9",
            "8ba0161e-dfb0-46be-8229-bf9f72cfd95f",
            "2690cb7d-1fbc-4432-ab1c-48b32cb7d49d",
            "e031b00d-a940-47b9-a0ed-46bac8c499a0",
            "b09c1393-637b-4829-aa2d-3864b5cf26f1",
            "199cc11a-80f2-4d30-bd84-60849f085bbb",
            "06de6eb7-0342-4d4a-a63f-5905af657cff",
            "2b099bcf-95ff-45d3-9cde-27759407798e",
            "ba998128-193b-469a-8a0b-f330255ff5b5",
            "c9f890c3-e251-4fb7-b486-4433becfce08",
            "363595b9-ca95-4ae2-b586-5414151405e4",
            "f9a6bce9-33c6-4206-8a28-5efb7bd022f3",
            "8ac533ac-fb54-42d2-a52f-336e12cc4580",
            "0e0c1e27-2b31-40f7-9b12-f57bcccdeb66",
            "a3a796ed-4128-4eaf-8622-b4e124bb514c",
            "41256e2f-1504-480c-9ddd-f2cf785f6a93",
            "1c7af4ad-9287-4852-888b-5bd0733fae0b",
            "43cd93d8-c005-407b-9421-d5b4d968174c",
            "204e5ad1-e739-4362-9281-59fc79b212b4",
            "53f6dae0-6d94-4927-9210-0942deafa49c",
            "73357058-20e9-414f-8c13-227d38c36b4d",
            "8f9530c9-3e34-4d9c-90aa-bd52b6775337",
            "30de05fa-d77a-4bf5-a4e5-4698325af22f",
            "b0362ad1-765b-4a28-961b-2a2c03c73464",
            "e7951903-a63c-4ed4-965b-d1986e7df5ad",
            "94b7bf6f-5898-483a-b972-23187bdecc16",
            "61e5e9d7-18be-4cc0-8b48-5045fa543dea",
            "6166e1c0-56d7-4eaf-bbea-fc62aee6bcb1",
            "05f79f19-d5b1-4338-8dd8-3409d90af865",
            "40107412-b07d-48bc-9f10-e5c11707ebfc",
            "1b01e173-26fa-4f18-840a-1053f3d29308",
            "46edf04d-f56a-40ca-a33a-4c2479a89e8d",
            "f3899b46-aa96-4a75-9442-687010c9ddbe",
            "cefa98c8-f1a8-4d53-8cf6-8e4b1821d721",
            "5f2d5084-1688-4b8a-9efd-53f369d74c90",
            "116a65b0-4678-4755-9325-a82a58af784d",
            "58fbe420-fc68-4a21-b2b7-808b985e66cc",
            "8e7ecc9b-7816-46a5-88f6-dbbc7682a104",
            "853b5c5d-033b-458f-936f-3d18f0cd53dd",
            "3ff528dc-ede4-4f97-8837-03d549a9a39e",
            "1d77a854-6ade-4bc7-9550-4f7237ffaa28",
            "d645daff-1bd7-4922-8681-c76923e38e76",
            "72b26156-fc11-4e35-9218-c3ed5f2179ac",
            "b7390e87-b027-4b0b-8213-ec52162a3bac",
            "385b68e3-af0e-44d9-8ce9-584f20d7a353",
            "83c7812c-a6bd-4495-b630-0b9ea44ed69a",
            "f0a950db-8fff-437a-b88e-adf580944b1b",
            "ef774e6a-0e29-42b9-b132-9d90a7d0df1a",
            "cb951c4e-0381-4fd3-b82d-8d6191f4f0a3",
            "935c754a-3e2d-4cca-93e7-7bd6740c6546",
            "04127db0-8efd-4da7-b30b-bc758698234b",
            "f8b0bc0f-7115-45d9-b0eb-bee91712a0be",
            "a92bd5b8-b2ad-448d-b58a-c4e4796ff096",
            "cc6ecacb-c2c3-45c5-bece-5e708a0690a4",
            "dc99c4b9-e2d2-4af5-9d1c-779d91b96973"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.91281,
      "text": "National Football League Game Summary",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.47430602,
          "height": 0.018797677,
          "left": 0.26289377,
          "top": 0.053528942
        },
        "polygon": [
          { "x": 0.26289377, "y": 0.053930722 },
          { "x": 0.7371764, "y": 0.053528942 },
          { "x": 0.7371998, "y": 0.071924984 },
          { "x": 0.26291367, "y": 0.07232662 }
        ]
      },
      "id": "4c37a23a-0f47-4fe5-8639-ed5a5f7aa010",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "fd5fba02-6901-42c1-8956-d7ba615b40ae",
            "34f275d3-8407-4249-a80a-467b221cc6f6",
            "3273ce0a-f617-4df9-9061-f57f18f24341",
            "f20e9a6b-2cde-4bb1-8483-7e171252dbac",
            "712969d1-4f80-456a-bc5d-95717f68221e"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.8227,
      "text": "NFL Copyright © 2022 by The National Football League. All rights reserved. This summary and play-by-play is for the express purpose of assisting media in their",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.92661977,
          "height": 0.0117682535,
          "left": 0.03584267,
          "top": 0.07926125
        },
        "polygon": [
          { "x": 0.03584267, "y": 0.080045804 },
          { "x": 0.9624475, "y": 0.07926125 },
          { "x": 0.9624624, "y": 0.09024512 },
          { "x": 0.035853572, "y": 0.0910295 }
        ]
      },
      "id": "177a2601-f7dc-4adb-bfde-5b915f84ec9d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "a83f3fbd-ffbd-489b-b166-c44b3c2752b5",
            "bf38f295-9a2b-41f1-9bec-08973785fae8",
            "1587d131-51ce-447c-996b-d723555e59c8",
            "d2e8cf06-16c1-43e1-b2ab-c64b477d44cb",
            "d43e2c2a-3293-467c-85a3-bd7858bad9ae",
            "fcbe0bb5-6118-4f5d-a1be-fccd80e5cb18",
            "9e8bf3bd-834d-4919-8818-83613516eb36",
            "9bb9c86c-1f0b-4be9-a649-b88e0842ec96",
            "5e1c3cbd-c51f-4c19-a6d3-581753fe1166",
            "52185a8c-1f0d-457b-abac-ea2520c59d4a",
            "de69e199-b302-4720-92d4-97de42bf9fc9",
            "0844ecb8-55c7-4247-9451-b032763f1b80",
            "552c508c-783e-41ae-8909-db0d32121fda",
            "454238b9-49e2-4a48-ac9b-af3464d1c275",
            "42e2d4ba-0a6c-4174-806a-38e6e643b175",
            "df65eebf-c0dd-4f12-9b68-dd27bf10b569",
            "7acad3fb-94a4-433f-8562-d1bcc9bba281",
            "ce39d8e8-84e4-47c8-adf4-bd9ebe0722ce",
            "2518b4ff-e7da-4cb3-93f1-934b292eca57",
            "a042bc2e-c4c8-407e-97f3-09bb2e6c5a0e",
            "907162eb-63ff-4f73-a476-ae8ef2c6c921",
            "fb73e412-2ab3-42af-b5dd-4429ad866d8d",
            "29b2fd3d-ae91-4755-b22a-479f12247ff7",
            "601a5632-0f84-4f2a-a409-138c8048b007",
            "e22e8174-2f4c-46e9-91f0-44ae30e897b6",
            "5fa05f08-4b5c-4d5b-b53d-1143f31b8cfb"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.84121,
      "text": "coverage of the game; any other use of this material is prohibited without the written permission of the National Football League.",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.74661237,
          "height": 0.011529794,
          "left": 0.035486247,
          "top": 0.09147907
        },
        "polygon": [
          { "x": 0.035486247, "y": 0.09211106 },
          { "x": 0.7820846, "y": 0.09147907 },
          { "x": 0.7820986, "y": 0.10237701 },
          { "x": 0.035497062, "y": 0.10300887 }
        ]
      },
      "id": "4da70dba-c208-4d21-965a-98a34576cf67",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "7f19f3c9-3b21-48e9-af07-9e70a2e377da",
            "2758a06d-7aa8-456c-9e6a-c4d85cd38d72",
            "3293cad7-91e4-44dd-9f9c-228bff71e63f",
            "38ebc80f-82b2-434e-ab18-534508fe8ed9",
            "78d9ac1d-765e-491a-8f5f-4f464accd569",
            "8f48e79e-362d-4215-8cf7-7ee3b6110957",
            "ef71d79c-0daa-4adf-a3f0-202816363764",
            "fc9fceb8-f756-47f9-8299-a44e2902c911",
            "9fdd235c-016f-4a20-8749-90abcec8f214",
            "7a22b62f-473f-4394-9bc2-15cbc9f23ec0",
            "bf6e0def-4a96-4919-826a-a88ad511adaf",
            "fb8fc6c4-39d1-45c1-b5b9-8fab274995b0",
            "3d53caf5-eb0a-46e8-9c00-21818247df85",
            "1ba9c1a7-d250-415c-8286-a69ea0e197a1",
            "05248ea4-1b73-4ddd-81a5-75ae80ba486c",
            "a868bb3b-89f4-4184-9947-08aa043d032e",
            "15ca1b91-1689-4951-a4d2-f3dd5f352aca",
            "8e5425d6-e270-4a59-a20b-18de895da885",
            "9268b79d-9fd9-4efd-b58b-af09cb1357c4",
            "32e2fdd9-e749-4cdf-ae34-76c607115df5",
            "513bf30d-abb7-41aa-b4e3-0cf2a84b9281"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9238,
      "text": "Date: Thursday, 12/22/2022",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.16370073,
          "height": 0.010750916,
          "left": 0.035795227,
          "top": 0.113572635
        },
        "polygon": [
          { "x": 0.035795227, "y": 0.11371113 },
          { "x": 0.19948474, "y": 0.113572635 },
          { "x": 0.19949596, "y": 0.12418508 },
          { "x": 0.03580576, "y": 0.12432355 }
        ]
      },
      "id": "c724a507-64da-4dcc-ab74-13cc7f46a54a",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "3f2399d3-c092-4d91-9bf0-d3920a0e1b43",
            "01dd44b9-c688-416f-8dde-b654855e4f02",
            "5bc52a34-a82b-4042-b173-6f044a3a17fb"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.808815,
      "text": "Jacksonville Jaguars at New York Jets",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.31207868,
          "height": 0.012997187,
          "left": 0.34555537,
          "top": 0.11411897
        },
        "polygon": [
          { "x": 0.34555537, "y": 0.11438301 },
          { "x": 0.6576183, "y": 0.11411897 },
          { "x": 0.6576341, "y": 0.12685218 },
          { "x": 0.34556958, "y": 0.12711616 }
        ]
      },
      "id": "37e5f352-d331-49ff-83be-7270d0278e60",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "0e449289-264a-45f8-8029-fc88f95a2397",
            "0e01272f-6830-401c-ad71-255b46491996",
            "fb8eda82-19ba-441e-979d-eadad5bfa24f",
            "1ea7d570-738e-49bb-b4d8-2461eb70d0b3",
            "f4a8c0a0-7501-40bc-9df7-2839794a6608",
            "d531ce1d-518b-4320-94d4-0e644be153a1"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.80081,
      "text": "Start Time: 8:16 PM EST",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.1422494,
          "height": 0.008532869,
          "left": 0.8115739,
          "top": 0.11386621
        },
        "polygon": [
          { "x": 0.8115739, "y": 0.11398656 },
          { "x": 0.95381194, "y": 0.11386621 },
          { "x": 0.9538233, "y": 0.12227875 },
          { "x": 0.81158483, "y": 0.122399084 }
        ]
      },
      "id": "98268c55-e2fc-49b6-a4d0-dc9d5d911b80",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "d63c4b03-c19c-4b09-9c38-0a6f43b966a3",
            "51ad0ce1-65d4-43f4-bf85-640e26f66543",
            "1c9734c2-ba42-4475-8338-3012ee5bef35",
            "e51f91aa-87e7-4568-b322-0943db7a71c0",
            "3032ac88-15d8-4665-9ec4-37d72aaf983c"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.66462,
      "text": "at MetLife Stadium, East Rutherford, NJ",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.22839,
          "height": 0.010260195,
          "left": 0.3849788,
          "top": 0.13185494
        },
        "polygon": [
          { "x": 0.3849788, "y": 0.1320481 },
          { "x": 0.61335653, "y": 0.13185494 },
          { "x": 0.6133688, "y": 0.141922 },
          { "x": 0.38499016, "y": 0.14211513 }
        ]
      },
      "id": "851df78f-517d-4a2b-b7ed-58a9b03fba10",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "88627d57-b00b-437a-ab94-609cf70dba68",
            "c4a1d508-8404-43f4-87e3-c35f45bb9951",
            "f5209093-13c4-4ccf-b87f-a3dd9e9a3f54",
            "9be886ea-361b-4487-84e3-2e907d1491ac",
            "eb889c27-7fdf-4392-94af-84ac5f4d1dce",
            "53622e4d-0a2e-4b91-8e2c-59b238c401ef"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.85244,
      "text": "Game Day Weather",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.12735648,
          "height": 0.010346693,
          "left": 0.42652804,
          "top": 0.15090135
        },
        "polygon": [
          { "x": 0.42652804, "y": 0.15100902 },
          { "x": 0.5538723, "y": 0.15090135 },
          { "x": 0.5538845, "y": 0.1611404 },
          { "x": 0.42653978, "y": 0.16124804 }
        ]
      },
      "id": "f38318b8-25dc-4d34-8b75-2b51e00723e3",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "672182b7-7d15-462f-87c9-53871ff1572c",
            "208e197f-d8e7-4bff-9ddf-c0e07937196c",
            "dcd71ad9-f3d7-4699-bec2-4bd660d710a3"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.88213,
      "text": "Game Weather: Light rain, cold, windy, and miserable",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.31131643,
          "height": 0.010747296,
          "left": 0.03548688,
          "top": 0.1675708
        },
        "polygon": [
          { "x": 0.03548688, "y": 0.16783392 },
          { "x": 0.34679163, "y": 0.1675708 },
          { "x": 0.3468033, "y": 0.17805503 },
          { "x": 0.035497285, "y": 0.1783181 }
        ]
      },
      "id": "4443e532-294c-4547-855d-12d78f328ece",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "0d1983e4-e089-4c8d-b2e7-85ead405a9da",
            "53c76fc2-bbd2-4229-b1dc-65aea61a92cf",
            "65b7249a-44fd-4739-821d-9cbc6c18cdf7",
            "4ed59638-1727-45f0-96d7-16554e5459e6",
            "30640f53-7920-469e-869c-bbe5c630615f",
            "dcd9e3f9-d6d3-4921-ba2e-8231ccfdc82a",
            "6a06115f-be34-4d97-b732-23b9732a0d35",
            "1b6bdca4-a754-4a7d-aac5-95d9a48cf7aa"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 96.69327,
      "text": "Temp: 45° F (7.2° C) Humidity: 91%, Wind: E 14 mph",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.31514382,
          "height": 0.0109316185,
          "left": 0.64303774,
          "top": 0.16731694
        },
        "polygon": [
          { "x": 0.64303774, "y": 0.1675833 },
          { "x": 0.95816714, "y": 0.16731694 },
          { "x": 0.9581816, "y": 0.17798227 },
          { "x": 0.6430509, "y": 0.17824857 }
        ]
      },
      "id": "180cb995-d7ae-4bc9-b376-d675f0fe372e",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "2ffedc7d-0eab-435a-8934-2fa66d8d78bd",
            "73215019-3925-4dae-a5c2-8aa2c86ff908",
            "30111ba9-68ad-4c36-a511-8fb207ea5b34",
            "9959a4cc-20c2-49e1-95ba-5fbad5cf3d01",
            "cee5054c-25da-4861-861d-65e698ac4303",
            "b424ce7f-b6c6-4b2c-a85d-e8e9037bc243",
            "0214b9e0-76bc-4698-955c-5d039da86df5",
            "7fd36909-4477-4352-a173-513c789604b8",
            "9b792203-9c90-482b-8f37-d771744cdb41",
            "4e09e247-acc4-4ceb-b527-e67355289bdc",
            "0b4282d3-fed1-4985-aacb-bc32dbf77d28"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.78043,
      "text": "Played Open Stadium on Turf: UBU Speed Series-S5-M",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.3145186,
          "height": 0.010594406,
          "left": 0.035990886,
          "top": 0.1826987
        },
        "polygon": [
          { "x": 0.035990886, "y": 0.18296444 },
          { "x": 0.35049796, "y": 0.1826987 },
          { "x": 0.3505095, "y": 0.1930274 },
          { "x": 0.036001142, "y": 0.19329311 }
        ]
      },
      "id": "e031d2d6-afa7-4783-a26b-f187c6659c16",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "066b340e-731c-4a2d-be1a-15fbf0c01fd2",
            "d5dfea69-0a46-458f-a4c6-6d7b6667ad54",
            "0687cef0-d603-4bc6-abd4-dde379c1d6d1",
            "4dba1a73-329f-4f69-897f-d4e4f11f67e5",
            "c398e562-0e42-44ea-b1db-8562599fce51",
            "f12b8d69-639f-422c-bce6-f7e92c6ae5c5",
            "97757008-f0de-4815-944e-4e51e55478da",
            "1a18d0e7-e715-44de-8dd8-9ebd4ef83e4a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76355,
      "text": "Outdoor Weather: Rain, cold, windy, and miserable, Wind Chill: 38",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.38396612,
          "height": 0.010667453,
          "left": 0.5743279,
          "top": 0.18266608
        },
        "polygon": [
          { "x": 0.5743279, "y": 0.1829905 },
          { "x": 0.95827997, "y": 0.18266608 },
          { "x": 0.958294, "y": 0.19300918 },
          { "x": 0.57434034, "y": 0.19333354 }
        ]
      },
      "id": "23e6aca8-dc7d-47ec-bbde-cd51b183bc2d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "bbf92cd0-db6e-463a-b591-d177681a7650",
            "6126310b-c8da-4c90-ab40-c8f8658b50eb",
            "043464b1-9fce-46e8-a6e6-b77e1fbcc8ae",
            "a3135077-c435-4e02-92f6-565ffcce7d2c",
            "66609a4a-bcb6-4198-9593-b267bc366135",
            "c1bd9b36-7282-4eb5-ad36-f8178669fa2d",
            "723d556a-141f-4840-af82-f3e461503fba",
            "8fcfbf52-af4a-4f04-86b5-36e707dc891b",
            "6078ea14-f2a2-43d1-8feb-fb66a71edb5f",
            "35db8c04-c955-44a4-90be-2faa91031d71"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76677,
      "text": "Officials",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05353244,
          "height": 0.008564244,
          "left": 0.4687055,
          "top": 0.20550719
        },
        "polygon": [
          { "x": 0.4687055, "y": 0.2055524 },
          { "x": 0.5222279, "y": 0.20550719 },
          { "x": 0.52223796, "y": 0.21402624 },
          { "x": 0.4687154, "y": 0.21407144 }
        ]
      },
      "id": "1a8dc8b6-d7ed-4cb3-972d-e0addb0c1d41",
      "relationships": [
        { "type": "CHILD", "ids": ["3318df26-fc47-44d3-97e7-d21989046d7b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.662964,
      "text": "Referee: Allen, Brad (122)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.15453705,
          "height": 0.010426926,
          "left": 0.09130876,
          "top": 0.2247515
        },
        "polygon": [
          { "x": 0.09130876, "y": 0.22488196 },
          { "x": 0.24583474, "y": 0.2247515 },
          { "x": 0.24584581, "y": 0.235048 },
          { "x": 0.0913192, "y": 0.23517843 }
        ]
      },
      "id": "ec079cfd-28dc-40b0-9b83-d3ef90c9220e",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "50124ddb-23ca-4ce9-858d-57b53e74c933",
            "7a5a3490-bb5e-4068-9c88-fad1864addef",
            "68d70640-0b42-4893-851f-a3e7e2976e92",
            "b47022e8-5ad6-4656-9356-e370dc983c63"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.545425,
      "text": "Umpire: Heydt, Duane (42)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.15974386,
          "height": 0.010498988,
          "left": 0.4105469,
          "top": 0.22478226
        },
        "polygon": [
          { "x": 0.4105469, "y": 0.22491711 },
          { "x": 0.5702783, "y": 0.22478226 },
          { "x": 0.57029074, "y": 0.23514642 },
          { "x": 0.41055873, "y": 0.23528124 }
        ]
      },
      "id": "c85e217e-d5ca-4117-b104-a9ab6ae11b52",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "204b80e1-92f5-4873-9c6e-1aecfb1dd766",
            "72dfbdf9-15e2-4de1-a59f-7a0d75bf9447",
            "79a7a42a-173d-43a0-945b-8be1f19168e7",
            "ff0e4d27-72ec-498b-86fa-d89496429fa2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.778465,
      "text": "Down Judge: Thomas, Sarah (53)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.19697596,
          "height": 0.0105366,
          "left": 0.69588834,
          "top": 0.22478828
        },
        "polygon": [
          { "x": 0.69588834, "y": 0.22495456 },
          { "x": 0.8928505, "y": 0.22478828 },
          { "x": 0.89286435, "y": 0.23515862 },
          { "x": 0.69590133, "y": 0.23532487 }
        ]
      },
      "id": "c8405a2f-f7d3-485c-af68-7b419a407b86",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "bafcf6b0-2ec6-4e7d-9466-705945264ce1",
            "da0fca09-535b-42e3-a073-64bb535fc603",
            "74e80001-7972-4251-adb4-1adaca3ead8f",
            "b22d159d-84eb-40ed-8284-41607508ca09",
            "5048c518-df59-40fd-be25-805fbacc4260"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.350876,
      "text": "Line Judge: Gallagher, Daniel (85)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.20065969,
          "height": 0.010784031,
          "left": 0.07397497,
          "top": 0.23974335
        },
        "polygon": [
          { "x": 0.07397497, "y": 0.2399127 },
          { "x": 0.27462313, "y": 0.23974335 },
          { "x": 0.27463466, "y": 0.25035807 },
          { "x": 0.073985666, "y": 0.25052738 }
        ]
      },
      "id": "48e7e229-8842-4daf-aa44-e0d5e3a371f8",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "7f14ede0-9576-4d1b-8692-4f29b6523118",
            "68be42ca-8dee-4ff5-a777-cb6b87a6ca42",
            "d15b8c4f-e130-463d-b3ae-f9a82da6b95a",
            "79336921-d6f8-4668-be6d-e4ed91fab0c5",
            "c60ec998-10de-4677-89bc-400c01f5d09e"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.75191,
      "text": "Field Judge: Patterson, Rick (15)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.19047281,
          "height": 0.010655296,
          "left": 0.38711917,
          "top": 0.23987691
        },
        "polygon": [
          { "x": 0.38711917, "y": 0.24003765 },
          { "x": 0.5775794, "y": 0.23987691 },
          { "x": 0.577592, "y": 0.2503715 },
          { "x": 0.38713107, "y": 0.2505322 }
        ]
      },
      "id": "57cd302a-2256-4dc6-8bbf-1b33a491655b",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "f34e5caf-5cd5-4f78-9724-62db590c48cc",
            "5b82fb4c-ca7f-4eb4-8a2e-2f9edf8e6aac",
            "eed3a8ef-ed53-49ff-8a8f-5e48e226a74c",
            "58e8953d-15ce-4a83-b09a-933dadfcd3d0",
            "0b355e11-b011-47d8-a24a-56f09e71d28a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76397,
      "text": "Side Judge: Cheek, Boris (41)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.17403972,
          "height": 0.010606392,
          "left": 0.70414764,
          "top": 0.23985274
        },
        "polygon": [
          { "x": 0.70414764, "y": 0.23999962 },
          { "x": 0.87817353, "y": 0.23985274 },
          { "x": 0.87818736, "y": 0.2503123 },
          { "x": 0.7041608, "y": 0.25045913 }
        ]
      },
      "id": "cba644be-0e91-4655-ad48-151f98bd7167",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "eaa2ac01-99fb-407c-a569-acd12ea23c48",
            "186706ae-e456-40ce-ac52-e4984ef1cbf6",
            "fd61ed67-dde2-4025-bb6a-132db8bcd0b0",
            "a0abbd31-c2f0-43f1-97d4-d3bb3947d9f6",
            "22003982-876e-4810-9489-d0de5bb04f6a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.69045,
      "text": "Back Judge: Josselyn, Tony (67)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.18997525,
          "height": 0.010626427,
          "left": 0.070693225,
          "top": 0.25503427
        },
        "polygon": [
          { "x": 0.070693225, "y": 0.25519454 },
          { "x": 0.26065716, "y": 0.25503427 },
          { "x": 0.2606685, "y": 0.26550043 },
          { "x": 0.07070375, "y": 0.26566067 }
        ]
      },
      "id": "5b91a8b5-15c3-48e9-859c-03b58301a38d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "10ca3933-8602-4b69-94ad-5f7654444f43",
            "ebdce146-9693-4ca7-aa03-6db365fda81f",
            "4f3181c3-7757-49b7-871a-2510634d9dca",
            "a5e24a05-a366-4189-81bc-b46b16d624d8",
            "260caac2-ce0e-4a7b-95d3-e10bb0be56e2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.04819,
      "text": "Replay Official: Young-Seigler, Artenzia (0)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.24899586,
          "height": 0.010717128,
          "left": 0.3700664,
          "top": 0.25490168
        },
        "polygon": [
          { "x": 0.3700664, "y": 0.25511175 },
          { "x": 0.61904943, "y": 0.25490168 },
          { "x": 0.61906224, "y": 0.26540878 },
          { "x": 0.3700782, "y": 0.26561883 }
        ]
      },
      "id": "d65d9995-adb8-4519-b13d-1f52894a557b",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "1fcfe993-dac6-4eba-b49e-44a4128a9ac0",
            "45666745-7bb7-4587-aef4-5289af6ed21f",
            "a6f112f9-8651-49da-9e02-085c0fe88e6b",
            "9022463f-48f1-4b50-8faf-c04dec955936",
            "7f0ed945-ba8a-413e-b215-6765b9d6909f"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.58865,
      "text": "Lineups",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05072089,
          "height": 0.010580468,
          "left": 0.47261566,
          "top": 0.27763164
        },
        "polygon": [
          { "x": 0.47261566, "y": 0.2776744 },
          { "x": 0.5233241, "y": 0.27763164 },
          { "x": 0.5233365, "y": 0.28816935 },
          { "x": 0.47262794, "y": 0.2882121 }
        ]
      },
      "id": "0c4ee1d5-2042-4ec6-ade8-efc9e33d1e11",
      "relationships": [
        { "type": "CHILD", "ids": ["e860a832-3798-4710-9227-82df16ba387f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.44591,
      "text": "Jacksonville Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.13506642,
          "height": 0.010522028,
          "left": 0.19329529,
          "top": 0.29822212
        },
        "polygon": [
          { "x": 0.19329529, "y": 0.29833597 },
          { "x": 0.3283502, "y": 0.29822212 },
          { "x": 0.32836172, "y": 0.30863032 },
          { "x": 0.19330625, "y": 0.30874416 }
        ]
      },
      "id": "c9c61c6d-c3dc-48e3-bffe-fddb575df974",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e7eb8c0d-787a-40eb-9199-fc314f969f4a",
            "e545bf9a-0489-491c-a41d-110f1c27b8e2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.69868,
      "text": "New York Jets",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09343307,
          "height": 0.00869427,
          "left": 0.6856144,
          "top": 0.29835027
        },
        "polygon": [
          { "x": 0.6856144, "y": 0.29842904 },
          { "x": 0.7790364, "y": 0.29835027 },
          { "x": 0.7790475, "y": 0.3069658 },
          { "x": 0.6856252, "y": 0.30704457 }
        ]
      },
      "id": "f1bf0cae-1572-465a-95a2-cc02da3660d0",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "03253f5c-5b54-4583-851f-6847019fc55e",
            "1139de3c-8b4c-40ef-873b-79dd0df1026d",
            "46dc2358-9c21-4f82-be20-4c99fd634edd"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.75024,
      "text": "Offense",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050557513,
          "height": 0.008835805,
          "left": 0.12328466,
          "top": 0.31332764
        },
        "polygon": [
          { "x": 0.12328466, "y": 0.31337023 },
          { "x": 0.17383297, "y": 0.31332764 },
          { "x": 0.17384218, "y": 0.32212085 },
          { "x": 0.12329369, "y": 0.32216343 }
        ]
      },
      "id": "e7c47e83-8f1e-4ee3-8200-68bd7a74ad7a",
      "relationships": [
        { "type": "CHILD", "ids": ["d737e153-de36-4edb-9d26-1d506b454d08"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9057,
      "text": "Defense",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052853573,
          "height": 0.008637659,
          "left": 0.35645828,
          "top": 0.3134403
        },
        "polygon": [
          { "x": 0.35645828, "y": 0.31348482 },
          { "x": 0.40930206, "y": 0.3134403 },
          { "x": 0.40931183, "y": 0.3220334 },
          { "x": 0.35646787, "y": 0.32207796 }
        ]
      },
      "id": "ed829ad5-7e26-46f4-a37e-c0020ed6142f",
      "relationships": [
        { "type": "CHILD", "ids": ["d6b69496-73e8-4479-9d14-a6f168e6bf0d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.74326,
      "text": "Offense",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050768178,
          "height": 0.008745773,
          "left": 0.6126439,
          "top": 0.3133909
        },
        "polygon": [
          { "x": 0.6126439, "y": 0.31343368 },
          { "x": 0.6634013, "y": 0.3133909 },
          { "x": 0.6634121, "y": 0.3220939 },
          { "x": 0.6126545, "y": 0.32213667 }
        ]
      },
      "id": "cdb2fe96-4eb6-48a8-a1e7-abc596ca15a1",
      "relationships": [
        { "type": "CHILD", "ids": ["8d811ae5-8745-4d07-aee6-e74ba5c6346f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92857,
      "text": "Defense",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053015616,
          "height": 0.0087166615,
          "left": 0.83652157,
          "top": 0.31342632
        },
        "polygon": [
          { "x": 0.83652157, "y": 0.313471 },
          { "x": 0.8895257, "y": 0.31342632 },
          { "x": 0.8895372, "y": 0.3220983 },
          { "x": 0.83653295, "y": 0.322143 }
        ]
      },
      "id": "84d91a4f-b91d-4914-be95-e11535eaf487",
      "relationships": [
        { "type": "CHILD", "ids": ["a651422a-ffc0-43da-8bf8-18dc635c7545"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.371475,
      "text": "TE 84 C.Manhertz",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11599654,
          "height": 0.008585585,
          "left": 0.07055106,
          "top": 0.33167267
        },
        "polygon": [
          { "x": 0.07055106, "y": 0.3317704 },
          { "x": 0.18653867, "y": 0.33167267 },
          { "x": 0.18654759, "y": 0.34016055 },
          { "x": 0.070559606, "y": 0.34025824 }
        ]
      },
      "id": "5a7ccf51-dd71-45bd-8926-b359a414c6c4",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b776624f-838a-4e9f-886e-81df3b013ceb",
            "332ac746-54d0-4237-9129-373bf21d7324",
            "bc98b071-4cd9-4897-a893-6c568de8462c"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.83682,
      "text": "DE 95 R.Robertson-Harris",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.16036543,
          "height": 0.00848917,
          "left": 0.3031366,
          "top": 0.33174896
        },
        "polygon": [
          { "x": 0.3031366, "y": 0.33188406 },
          { "x": 0.4634923, "y": 0.33174896 },
          { "x": 0.46350202, "y": 0.3401031 },
          { "x": 0.30314574, "y": 0.34023815 }
        ]
      },
      "id": "afea6499-0189-4f51-b5f7-4589bc8e787e",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "95e08fb0-9f8b-44f4-92e3-af54d9c0a5ba",
            "f5d044a0-9eb4-431b-a1e5-60b77db17b36",
            "2147b9a1-912a-42d8-bf62-b49d8e536f04"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.78206,
      "text": "WR 8 E.Moore",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10798278,
          "height": 0.008657944,
          "left": 0.5496472,
          "top": 0.33168855
        },
        "polygon": [
          { "x": 0.5496472, "y": 0.33177954 },
          { "x": 0.65761936, "y": 0.33168855 },
          { "x": 0.65762997, "y": 0.34025556 },
          { "x": 0.5496574, "y": 0.34034652 }
        ]
      },
      "id": "1f16c4ee-bf85-43f4-a438-9623697ea077",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e08c9f70-e1af-4046-aa09-03fec0320f38",
            "3b83b7b1-21c4-42fe-a990-fa15d7a1b53c",
            "d837985e-b1d5-4df9-a4e3-edabe4092376"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.52813,
      "text": "EDGE 91 J.Franklin-Myers",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.16074091,
          "height": 0.010539005,
          "left": 0.7675908,
          "top": 0.33155963
        },
        "polygon": [
          { "x": 0.7675908, "y": 0.33169505 },
          { "x": 0.9283178, "y": 0.33155963 },
          { "x": 0.92833173, "y": 0.34196326 },
          { "x": 0.7676041, "y": 0.34209865 }
        ]
      },
      "id": "027c1672-b77f-4551-bc62-727ccc72231c",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b5673bcf-7ac4-4409-9c69-d09a2d8ee234",
            "bfc6d0da-9d16-46a9-904d-1bfb3523bab9",
            "c5938ce4-ff11-4bb0-9ca9-54ba4b88e364"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.79127,
      "text": "LT 72 W.Little",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.092951566,
          "height": 0.008625434,
          "left": 0.07228518,
          "top": 0.3468194
        },
        "polygon": [
          { "x": 0.07228518, "y": 0.34689766 },
          { "x": 0.16522783, "y": 0.3468194 },
          { "x": 0.16523674, "y": 0.35536656 },
          { "x": 0.07229379, "y": 0.35544482 }
        ]
      },
      "id": "a6c9044c-2639-47ed-8007-34f0b776deb7",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "8683e286-f5b0-4173-8560-b2fd93060ce0",
            "f32b9df9-0ba4-4a1b-a045-6b239df33edb",
            "8581d81e-d14b-4230-a718-562bab03aed2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.70029,
      "text": "NT 52 D.Hamilton",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11486915,
          "height": 0.008500015,
          "left": 0.30320334,
          "top": 0.3468359
        },
        "polygon": [
          { "x": 0.30320334, "y": 0.34693265 },
          { "x": 0.41806287, "y": 0.3468359 },
          { "x": 0.4180725, "y": 0.3552392 },
          { "x": 0.30321255, "y": 0.35533592 }
        ]
      },
      "id": "df9f1746-9dc3-4ecf-ac58-35e891350a16",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e9804005-d842-4a95-9ddd-f58dfe73f994",
            "4db3d833-db1e-49b6-b5e6-e9e686c3dab7",
            "9171ed6b-14e2-4fee-b1ce-70a4f68f9baf"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.69738,
      "text": "LT 71 D.Brown",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10402839,
          "height": 0.008578946,
          "left": 0.5556022,
          "top": 0.3468436
        },
        "polygon": [
          { "x": 0.5556022, "y": 0.3469312 },
          { "x": 0.6596201, "y": 0.3468436 },
          { "x": 0.6596306, "y": 0.35533494 },
          { "x": 0.5556124, "y": 0.35542253 }
        ]
      },
      "id": "2667877b-fcd9-400f-8403-30f9102936bd",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e5696d43-be35-4da8-b2b0-520371e6bf52",
            "0c41f171-16c2-4795-ae08-a86a469c46af",
            "1ee2b267-26cb-4f28-8b66-3ff082dba7c9"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.64105,
      "text": "DL 98 S.Rankins",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10628727,
          "height": 0.008730249,
          "left": 0.78456616,
          "top": 0.34672812
        },
        "polygon": [
          { "x": 0.78456616, "y": 0.3468176 },
          { "x": 0.89084196, "y": 0.34672812 },
          { "x": 0.89085346, "y": 0.35536888 },
          { "x": 0.7845773, "y": 0.35545838 }
        ]
      },
      "id": "19d74929-2a4f-4292-92e2-e5f6b0770361",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "629d4364-38bf-4ef1-92b0-7472cd3cdb6f",
            "cf8df15e-f70e-4c0d-a3cd-38fe45f25f0c",
            "b8141182-74df-47ab-b37c-768f8b0d9bf0"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87051,
      "text": "LG 69 T.Shatley",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10408728,
          "height": 0.010552288,
          "left": 0.07112001,
          "top": 0.36194867
        },
        "polygon": [
          { "x": 0.07112001, "y": 0.3620363 },
          { "x": 0.17519632, "y": 0.36194867 },
          { "x": 0.17520729, "y": 0.37241334 },
          { "x": 0.07113054, "y": 0.37250096 }
        ]
      },
      "id": "b2d538b4-7159-4aeb-b2ea-59f4c94e36d1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "6cff0f7f-bf4f-4fbf-85a5-b0516da03c4f",
            "b1d674eb-f01e-4f3e-87d9-187527f95abd",
            "e93f3528-f365-4602-9bc7-07607c63c53f"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.79383,
      "text": "DL 98 C.Peters",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09821696,
          "height": 0.008733481,
          "left": 0.30379188,
          "top": 0.3619875
        },
        "polygon": [
          { "x": 0.30379188, "y": 0.36207017 },
          { "x": 0.40199903, "y": 0.3619875 },
          { "x": 0.40200886, "y": 0.3706383 },
          { "x": 0.3038014, "y": 0.37072098 }
        ]
      },
      "id": "12279a5a-cd01-4187-9065-93021457aa65",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "5db7cefb-3c9d-455a-b066-a9436e82649c",
            "458b1b13-85c3-46f4-bd0a-60963fffd6ea",
            "6a725610-2885-4dd1-93fb-db92adbdc903"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.67778,
      "text": "LG 78 L.Tomlinson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.12511726,
          "height": 0.008671317,
          "left": 0.5546074,
          "top": 0.36193788
        },
        "polygon": [
          { "x": 0.5546074, "y": 0.3620432 },
          { "x": 0.67971396, "y": 0.36193788 },
          { "x": 0.67972463, "y": 0.37050387 },
          { "x": 0.55461764, "y": 0.3706092 }
        ]
      },
      "id": "05f742e4-d3f3-48c6-afc4-970c290e0d49",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "5c61a43e-2106-478c-83c8-d2db5c710fc8",
            "8b0d9413-1c00-4ade-b124-aacec6f3ec29",
            "f899ece0-35b9-4327-bbc6-0b965ed32f27"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.33498,
      "text": "DL 95 Q.Williams",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11071527,
          "height": 0.010247193,
          "left": 0.78455627,
          "top": 0.36190015
        },
        "polygon": [
          { "x": 0.78455627, "y": 0.36199334 },
          { "x": 0.89525807, "y": 0.36190015 },
          { "x": 0.89527154, "y": 0.37205416 },
          { "x": 0.7845693, "y": 0.37214735 }
        ]
      },
      "id": "0a83b5d0-2342-41c0-8772-aac2de52e137",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "734a67ea-58e2-410f-a615-8d447af69b6a",
            "23fc0552-c8f3-4d83-abce-5cea6bfaf0b8",
            "981f2bc3-73c6-409f-bfb6-0787765515b6"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 96.52706,
      "text": "C 79 L.Fortner",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09565506,
          "height": 0.008683223,
          "left": 0.0783438,
          "top": 0.37710735
        },
        "polygon": [
          { "x": 0.0783438, "y": 0.37718785 },
          { "x": 0.17398986, "y": 0.37710735 },
          { "x": 0.17399886, "y": 0.38571006 },
          { "x": 0.07835249, "y": 0.38579056 }
        ]
      },
      "id": "149909e8-dfdd-4b2e-b090-9ea64ba664f1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b661cdb1-fa2b-41e1-b9fa-f65a2b0044a5",
            "00c95fc5-4794-4c42-96bf-779a2656a169",
            "ed25f08e-b3de-41be-a5a1-0029580352f2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.831375,
      "text": "WILL 41 J.Allen",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.101913825,
          "height": 0.0084964605,
          "left": 0.28949445,
          "top": 0.37718958
        },
        "polygon": [
          { "x": 0.28949445, "y": 0.37727535 },
          { "x": 0.39139876, "y": 0.37718958 },
          { "x": 0.39140826, "y": 0.38560027 },
          { "x": 0.28950363, "y": 0.38568604 }
        ]
      },
      "id": "94207c65-9302-43c6-9da5-bf618c01b8d2",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "f3c7009c-6499-4ef0-b269-2236c3f4f6a6",
            "caacc54f-ff4a-4591-9ef4-f1a3e9119b19",
            "b0f80cc8-d0a2-4f3b-89e3-e9454c24afda"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.695694,
      "text": "C 60 C.McGovern",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11737802,
          "height": 0.008731067,
          "left": 0.5616344,
          "top": 0.37704468
        },
        "polygon": [
          { "x": 0.5616344, "y": 0.37714347 },
          { "x": 0.6790017, "y": 0.37704468 },
          { "x": 0.6790124, "y": 0.38567698 },
          { "x": 0.5616448, "y": 0.38577574 }
        ]
      },
      "id": "fa107206-27ff-4abc-a231-50b94f826039",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e74cc010-4978-400f-8112-dba20d756c10",
            "55767d83-c954-46f3-a138-52217fb3259f",
            "af388ad7-02a2-446e-afd5-5547df3600c3"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.839676,
      "text": "EDGE 58 C.Lawson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.12186603,
          "height": 0.008734508,
          "left": 0.7675682,
          "top": 0.3771476
        },
        "polygon": [
          { "x": 0.7675682, "y": 0.37725013 },
          { "x": 0.8894227, "y": 0.3771476 },
          { "x": 0.88943416, "y": 0.38577956 },
          { "x": 0.7675792, "y": 0.3858821 }
        ]
      },
      "id": "6fd58a05-bcf3-4bc4-8dd4-2f33a518a1ed",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "f420a700-102d-4069-944f-0a5b148ddf3a",
            "0d7f8ae0-0274-49e0-8828-38af1f9ea0f6",
            "a29971b1-4835-4b9f-8494-e3dc9bdcf1f1"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.571976,
      "text": "RG 68 B.Scherff",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.1048034,
          "height": 0.0088889655,
          "left": 0.06952829,
          "top": 0.39209056
        },
        "polygon": [
          { "x": 0.06952829, "y": 0.3921787 },
          { "x": 0.17432247, "y": 0.39209056 },
          { "x": 0.1743317, "y": 0.40089133 },
          { "x": 0.06953714, "y": 0.40097952 }
        ]
      },
      "id": "99a23616-8800-4ef1-89bc-42f8410c2900",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "04b05bf5-825d-46e5-9a2b-d1f2b153d032",
            "c389f85d-b74b-40b2-8650-45ecd2096820",
            "182fbeb9-7ebc-4951-80d1-41afd156fed6"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.69319,
      "text": "OLB 49 A.Key",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09135762,
          "height": 0.010267995,
          "left": 0.29563007,
          "top": 0.39236265
        },
        "polygon": [
          { "x": 0.29563007, "y": 0.3924395 },
          { "x": 0.38697615, "y": 0.39236265 },
          { "x": 0.3869877, "y": 0.40255383 },
          { "x": 0.2956412, "y": 0.40263066 }
        ]
      },
      "id": "bfaa5d5c-f192-4fb3-8102-8cd8b38a478c",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "3c596f21-9e5c-46a3-9cfc-0ff7b0042513",
            "c92afc14-84bd-40f9-a841-7b9f889a14b3",
            "c23af39f-295d-42fa-b886-4445b05f62d9"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.658875,
      "text": "RG 65 N.Herbig",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10775884,
          "height": 0.01050812,
          "left": 0.55300295,
          "top": 0.39230025
        },
        "polygon": [
          { "x": 0.55300295, "y": 0.3923909 },
          { "x": 0.6607489, "y": 0.39230025 },
          { "x": 0.6607618, "y": 0.40271774 },
          { "x": 0.5530154, "y": 0.40280837 }
        ]
      },
      "id": "e50ce816-2c3d-4163-b425-6ed30a6cf402",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "ea9101f9-119c-499d-8931-bda77690a992",
            "652fc38a-fc60-4df1-9c3c-40e9a9be84f2",
            "6f748cf0-cc61-418b-a85e-d5f01fd7fac4"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.30306,
      "text": "LB 56 Qu.Williams",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11711162,
          "height": 0.010535949,
          "left": 0.78559065,
          "top": 0.39216557
        },
        "polygon": [
          { "x": 0.78559065, "y": 0.3922641 },
          { "x": 0.9026884, "y": 0.39216557 },
          { "x": 0.9027023, "y": 0.402603 },
          { "x": 0.7856041, "y": 0.4027015 }
        ]
      },
      "id": "6449f71c-bb27-41a5-a04a-7da5cc000b4c",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "88738958-a061-4fa4-8020-dbac143ac13e",
            "7a3a9502-12b8-469a-a2b6-100aee6e0f56",
            "125120f0-4be0-4641-b021-dd9cca801819"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.88226,
      "text": "RT 75 J.Taylor",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09625716,
          "height": 0.010268876,
          "left": 0.07050261,
          "top": 0.40744498
        },
        "polygon": [
          { "x": 0.07050261, "y": 0.40752596 },
          { "x": 0.16674913, "y": 0.40744498 },
          { "x": 0.16675976, "y": 0.41763294 },
          { "x": 0.07051285, "y": 0.41771388 }
        ]
      },
      "id": "8a090da9-4309-4004-8e22-6a250e21ea52",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "9fd6a2a2-ca2e-4275-8a68-97867a6a2176",
            "abd7124d-42e5-4de0-bdd3-45e3012b374c",
            "0905dff2-16fd-433e-b798-0b0cf3185c6a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.36741,
      "text": "LB 23 F.Oluokun",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10728731,
          "height": 0.008733157,
          "left": 0.3050839,
          "top": 0.40733302
        },
        "polygon": [
          { "x": 0.3050839, "y": 0.40742326 },
          { "x": 0.41236135, "y": 0.40733302 },
          { "x": 0.41237122, "y": 0.41597596 },
          { "x": 0.3050934, "y": 0.41606617 }
        ]
      },
      "id": "cac40589-fe35-4548-993a-15774af316a3",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e748c74c-aa8d-4bfe-802d-508be3cfc070",
            "eb963c92-f459-4eef-a445-b00d0440b439",
            "076d4d6f-70e5-4013-b2a0-3b1502631bca"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.44305,
      "text": "LT 76 G.Fant",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09304617,
          "height": 0.008783009,
          "left": 0.555562,
          "top": 0.40734038
        },
        "polygon": [
          { "x": 0.555562, "y": 0.40741864 },
          { "x": 0.6485974, "y": 0.40734038 },
          { "x": 0.64860815, "y": 0.41604513 },
          { "x": 0.5555724, "y": 0.4161234 }
        ]
      },
      "id": "2098d992-6052-415f-add1-ad95aef2de6a",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "cf80424d-50ad-4171-bd7f-020ceacc1404",
            "86da7340-bf73-41f4-b527-0a7fb722cc91",
            "fd1bcd3d-c758-428e-999c-f2bc3d43e00f"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.77062,
      "text": "LB 57 C.Mosley",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10050318,
          "height": 0.010436651,
          "left": 0.7855151,
          "top": 0.40737775
        },
        "polygon": [
          { "x": 0.7855151, "y": 0.4074623 },
          { "x": 0.88600457, "y": 0.40737775 },
          { "x": 0.8860183, "y": 0.41772988 },
          { "x": 0.7855284, "y": 0.4178144 }
        ]
      },
      "id": "ec3ade44-502e-4f50-8a65-374d072dbba0",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "f06d038a-2e2a-4e66-b6b5-0a8845fe3ceb",
            "7beb292e-6583-4b72-aded-bd7829349ad6",
            "99155ce0-221d-46d6-88f5-ad905daa9e53"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.20887,
      "text": "TE 17 E.Engram",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10598268,
          "height": 0.0105877165,
          "left": 0.070698574,
          "top": 0.42242816
        },
        "polygon": [
          { "x": 0.070698574, "y": 0.42251727 },
          { "x": 0.17667025, "y": 0.42242816 },
          { "x": 0.17668127, "y": 0.43292677 },
          { "x": 0.07070914, "y": 0.43301585 }
        ]
      },
      "id": "e51b694c-5315-4fe3-b658-d4be8479a12f",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "2ff98073-fb18-49a5-9cb3-2a7ef01333f9",
            "459e3bf2-2cc6-4ee5-89d4-af34efb92619",
            "e07c8b88-ffd1-463c-9c5b-0330b86d72cf"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.36266,
      "text": "LB 33 D.Lloyd",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09195498,
          "height": 0.0103856465,
          "left": 0.30504033,
          "top": 0.4225974
        },
        "polygon": [
          { "x": 0.30504033, "y": 0.42267472 },
          { "x": 0.39698362, "y": 0.4225974 },
          { "x": 0.3969953, "y": 0.43290576 },
          { "x": 0.30505165, "y": 0.43298304 }
        ]
      },
      "id": "11de8187-d8fe-4521-b654-c13ede1abcae",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "f85f8045-588e-4087-9d25-92fa570a01df",
            "c79a5420-8ca4-4caf-b2b0-c0ce8cf45a06",
            "493f1296-6c6a-450e-9568-8df61a2eb43d"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.40685,
      "text": "TE 87 C.Uzomah",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11405404,
          "height": 0.008930619,
          "left": 0.55423224,
          "top": 0.42247495
        },
        "polygon": [
          { "x": 0.55423224, "y": 0.42257082 },
          { "x": 0.6682753, "y": 0.42247495 },
          { "x": 0.66828626, "y": 0.43130967 },
          { "x": 0.5542428, "y": 0.43140554 }
        ]
      },
      "id": "c8e510bf-b73e-4c4e-9162-b2aaaee4c6d6",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "32b6b7b0-8b1e-4d30-b463-dccf32812c21",
            "803a830a-7938-4f1e-bc45-f3aa489bdce1",
            "aa3eaa15-a1c7-47ef-a503-900e98ed9c22"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.16934,
      "text": "LB 9 K.Alexander",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.117867894,
          "height": 0.008831532,
          "left": 0.7855168,
          "top": 0.4224516
        },
        "polygon": [
          { "x": 0.7855168, "y": 0.4225507 },
          { "x": 0.903373, "y": 0.4224516 },
          { "x": 0.9033847, "y": 0.43118402 },
          { "x": 0.785528, "y": 0.43128312 }
        ]
      },
      "id": "431d0916-d404-4099-a947-926d39b47430",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "33903b8c-c600-4580-a7bf-537148f64e14",
            "3e1253c6-1228-4357-8be1-4f83f91abc88",
            "e9671328-e5b3-4dfc-8800-606f455b6b51"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.64278,
      "text": "WR 13 C.Kirk",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08916727,
          "height": 0.008677916,
          "left": 0.06599251,
          "top": 0.4376739
        },
        "polygon": [
          { "x": 0.06599251, "y": 0.43774885 },
          { "x": 0.15515083, "y": 0.4376739 },
          { "x": 0.15515977, "y": 0.44627687 },
          { "x": 0.066001154, "y": 0.44635183 }
        ]
      },
      "id": "1e5f1ad5-3c80-4295-a99a-8d550a5226dc",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "8b0cc316-cea9-4b17-9a48-7be79aa59906",
            "4d70c4e5-c18b-43f1-99bc-5f7055d68e74",
            "d2373eae-678c-4918-88d3-a9ec856bc842"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.73514,
      "text": "CB 31 D.Williams",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.111008056,
          "height": 0.00884577,
          "left": 0.30361927,
          "top": 0.43759403
        },
        "polygon": [
          { "x": 0.30361927, "y": 0.43768734 },
          { "x": 0.41461733, "y": 0.43759403 },
          { "x": 0.4146273, "y": 0.44634652 },
          { "x": 0.30362886, "y": 0.4464398 }
        ]
      },
      "id": "e8a7c593-bc09-4b00-8c45-b236bb5bfedb",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "f5a673fc-a9d0-444b-841a-e9e3e6816d8d",
            "22673e32-1f08-4965-9e87-2e2ffa7512bd",
            "e24208e9-eb6e-456e-ae73-e7e344f82e9e"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.18697,
      "text": "WR 15 C.Streveler",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.123696685,
          "height": 0.00884303,
          "left": 0.54957414,
          "top": 0.43754768
        },
        "polygon": [
          { "x": 0.54957414, "y": 0.43765166 },
          { "x": 0.67326, "y": 0.43754768 },
          { "x": 0.6732708, "y": 0.44628677 },
          { "x": 0.54958457, "y": 0.44639072 }
        ]
      },
      "id": "cbbf29ef-a3ab-49c7-9004-5ee821df5dfc",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "fd71d119-7378-4b5c-bae5-907aefb7e293",
            "6f99e282-2137-4163-b421-e5ec22b36906",
            "02953766-e697-4343-9400-07c10cf05e31"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.618805,
      "text": "CB 4 D.Reed",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09221345,
          "height": 0.008508836,
          "left": 0.7839901,
          "top": 0.43776914
        },
        "polygon": [
          { "x": 0.7839901, "y": 0.43784666 },
          { "x": 0.8761924, "y": 0.43776914 },
          { "x": 0.87620354, "y": 0.4462005 },
          { "x": 0.78400093, "y": 0.44627798 }
        ]
      },
      "id": "b55f879a-42be-4f20-894e-5ea1e4069d1f",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "0831a24f-c892-40e7-b24e-6576d1435630",
            "2066caa8-a11b-45db-a2aa-fdf14f61269f",
            "1fa8572b-212c-4170-8c86-b6b5bda9c939"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.58301,
      "text": "WR 7 Z.Jones",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.099196024,
          "height": 0.008816251,
          "left": 0.06603687,
          "top": 0.45298973
        },
        "polygon": [
          { "x": 0.06603687, "y": 0.45307308 },
          { "x": 0.16522379, "y": 0.45298973 },
          { "x": 0.1652329, "y": 0.46172264 },
          { "x": 0.06604564, "y": 0.461806 }
        ]
      },
      "id": "93f0e54c-2c25-4086-b0f2-3442f0f8b8a3",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "fb2a5a54-50f9-438e-bd03-39c93e2dff23",
            "7397bc2c-c41a-4da2-84e1-bbebfaed2c86",
            "e3d7bfae-e2ea-4150-85de-4ff1cce3d85d"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.53195,
      "text": "CB 32 T.Campbell",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11521256,
          "height": 0.010526458,
          "left": 0.30360883,
          "top": 0.45276085
        },
        "polygon": [
          { "x": 0.30360883, "y": 0.45285767 },
          { "x": 0.41880947, "y": 0.45276085 },
          { "x": 0.4188214, "y": 0.46319053 },
          { "x": 0.30362028, "y": 0.46328732 }
        ]
      },
      "id": "d90b3cb7-327e-4074-9098-87890567ea5d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "40b4e3a5-400b-40c0-a0a5-fc08f03f0300",
            "128465be-0328-4858-9a93-4be28227e100",
            "376ec8fe-e0bf-45fd-aae2-0bc2c4c637a5"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.7174,
      "text": "QB 2 Z.Wilson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10712281,
          "height": 0.009903236,
          "left": 0.55243427,
          "top": 0.4528582
        },
        "polygon": [
          { "x": 0.55243427, "y": 0.4529482 },
          { "x": 0.65954494, "y": 0.4528582 },
          { "x": 0.6595571, "y": 0.46267143 },
          { "x": 0.552446, "y": 0.46276143 }
        ]
      },
      "id": "f0d2ef9a-8f3f-4ac2-a37a-1613bfe03cf7",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "6dad33d6-665b-4130-8f01-9f35bda2965e",
            "f5f32587-0a8b-4593-af31-f2aeb9641ac3",
            "230f9754-ae51-4221-a339-54e532c342e1"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.35678,
      "text": "CB 1 A.Gardner",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10918409,
          "height": 0.00867549,
          "left": 0.7839075,
          "top": 0.45285863
        },
        "polygon": [
          { "x": 0.7839075, "y": 0.45295036 },
          { "x": 0.8930802, "y": 0.45285863 },
          { "x": 0.89309156, "y": 0.46144238 },
          { "x": 0.78391856, "y": 0.4615341 }
        ]
      },
      "id": "7b8bea80-e837-4749-b246-11c133c07131",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b90a73e8-c8f6-459e-a5a2-43a121b66e6d",
            "68903ba9-899e-4edf-9f40-1bad19ac02ed",
            "c87f9e0c-49d6-4664-9804-66bba973e6e8"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.604614,
      "text": "QB 16 T.Lawrence",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.118991986,
          "height": 0.009764244,
          "left": 0.06896023,
          "top": 0.46805927
        },
        "polygon": [
          { "x": 0.06896023, "y": 0.46815923 },
          { "x": 0.18794204, "y": 0.46805927 },
          { "x": 0.18795222, "y": 0.47772357 },
          { "x": 0.06896995, "y": 0.47782353 }
        ]
      },
      "id": "5c36ba48-e55f-4698-b892-ea3f324980e2",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "83811c14-da94-4c7c-8c28-b05ab47c305f",
            "59cece99-c677-4200-92b0-27e77c329996",
            "ac7e54cf-fe80-42d0-b45a-57ed4193d21a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.30231,
      "text": "FS 5 A.Cisco",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09038766,
          "height": 0.00873747,
          "left": 0.305434,
          "top": 0.46794787
        },
        "polygon": [
          { "x": 0.305434, "y": 0.46802378 },
          { "x": 0.39581183, "y": 0.46794787 },
          { "x": 0.39582163, "y": 0.4766094 },
          { "x": 0.3054435, "y": 0.47668532 }
        ]
      },
      "id": "958c86b3-1627-4abf-b38f-7f6d85f7864b",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "64f9af34-1f9c-4719-a084-d6b91a3b6440",
            "a925da2d-dc3b-4cc3-a30e-ce31a5610fab",
            "de57777d-5776-4420-8ebe-0035b9b33814"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.34921,
      "text": "RB 27 Z.Knight",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.105428375,
          "height": 0.0105308825,
          "left": 0.5538719,
          "top": 0.46789548
        },
        "polygon": [
          { "x": 0.5538719, "y": 0.46798405 },
          { "x": 0.6592874, "y": 0.46789548 },
          { "x": 0.6593003, "y": 0.4783378 },
          { "x": 0.55388445, "y": 0.47842637 }
        ]
      },
      "id": "f1ccd3b8-e45a-4f81-97e1-3e5ad5777834",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "d0851b39-26a7-41a9-9bac-a4ec0f6ca8f0",
            "c94bf2f3-bb85-450c-9c4e-696517dd7839",
            "22d00141-3cc5-496d-88ca-5e95b3d4379a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.22807,
      "text": "S 39 W.Parks",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0895871,
          "height": 0.008824331,
          "left": 0.7922362,
          "top": 0.4679505
        },
        "polygon": [
          { "x": 0.7922362, "y": 0.46802574 },
          { "x": 0.8818117, "y": 0.4679505 },
          { "x": 0.8818233, "y": 0.4766996 },
          { "x": 0.7922475, "y": 0.47677484 }
        ]
      },
      "id": "0b829b92-ba24-450a-b015-e6401fc72da1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "a43a6b42-5209-4a60-b48c-69bc33bdcc37",
            "193b4b4a-59e3-4a41-934a-dc2b8b8bf59f",
            "11e3ea99-66d7-44e0-b6e2-d2cefadbf35c"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.9235,
      "text": "RB 1 T.Etienne",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.1054651,
          "height": 0.008530077,
          "left": 0.07046338,
          "top": 0.4833216
        },
        "polygon": [
          { "x": 0.07046338, "y": 0.48341018 },
          { "x": 0.17591964, "y": 0.4833216 },
          { "x": 0.17592847, "y": 0.49176314 },
          { "x": 0.070471875, "y": 0.4918517 }
        ]
      },
      "id": "54b56708-2b81-4c21-a09e-2269eb2907f2",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "43ae8eeb-92ec-4595-b262-814b0bf38550",
            "a1b84f0d-9b63-4ada-805f-6971594225f0",
            "b1d49a3e-8c7a-4ee3-9c5d-fb359ddb76d5"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.98522,
      "text": "SS 2 R.Jenkins",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10415806,
          "height": 0.008912716,
          "left": 0.3043163,
          "top": 0.4830399
        },
        "polygon": [
          { "x": 0.3043163, "y": 0.4831274 },
          { "x": 0.4084643, "y": 0.4830399 },
          { "x": 0.40847436, "y": 0.49186516 },
          { "x": 0.304326, "y": 0.49195263 }
        ]
      },
      "id": "f48b01a2-af46-40a0-b6ff-b292ec428582",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "673a48b2-3c0a-4241-83da-b9cfe84c27a1",
            "63873860-6119-4255-b5d3-21e2e15bfaad",
            "0866cdf0-b133-4904-8ae1-6785d101b657"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.68919,
      "text": "WR 17 G.Wilson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11150762,
          "height": 0.008793332,
          "left": 0.54952323,
          "top": 0.4831198
        },
        "polygon": [
          { "x": 0.54952323, "y": 0.48321342 },
          { "x": 0.66102004, "y": 0.4831198 },
          { "x": 0.6610308, "y": 0.4918195 },
          { "x": 0.5495336, "y": 0.4919131 }
        ]
      },
      "id": "389d40ba-9178-4d40-b3a3-348c3adbbf68",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "4045058f-2b0b-476c-b1bf-e98859b3ee72",
            "0e5ed659-a156-4c5d-a40e-e70d21856458",
            "97e75fd3-aa91-48b2-b2af-e4d56c2127f6"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.05609,
      "text": "S 3 J.Whitehead",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11328389,
          "height": 0.00901749,
          "left": 0.7922967,
          "top": 0.48307014
        },
        "polygon": [
          { "x": 0.7922967, "y": 0.48316526 },
          { "x": 0.9055687, "y": 0.48307014 },
          { "x": 0.90558064, "y": 0.4919925 },
          { "x": 0.7923082, "y": 0.49208763 }
        ]
      },
      "id": "56eccca9-0058-4066-8ec4-2b561bea4ebe",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "fbd7d8ad-c1e7-4421-ab7c-1150f7ca62c8",
            "2d631a28-9aed-48f0-8a2a-aec6917ee724",
            "da55c736-3de2-4a45-bfa6-0f0a7c487ea0"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.3944,
      "text": "Substitutions",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08694241,
          "height": 0.008902429,
          "left": 0.22119077,
          "top": 0.51810443
        },
        "polygon": [
          { "x": 0.22119077, "y": 0.5181774 },
          { "x": 0.30812347, "y": 0.51810443 },
          { "x": 0.30813316, "y": 0.5269339 },
          { "x": 0.22120017, "y": 0.52700686 }
        ]
      },
      "id": "40aca2ac-4477-4a54-9058-5f2d3f1f2050",
      "relationships": [
        { "type": "CHILD", "ids": ["c5eaa612-f085-4e91-af02-5a387009c45c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.33106,
      "text": "Substitutions",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08762426,
          "height": 0.008900912,
          "left": 0.69147635,
          "top": 0.5181562
        },
        "polygon": [
          { "x": 0.69147635, "y": 0.51822966 },
          { "x": 0.7790893, "y": 0.5181562 },
          { "x": 0.77910066, "y": 0.52698356 },
          { "x": 0.69148743, "y": 0.52705705 }
        ]
      },
      "id": "05680c33-d57c-4ea1-8fe4-6be2d9ae0aad",
      "relationships": [
        { "type": "CHILD", "ids": ["8a4deba3-09bd-4cac-b2b9-d77efcbc36a0"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.9413,
      "text": "QB 3 C.Beathard, CB 6 C.Claybrooks, 9 L.Cooke, K 10 R.Patterson, WR 11",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.43555838,
          "height": 0.0108803995,
          "left": 0.035538666,
          "top": 0.53620815
        },
        "polygon": [
          { "x": 0.035538666, "y": 0.5365736 },
          { "x": 0.4710848, "y": 0.53620815 },
          { "x": 0.47109705, "y": 0.5467232 },
          { "x": 0.0355491, "y": 0.54708856 }
        ]
      },
      "id": "94e0800b-a067-4bd6-a3b1-c8fcb9879843",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b3cc1f15-ea05-4185-b86e-35c2ba4ca0b2",
            "6535393b-4e6d-4c59-a43b-2e41b56d3d3c",
            "7ed66d63-1d19-4891-8fbf-a1d5e8253628",
            "32323c60-94a6-4fb9-89ff-3d07f0bbe237",
            "4f717ae9-50ac-4756-a067-294a68456945",
            "6bb6e0ff-087c-4aac-8fc0-4a4b71723d76",
            "c7d052e1-8df9-48d7-b614-944d002368e5",
            "99290727-b627-4fb2-9d23-dd1b18c281ed",
            "015ca364-b0e3-46d9-9d5d-6ba417f4ccf5",
            "8a7ebf70-76b2-4769-a1c5-b8c593a0f621",
            "a1438ad9-73e5-41be-82a0-3e82286b1f63",
            "1d6df24b-b176-4066-8cc0-62089d23e12a",
            "c1b8a01e-6fb4-4347-af0a-22d67d2b069a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 96.50127,
      "text": "K G.Zuerlein, P 7 B.Mann, WR 10 B.Berrios, S 21 A.Davis, S 22 T.Adams, RB",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.44947836,
          "height": 0.010616965,
          "left": 0.50657016,
          "top": 0.5361805
        },
        "polygon": [
          { "x": 0.50657016, "y": 0.53655756 },
          { "x": 0.9560346, "y": 0.5361805 },
          { "x": 0.9560485, "y": 0.5464204 },
          { "x": 0.5065822, "y": 0.54679745 }
        ]
      },
      "id": "ae03799f-3ed9-4182-8a2d-4439f7a5c841",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "be1271b8-0690-45e6-ae35-fb231045a517",
            "94ca59b3-6a35-4185-b45c-f03e69a92d88",
            "04f93af3-b2d7-4e1e-9a5e-93803122c9ac",
            "8d19db12-801e-419b-945c-72306f56bb5b",
            "82088f75-6d36-4d50-8591-7cf654d89f0c",
            "edebed99-5626-4a49-8d80-53bf34014768",
            "9c6bc8ce-361e-4c21-8d48-c37fcc536d67",
            "7017738d-39b3-4c4a-8a39-6f3de1b54f70",
            "bed50b9b-2e85-41b8-8aa1-c3a444f12262",
            "b0ce077c-9acf-4cc1-b606-0a8d86390088",
            "48f2ebb2-d82d-4b48-878c-1d756dfe73d1",
            "8ac9aac2-4bb0-4722-8a20-1a5c0bbb9db5",
            "452cf670-d50f-474c-86b1-d38e606a8ba9",
            "0409817b-5a3f-460e-a5ab-fb2cc60968e8",
            "b9846e42-2be5-4fc5-bce4-e85f5f14a8cd"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.62882,
      "text": "M.Jones, WR 15 T.Jones, S 20 D.Thomas, RB 22 J.Hasty, RB 24 S.Conner, CB",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.44679978,
          "height": 0.010916361,
          "left": 0.03610011,
          "top": 0.5483684
        },
        "polygon": [
          { "x": 0.03610011, "y": 0.5487431 },
          { "x": 0.4828876, "y": 0.5483684 },
          { "x": 0.4828999, "y": 0.5589101 },
          { "x": 0.03611057, "y": 0.55928475 }
        ]
      },
      "id": "3c5c214e-d412-4034-b6ef-8e9221cfa2ca",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e4363bcf-7342-40ba-9b9d-9c10dda0d0fd",
            "b660a5ae-48cf-4b46-8a91-5b2a326b745e",
            "b0a097a3-691a-4047-946e-4077c3560eba",
            "e5d6eea8-477a-4a3a-95b3-01aaaa710dd8",
            "ce453f1f-0b05-4a7e-b11c-5d3392c2fbca",
            "afad632a-d39e-4aef-b1f2-1e3e9afa80dd",
            "fdaae1a4-8a83-493b-8e43-7adf5072e843",
            "4b888895-385f-43a6-adc3-6684c1c159d0",
            "ac9d7d93-91df-4dc1-8414-9e38b311e94b",
            "5c496843-dcb1-416d-8859-571fe3a7a0a3",
            "f09a246d-66cf-4995-b1c2-a54d1edab4cf",
            "309d73b1-aaf9-49a3-99d1-955f0fa0b97a",
            "28d4afa6-77b2-4745-8e71-fd61ccadc677",
            "6d5fcd3c-bff7-4e50-ba2b-c753755a75b6"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.8107,
      "text": "25 T.Johnson, CB 30 M.Carter, RB 32 Mi.Carter, CB 34 J.Hardee, CB 37 B.Hall,",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.45025682,
          "height": 0.010575254,
          "left": 0.5064125,
          "top": 0.5483166
        },
        "polygon": [
          { "x": 0.5064125, "y": 0.54869425 },
          { "x": 0.9566555, "y": 0.5483166 },
          { "x": 0.95666933, "y": 0.5585143 },
          { "x": 0.5064245, "y": 0.5588919 }
        ]
      },
      "id": "7d58a381-4f78-4956-985a-dd0c3dc9725b",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "5e653b0c-55e0-4e12-9d0e-37a42c5ed0f9",
            "6905760f-f4d2-44ba-ac27-f0128738b975",
            "516fb912-d037-4a1e-8f14-cd095a4b9775",
            "2cd7cc85-d437-487a-9135-bbf429837bce",
            "071f5cd3-6e0f-486d-8ebd-506be91172fa",
            "a85bdd16-2c6e-4210-b04b-53f826c68e52",
            "553830bc-a9a3-471f-9009-347e81236cc1",
            "b07ec54c-f6dd-4fc1-af17-599117cc3831",
            "c687d06e-a4ca-4433-84c4-c8873a159b45",
            "20fd6981-d9ac-4715-8ca2-47ba44cb8ba3",
            "b4956f4a-73ee-4fbf-8a2d-856c33b310fa",
            "3aa1b25a-7ab8-41bd-9396-cda0c2a2cfbf",
            "3b73373d-ce35-4f51-9262-fb518bca4f30",
            "11fdb6f2-2fbf-45f2-991a-50a9d0853174"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.24299,
      "text": "29 Te.Campbell, CB 37 T.Herndon, WR 39 J.Agnew, S 42 A.Wingard, OLB 45",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.44232118,
          "height": 0.011000368,
          "left": 0.035501976,
          "top": 0.56043375
        },
        "polygon": [
          { "x": 0.035501976, "y": 0.56080467 },
          { "x": 0.47781077, "y": 0.56043375 },
          { "x": 0.47782317, "y": 0.5710633 },
          { "x": 0.035512522, "y": 0.57143414 }
        ]
      },
      "id": "1ce9582a-b1f4-4525-b9d1-f1c0df0b3133",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "38e77ae7-c34b-4014-9e5f-f8545a3ff221",
            "87f0d396-8f7a-42f3-8754-a71fde4add04",
            "5baae64f-cfc5-4276-a502-083b0b76254a",
            "12eb59bf-eba6-4532-9fee-f380ee637bec",
            "3d598bb2-7a1a-4546-a921-0e6f21fb2dd6",
            "26ead6d2-8f70-4398-ae89-45100c98def5",
            "6e65ec36-3dfc-476c-8f2b-13d960ae93bc",
            "729571fd-55ab-426b-ad55-ade24c61fc60",
            "b8c8a292-eb97-4d03-8d1c-7444dc9088bf",
            "2f445483-eda4-413b-bf09-c89163d33722",
            "a17be720-4134-4414-be4c-8058492cce83",
            "b2636768-0285-46d6-99b3-4450266594ee",
            "400ece21-1afa-4b29-b849-a12583137643"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.65045,
      "text": "LS 42 T.Hennessy, LB 44 J.Sherwood, LB 45 H.Nasirildeen, DL 47 B.Huff, DE",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.4407336,
          "height": 0.01076307,
          "left": 0.50684994,
          "top": 0.5605122
        },
        "polygon": [
          { "x": 0.50684994, "y": 0.5608818 },
          { "x": 0.94756955, "y": 0.5605122 },
          { "x": 0.94758356, "y": 0.57090575 },
          { "x": 0.5068622, "y": 0.5712753 }
        ]
      },
      "id": "07411efc-5d16-4ca6-bb46-a458c91243df",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "4e59678a-84dd-45c5-a993-1a3de51e1135",
            "9330d5e4-1079-4619-9920-e26b29e64051",
            "d7410c69-1724-4751-8804-6a9ed7139c1a",
            "c386e065-a7c9-4031-9724-353d1b35a797",
            "1094f04c-0a63-4e1b-97fa-2da98bdac202",
            "982067f9-44da-4cc6-adc9-1e661c732f22",
            "60a452c8-5599-4b59-bcc7-023cbb591c4d",
            "f2b7c57f-1ef3-4758-ac67-51c3edb79b80",
            "52a29865-3f06-4b90-b4f8-37d60c3033ba",
            "ad6340ba-5a4f-4516-8195-54c35758d05d",
            "751bf5d5-38b3-4aff-938a-c1836f07da25",
            "c37466a5-a2ab-4b3b-a6c7-1d5bb50635f1",
            "4d01c2e9-f7fc-4788-983e-24bc4818acd1"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.832245,
      "text": "K.Chaisson, LS 46 R.Matiscik, LB 48 C.Muma, LB 50 S.Quarterman, LB 57",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.42151898,
          "height": 0.011025797,
          "left": 0.035652995,
          "top": 0.5724743
        },
        "polygon": [
          { "x": 0.035652995, "y": 0.5728277 },
          { "x": 0.45715964, "y": 0.5724743 },
          { "x": 0.45717198, "y": 0.5831468 },
          { "x": 0.035663586, "y": 0.58350015 }
        ]
      },
      "id": "a9411e30-d1c8-478d-b600-18aa7e98e2a1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "eecc22d2-e6cf-4126-b315-d2787a9ae97d",
            "39e5721b-fc04-4a1b-8f9e-52d9b2d6e9b0",
            "040165f8-8abc-47b1-b206-d4775643b8d4",
            "c38a6c16-439c-4836-b942-87421d03bf99",
            "cf12a6ec-1acf-4e43-8c4e-4fc8a1a7fd6b",
            "7ab50056-5689-4dca-9f29-8446665c155a",
            "a40f764b-5f53-4e6d-95f4-84c05fa9252f",
            "4b402943-75b0-4118-a441-3ed696087622",
            "41f1e617-caac-431f-b2b7-9dc9ff5bd85e",
            "298aff64-2592-4196-87a4-8aacaf6815a6",
            "09903614-1a4b-4694-b4ea-636f160b79c9",
            "f50e86b0-4d08-4ea6-950f-788341f9eb7f"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.16672,
      "text": "52 J.Johnson, OL 66 L.Duvernay-Tardif, OL 67 D.Feeney, OL 68 M.Remmers,",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.44259372,
          "height": 0.010999058,
          "left": 0.50669116,
          "top": 0.5725713
        },
        "polygon": [
          { "x": 0.50669116, "y": 0.5729423 },
          { "x": 0.94927055, "y": 0.5725713 },
          { "x": 0.94928485, "y": 0.5831994 },
          { "x": 0.5067037, "y": 0.58357036 }
        ]
      },
      "id": "a8af249a-393e-41e7-b908-ca4a92981503",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "71887105-179a-447d-b1d0-55ea3a735d47",
            "93ab661e-5eba-426e-8ef2-e3aa82655942",
            "37c9f79c-dcac-4eb4-a49d-7569f30e15e5",
            "76749e00-4623-453b-a2e6-6bf99078d43c",
            "7a22a712-12a1-4085-997c-e5f617eb0688",
            "c3c9883e-c7ff-4e3e-9cf7-d49aef9b561a",
            "b4da4ca3-05da-4518-ae5c-e7c3b58d4c94",
            "cba0d89f-7916-4c3e-89e4-341a382d6beb",
            "1bcd74f7-2213-4f14-8352-6a8dd87138ae",
            "88323cbd-8a21-459b-84d8-1549630afef6",
            "724f86a5-439d-488f-aca1-3b62e3744c1c"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.81279,
      "text": "C.Johnson, OT 64 C.Cronk, OL 70 C.Van Lanen, OL 73 B.Hance, TE 85",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.4050225,
          "height": 0.010488103,
          "left": 0.035605323,
          "top": 0.5847048
        },
        "polygon": [
          { "x": 0.035605323, "y": 0.58504426 },
          { "x": 0.44061613, "y": 0.5847048 },
          { "x": 0.4406278, "y": 0.5948535 },
          { "x": 0.035615392, "y": 0.5951929 }
        ]
      },
      "id": "c747ef57-3747-4269-995f-48fd5e2f55ec",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b36e634c-0ce9-485a-96c0-bff6f2588065",
            "17b90255-df6b-45c6-b664-83cb245cdda0",
            "61100e3f-8d65-49ff-af98-559afe637adb",
            "0199c5ec-831a-4d72-a4a6-d68059dd8308",
            "a16b025c-d8af-488d-a9c9-c3bf7b0e7a68",
            "ce6c5b79-8e22-4d19-9ec5-35f0d117e7b0",
            "ced42e4e-325a-4a18-84ea-a6db3d42b793",
            "e55ade3a-3966-46b5-ba83-cc771492f017",
            "471313d5-66d9-4582-830d-57519a61dd26",
            "008a3ff1-8b92-4125-a07e-f05c7bad8111",
            "d8ec2884-4238-4844-be17-673ebc2e78f8",
            "e38b6bf7-ab52-4377-be33-df3267230fb2",
            "145c7e10-c4c9-49fa-be27-d0736af69c5a"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.977615,
      "text": "DL 72 M.Clemons, TE 83 T.Conklin, WR 84 C.Davis, TE 88 K.Yeboah, DL 94",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.43399328,
          "height": 0.010603764,
          "left": 0.50664955,
          "top": 0.58478075
        },
        "polygon": [
          { "x": 0.50664955, "y": 0.5851445 },
          { "x": 0.940629, "y": 0.58478075 },
          { "x": 0.94064283, "y": 0.5950209 },
          { "x": 0.5066616, "y": 0.59538454 }
        ]
      },
      "id": "c1d5601e-2faf-4a30-babc-9b5866e4a9d7",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b28b7d27-7f88-4682-8463-0d3a3b2beafe",
            "b0ce0f4e-01e4-428b-bcc8-a7e6944f9281",
            "613c4317-1e92-4d13-8022-8fc24ba08676",
            "8f2527ff-15bc-4084-ba59-01d9bc72a556",
            "3c30aab6-8a36-4194-be0e-cdf59491c326",
            "05cf011f-f731-4891-b379-758343c460a1",
            "b4bc12bd-fc12-4c2b-a2e9-a2b2dd7b0c28",
            "6c5b13fb-09e8-4a7e-96fd-4a35b4440249",
            "dc0e4feb-e3f7-4f70-b41e-bb4dcb3d1b10",
            "aa41d2c6-4167-4f93-8d20-99f67fd31542",
            "d36daee9-1f76-472c-bf78-30d77b521a33",
            "64b99816-9bd1-4748-a4d9-edb7ab1dddfb",
            "9127a35c-3a48-4583-ba38-24bcd01120ca",
            "5cfda8be-7b9d-4695-aa02-3579b751b766"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.68575,
      "text": "D.Arnold, TE 89 L.Farrell, DL 91 D.Smoot, DL 96 A.Gotsis, DL 99 J.Ledbetter",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.439376,
          "height": 0.010560946,
          "left": 0.036109798,
          "top": 0.5971183
        },
        "polygon": [
          { "x": 0.036109798, "y": 0.5974865 },
          { "x": 0.4754739, "y": 0.5971183 },
          { "x": 0.4754858, "y": 0.6073111 },
          { "x": 0.036119916, "y": 0.60767925 }
        ]
      },
      "id": "3f5aa576-ca2e-4802-a4e7-7d9e0a8ef10d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "ecf33a2d-fe8a-411f-b746-79ed27df56eb",
            "1554c939-bda4-424f-b419-18bad857609f",
            "ac59d317-c028-434f-8d38-1e8a27651f87",
            "e55b4a84-6756-486f-959a-3980682a0ed2",
            "f864cb9e-1d89-49a0-b459-9be7ab4b1efa",
            "7ed444b2-f897-43b1-9678-347f9fde63de",
            "e91a5d06-7421-45b0-a57f-94c0b4f765dd",
            "c4be38b0-ad4a-4bf8-86a8-bc9040bc1c0e",
            "c1c94cbd-eab6-471f-a3a7-44c272a9eb0a",
            "ec251010-eed3-458c-9ca7-dae54765d32a",
            "cd325292-916e-44fa-8909-b25d95fa4cec",
            "981b4292-0ed0-49ab-8d27-e1a60dc03b4a",
            "a40ba6ef-d53e-4379-8052-573d882ddabd"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.554214,
      "text": "S.Thomas, DL 97 N.Shepherd, DL 99 V.Curry",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.25709778,
          "height": 0.010814594,
          "left": 0.50823647,
          "top": 0.597335
        },
        "polygon": [
          { "x": 0.50823647, "y": 0.59755045 },
          { "x": 0.7653207, "y": 0.597335 },
          { "x": 0.76533425, "y": 0.60793424 },
          { "x": 0.508249, "y": 0.6081496 }
        ]
      },
      "id": "bd11e3e5-5789-4e3a-bcdc-2e9d0e7faff2",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "3e7b8d9d-5592-4b9d-856b-b07708b61991",
            "9443eadf-25c2-4126-80d1-35018343c889",
            "174e3931-8140-442b-a5f6-1cecba248e2f",
            "1397397b-76ca-4065-b44f-20f0b66c95c2",
            "4f628817-ce3f-4cba-9022-d42e6205912b",
            "1638afb6-8dd0-4528-bfe7-3f51a45d9506",
            "3d6acee3-7eea-4514-ace7-0b3f683d1d67"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.70191,
      "text": "Did Not Play",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08062232,
          "height": 0.0106846485,
          "left": 0.22422193,
          "top": 0.6175677
        },
        "polygon": [
          { "x": 0.22422193, "y": 0.61763525 },
          { "x": 0.3048326, "y": 0.6175677 },
          { "x": 0.30484426, "y": 0.62818485 },
          { "x": 0.22423325, "y": 0.6282524 }
        ]
      },
      "id": "a693cb49-f716-4a34-b35a-caf417008177",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "882d6320-8fa1-4dea-8af2-71b8da0ba4fc",
            "aa3f0fd4-c8e9-4a67-bce2-1eca3b38299f",
            "de8cf2e3-6dc8-4e0c-b0fd-4adf9cc82225"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.85548,
      "text": "Did Not Play",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08067043,
          "height": 0.010690151,
          "left": 0.6948996,
          "top": 0.6175344
        },
        "polygon": [
          { "x": 0.6948996, "y": 0.61760193 },
          { "x": 0.77555645, "y": 0.6175344 },
          { "x": 0.77557003, "y": 0.62815696 },
          { "x": 0.6949129, "y": 0.62822455 }
        ]
      },
      "id": "a4c7ad8b-5d50-46e1-adab-c004ce5e625e",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "27b71c81-b96c-45ee-bd88-622e5bf5e601",
            "358f6223-0d0b-41cb-8ef1-018f8359b06d",
            "c1502b97-92ed-4327-b91b-28574e4f79e8"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.81667,
      "text": "QB 19 J.Flacco",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08462625,
          "height": 0.010056875,
          "left": 0.50626194,
          "top": 0.6359422
        },
        "polygon": [
          { "x": 0.50626194, "y": 0.63601303 },
          { "x": 0.5908761, "y": 0.6359422 },
          { "x": 0.5908882, "y": 0.64592826 },
          { "x": 0.5062737, "y": 0.6459991 }
        ]
      },
      "id": "8f9a64ec-3c58-45df-aa9d-87904c690f75",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "744cca36-74e0-4473-ba32-a234ff432134",
            "4899243c-c4f3-446d-9585-358b61f925b2",
            "b62b2021-2a9c-4d80-b809-201914d0f899"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.56178,
      "text": "Not Active",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.067790225,
          "height": 0.008498103,
          "left": 0.23077543,
          "top": 0.6565674
        },
        "polygon": [
          { "x": 0.23077543, "y": 0.6566241 },
          { "x": 0.29855642, "y": 0.6565674 },
          { "x": 0.29856566, "y": 0.6650088 },
          { "x": 0.23078445, "y": 0.66506547 }
        ]
      },
      "id": "de43090a-73a9-4dbe-89bd-9d6f0ff298c7",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "33e55b64-12aa-4a3f-8964-bd7b38be85eb",
            "dd7527fe-0380-4151-b0d7-507f750604b9"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.802574,
      "text": "Not Active",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06766433,
          "height": 0.008590999,
          "left": 0.7015234,
          "top": 0.6565311
        },
        "polygon": [
          { "x": 0.7015234, "y": 0.6565877 },
          { "x": 0.76917684, "y": 0.6565311 },
          { "x": 0.76918775, "y": 0.6650655 },
          { "x": 0.7015341, "y": 0.6651221 }
        ]
      },
      "id": "5a8eeae3-05a7-4a9b-9994-a9978defe955",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "c29088f9-b53b-4c94-a75c-c63b4f92653c",
            "186e68a6-de0e-4572-8205-8e6700e8f0de"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.808525,
      "text": "WR 14 K.Pryor, CB 30 Mo.Brown, CB 34 G.Junior, OLB 44 T.Walker, OLB 47",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.43630514,
          "height": 0.010430937,
          "left": 0.03516902,
          "top": 0.6745128
        },
        "polygon": [
          { "x": 0.03516902, "y": 0.6748778 },
          { "x": 0.47146243, "y": 0.6745128 },
          { "x": 0.47147414, "y": 0.6845788 },
          { "x": 0.035179008, "y": 0.68494374 }
        ]
      },
      "id": "cf3b9454-7b9e-462e-94f4-7799bbdb7eab",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "08228fd6-5ef8-4046-ae00-d8a6922d4603",
            "4a8cb099-0f98-46a2-a144-3ea2a4fec037",
            "943bf267-ca96-4a52-9687-a304534fbabd",
            "44033571-a9b2-4cb8-93ad-0b7f6b3e6995",
            "d1c7a1d6-0d76-4cd7-8c23-9a14f3826c93",
            "0a03005d-2da4-4679-8587-9fccce4e4770",
            "f3088d26-be9b-4d85-b7ec-1634b2784510",
            "f0d2b777-0ec0-4414-ba1d-4550abd671df",
            "2dd402ef-cc21-47f9-88fa-7b40f10cec13",
            "43c60ae3-e10e-40c0-b91a-73d1283747eb",
            "6ea47ec2-48ff-4b35-81b7-ac1194f2f17d",
            "62dc6853-8d28-4e7f-9ded-8faab5f2512d",
            "357fed77-c996-442e-b0f7-23ca94ca8a1c",
            "092c876e-9630-466a-be3c-a0b6d58dba57"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.21074,
      "text": "QB 5 M.White, WR 11 D.Mims, WR 16 J.Smith, RB 23 J.Robinson, CB 26",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.41518867,
          "height": 0.01040153,
          "left": 0.50650907,
          "top": 0.67441255
        },
        "polygon": [
          { "x": 0.50650907, "y": 0.67475986 },
          { "x": 0.92168427, "y": 0.67441255 },
          { "x": 0.92169774, "y": 0.6844668 },
          { "x": 0.5065209, "y": 0.68481404 }
        ]
      },
      "id": "aae6af18-abea-4913-b1ab-0ca36ec1136b",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "0c61b324-dbe9-4b19-9bad-a2f7a2be5f31",
            "583c0f9e-fddc-4c74-a8fe-c30fd4609300",
            "f7617f14-476c-4389-ac34-1434519af3fc",
            "72166608-dc94-4694-af2d-e5f2d03f72a4",
            "4749cedc-0284-4ef5-843f-62aaf8a5c190",
            "5e65f3e4-a25c-4cb4-b83e-0ae68de56e9d",
            "1868c956-cb0d-48fc-b4a0-5a48d9873125",
            "9e7ef6ac-897b-4987-84f9-7163cf3677fb",
            "7c13e659-ec82-4132-b23f-ead74f86e39e",
            "cd8cdc90-c195-4fd8-88c9-542bc3e3d835",
            "1fe827f7-6da5-4ea2-978e-e62364ce819b",
            "5e80ee10-d1fe-4c76-8cfd-fc8dbc9f8552",
            "5c4f3b8b-a454-46b9-b9c0-9a75295fde7e",
            "577f82fb-faff-42f4-8803-171fd545627e"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.37376,
      "text": "D.Dixon, OL 74 C.Robinson, DL 94 F.Fatukasi",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.25961813,
          "height": 0.01028474,
          "left": 0.03626387,
          "top": 0.6866388
        },
        "polygon": [
          { "x": 0.03626387, "y": 0.6868559 },
          { "x": 0.29587096, "y": 0.6866388 },
          { "x": 0.295882, "y": 0.69670635 },
          { "x": 0.03627386, "y": 0.6969235 }
        ]
      },
      "id": "625986c3-320c-41f7-9049-c3cdc8ecbff5",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "0e5dd072-f95b-412d-9803-4b373753570a",
            "d7389f3e-2c12-477c-bc48-394276ac2011",
            "7d540fab-5274-4ca3-9228-e11f1f7c28fd",
            "d02d563d-f86b-4efc-96be-a5a2d6a3061c",
            "80edfbcc-09a0-4789-b88c-211066671a79",
            "53bc9950-9c51-4298-8236-502d0f3d7487",
            "85caf3b5-a44e-493c-8aa6-5d6b36f8ec3f"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 96.969864,
      "text": "B.Echols, S 29 L.Joyner, TE 89 J.Ruckert",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.23257378,
          "height": 0.010693269,
          "left": 0.5069301,
          "top": 0.68668735
        },
        "polygon": [
          { "x": 0.5069301, "y": 0.68688184 },
          { "x": 0.73949057, "y": 0.68668735 },
          { "x": 0.7395039, "y": 0.6971861 },
          { "x": 0.5069425, "y": 0.6973806 }
        ]
      },
      "id": "27d2e4e1-83eb-4f4d-9016-6f6ba190a441",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "a349a202-c9fe-405b-9fc4-2a5cf16e513b",
            "dda0993b-00e0-43d3-a289-2454180dcb4e",
            "e40b3956-f397-40e5-a25e-3b8d46657028",
            "03fad22e-c412-43ee-b375-a4844994945c",
            "16b42f57-0000-40de-9d28-dec2aaca0b0e",
            "63e22705-d68f-48cd-84c2-f3666bbdc29f",
            "ad19ff3a-408b-47b9-9ac5-d2143b56f2fa"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 94.04342,
      "text": "Field Goals (made ( ) & missed)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.19730897,
          "height": 0.01036348,
          "left": 0.39840433,
          "top": 0.7063756
        },
        "polygon": [
          { "x": 0.39840433, "y": 0.7065406 },
          { "x": 0.5957009, "y": 0.7063756 },
          { "x": 0.5957133, "y": 0.71657413 },
          { "x": 0.3984159, "y": 0.71673906 }
        ]
      },
      "id": "11b9b3ac-f021-42e5-8607-15f94266b1b1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "bc1cc69a-f855-4373-98a3-852f11bb74b2",
            "43a40bf7-2a1d-4851-9094-78171ad80677",
            "4c642259-3809-4061-a4ff-5f2ed7af1d4e",
            "5fcc8b08-2e84-45de-bba8-5a8597762e28",
            "4db555e7-a196-4205-a41a-3930baf47e59",
            "eedbe452-9fec-4028-9484-a85fe03776ac"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.320786,
      "text": "R.Patterson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06255293,
          "height": 0.0084950235,
          "left": 0.03916038,
          "top": 0.7271703
        },
        "polygon": [
          { "x": 0.03916038, "y": 0.72722256 },
          { "x": 0.10170471, "y": 0.7271703 },
          { "x": 0.10171331, "y": 0.73561305 },
          { "x": 0.039168768, "y": 0.73566526 }
        ]
      },
      "id": "24c1ba72-14f1-4ee1-9c1f-c054d969df19",
      "relationships": [
        { "type": "CHILD", "ids": ["86d54210-4d7c-424d-8614-e4c3261fa862"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.91391,
      "text": "(32) (45) 44WL (41) (37)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.14547329,
          "height": 0.011429478,
          "left": 0.27581754,
          "top": 0.72665673
        },
        "polygon": [
          { "x": 0.27581754, "y": 0.7267783 },
          { "x": 0.42127788, "y": 0.72665673 },
          { "x": 0.4212908, "y": 0.7379647 },
          { "x": 0.27582982, "y": 0.7380862 }
        ]
      },
      "id": "51e0fcf3-d0f7-4791-b9de-0a54f5a6f94c",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "458dc462-aa33-4897-980c-f19d6cf61a3e",
            "9f17f2e1-ef66-4696-9a62-d5933a94aa62",
            "bd5e2455-3b2c-438a-b017-856edc53437f",
            "7972517a-0829-4d87-bde7-58c65ebff862",
            "e1b0a4af-0235-4764-8570-70c06490d3f0"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.22386,
      "text": "G.Zuerlein",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05876227,
          "height": 0.0085775675,
          "left": 0.50622666,
          "top": 0.72707564
        },
        "polygon": [
          { "x": 0.50622666, "y": 0.72712475 },
          { "x": 0.5649787, "y": 0.72707564 },
          { "x": 0.5649889, "y": 0.7356041 },
          { "x": 0.50623673, "y": 0.73565316 }
        ]
      },
      "id": "d85e38bc-f408-464a-b4bf-aca397acfc03",
      "relationships": [
        { "type": "CHILD", "ids": ["e5ea7ef8-fae3-4fe9-a430-7c6e1c498509"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.916504,
      "text": "(37)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023729268,
          "height": 0.010662768,
          "left": 0.7418018,
          "top": 0.7269756
        },
        "polygon": [
          { "x": 0.7418018, "y": 0.72699547 },
          { "x": 0.7655175, "y": 0.7269756 },
          { "x": 0.76553106, "y": 0.7376186 },
          { "x": 0.7418153, "y": 0.7376384 }
        ]
      },
      "id": "fe3c6198-72c6-4c50-9bd9-42377b080b84",
      "relationships": [
        { "type": "CHILD", "ids": ["28e28569-945e-42ed-bbe0-7748a88bafcd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.86888,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006967731,
          "height": 0.008101291,
          "left": 0.5442596,
          "top": 0.7479366
        },
        "polygon": [
          { "x": 0.5442596, "y": 0.7479424 },
          { "x": 0.5512177, "y": 0.7479366 },
          { "x": 0.55122733, "y": 0.75603205 },
          { "x": 0.54426926, "y": 0.7560379 }
        ]
      },
      "id": "a2ce01e4-c6f7-435b-9cc8-62188866a195",
      "relationships": [
        { "type": "CHILD", "ids": ["2f9c3778-33c0-421c-8302-b76c59c52d74"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.90107,
      "text": "2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00809453,
          "height": 0.008121883,
          "left": 0.6224581,
          "top": 0.7479247
        },
        "polygon": [
          { "x": 0.6224581, "y": 0.7479314 },
          { "x": 0.6305427, "y": 0.7479247 },
          { "x": 0.63055265, "y": 0.7560398 },
          { "x": 0.62246805, "y": 0.75604653 }
        ]
      },
      "id": "8cf34933-4a7a-4b63-83d9-e2e11be1bf10",
      "relationships": [
        { "type": "CHILD", "ids": ["8116d3ad-aaf0-4e5b-ba85-e94935d04bad"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.946884,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0077741286,
          "height": 0.008312236,
          "left": 0.70063925,
          "top": 0.74790585
        },
        "polygon": [
          { "x": 0.70063925, "y": 0.7479123 },
          { "x": 0.70840293, "y": 0.74790585 },
          { "x": 0.70841336, "y": 0.7562116 },
          { "x": 0.7006496, "y": 0.7562181 }
        ]
      },
      "id": "ec70f91f-82c5-4252-b773-cc7d0ab07f0f",
      "relationships": [
        { "type": "CHILD", "ids": ["14c995c1-65db-4b40-ae82-243c500a869e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.960205,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.008578222,
          "height": 0.008114729,
          "left": 0.7788626,
          "top": 0.74794793
        },
        "polygon": [
          { "x": 0.7788626, "y": 0.7479551 },
          { "x": 0.78743035, "y": 0.74794793 },
          { "x": 0.7874408, "y": 0.75605553 },
          { "x": 0.77887297, "y": 0.7560627 }
        ]
      },
      "id": "908b01e6-f9e0-4f3f-bc0d-aa2e8f9083e8",
      "relationships": [
        { "type": "CHILD", "ids": ["351ef01b-a49b-4559-8748-10e7bd19ccb6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 94.51946,
      "text": "OT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018404614,
          "height": 0.0085176155,
          "left": 0.8576599,
          "top": 0.74770904
        },
        "polygon": [
          { "x": 0.8576599, "y": 0.7477244 },
          { "x": 0.8760533, "y": 0.74770904 },
          { "x": 0.8760645, "y": 0.7562113 },
          { "x": 0.8576711, "y": 0.75622666 }
        ]
      },
      "id": "b223325c-c8fb-40a4-94b8-3a12a8ff715b",
      "relationships": [
        { "type": "CHILD", "ids": ["0a8ed7a8-d5bd-4f45-8dba-3a15c2b8c40a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89041,
      "text": "Total",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0333148,
          "height": 0.008373046,
          "left": 0.92033225,
          "top": 0.7479128
        },
        "polygon": [
          { "x": 0.92033225, "y": 0.74794066 },
          { "x": 0.95363575, "y": 0.7479128 },
          { "x": 0.953647, "y": 0.7562581 },
          { "x": 0.9203434, "y": 0.7562859 }
        ]
      },
      "id": "f1d59638-4764-44a1-a225-886730c482f9",
      "relationships": [
        { "type": "CHILD", "ids": ["316970bd-7c1a-487d-b75a-fde6b1721a43"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.6462,
      "text": "VISITOR:",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053773314,
          "height": 0.008436883,
          "left": 0.035226602,
          "top": 0.764212
        },
        "polygon": [
          { "x": 0.035226602, "y": 0.76425695 },
          { "x": 0.08899141, "y": 0.764212 },
          { "x": 0.08899991, "y": 0.77260405 },
          { "x": 0.035234928, "y": 0.77264893 }
        ]
      },
      "id": "8ba0161e-dfb0-46be-8229-bf9f72cfd95f",
      "relationships": [
        { "type": "CHILD", "ids": ["e806535c-f9f8-4673-8772-8e0a6c4595d3"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.26836,
      "text": "Jacksonville Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.115886405,
          "height": 0.01051215,
          "left": 0.14796782,
          "top": 0.7639356
        },
        "polygon": [
          { "x": 0.14796782, "y": 0.7640324 },
          { "x": 0.26384294, "y": 0.7639356 },
          { "x": 0.2638542, "y": 0.774351 },
          { "x": 0.1479786, "y": 0.7744478 }
        ]
      },
      "id": "2690cb7d-1fbc-4432-ab1c-48b32cb7d49d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "37ddae00-f0d3-4aa4-bb9b-4d261efa2181",
            "c4a2d5e8-d1a0-4977-9249-b6341e4e6b3d"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.915085,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0068591004,
          "height": 0.008500283,
          "left": 0.5447495,
          "top": 0.7628808
        },
        "polygon": [
          { "x": 0.5447495, "y": 0.7628865 },
          { "x": 0.5515985, "y": 0.7628808 },
          { "x": 0.5516086, "y": 0.77137536 },
          { "x": 0.54475963, "y": 0.7713811 }
        ]
      },
      "id": "e031b00d-a940-47b9-a0ed-46bac8c499a0",
      "relationships": [
        { "type": "CHILD", "ids": ["e4aaaef2-80d2-4cf1-8f0b-0383ca8e22c3"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97217,
      "text": "10",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013311316,
          "height": 0.0084789535,
          "left": 0.6171042,
          "top": 0.76297593
        },
        "polygon": [
          { "x": 0.6171042, "y": 0.762987 },
          { "x": 0.6304051, "y": 0.76297593 },
          { "x": 0.6304155, "y": 0.7714438 },
          { "x": 0.61711454, "y": 0.7714549 }
        ]
      },
      "id": "b09c1393-637b-4829-aa2d-3864b5cf26f1",
      "relationships": [
        { "type": "CHILD", "ids": ["854861d6-a0cf-440f-8c2a-756bbd5af756"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93906,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067143557,
          "height": 0.008514854,
          "left": 0.7017214,
          "top": 0.7629204
        },
        "polygon": [
          { "x": 0.7017214, "y": 0.762926 },
          { "x": 0.70842505, "y": 0.7629204 },
          { "x": 0.7084357, "y": 0.7714296 },
          { "x": 0.70173204, "y": 0.7714352 }
        ]
      },
      "id": "199cc11a-80f2-4d30-bd84-60849f085bbb",
      "relationships": [
        { "type": "CHILD", "ids": ["e3e6bc56-711e-426c-bd5a-b2835e28fe44"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.91135,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067182947,
          "height": 0.008531085,
          "left": 0.7801448,
          "top": 0.76291037
        },
        "polygon": [
          { "x": 0.7801448, "y": 0.76291597 },
          { "x": 0.7868521, "y": 0.76291037 },
          { "x": 0.7868631, "y": 0.77143586 },
          { "x": 0.7801558, "y": 0.77144146 }
        ]
      },
      "id": "06de6eb7-0342-4d4a-a63f-5905af657cff",
      "relationships": [
        { "type": "CHILD", "ids": ["ea08b56e-e38f-45db-a446-01c1659c6c40"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.56375,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069314707,
          "height": 0.008203592,
          "left": 0.8684069,
          "top": 0.7631158
        },
        "polygon": [
          { "x": 0.8684069, "y": 0.7631216 },
          { "x": 0.8753275, "y": 0.7631158 },
          { "x": 0.8753384, "y": 0.77131367 },
          { "x": 0.8684177, "y": 0.77131945 }
        ]
      },
      "id": "2b099bcf-95ff-45d3-9cde-27759407798e",
      "relationships": [
        { "type": "CHILD", "ids": ["c0b9ed96-41a8-47e5-a4b1-e4d3c9d1051d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96421,
      "text": "19",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01306598,
          "height": 0.008366497,
          "left": 0.9407905,
          "top": 0.76310116
        },
        "polygon": [
          { "x": 0.9407905, "y": 0.76311207 },
          { "x": 0.95384514, "y": 0.76310116 },
          { "x": 0.95385647, "y": 0.7714568 },
          { "x": 0.94080174, "y": 0.7714677 }
        ]
      },
      "id": "ba998128-193b-469a-8a0b-f330255ff5b5",
      "relationships": [
        { "type": "CHILD", "ids": ["c614e840-dfb7-4be2-8479-35da97e49d7a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.6237,
      "text": "HOME:",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03871002,
          "height": 0.008379164,
          "left": 0.035705697,
          "top": 0.77940595
        },
        "polygon": [
          { "x": 0.035705697, "y": 0.77943826 },
          { "x": 0.07440731, "y": 0.77940595 },
          { "x": 0.07441572, "y": 0.7877528 },
          { "x": 0.035713978, "y": 0.7877851 }
        ]
      },
      "id": "c9f890c3-e251-4fb7-b486-4433becfce08",
      "relationships": [
        { "type": "CHILD", "ids": ["389f8549-374b-4841-a9df-57ae90ba6f96"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.86173,
      "text": "New York Jets",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08151893,
          "height": 0.008703163,
          "left": 0.14864507,
          "top": 0.7792419
        },
        "polygon": [
          { "x": 0.14864507, "y": 0.77931 },
          { "x": 0.23015478, "y": 0.7792419 },
          { "x": 0.230164, "y": 0.787877 },
          { "x": 0.14865403, "y": 0.7879451 }
        ]
      },
      "id": "363595b9-ca95-4ae2-b586-5414151405e4",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "5ffbc247-423e-457c-8feb-9aaf9a8dc3e1",
            "ec484aa6-e0a1-488c-bcca-f4401f74d859",
            "e8ed3ddf-a329-4ab0-b010-ba7e2d03cb55"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87523,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0068391995,
          "height": 0.008536223,
          "left": 0.54478914,
          "top": 0.7780022
        },
        "polygon": [
          { "x": 0.54478914, "y": 0.7780079 },
          { "x": 0.5516181, "y": 0.7780022 },
          { "x": 0.5516283, "y": 0.78653276 },
          { "x": 0.54479927, "y": 0.7865384 }
        ]
      },
      "id": "f9a6bce9-33c6-4206-8a28-5efb7bd022f3",
      "relationships": [
        { "type": "CHILD", "ids": ["bf7880f0-6da0-404c-9964-747508625875"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.85413,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007238744,
          "height": 0.008272365,
          "left": 0.62321556,
          "top": 0.77815557
        },
        "polygon": [
          { "x": 0.62321556, "y": 0.7781616 },
          { "x": 0.63044417, "y": 0.77815557 },
          { "x": 0.6304543, "y": 0.7864219 },
          { "x": 0.6232256, "y": 0.7864279 }
        ]
      },
      "id": "8ac533ac-fb54-42d2-a52f-336e12cc4580",
      "relationships": [
        { "type": "CHILD", "ids": ["8706e94d-26b9-4a6a-a28e-d580cd1331e4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.619415,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00712728,
          "height": 0.008311645,
          "left": 0.7017081,
          "top": 0.7781725
        },
        "polygon": [
          { "x": 0.7017081, "y": 0.77817845 },
          { "x": 0.70882493, "y": 0.7781725 },
          { "x": 0.70883536, "y": 0.78647816 },
          { "x": 0.7017185, "y": 0.7864841 }
        ]
      },
      "id": "0e0c1e27-2b31-40f7-9b12-f57bcccdeb66",
      "relationships": [
        { "type": "CHILD", "ids": ["b13826aa-4cfe-494a-b960-6b8c350f851b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.79558,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007258238,
          "height": 0.008366855,
          "left": 0.78010094,
          "top": 0.7781356
        },
        "polygon": [
          { "x": 0.78010094, "y": 0.7781417 },
          { "x": 0.7873484, "y": 0.7781356 },
          { "x": 0.7873592, "y": 0.7864964 },
          { "x": 0.7801117, "y": 0.7865025 }
        ]
      },
      "id": "a3a796ed-4128-4eaf-8622-b4e124bb514c",
      "relationships": [
        { "type": "CHILD", "ids": ["63210e41-02d6-41aa-b635-29f16f9bd83c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.45665,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070045935,
          "height": 0.0081619425,
          "left": 0.8684292,
          "top": 0.7782439
        },
        "polygon": [
          { "x": 0.8684292, "y": 0.77824974 },
          { "x": 0.875423, "y": 0.7782439 },
          { "x": 0.8754338, "y": 0.7864 },
          { "x": 0.86844, "y": 0.7864058 }
        ]
      },
      "id": "41256e2f-1504-480c-9ddd-f2cf785f6a93",
      "relationships": [
        { "type": "CHILD", "ids": ["81722ff0-db70-4fad-9e47-8bd9e79afbfe"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.86285,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006931948,
          "height": 0.008364813,
          "left": 0.9468791,
          "top": 0.77815783
        },
        "polygon": [
          { "x": 0.9468791, "y": 0.7781636 },
          { "x": 0.9537997, "y": 0.77815783 },
          { "x": 0.95381105, "y": 0.78651685 },
          { "x": 0.94689035, "y": 0.7865226 }
        ]
      },
      "id": "1c7af4ad-9287-4852-888b-5bd0733fae0b",
      "relationships": [
        { "type": "CHILD", "ids": ["d42cf449-9556-434c-a5f4-8456db0e8e8c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.83873,
      "text": "Scoring Plays",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0879358,
          "height": 0.0105793085,
          "left": 0.4556434,
          "top": 0.7987277
        },
        "polygon": [
          { "x": 0.4556434, "y": 0.79880106 },
          { "x": 0.54356664, "y": 0.7987277 },
          { "x": 0.54357916, "y": 0.80923367 },
          { "x": 0.45565554, "y": 0.80930704 }
        ]
      },
      "id": "43cd93d8-c005-407b-9421-d5b4d968174c",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "e373ac04-c1e9-402c-b4f8-050b1d9be60f",
            "52d24028-8adf-48c6-bc87-64ebd4839def"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89775,
      "text": "Team",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0365017,
          "height": 0.008620003,
          "left": 0.029818023,
          "top": 0.8188532
        },
        "polygon": [
          { "x": 0.029818023, "y": 0.81888366 },
          { "x": 0.06631109, "y": 0.8188532 },
          { "x": 0.06631972, "y": 0.82744277 },
          { "x": 0.029826527, "y": 0.8274732 }
        ]
      },
      "id": "204e5ad1-e739-4362-9281-59fc79b212b4",
      "relationships": [
        { "type": "CHILD", "ids": ["35fc5127-55d7-4190-b4e8-b61d146cc9b5"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89542,
      "text": "Qtr",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021797163,
          "height": 0.010184455,
          "left": 0.123867005,
          "top": 0.8189593
        },
        "polygon": [
          { "x": 0.123867005, "y": 0.8189775 },
          { "x": 0.14565364, "y": 0.8189593 },
          { "x": 0.14566417, "y": 0.8291256 },
          { "x": 0.12387744, "y": 0.82914376 }
        ]
      },
      "id": "53f6dae0-6d94-4927-9210-0942deafa49c",
      "relationships": [
        { "type": "CHILD", "ids": ["2257af8e-2780-46e3-8f74-d2fbdf092233"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.68151,
      "text": "Time Play Description (Extra Point) (Drive Info)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.3197122,
          "height": 0.011014959,
          "left": 0.17895177,
          "top": 0.8186209
        },
        "polygon": [
          { "x": 0.17895177, "y": 0.8188876 },
          { "x": 0.49865136, "y": 0.8186209 },
          { "x": 0.49866396, "y": 0.8293692 },
          { "x": 0.17896304, "y": 0.82963586 }
        ]
      },
      "id": "73357058-20e9-414f-8c13-227d38c36b4d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "4bcd0cfb-42ca-4fd2-a642-8880fa8d1fe9",
            "7f7df0f3-17f6-4a13-b0b4-1bdaf8cb28f0",
            "3e100ef4-f49d-483c-addf-2c20de0ff94e",
            "38134e0e-7a6d-49d5-8206-bdb4fde69919",
            "3bc163ba-d71b-41bb-9c7d-3e9b3583514c",
            "29b03151-dc07-476f-b27d-0bf05ad8a780",
            "cdea9c7b-0587-4ab5-9d60-db83616acb82"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87301,
      "text": "Visitor",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.043205585,
          "height": 0.008739974,
          "left": 0.861915,
          "top": 0.818792
        },
        "polygon": [
          { "x": 0.861915, "y": 0.81882805 },
          { "x": 0.905109, "y": 0.818792 },
          { "x": 0.90512055, "y": 0.82749593 },
          { "x": 0.86192644, "y": 0.82753193 }
        ]
      },
      "id": "8f9530c9-3e34-4d9c-90aa-bd52b6775337",
      "relationships": [
        { "type": "CHILD", "ids": ["128a7358-edfb-4b11-a3b8-8d4d25a67919"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93953,
      "text": "Home",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037714407,
          "height": 0.008480726,
          "left": 0.9211383,
          "top": 0.8190263
        },
        "polygon": [
          { "x": 0.9211383, "y": 0.81905776 },
          { "x": 0.95884126, "y": 0.8190263 },
          { "x": 0.9588527, "y": 0.82747555 },
          { "x": 0.9211496, "y": 0.827507 }
        ]
      },
      "id": "30de05fa-d77a-4bf5-a4e5-4698325af22f",
      "relationships": [
        { "type": "CHILD", "ids": ["9f54f38e-4e08-4f3a-a9f2-251403e622ac"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.86573,
      "text": "Jets",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023096275,
          "height": 0.008165104,
          "left": 0.030324413,
          "top": 0.83716977
        },
        "polygon": [
          { "x": 0.030324413, "y": 0.837189 },
          { "x": 0.053412545, "y": 0.83716977 },
          { "x": 0.05342069, "y": 0.84531564 },
          { "x": 0.030332478, "y": 0.8453349 }
        ]
      },
      "id": "b0362ad1-765b-4a28-961b-2a2c03c73464",
      "relationships": [
        { "type": "CHILD", "ids": ["fd9b65ff-ed72-44e1-9507-67cee3e593e1"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.7647,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.005536359,
          "height": 0.007869147,
          "left": 0.1385431,
          "top": 0.8372375
        },
        "polygon": [
          { "x": 0.1385431, "y": 0.83724207 },
          { "x": 0.14407131, "y": 0.8372375 },
          { "x": 0.14407945, "y": 0.845102 },
          { "x": 0.13855122, "y": 0.8451066 }
        ]
      },
      "id": "e7951903-a63c-4ed4-965b-d1986e7df5ad",
      "relationships": [
        { "type": "CHILD", "ids": ["2be8ec8d-ca52-4210-b417-381999df829b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.41864,
      "text": "11:37 G.Zuerlein 37 yd. Field Goal (4--3, 1:59)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.27375138,
          "height": 0.010893802,
          "left": 0.17928313,
          "top": 0.83665365
        },
        "polygon": [
          { "x": 0.17928313, "y": 0.83688194 },
          { "x": 0.45302218, "y": 0.83665365 },
          { "x": 0.45303452, "y": 0.84731925 },
          { "x": 0.17929432, "y": 0.8475475 }
        ]
      },
      "id": "94b7bf6f-5898-483a-b972-23187bdecc16",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "abdc1d82-c10b-4796-abb0-672b8646ad32",
            "f43df7fb-00ef-412f-b6cd-7b1afd189ec5",
            "7eaa9f22-4442-43b3-9895-0449760fe819",
            "353e55a2-9078-4e09-9f17-3d4517e228d0",
            "bbc9c2ab-2a51-4025-8f1c-c8faa7cfec0f",
            "e080e6ae-963c-473e-8aa9-c66214a5e17b",
            "8104a54e-5993-4835-9652-627296433323",
            "090e5b9b-81f0-416d-a86c-a0aa4e2c22b6"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.49641,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007076769,
          "height": 0.008152759,
          "left": 0.8977385,
          "top": 0.83699113
        },
        "polygon": [
          { "x": 0.8977385, "y": 0.83699703 },
          { "x": 0.9048044, "y": 0.83699113 },
          { "x": 0.90481526, "y": 0.845138 },
          { "x": 0.89774936, "y": 0.8451439 }
        ]
      },
      "id": "61e5e9d7-18be-4cc0-8b48-5045fa543dea",
      "relationships": [
        { "type": "CHILD", "ids": ["30e354e1-2803-4104-9f5a-137fbc3c42a6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.91322,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006439364,
          "height": 0.008259486,
          "left": 0.9520789,
          "top": 0.83701247
        },
        "polygon": [
          { "x": 0.9520789, "y": 0.83701783 },
          { "x": 0.95850706, "y": 0.83701247 },
          { "x": 0.95851827, "y": 0.8452666 },
          { "x": 0.95209, "y": 0.84527194 }
        ]
      },
      "id": "6166e1c0-56d7-4eaf-bbea-fc62aee6bcb1",
      "relationships": [
        { "type": "CHILD", "ids": ["58549768-e080-4767-bf24-56ef0ec4dfbd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.51195,
      "text": "Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04491803,
          "height": 0.010122062,
          "left": 0.030188411,
          "top": 0.8522552
        },
        "polygon": [
          { "x": 0.030188411, "y": 0.85229266 },
          { "x": 0.07509628, "y": 0.8522552 },
          { "x": 0.07510644, "y": 0.86233985 },
          { "x": 0.030198397, "y": 0.8623773 }
        ]
      },
      "id": "05f79f19-d5b1-4338-8dd8-3409d90af865",
      "relationships": [
        { "type": "CHILD", "ids": ["b52a4fe1-78dd-4922-bc1d-c4fba0633f2a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.68671,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0053152516,
          "height": 0.007956583,
          "left": 0.13870354,
          "top": 0.8522976
        },
        "polygon": [
          { "x": 0.13870354, "y": 0.8523021 },
          { "x": 0.14401056, "y": 0.8522976 },
          { "x": 0.14401878, "y": 0.8602498 },
          { "x": 0.13871175, "y": 0.8602542 }
        ]
      },
      "id": "40107412-b07d-48bc-9f10-e5c11707ebfc",
      "relationships": [
        { "type": "CHILD", "ids": ["f76aaaec-9f2f-4514-9282-7264dcf43bea"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.66781,
      "text": "7:15 R.Patterson 32 yd. Field Goal (10-61, 4:22)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.28482485,
          "height": 0.010828847,
          "left": 0.18550804,
          "top": 0.85179126
        },
        "polygon": [
          { "x": 0.18550804, "y": 0.8520287 },
          { "x": 0.47032058, "y": 0.85179126 },
          { "x": 0.4703329, "y": 0.86238277 },
          { "x": 0.18551917, "y": 0.8626201 }
        ]
      },
      "id": "1b01e173-26fa-4f18-840a-1053f3d29308",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "8d087120-029f-4da7-b377-5056212cb2fc",
            "62331c20-a3f7-4ec8-9c07-65ca242ec800",
            "ca45e914-3abb-4a9b-a8a2-60f064834545",
            "7877c4d1-b90c-4757-8d81-bf436afe14f9",
            "1d423e7d-c663-46ec-9dfb-67299223a590",
            "0c03790e-9a2a-454e-b659-66b517a60800",
            "21048cec-741b-4920-9d5d-7d38cdeb24e4",
            "e187702f-dd04-43a1-abba-d1c0ce70df48"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.929504,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0066704964,
          "height": 0.008338333,
          "left": 0.8979409,
          "top": 0.8520611
        },
        "polygon": [
          { "x": 0.8979409, "y": 0.85206664 },
          { "x": 0.90460026, "y": 0.8520611 },
          { "x": 0.9046114, "y": 0.8603939 },
          { "x": 0.89795196, "y": 0.8603994 }
        ]
      },
      "id": "46edf04d-f56a-40ca-a33a-4c2479a89e8d",
      "relationships": [
        { "type": "CHILD", "ids": ["9ae60bc0-42ac-4408-8713-95dab99b9652"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92485,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006415628,
          "height": 0.008304224,
          "left": 0.95210874,
          "top": 0.8520663
        },
        "polygon": [
          { "x": 0.95210874, "y": 0.8520716 },
          { "x": 0.95851314, "y": 0.8520663 },
          { "x": 0.95852435, "y": 0.86036515 },
          { "x": 0.95211995, "y": 0.8603705 }
        ]
      },
      "id": "f3899b46-aa96-4a75-9442-687010c9ddbe",
      "relationships": [
        { "type": "CHILD", "ids": ["fe847bcf-65e1-48dd-bd4c-573d4cbdc332"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.68132,
      "text": "Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044924248,
          "height": 0.010144344,
          "left": 0.030152448,
          "top": 0.86740726
        },
        "polygon": [
          { "x": 0.030152448, "y": 0.8674447 },
          { "x": 0.07506651, "y": 0.86740726 },
          { "x": 0.07507669, "y": 0.8775142 },
          { "x": 0.030162456, "y": 0.87755156 }
        ]
      },
      "id": "cefa98c8-f1a8-4d53-8cf6-8e4b1821d721",
      "relationships": [
        { "type": "CHILD", "ids": ["fc056a05-cf08-4380-9e52-f916e4722f67"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89903,
      "text": "2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006816239,
          "height": 0.008061267,
          "left": 0.13786559,
          "top": 0.86732537
        },
        "polygon": [
          { "x": 0.13786559, "y": 0.867331 },
          { "x": 0.14467348, "y": 0.86732537 },
          { "x": 0.14468183, "y": 0.87538093 },
          { "x": 0.1378739, "y": 0.8753866 }
        ]
      },
      "id": "5f2d5084-1688-4b8a-9efd-53f369d74c90",
      "relationships": [
        { "type": "CHILD", "ids": ["3c6f23fd-7297-4d15-ae75-441d4e067f35"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.16644,
      "text": "11:26 T.Lawrence 1 yd. run (R.Patterson kick) (16-96, 8:15)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.35318798,
          "height": 0.010983267,
          "left": 0.1792737,
          "top": 0.86692166
        },
        "polygon": [
          { "x": 0.1792737, "y": 0.867216 },
          { "x": 0.532449, "y": 0.86692166 },
          { "x": 0.53246164, "y": 0.8776106 },
          { "x": 0.1792849, "y": 0.8779049 }
        ]
      },
      "id": "116a65b0-4678-4755-9325-a82a58af784d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "100a92c5-489d-43ff-bb95-5b5406c87103",
            "5db2d59e-5772-406a-933a-3ec40ed868ed",
            "2c899919-67cd-4e39-95ab-9477643f744f",
            "6456d9e1-d026-4e23-b75f-5403ae4852e5",
            "b4857aae-e461-4859-a646-54418148c622",
            "90210722-0b23-44a1-8c99-6a8d096b9fec",
            "59217553-86ad-4774-b7e6-4dbcd52fc000",
            "0a155696-eb9b-4390-9188-21ab06a6c4b9",
            "b5cbe6cc-dbbc-46af-a636-d6c2769567a2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97979,
      "text": "10",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013342257,
          "height": 0.008153199,
          "left": 0.891566,
          "top": 0.86732936
        },
        "polygon": [
          { "x": 0.891566, "y": 0.86734045 },
          { "x": 0.9048974, "y": 0.86732936 },
          { "x": 0.90490824, "y": 0.8754714 },
          { "x": 0.89157677, "y": 0.87548256 }
        ]
      },
      "id": "58fbe420-fc68-4a21-b2b7-808b985e66cc",
      "relationships": [
        { "type": "CHILD", "ids": ["f0864c22-44d3-457b-8888-e2bb678c6cce"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92178,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0064942213,
          "height": 0.008292732,
          "left": 0.9520469,
          "top": 0.86717796
        },
        "polygon": [
          { "x": 0.9520469, "y": 0.8671833 },
          { "x": 0.9585299, "y": 0.86717796 },
          { "x": 0.9585411, "y": 0.8754653 },
          { "x": 0.9520581, "y": 0.8754707 }
        ]
      },
      "id": "8e7ecc9b-7816-46a5-88f6-dbbc7682a104",
      "relationships": [
        { "type": "CHILD", "ids": ["1064902a-8718-4bde-a205-55a240ce0c29"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.5414,
      "text": "Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044960234,
          "height": 0.010217017,
          "left": 0.030154737,
          "top": 0.8825205
        },
        "polygon": [
          { "x": 0.030154737, "y": 0.8825579 },
          { "x": 0.07510471, "y": 0.8825205 },
          { "x": 0.07511497, "y": 0.8927001 },
          { "x": 0.030164817, "y": 0.8927375 }
        ]
      },
      "id": "853b5c5d-033b-458f-936f-3d18f0cd53dd",
      "relationships": [
        { "type": "CHILD", "ids": ["c7dcf892-92c2-4af9-a3ba-0c263b8a98e8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87713,
      "text": "2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0068176785,
          "height": 0.008075381,
          "left": 0.13787349,
          "top": 0.8824247
        },
        "polygon": [
          { "x": 0.13787349, "y": 0.8824304 },
          { "x": 0.14468281, "y": 0.8824247 },
          { "x": 0.14469117, "y": 0.8904944 },
          { "x": 0.13788182, "y": 0.89050007 }
        ]
      },
      "id": "3ff528dc-ede4-4f97-8837-03d549a9a39e",
      "relationships": [
        { "type": "CHILD", "ids": ["6081c2d0-78fc-47c5-a4bd-162c89d32a9c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.773674,
      "text": "2:55 R.Patterson 45 yd. Field Goal (8-61, 4:44)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.27754048,
          "height": 0.010854099,
          "left": 0.1856758,
          "top": 0.882102
        },
        "polygon": [
          { "x": 0.1856758, "y": 0.8823332 },
          { "x": 0.46320394, "y": 0.882102 },
          { "x": 0.46321627, "y": 0.89272493 },
          { "x": 0.18568696, "y": 0.89295614 }
        ]
      },
      "id": "1d77a854-6ade-4bc7-9550-4f7237ffaa28",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "b5a98fa6-4052-4d02-bf26-f02e0ecbbb4b",
            "1deb9a3b-c0f1-4b88-b5dd-e83ef966de5e",
            "53ca8b58-5f79-45d6-8106-dbcebd5440a7",
            "e7e54d3b-479b-4fad-8a3d-3c3ea69f9780",
            "5353a516-7346-4205-bb03-c46c7bdc2a8c",
            "d3e8163d-b97d-4637-a55c-933afe3bc71a",
            "4119e1d8-fe50-4fe7-a6c7-d38e4831775a",
            "60db2d38-9fef-4914-be8f-9ecdbac99961"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97853,
      "text": "13",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.012964973,
          "height": 0.008462844,
          "left": 0.8916091,
          "top": 0.8823973
        },
        "polygon": [
          { "x": 0.8916091, "y": 0.8824081 },
          { "x": 0.9045628, "y": 0.8823973 },
          { "x": 0.90457404, "y": 0.89084935 },
          { "x": 0.89162034, "y": 0.89086014 }
        ]
      },
      "id": "d645daff-1bd7-4922-8681-c76923e38e76",
      "relationships": [
        { "type": "CHILD", "ids": ["f5250cbd-1db8-45fd-b0b0-cd09c8c7147d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94106,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0065430044,
          "height": 0.008307052,
          "left": 0.9520398,
          "top": 0.88248235
        },
        "polygon": [
          { "x": 0.9520398, "y": 0.88248783 },
          { "x": 0.9585715, "y": 0.88248235 },
          { "x": 0.95858276, "y": 0.89078397 },
          { "x": 0.952051, "y": 0.89078945 }
        ]
      },
      "id": "72b26156-fc11-4e35-9218-c3ed5f2179ac",
      "relationships": [
        { "type": "CHILD", "ids": ["4e172ed0-f1f1-4ccf-a6c3-e79f066103a1"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.41166,
      "text": "Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04493933,
          "height": 0.010196081,
          "left": 0.03010954,
          "top": 0.897651
        },
        "polygon": [
          { "x": 0.03010954, "y": 0.89768845 },
          { "x": 0.075038634, "y": 0.897651 },
          { "x": 0.07504887, "y": 0.9078097 },
          { "x": 0.030119598, "y": 0.9078471 }
        ]
      },
      "id": "b7390e87-b027-4b0b-8213-ec52162a3bac",
      "relationships": [
        { "type": "CHILD", "ids": ["eba997ab-021f-4598-916a-f5590e30fa87"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89823,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0066853296,
          "height": 0.008195823,
          "left": 0.13795018,
          "top": 0.89758205
        },
        "polygon": [
          { "x": 0.13795018, "y": 0.8975876 },
          { "x": 0.14462703, "y": 0.89758205 },
          { "x": 0.14463551, "y": 0.9057723 },
          { "x": 0.13795865, "y": 0.9057779 }
        ]
      },
      "id": "385b68e3-af0e-44d9-8ce9-584f20d7a353",
      "relationships": [
        { "type": "CHILD", "ids": ["b98a36c0-708a-4a53-9010-da315557be88"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.707535,
      "text": "7:06 R.Patterson 41 yd. Field Goal (12-49, 6:24)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.28441915,
          "height": 0.0106783,
          "left": 0.18558252,
          "top": 0.89732164
        },
        "polygon": [
          { "x": 0.18558252, "y": 0.89755857 },
          { "x": 0.46998954, "y": 0.89732164 },
          { "x": 0.47000167, "y": 0.9077631 },
          { "x": 0.1855935, "y": 0.90799993 }
        ]
      },
      "id": "83c7812c-a6bd-4495-b630-0b9ea44ed69a",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "93d4d692-3f00-4ecc-a4ac-01c75c3f40c3",
            "595d2713-3f88-408c-85a4-f7f1f9a966f0",
            "a99b932a-c4ae-4bd8-be87-e365689690a5",
            "af6eb925-34e0-4f0b-af9b-e0d7f19d032f",
            "ad47849a-3f7b-4e42-8ac8-1ab293201a58",
            "bd0d0d58-1bf8-4e9a-b93b-1716a9692d11",
            "3de66b47-c5f0-4272-aba9-a9d87f1c63b5",
            "d4525d8a-a87a-4aae-9020-868a1ee889cc"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98462,
      "text": "16",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013300996,
          "height": 0.0082540875,
          "left": 0.89164513,
          "top": 0.89760196
        },
        "polygon": [
          { "x": 0.89164513, "y": 0.897613 },
          { "x": 0.9049351, "y": 0.89760196 },
          { "x": 0.9049461, "y": 0.905845 },
          { "x": 0.89165604, "y": 0.905856 }
        ]
      },
      "id": "f0a950db-8fff-437a-b88e-adf580944b1b",
      "relationships": [
        { "type": "CHILD", "ids": ["565a8e3b-c79d-4d59-b744-716f2a08975e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92974,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0065149902,
          "height": 0.00830794,
          "left": 0.95210505,
          "top": 0.8976081
        },
        "polygon": [
          { "x": 0.95210505, "y": 0.8976135 },
          { "x": 0.95860875, "y": 0.8976081 },
          { "x": 0.95862, "y": 0.9059106 },
          { "x": 0.95211625, "y": 0.90591604 }
        ]
      },
      "id": "ef774e6a-0e29-42b9-b132-9d90a7d0df1a",
      "relationships": [
        { "type": "CHILD", "ids": ["be36ecdc-2594-407d-9543-7d38f2ac55de"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.629616,
      "text": "Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.045039903,
          "height": 0.010050713,
          "left": 0.03001716,
          "top": 0.91288394
        },
        "polygon": [
          { "x": 0.03001716, "y": 0.9129215 },
          { "x": 0.07504697, "y": 0.91288394 },
          { "x": 0.07505707, "y": 0.9228972 },
          { "x": 0.030027073, "y": 0.92293465 }
        ]
      },
      "id": "cb951c4e-0381-4fd3-b82d-8d6191f4f0a3",
      "relationships": [
        { "type": "CHILD", "ids": ["ec8d9ab8-4107-417c-84d6-457cb1f9cd4c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94321,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007362896,
          "height": 0.00791848,
          "left": 0.13785395,
          "top": 0.9127729
        },
        "polygon": [
          { "x": 0.13785395, "y": 0.91277903 },
          { "x": 0.14520866, "y": 0.9127729 },
          { "x": 0.14521685, "y": 0.92068523 },
          { "x": 0.13786212, "y": 0.9206914 }
        ]
      },
      "id": "935c754a-3e2d-4cca-93e7-7bd6740c6546",
      "relationships": [
        { "type": "CHILD", "ids": ["5e0c6269-aa30-4098-8923-3dfb7230b1f7"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76097,
      "text": "3:46 R.Patterson 37 yd. Field Goal (4-5, 0:24)",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.27033255,
          "height": 0.010939083,
          "left": 0.18566015,
          "top": 0.9123394
        },
        "polygon": [
          { "x": 0.18566015, "y": 0.91256446 },
          { "x": 0.45598033, "y": 0.9123394 },
          { "x": 0.45599273, "y": 0.92305344 },
          { "x": 0.18567142, "y": 0.92327845 }
        ]
      },
      "id": "04127db0-8efd-4da7-b30b-bc758698234b",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "85665499-a8ff-4339-92b2-c0ebac2c402b",
            "de1970a8-4a4e-4ecd-b524-84c24ed4f2e2",
            "59f99cc1-e9ac-4c85-83c5-5b35bea67e4b",
            "fab18abb-518a-41ee-8a6a-ec8f03fe2a07",
            "edf38e01-a29b-4fad-bcb1-e344db67e226",
            "6b8b864d-a8ac-4c8e-9926-13aad466c154",
            "76876a86-8385-44af-b760-7b2c50b79290",
            "463faecf-976c-4f7d-b4c9-13e165c23333"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.983315,
      "text": "19",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013289341,
          "height": 0.008312448,
          "left": 0.89163077,
          "top": 0.91279274
        },
        "polygon": [
          { "x": 0.89163077, "y": 0.9128038 },
          { "x": 0.9049091, "y": 0.91279274 },
          { "x": 0.90492016, "y": 0.9210941 },
          { "x": 0.8916418, "y": 0.9211052 }
        ]
      },
      "id": "f8b0bc0f-7115-45d9-b0eb-bee91712a0be",
      "relationships": [
        { "type": "CHILD", "ids": ["de5e93c0-2ddd-47d5-963e-c45b09902a32"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92856,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006551048,
          "height": 0.008426328,
          "left": 0.9520673,
          "top": 0.91270036
        },
        "polygon": [
          { "x": 0.9520673, "y": 0.9127058 },
          { "x": 0.95860696, "y": 0.91270036 },
          { "x": 0.95861834, "y": 0.92112124 },
          { "x": 0.9520787, "y": 0.92112666 }
        ]
      },
      "id": "a92bd5b8-b2ad-448d-b58a-c4e4796ff096",
      "relationships": [
        { "type": "CHILD", "ids": ["3aff2692-77eb-4f53-9b2f-ca456e697643"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.638245,
      "text": "Paid Attendance: 70,043",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.14088799,
          "height": 0.009967929,
          "left": 0.0308478,
          "top": 0.9287814
        },
        "polygon": [
          { "x": 0.0308478, "y": 0.92889863 },
          { "x": 0.17172548, "y": 0.9287814 },
          { "x": 0.1717358, "y": 0.9386321 },
          { "x": 0.030857557, "y": 0.9387493 }
        ]
      },
      "id": "cc6ecacb-c2c3-45c5-bece-5e708a0690a4",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "91419419-6e0d-4528-aaa1-05702a9e0125",
            "67c08c73-f680-4fd6-8e14-b832a4d7810c",
            "88f535d9-9185-47ad-aad0-7fd58dd36b59"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.88886,
      "text": "Time: 2:53",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06341492,
          "height": 0.008525185,
          "left": 0.89537424,
          "top": 0.9287053
        },
        "polygon": [
          { "x": 0.89537424, "y": 0.928758 },
          { "x": 0.95877767, "y": 0.9287053 },
          { "x": 0.9587891, "y": 0.93717766 },
          { "x": 0.8953855, "y": 0.93723047 }
        ]
      },
      "id": "dc99c4b9-e2d2-4af5-9d1c-779d91b96973",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "202efc33-86d0-4173-8d53-95765e9251d8",
            "b7574a49-f0e0-493a-896b-41cc3318d540"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.958435,
      "text": "National",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09500109,
          "height": 0.014664925,
          "left": 0.26289377,
          "top": 0.053850256
        },
        "polygon": [
          { "x": 0.26289377, "y": 0.053930722 },
          { "x": 0.35787854, "y": 0.053850256 },
          { "x": 0.35789484, "y": 0.06843474 },
          { "x": 0.26290953, "y": 0.06851518 }
        ]
      },
      "id": "fd5fba02-6901-42c1-8956-d7ba615b40ae",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.929115,
      "text": "Football",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.090348646,
          "height": 0.014858989,
          "left": 0.3670948,
          "top": 0.05392438
        },
        "polygon": [
          { "x": 0.3670948, "y": 0.054000903 },
          { "x": 0.45742634, "y": 0.05392438 },
          { "x": 0.45744345, "y": 0.06870687 },
          { "x": 0.3671114, "y": 0.06878337 }
        ]
      },
      "id": "34f275d3-8407-4249-a80a-467b221cc6f6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85807,
      "text": "League",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08218478,
          "height": 0.017278213,
          "left": 0.4662427,
          "top": 0.054566815
        },
        "polygon": [
          { "x": 0.4662427, "y": 0.05463642 },
          { "x": 0.54840696, "y": 0.054566815 },
          { "x": 0.54842746, "y": 0.07177545 },
          { "x": 0.4662627, "y": 0.071845025 }
        ]
      },
      "id": "3273ce0a-f617-4df9-9061-f57f18f24341",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87363,
      "text": "Game",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06587286,
          "height": 0.013840187,
          "left": 0.5550482,
          "top": 0.05450671
        },
        "polygon": [
          { "x": 0.5550482, "y": 0.054562498 },
          { "x": 0.62090427, "y": 0.05450671 },
          { "x": 0.6209211, "y": 0.06829113 },
          { "x": 0.55506474, "y": 0.068346895 }
        ]
      },
      "id": "f20e9a6b-2cde-4bb1-8483-7e171252dbac",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94481,
      "text": "Summary",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10968335,
          "height": 0.017354375,
          "left": 0.6275164,
          "top": 0.054663476
        },
        "polygon": [
          { "x": 0.6275164, "y": 0.05475637 },
          { "x": 0.73717785, "y": 0.054663476 },
          { "x": 0.7371998, "y": 0.071924984 },
          { "x": 0.62753755, "y": 0.07201785 }
        ]
      },
      "id": "712969d1-4f80-456a-bc5d-95717f68221e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89577,
      "text": "NFL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02210651,
          "height": 0.008006145,
          "left": 0.03584288,
          "top": 0.08024086
        },
        "polygon": [
          { "x": 0.03584288, "y": 0.08025957 },
          { "x": 0.057941392, "y": 0.08024086 },
          { "x": 0.05794939, "y": 0.08822829 },
          { "x": 0.035850808, "y": 0.088247 }
        ]
      },
      "id": "a83f3fbd-ffbd-489b-b166-c44b3c2752b5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.691376,
      "text": "Copyright",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05535321,
          "height": 0.010403766,
          "left": 0.061600223,
          "top": 0.07998968
        },
        "polygon": [
          { "x": 0.061600223, "y": 0.080036536 },
          { "x": 0.11694282, "y": 0.07998968 },
          { "x": 0.11695343, "y": 0.0903466 },
          { "x": 0.06161061, "y": 0.09039345 }
        ]
      },
      "id": "bf38f295-9a2b-41f1-9bec-08973785fae8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 72.665054,
      "text": "©",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.010270688,
          "height": 0.008453791,
          "left": 0.121603124,
          "top": 0.080370285
        },
        "polygon": [
          { "x": 0.121603124, "y": 0.08037897 },
          { "x": 0.13186511, "y": 0.080370285 },
          { "x": 0.13187382, "y": 0.08881539 },
          { "x": 0.12161179, "y": 0.08882408 }
        ]
      },
      "id": "1587d131-51ce-447c-996b-d723555e59c8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.75325,
      "text": "2022",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02832113,
          "height": 0.008139854,
          "left": 0.13710392,
          "top": 0.0801738
        },
        "polygon": [
          { "x": 0.13710392, "y": 0.08019777 },
          { "x": 0.16541657, "y": 0.0801738 },
          { "x": 0.16542505, "y": 0.08828968 },
          { "x": 0.13711229, "y": 0.08831365 }
        ]
      },
      "id": "d2e8cf06-16c1-43e1-b2ab-c64b477d44cb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97782,
      "text": "by",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013721831,
          "height": 0.010316896,
          "left": 0.16986519,
          "top": 0.07992072
        },
        "polygon": [
          { "x": 0.16986519, "y": 0.079932325 },
          { "x": 0.1835762, "y": 0.07992072 },
          { "x": 0.18358701, "y": 0.09022601 },
          { "x": 0.16987596, "y": 0.09023762 }
        ]
      },
      "id": "d43e2c2a-3293-467c-85a3-bd7858bad9ae",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98789,
      "text": "The",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.022338042,
          "height": 0.00831553,
          "left": 0.18717657,
          "top": 0.079984695
        },
        "polygon": [
          { "x": 0.18717657, "y": 0.080003604 },
          { "x": 0.20950581, "y": 0.079984695 },
          { "x": 0.20951462, "y": 0.088281326 },
          { "x": 0.1871853, "y": 0.08830023 }
        ]
      },
      "id": "fcbe0bb5-6118-4f5d-a1be-fccd80e5cb18",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92622,
      "text": "National",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04617678,
          "height": 0.008413857,
          "left": 0.21385501,
          "top": 0.07993353
        },
        "polygon": [
          { "x": 0.21385501, "y": 0.079972625 },
          { "x": 0.26002273, "y": 0.07993353 },
          { "x": 0.2600318, "y": 0.088308305 },
          { "x": 0.21386391, "y": 0.08834739 }
        ]
      },
      "id": "9e8bf3bd-834d-4919-8818-83613516eb36",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93276,
      "text": "Football",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04470485,
          "height": 0.008428103,
          "left": 0.26484397,
          "top": 0.07989843
        },
        "polygon": [
          { "x": 0.26484397, "y": 0.07993627 },
          { "x": 0.3095396, "y": 0.07989843 },
          { "x": 0.30954883, "y": 0.088288695 },
          { "x": 0.26485306, "y": 0.088326536 }
        ]
      },
      "id": "9bb9c86c-1f0b-4be9-a649-b88e0842ec96",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.20809,
      "text": "League.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044771437,
          "height": 0.010194813,
          "left": 0.3142417,
          "top": 0.080185585
        },
        "polygon": [
          { "x": 0.3142417, "y": 0.080223486 },
          { "x": 0.3590018, "y": 0.080185585 },
          { "x": 0.35901314, "y": 0.090342514 },
          { "x": 0.3142529, "y": 0.0903804 }
        ]
      },
      "id": "5e1c3cbd-c51f-4c19-a6d3-581753fe1166",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93822,
      "text": "All",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014241992,
          "height": 0.008228467,
          "left": 0.3631987,
          "top": 0.08002557
        },
        "polygon": [
          { "x": 0.3631987, "y": 0.080037616 },
          { "x": 0.37743142, "y": 0.08002557 },
          { "x": 0.3774407, "y": 0.08824199 },
          { "x": 0.3632079, "y": 0.088254035 }
        ]
      },
      "id": "52185a8c-1f0d-457b-abac-ea2520c59d4a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97168,
      "text": "rights",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.032173175,
          "height": 0.010243278,
          "left": 0.38172942,
          "top": 0.08004367
        },
        "polygon": [
          { "x": 0.38172942, "y": 0.080070905 },
          { "x": 0.41389093, "y": 0.08004367 },
          { "x": 0.41390258, "y": 0.09025973 },
          { "x": 0.38174096, "y": 0.090286955 }
        ]
      },
      "id": "de69e199-b302-4720-92d4-97de42bf9fc9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.973694,
      "text": "reserved.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052389674,
          "height": 0.008487024,
          "left": 0.4181859,
          "top": 0.079976715
        },
        "polygon": [
          { "x": 0.4181859, "y": 0.08002107 },
          { "x": 0.47056574, "y": 0.079976715 },
          { "x": 0.47057557, "y": 0.0884194 },
          { "x": 0.41819555, "y": 0.088463746 }
        ]
      },
      "id": "0844ecb8-55c7-4247-9451-b032763f1b80",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.956604,
      "text": "This",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024260357,
          "height": 0.008377719,
          "left": 0.4752775,
          "top": 0.07996492
        },
        "polygon": [
          { "x": 0.4752775, "y": 0.07998545 },
          { "x": 0.49952805, "y": 0.07996492 },
          { "x": 0.4995379, "y": 0.08832211 },
          { "x": 0.47528726, "y": 0.08834264 }
        ]
      },
      "id": "552c508c-783e-41ae-8909-db0d32121fda",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96865,
      "text": "summary",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053626448,
          "height": 0.008575661,
          "left": 0.5031877,
          "top": 0.08165943
        },
        "polygon": [
          { "x": 0.5031877, "y": 0.08170482 },
          { "x": 0.55680394, "y": 0.08165943 },
          { "x": 0.55681413, "y": 0.0901897 },
          { "x": 0.5031977, "y": 0.090235084 }
        ]
      },
      "id": "454238b9-49e2-4a48-ac9b-af3464d1c275",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98984,
      "text": "and",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021366535,
          "height": 0.008160535,
          "left": 0.5605198,
          "top": 0.08008218
        },
        "polygon": [
          { "x": 0.5605198, "y": 0.08010026 },
          { "x": 0.5818765, "y": 0.08008218 },
          { "x": 0.58188635, "y": 0.088224635 },
          { "x": 0.56052953, "y": 0.08824271 }
        ]
      },
      "id": "42e2d4ba-0a6c-4174-806a-38e6e643b175",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89523,
      "text": "play-by-play",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07078726,
          "height": 0.010424388,
          "left": 0.5859603,
          "top": 0.07999734
        },
        "polygon": [
          { "x": 0.5859603, "y": 0.08005726 },
          { "x": 0.65673476, "y": 0.07999734 },
          { "x": 0.6567476, "y": 0.09036181 },
          { "x": 0.58597285, "y": 0.09042173 }
        ]
      },
      "id": "df65eebf-c0dd-4f12-9b68-dd27bf10b569",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9614,
      "text": "is",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.008883943,
          "height": 0.008191158,
          "left": 0.6605853,
          "top": 0.08013079
        },
        "polygon": [
          { "x": 0.6605853, "y": 0.0801383 },
          { "x": 0.66945904, "y": 0.08013079 },
          { "x": 0.66946924, "y": 0.08831444 },
          { "x": 0.6605954, "y": 0.08832195 }
        ]
      },
      "id": "7acad3fb-94a4-433f-8562-d1bcc9bba281",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98931,
      "text": "for",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016302323,
          "height": 0.008278538,
          "left": 0.67319256,
          "top": 0.07992694
        },
        "polygon": [
          { "x": 0.67319256, "y": 0.07994073 },
          { "x": 0.68948454, "y": 0.07992694 },
          { "x": 0.68949485, "y": 0.08819168 },
          { "x": 0.6732028, "y": 0.08820547 }
        ]
      },
      "id": "ce39d8e8-84e4-47c8-adf4-bd9ebe0722ce",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98843,
      "text": "the",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01921096,
          "height": 0.008307113,
          "left": 0.6929608,
          "top": 0.08002508
        },
        "polygon": [
          { "x": 0.6929608, "y": 0.080041334 },
          { "x": 0.7121613, "y": 0.08002508 },
          { "x": 0.71217173, "y": 0.088315934 },
          { "x": 0.69297117, "y": 0.08833219 }
        ]
      },
      "id": "2518b4ff-e7da-4cb3-93f1-934b292eca57",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.929695,
      "text": "express",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044292826,
          "height": 0.008582735,
          "left": 0.71591705,
          "top": 0.08167769
        },
        "polygon": [
          { "x": 0.71591705, "y": 0.08171518 },
          { "x": 0.76019895, "y": 0.08167769 },
          { "x": 0.76020986, "y": 0.09022294 },
          { "x": 0.71592784, "y": 0.09026042 }
        ]
      },
      "id": "a042bc2e-c4c8-407e-97f3-09bb2e6c5a0e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97803,
      "text": "purpose",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04627809,
          "height": 0.008635009,
          "left": 0.7640998,
          "top": 0.081772245
        },
        "polygon": [
          { "x": 0.7640998, "y": 0.08181142 },
          { "x": 0.8103667, "y": 0.081772245 },
          { "x": 0.81037784, "y": 0.09036809 },
          { "x": 0.76411074, "y": 0.09040726 }
        ]
      },
      "id": "907162eb-63ff-4f73-a476-ae8ef2c6c921",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97955,
      "text": "of",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.012118784,
          "height": 0.008339019,
          "left": 0.81402236,
          "top": 0.07985149
        },
        "polygon": [
          { "x": 0.81402236, "y": 0.07986174 },
          { "x": 0.82613033, "y": 0.07985149 },
          { "x": 0.8261412, "y": 0.08818026 },
          { "x": 0.8140332, "y": 0.08819051 }
        ]
      },
      "id": "fb73e412-2ab3-42af-b5dd-4429ad866d8d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93491,
      "text": "assisting",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048729684,
          "height": 0.010240443,
          "left": 0.8296513,
          "top": 0.08011709
        },
        "polygon": [
          { "x": 0.8296513, "y": 0.080158345 },
          { "x": 0.8783675, "y": 0.08011709 },
          { "x": 0.87838095, "y": 0.090316296 },
          { "x": 0.8296646, "y": 0.090357535 }
        ]
      },
      "id": "29b2fd3d-ae91-4755-b22a-479f12247ff7",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93018,
      "text": "media",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.034396607,
          "height": 0.008098577,
          "left": 0.88306785,
          "top": 0.08017824
        },
        "polygon": [
          { "x": 0.88306785, "y": 0.080207355 },
          { "x": 0.91745365, "y": 0.08017824 },
          { "x": 0.91746444, "y": 0.08824771 },
          { "x": 0.8830785, "y": 0.08827682 }
        ]
      },
      "id": "601a5632-0f84-4f2a-a409-138c8048b007",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.985405,
      "text": "in",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.009922166,
          "height": 0.007926654,
          "left": 0.92185855,
          "top": 0.08020881
        },
        "polygon": [
          { "x": 0.92185855, "y": 0.080217205 },
          { "x": 0.93177, "y": 0.08020881 },
          { "x": 0.9317807, "y": 0.08812708 },
          { "x": 0.92186916, "y": 0.088135466 }
        ]
      },
      "id": "e22e8174-2f4c-46e9-91f0-44ae30e897b6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98123,
      "text": "their",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02659808,
          "height": 0.0080943685,
          "left": 0.9358615,
          "top": 0.08010452
        },
        "polygon": [
          { "x": 0.9358615, "y": 0.08012703 },
          { "x": 0.96244866, "y": 0.08010452 },
          { "x": 0.9624596, "y": 0.088176385 },
          { "x": 0.9358724, "y": 0.08819889 }
        ]
      },
      "id": "5fa05f08-4b5c-4d5b-b53d-1143f31b8cfb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96001,
      "text": "coverage",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05236389,
          "height": 0.008592439,
          "left": 0.03548803,
          "top": 0.093867116
        },
        "polygon": [
          { "x": 0.03548803, "y": 0.09391143 },
          { "x": 0.08784326, "y": 0.093867116 },
          { "x": 0.08785193, "y": 0.10241524 },
          { "x": 0.035496518, "y": 0.10245955 }
        ]
      },
      "id": "7f19f3c9-3b21-48e9-af07-9e70a2e377da",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97759,
      "text": "of",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011960033,
          "height": 0.008396354,
          "left": 0.091717735,
          "top": 0.09205335
        },
        "polygon": [
          { "x": 0.091717735, "y": 0.092063464 },
          { "x": 0.10366922, "y": 0.09205335 },
          { "x": 0.103677765, "y": 0.100439586 },
          { "x": 0.09172624, "y": 0.100449696 }
        ]
      },
      "id": "2758a06d-7aa8-456c-9e6a-c4d85cd38d72",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.99287,
      "text": "the",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018915217,
          "height": 0.00842057,
          "left": 0.10677177,
          "top": 0.09204691
        },
        "polygon": [
          { "x": 0.10677177, "y": 0.09206291 },
          { "x": 0.12567835, "y": 0.09204691 },
          { "x": 0.12568699, "y": 0.10045148 },
          { "x": 0.10678034, "y": 0.10046748 }
        ]
      },
      "id": "3293cad7-91e4-44dd-9f9c-228bff71e63f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84946,
      "text": "game;",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.035839494,
          "height": 0.008724391,
          "left": 0.12949815,
          "top": 0.09370637
        },
        "polygon": [
          { "x": 0.12949815, "y": 0.0937367 },
          { "x": 0.16532858, "y": 0.09370637 },
          { "x": 0.16533765, "y": 0.10240044 },
          { "x": 0.12950711, "y": 0.10243076 }
        ]
      },
      "id": "38ebc80f-82b2-434e-ab18-534508fe8ed9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.992226,
      "text": "any",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020866465,
          "height": 0.008439356,
          "left": 0.17020012,
          "top": 0.093940035
        },
        "polygon": [
          { "x": 0.17020012, "y": 0.09395769 },
          { "x": 0.19105773, "y": 0.093940035 },
          { "x": 0.1910666, "y": 0.10236174 },
          { "x": 0.17020893, "y": 0.1023794 }
        ]
      },
      "id": "78d9ac1d-765e-491a-8f5f-4f464accd569",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.993164,
      "text": "other",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030198438,
          "height": 0.008266706,
          "left": 0.19526203,
          "top": 0.092296295
        },
        "polygon": [
          { "x": 0.19526203, "y": 0.09232185 },
          { "x": 0.22545166, "y": 0.092296295 },
          { "x": 0.22546045, "y": 0.10053745 },
          { "x": 0.19527072, "y": 0.100563 }
        ]
      },
      "id": "8f48e79e-362d-4215-8cf7-7ee3b6110957",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.967995,
      "text": "use",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020028358,
          "height": 0.0065122684,
          "left": 0.22944064,
          "top": 0.093905985
        },
        "polygon": [
          { "x": 0.22944064, "y": 0.09392293 },
          { "x": 0.24946202, "y": 0.093905985 },
          { "x": 0.24946901, "y": 0.100401305 },
          { "x": 0.22944759, "y": 0.100418255 }
        ]
      },
      "id": "ef71d79c-0daa-4adf-a3f0-202816363764",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97195,
      "text": "of",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0118395,
          "height": 0.008415038,
          "left": 0.2534866,
          "top": 0.091975614
        },
        "polygon": [
          { "x": 0.2534866, "y": 0.09198563 },
          { "x": 0.265317, "y": 0.091975614 },
          { "x": 0.2653261, "y": 0.10038064 },
          { "x": 0.25349566, "y": 0.10039065 }
        ]
      },
      "id": "fc9fceb8-f756-47f9-8299-a44e2902c911",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.983665,
      "text": "this",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020759715,
          "height": 0.008572377,
          "left": 0.26848215,
          "top": 0.09196616
        },
        "polygon": [
          { "x": 0.26848215, "y": 0.09198373 },
          { "x": 0.28923252, "y": 0.09196616 },
          { "x": 0.28924185, "y": 0.100520976 },
          { "x": 0.26849142, "y": 0.10053854 }
        ]
      },
      "id": "9fdd235c-016f-4a20-8749-90abcec8f214",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90257,
      "text": "material",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.046469934,
          "height": 0.008492129,
          "left": 0.29337135,
          "top": 0.092047125
        },
        "polygon": [
          { "x": 0.29337135, "y": 0.09208645 },
          { "x": 0.3398319, "y": 0.092047125 },
          { "x": 0.33984128, "y": 0.10049993 },
          { "x": 0.2933806, "y": 0.10053925 }
        ]
      },
      "id": "7a22b62f-473f-4394-9bc2-15cbc9f23ec0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96992,
      "text": "is",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00874199,
          "height": 0.008213927,
          "left": 0.3440912,
          "top": 0.092206396
        },
        "polygon": [
          { "x": 0.3440912, "y": 0.09221379 },
          { "x": 0.35282403, "y": 0.092206396 },
          { "x": 0.3528332, "y": 0.10041293 },
          { "x": 0.34410036, "y": 0.10042032 }
        ]
      },
      "id": "bf6e0def-4a96-4919-826a-a88ad511adaf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91404,
      "text": "prohibited",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05764882,
          "height": 0.01025882,
          "left": 0.35708958,
          "top": 0.091987595
        },
        "polygon": [
          { "x": 0.35708958, "y": 0.09203638 },
          { "x": 0.41472673, "y": 0.091987595 },
          { "x": 0.4147384, "y": 0.10219763 },
          { "x": 0.357101, "y": 0.10224641 }
        ]
      },
      "id": "fb8fc6c4-39d1-45c1-b5b9-8fab274995b0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98489,
      "text": "without",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04389816,
          "height": 0.00859727,
          "left": 0.41857484,
          "top": 0.09202526
        },
        "polygon": [
          { "x": 0.41857484, "y": 0.092062406 },
          { "x": 0.46246308, "y": 0.09202526 },
          { "x": 0.462473, "y": 0.10058538 },
          { "x": 0.41858461, "y": 0.10062253 }
        ]
      },
      "id": "3d53caf5-eb0a-46e8-9c00-21818247df85",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98911,
      "text": "the",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018984115,
          "height": 0.008391204,
          "left": 0.46584272,
          "top": 0.09211582
        },
        "polygon": [
          { "x": 0.46584272, "y": 0.09213188 },
          { "x": 0.48481706, "y": 0.09211582 },
          { "x": 0.48482683, "y": 0.100490965 },
          { "x": 0.46585244, "y": 0.10050703 }
        ]
      },
      "id": "1ba9c1a7-d250-415c-8286-a69ea0e197a1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.944046,
      "text": "written",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04060555,
          "height": 0.008347914,
          "left": 0.48823485,
          "top": 0.09227053
        },
        "polygon": [
          { "x": 0.48823485, "y": 0.09230489 },
          { "x": 0.5288305, "y": 0.09227053 },
          { "x": 0.5288404, "y": 0.10058409 },
          { "x": 0.4882446, "y": 0.100618444 }
        ]
      },
      "id": "05248ea4-1b73-4ddd-81a5-75ae80ba486c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.745705,
      "text": "permission",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.061130937,
          "height": 0.010183484,
          "left": 0.5332827,
          "top": 0.09220507
        },
        "polygon": [
          { "x": 0.5332827, "y": 0.09225681 },
          { "x": 0.59440136, "y": 0.09220507 },
          { "x": 0.59441364, "y": 0.10233683 },
          { "x": 0.53329474, "y": 0.10238855 }
        ]
      },
      "id": "a868bb3b-89f4-4184-9947-08aa043d032e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.981606,
      "text": "of",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.012328966,
          "height": 0.0083844485,
          "left": 0.59868455,
          "top": 0.09197365
        },
        "polygon": [
          { "x": 0.59868455, "y": 0.09198407 },
          { "x": 0.61100334, "y": 0.09197365 },
          { "x": 0.61101353, "y": 0.10034767 },
          { "x": 0.59869474, "y": 0.10035809 }
        ]
      },
      "id": "15ca1b91-1689-4951-a4d2-f3dd5f352aca",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9892,
      "text": "the",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018810146,
          "height": 0.008296586,
          "left": 0.6140029,
          "top": 0.092164785
        },
        "polygon": [
          { "x": 0.6140029, "y": 0.0921807 },
          { "x": 0.63280284, "y": 0.092164785 },
          { "x": 0.63281304, "y": 0.10044546 },
          { "x": 0.61401296, "y": 0.10046137 }
        ]
      },
      "id": "8e5425d6-e270-4a59-a20b-18de895da885",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95226,
      "text": "National",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.047034502,
          "height": 0.008438287,
          "left": 0.6368627,
          "top": 0.092044145
        },
        "polygon": [
          { "x": 0.6368627, "y": 0.09208395 },
          { "x": 0.6838867, "y": 0.092044145 },
          { "x": 0.6838972, "y": 0.10044263 },
          { "x": 0.636873, "y": 0.100482434 }
        ]
      },
      "id": "9268b79d-9fd9-4efd-b58b-af09cb1357c4",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93146,
      "text": "Football",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.045069244,
          "height": 0.008644808,
          "left": 0.6881332,
          "top": 0.092046075
        },
        "polygon": [
          { "x": 0.6881332, "y": 0.092084214 },
          { "x": 0.73319155, "y": 0.092046075 },
          { "x": 0.7332024, "y": 0.10065275 },
          { "x": 0.6881439, "y": 0.10069089 }
        ]
      },
      "id": "32e2fdd9-e749-4cdf-ae34-76c607115df5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.67161,
      "text": "League.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044507883,
          "height": 0.010268909,
          "left": 0.73759073,
          "top": 0.09214576
        },
        "polygon": [
          { "x": 0.73759073, "y": 0.092183426 },
          { "x": 0.7820855, "y": 0.09214576 },
          { "x": 0.7820986, "y": 0.10237701 },
          { "x": 0.7376037, "y": 0.10241467 }
        ]
      },
      "id": "513bf30d-abb7-41aa-b4e3-0cf2a84b9281",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.930885,
      "text": "Date:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030194273,
          "height": 0.008333885,
          "left": 0.03579558,
          "top": 0.11404202
        },
        "polygon": [
          { "x": 0.03579558, "y": 0.11406756 },
          { "x": 0.06598151, "y": 0.11404202 },
          { "x": 0.06598985, "y": 0.122350365 },
          { "x": 0.03580383, "y": 0.122375906 }
        ]
      },
      "id": "3f2399d3-c092-4d91-9bf0-d3920a0e1b43",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.953354,
      "text": "Thursday,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0572003,
          "height": 0.010660809,
          "left": 0.07063984,
          "top": 0.11363326
        },
        "polygon": [
          { "x": 0.07063984, "y": 0.11368165 },
          { "x": 0.12782922, "y": 0.11363326 },
          { "x": 0.12784015, "y": 0.12424569 },
          { "x": 0.07065052, "y": 0.12429407 }
        ]
      },
      "id": "01dd44b9-c688-416f-8dde-b654855e4f02",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88715,
      "text": "12/22/2022",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06640673,
          "height": 0.009768262,
          "left": 0.13308837,
          "top": 0.11365806
        },
        "polygon": [
          { "x": 0.13308837, "y": 0.11371424 },
          { "x": 0.19948483, "y": 0.11365806 },
          { "x": 0.19949509, "y": 0.123370156 },
          { "x": 0.13309838, "y": 0.123426326 }
        ]
      },
      "id": "5bc52a34-a82b-4042-b173-6f044a3a17fb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.724434,
      "text": "Jacksonville",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.10014266,
          "height": 0.010384404,
          "left": 0.34555537,
          "top": 0.11429829
        },
        "polygon": [
          { "x": 0.34555537, "y": 0.11438301 },
          { "x": 0.44568616, "y": 0.11429829 },
          { "x": 0.44569802, "y": 0.12459799 },
          { "x": 0.34556687, "y": 0.124682695 }
        ]
      },
      "id": "0e449289-264a-45f8-8029-fc88f95a2397",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.57905,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06425168,
          "height": 0.012309791,
          "left": 0.4499508,
          "top": 0.114718065
        },
        "polygon": [
          { "x": 0.4499508, "y": 0.11477242 },
          { "x": 0.51418805, "y": 0.114718065 },
          { "x": 0.51420254, "y": 0.12697351 },
          { "x": 0.44996497, "y": 0.12702785 }
        ]
      },
      "id": "0e01272f-6830-401c-ad71-255b46491996",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91204,
      "text": "at",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016819624,
          "height": 0.009601635,
          "left": 0.5191044,
          "top": 0.11511369
        },
        "polygon": [
          { "x": 0.5191044, "y": 0.115127906 },
          { "x": 0.53591263, "y": 0.11511369 },
          { "x": 0.5359241, "y": 0.124701105 },
          { "x": 0.51911575, "y": 0.12471532 }
        ]
      },
      "id": "fb8eda82-19ba-441e-979d-eadad5bfa24f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94868,
      "text": "New",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03633255,
          "height": 0.01008472,
          "left": 0.54082114,
          "top": 0.11460908
        },
        "polygon": [
          { "x": 0.54082114, "y": 0.114639804 },
          { "x": 0.5771416, "y": 0.11460908 },
          { "x": 0.5771537, "y": 0.12466307 },
          { "x": 0.5408331, "y": 0.124693796 }
        ]
      },
      "id": "1ea7d570-738e-49bb-b4d8-2461eb70d0b3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81143,
      "text": "York",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.038409304,
          "height": 0.010129765,
          "left": 0.5816707,
          "top": 0.114529535
        },
        "polygon": [
          { "x": 0.5816707, "y": 0.11456202 },
          { "x": 0.62006766, "y": 0.114529535 },
          { "x": 0.62008, "y": 0.124626815 },
          { "x": 0.58168286, "y": 0.1246593 }
        ]
      },
      "id": "f4a8c0a0-7501-40bc-9df7-2839794a6608",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.877235,
      "text": "Jets",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.033607736,
          "height": 0.01001624,
          "left": 0.62402374,
          "top": 0.114768006
        },
        "polygon": [
          { "x": 0.62402374, "y": 0.11479643 },
          { "x": 0.6576191, "y": 0.114768006 },
          { "x": 0.65763146, "y": 0.12475583 },
          { "x": 0.62403595, "y": 0.124784246 }
        ]
      },
      "id": "d531ce1d-518b-4320-94d4-0e644be153a1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.937546,
      "text": "Start",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027608527,
          "height": 0.008235203,
          "left": 0.8115739,
          "top": 0.11396321
        },
        "polygon": [
          { "x": 0.8115739, "y": 0.11398656 },
          { "x": 0.8391717, "y": 0.11396321 },
          { "x": 0.83918244, "y": 0.12217507 },
          { "x": 0.81158453, "y": 0.12219842 }
        ]
      },
      "id": "d63c4b03-c19c-4b09-9c38-0a6f43b966a3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.943794,
      "text": "Time:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.032223888,
          "height": 0.00828046,
          "left": 0.8426837,
          "top": 0.114006124
        },
        "polygon": [
          { "x": 0.8426837, "y": 0.114033386 },
          { "x": 0.87489665, "y": 0.114006124 },
          { "x": 0.87490755, "y": 0.122259334 },
          { "x": 0.8426945, "y": 0.12228659 }
        ]
      },
      "id": "51ad0ce1-65d4-43f4-bf85-640e26f66543",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.29601,
      "text": "8:16",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025857616,
          "height": 0.008310876,
          "left": 0.8801754,
          "top": 0.113974325
        },
        "polygon": [
          { "x": 0.8801754, "y": 0.11399619 },
          { "x": 0.90602195, "y": 0.113974325 },
          { "x": 0.90603304, "y": 0.122263335 },
          { "x": 0.8801864, "y": 0.1222852 }
        ]
      },
      "id": "1c9734c2-ba42-4475-8338-3012ee5bef35",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.788994,
      "text": "PM",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01656069,
          "height": 0.008035741,
          "left": 0.91050893,
          "top": 0.11417433
        },
        "polygon": [
          { "x": 0.91050893, "y": 0.11418833 },
          { "x": 0.9270589, "y": 0.11417433 },
          { "x": 0.92706966, "y": 0.12219606 },
          { "x": 0.91051966, "y": 0.12221007 }
        ]
      },
      "id": "e51f91aa-87e7-4568-b322-0943db7a71c0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.03773,
      "text": "EST",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021908177,
          "height": 0.008142694,
          "left": 0.9319151,
          "top": 0.114154585
        },
        "polygon": [
          { "x": 0.9319151, "y": 0.11417311 },
          { "x": 0.9538123, "y": 0.114154585 },
          { "x": 0.9538233, "y": 0.12227875 },
          { "x": 0.9319261, "y": 0.12229728 }
        ]
      },
      "id": "3032ac88-15d8-4665-9ec4-37d72aaf983c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.924515,
      "text": "at",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011695005,
          "height": 0.0080523845,
          "left": 0.38497925,
          "top": 0.13245599
        },
        "polygon": [
          { "x": 0.38497925, "y": 0.13246587 },
          { "x": 0.39666516, "y": 0.13245599 },
          { "x": 0.39667428, "y": 0.14049849 },
          { "x": 0.38498834, "y": 0.14050838 }
        ]
      },
      "id": "88627d57-b00b-437a-ab94-609cf70dba68",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84415,
      "text": "MetLife",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.041492816,
          "height": 0.008610744,
          "left": 0.40067104,
          "top": 0.13204192
        },
        "polygon": [
          { "x": 0.40067104, "y": 0.132077 },
          { "x": 0.442154, "y": 0.13204192 },
          { "x": 0.44216385, "y": 0.14061758 },
          { "x": 0.40068078, "y": 0.14065266 }
        ]
      },
      "id": "c4a1d508-8404-43f4-87e3-c35f45bb9951",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.435745,
      "text": "Stadium,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050123945,
          "height": 0.009914429,
          "left": 0.4465055,
          "top": 0.13195367
        },
        "polygon": [
          { "x": 0.4465055, "y": 0.13199607 },
          { "x": 0.49661785, "y": 0.13195367 },
          { "x": 0.49662942, "y": 0.14182572 },
          { "x": 0.44651687, "y": 0.1418681 }
        ]
      },
      "id": "f5209093-13c4-4ccf-b87f-a3dd9e9a3f54",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.52795,
      "text": "East",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02427302,
          "height": 0.008544349,
          "left": 0.50174755,
          "top": 0.13205183
        },
        "polygon": [
          { "x": 0.50174755, "y": 0.13207234 },
          { "x": 0.52601045, "y": 0.13205183 },
          { "x": 0.5260205, "y": 0.14057566 },
          { "x": 0.50175756, "y": 0.14059618 }
        ]
      },
      "id": "9be886ea-361b-4487-84e3-2e907d1491ac",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.33526,
      "text": "Rutherford,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0646455,
          "height": 0.01011994,
          "left": 0.53016776,
          "top": 0.13187242
        },
        "polygon": [
          { "x": 0.53016776, "y": 0.13192707 },
          { "x": 0.59480107, "y": 0.13187242 },
          { "x": 0.5948133, "y": 0.14193769 },
          { "x": 0.5301797, "y": 0.14199235 }
        ]
      },
      "id": "eb889c27-7fdf-4392-94af-84ac5f4d1dce",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.920074,
      "text": "NJ",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01383769,
          "height": 0.008509503,
          "left": 0.5995294,
          "top": 0.13203643
        },
        "polygon": [
          { "x": 0.5995294, "y": 0.13204813 },
          { "x": 0.6133567, "y": 0.13203643 },
          { "x": 0.6133671, "y": 0.14053424 },
          { "x": 0.5995397, "y": 0.14054593 }
        ]
      },
      "id": "53622e4d-0a2e-4b91-8e2c-59b238c401ef",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82179,
      "text": "Game",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037696976,
          "height": 0.008095065,
          "left": 0.42652807,
          "top": 0.15100296
        },
        "polygon": [
          { "x": 0.42652807, "y": 0.15103482 },
          { "x": 0.4642157, "y": 0.15100296 },
          { "x": 0.46422505, "y": 0.15906617 },
          { "x": 0.4265373, "y": 0.15909803 }
        ]
      },
      "id": "672182b7-7d15-462f-87c9-53871ff1572c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84273,
      "text": "Day",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024850352,
          "height": 0.010063384,
          "left": 0.46848443,
          "top": 0.1511492
        },
        "polygon": [
          { "x": 0.46848443, "y": 0.1511702 },
          { "x": 0.49332303, "y": 0.1511492 },
          { "x": 0.4933348, "y": 0.16119158 },
          { "x": 0.4684961, "y": 0.16121258 }
        ]
      },
      "id": "208e197f-d8e7-4bff-9ddf-c0e07937196c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.892815,
      "text": "Weather",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05693753,
          "height": 0.008397285,
          "left": 0.49694473,
          "top": 0.15090135
        },
        "polygon": [
          { "x": 0.49694473, "y": 0.1509495 },
          { "x": 0.5538723, "y": 0.15090135 },
          { "x": 0.55388224, "y": 0.15925051 },
          { "x": 0.49695453, "y": 0.15929864 }
        ]
      },
      "id": "dcd71ad9-f3d7-4699-bec2-4bd660d710a3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86642,
      "text": "Game",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03363014,
          "height": 0.008392054,
          "left": 0.03548692,
          "top": 0.1678479
        },
        "polygon": [
          { "x": 0.03548692, "y": 0.16787632 },
          { "x": 0.06910865, "y": 0.1678479 },
          { "x": 0.06911706, "y": 0.17621154 },
          { "x": 0.03549522, "y": 0.17623995 }
        ]
      },
      "id": "0d1983e4-e089-4c8d-b2e7-85ead405a9da",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.877945,
      "text": "Weather:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05268268,
          "height": 0.008638504,
          "left": 0.072621256,
          "top": 0.16781066
        },
        "polygon": [
          { "x": 0.072621256, "y": 0.16785519 },
          { "x": 0.1252951, "y": 0.16781066 },
          { "x": 0.12530394, "y": 0.17640465 },
          { "x": 0.07262991, "y": 0.17644916 }
        ]
      },
      "id": "53c76fc2-bbd2-4229-b1dc-65aea61a92cf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.948555,
      "text": "Light",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.028570531,
          "height": 0.010432794,
          "left": 0.13070144,
          "top": 0.16780485
        },
        "polygon": [
          { "x": 0.13070144, "y": 0.16782898 },
          { "x": 0.15926114, "y": 0.16780485 },
          { "x": 0.15927197, "y": 0.1782135 },
          { "x": 0.13071215, "y": 0.17823765 }
        ]
      },
      "id": "65b7249a-44fd-4739-821d-9cbc6c18cdf7",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.80448,
      "text": "rain,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024853488,
          "height": 0.009783084,
          "left": 0.16308914,
          "top": 0.16793174
        },
        "polygon": [
          { "x": 0.16308914, "y": 0.16795273 },
          { "x": 0.18793234, "y": 0.16793174 },
          { "x": 0.18794262, "y": 0.17769383 },
          { "x": 0.16309932, "y": 0.17771482 }
        ]
      },
      "id": "4ed59638-1727-45f0-96d7-16554e5459e6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.74864,
      "text": "cold,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02668172,
          "height": 0.010085708,
          "left": 0.19258404,
          "top": 0.1676786
        },
        "polygon": [
          { "x": 0.19258404, "y": 0.16770114 },
          { "x": 0.21925505, "y": 0.1676786 },
          { "x": 0.21926576, "y": 0.17774177 },
          { "x": 0.19259465, "y": 0.17776431 }
        ]
      },
      "id": "30640f53-7920-469e-869c-bbe5c630615f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94304,
      "text": "windy,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037229653,
          "height": 0.010314781,
          "left": 0.22387902,
          "top": 0.16783744
        },
        "polygon": [
          { "x": 0.22387902, "y": 0.1678689 },
          { "x": 0.26109755, "y": 0.16783744 },
          { "x": 0.26110867, "y": 0.17812078 },
          { "x": 0.22388999, "y": 0.17815222 }
        ]
      },
      "id": "dcd9e3f9-d6d3-4921-ba2e-8231ccfdc82a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.99116,
      "text": "and",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021256063,
          "height": 0.008446984,
          "left": 0.26578656,
          "top": 0.16780412
        },
        "polygon": [
          { "x": 0.26578656, "y": 0.16782208 },
          { "x": 0.28703344, "y": 0.16780412 },
          { "x": 0.28704262, "y": 0.17623316 },
          { "x": 0.2657957, "y": 0.17625111 }
        ]
      },
      "id": "6a06115f-be34-4d97-b732-23b9732a0d35",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87685,
      "text": "miserable",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.055581793,
          "height": 0.008503338,
          "left": 0.29121956,
          "top": 0.16784567
        },
        "polygon": [
          { "x": 0.29121956, "y": 0.16789263 },
          { "x": 0.34679192, "y": 0.16784567 },
          { "x": 0.34680137, "y": 0.17630205 },
          { "x": 0.2912288, "y": 0.17634901 }
        ]
      },
      "id": "1b6bdca4-a754-4a7d-aac5-95d9a48cf7aa",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.65909,
      "text": "Temp:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.036533523,
          "height": 0.010160315,
          "left": 0.6430381,
          "top": 0.16781987
        },
        "polygon": [
          { "x": 0.6430381, "y": 0.16785075 },
          { "x": 0.679559, "y": 0.16781987 },
          { "x": 0.6795716, "y": 0.17794932 },
          { "x": 0.64305055, "y": 0.17798018 }
        ]
      },
      "id": "2ffedc7d-0eab-435a-8934-2fa66d8d78bd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 89.22485,
      "text": "45°",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01994402,
          "height": 0.008624148,
          "left": 0.68458366,
          "top": 0.16771188
        },
        "polygon": [
          { "x": 0.68458366, "y": 0.16772874 },
          { "x": 0.7045169, "y": 0.16771188 },
          { "x": 0.7045277, "y": 0.1763192 },
          { "x": 0.6845944, "y": 0.17633604 }
        ]
      },
      "id": "73215019-3925-4dae-a5c2-8aa2c86ff908",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.47496,
      "text": "F",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0066232746,
          "height": 0.008405773,
          "left": 0.7095957,
          "top": 0.16786094
        },
        "polygon": [
          { "x": 0.7095957, "y": 0.16786653 },
          { "x": 0.7162084, "y": 0.16786094 },
          { "x": 0.716219, "y": 0.17626113 },
          { "x": 0.7096063, "y": 0.17626671 }
        ]
      },
      "id": "30111ba9-68ad-4c36-a511-8fb207ea5b34",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 90.06188,
      "text": "(7.2°",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.028620092,
          "height": 0.010623929,
          "left": 0.7203201,
          "top": 0.1674938
        },
        "polygon": [
          { "x": 0.7203201, "y": 0.16751797 },
          { "x": 0.74892676, "y": 0.1674938 },
          { "x": 0.7489402, "y": 0.17809355 },
          { "x": 0.7203335, "y": 0.17811772 }
        ]
      },
      "id": "9959a4cc-20c2-49e1-95ba-5fbad5cf3d01",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.082535,
      "text": "C)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0125996545,
          "height": 0.010522037,
          "left": 0.7535862,
          "top": 0.16763312
        },
        "polygon": [
          { "x": 0.7535862, "y": 0.16764376 },
          { "x": 0.7661724, "y": 0.16763312 },
          { "x": 0.7661858, "y": 0.17814451 },
          { "x": 0.7535996, "y": 0.17815515 }
        ]
      },
      "id": "cee5054c-25da-4861-861d-65e698ac4303",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.47302,
      "text": "Humidity:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054089468,
          "height": 0.010413594,
          "left": 0.7709489,
          "top": 0.1676818
        },
        "polygon": [
          { "x": 0.7709489, "y": 0.1677275 },
          { "x": 0.82502484, "y": 0.1676818 },
          { "x": 0.8250383, "y": 0.1780497 },
          { "x": 0.7709622, "y": 0.17809539 }
        ]
      },
      "id": "b424ce7f-b6c6-4b2c-a85d-e8e9037bc243",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 91.68096,
      "text": "91%,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03037729,
          "height": 0.009921773,
          "left": 0.83004385,
          "top": 0.16777542
        },
        "polygon": [
          { "x": 0.83004385, "y": 0.16780108 },
          { "x": 0.8604081, "y": 0.16777542 },
          { "x": 0.8604211, "y": 0.17767154 },
          { "x": 0.8300568, "y": 0.1776972 }
        ]
      },
      "id": "0214b9e0-76bc-4698-955c-5d039da86df5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95004,
      "text": "Wind:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.033226203,
          "height": 0.008602899,
          "left": 0.8649876,
          "top": 0.16773252
        },
        "polygon": [
          { "x": 0.8649876, "y": 0.1677606 },
          { "x": 0.8982024, "y": 0.16773252 },
          { "x": 0.8982138, "y": 0.17630735 },
          { "x": 0.86499894, "y": 0.17633541 }
        ]
      },
      "id": "7fd36909-4477-4352-a173-513c789604b8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.323135,
      "text": "E",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070712185,
          "height": 0.008289687,
          "left": 0.9036849,
          "top": 0.16786103
        },
        "polygon": [
          { "x": 0.9036849, "y": 0.167867 },
          { "x": 0.910745, "y": 0.16786103 },
          { "x": 0.9107561, "y": 0.17614475 },
          { "x": 0.90369594, "y": 0.17615072 }
        ]
      },
      "id": "9b792203-9c90-482b-8f37-d771744cdb41",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89081,
      "text": "14",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013474184,
          "height": 0.00824073,
          "left": 0.9155138,
          "top": 0.16786633
        },
        "polygon": [
          { "x": 0.9155138, "y": 0.1678777 },
          { "x": 0.92897695, "y": 0.16786633 },
          { "x": 0.928988, "y": 0.17609568 },
          { "x": 0.91552484, "y": 0.17610706 }
        ]
      },
      "id": "4e09e247-acc4-4ceb-b527-e67355289bdc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.80463,
      "text": "mph",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024977958,
          "height": 0.01015185,
          "left": 0.93320364,
          "top": 0.16783805
        },
        "polygon": [
          { "x": 0.93320364, "y": 0.16785915 },
          { "x": 0.95816785, "y": 0.16783805 },
          { "x": 0.95818156, "y": 0.17796881 },
          { "x": 0.9332172, "y": 0.1779899 }
        ]
      },
      "id": "0b4282d3-fed1-4985-aacb-bc32dbf77d28",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.970314,
      "text": "Played",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037211064,
          "height": 0.010071885,
          "left": 0.03599095,
          "top": 0.1829948
        },
        "polygon": [
          { "x": 0.03599095, "y": 0.18302622 },
          { "x": 0.0731919, "y": 0.1829948 },
          { "x": 0.073202014, "y": 0.19303526 },
          { "x": 0.03600092, "y": 0.19306669 }
        ]
      },
      "id": "066b340e-731c-4a2d-be1a-15fbf0c01fd2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93098,
      "text": "Open",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03024972,
          "height": 0.01015606,
          "left": 0.07736325,
          "top": 0.18303175
        },
        "polygon": [
          { "x": 0.07736325, "y": 0.18305731 },
          { "x": 0.10760263, "y": 0.18303175 },
          { "x": 0.107612975, "y": 0.19316228 },
          { "x": 0.077373475, "y": 0.19318782 }
        ]
      },
      "id": "d5dfea69-0a46-458f-a4c6-6d7b6667ad54",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81819,
      "text": "Stadium",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.046912435,
          "height": 0.008509269,
          "left": 0.1118368,
          "top": 0.18289813
        },
        "polygon": [
          { "x": 0.1118368, "y": 0.18293777 },
          { "x": 0.15874042, "y": 0.18289813 },
          { "x": 0.15874924, "y": 0.19136778 },
          { "x": 0.111845456, "y": 0.1914074 }
        ]
      },
      "id": "0687cef0-d603-4bc6-abd4-dde379c1d6d1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.981064,
      "text": "on",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014455709,
          "height": 0.006282427,
          "left": 0.16272163,
          "top": 0.1850451
        },
        "polygon": [
          { "x": 0.16272163, "y": 0.1850573 },
          { "x": 0.17717077, "y": 0.1850451 },
          { "x": 0.17717734, "y": 0.19131531 },
          { "x": 0.16272818, "y": 0.19132751 }
        ]
      },
      "id": "4dba1a73-329f-4f69-897f-d4e4f11f67e5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.4356,
      "text": "Turf:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027851561,
          "height": 0.008600226,
          "left": 0.18101436,
          "top": 0.18281838
        },
        "polygon": [
          { "x": 0.18101436, "y": 0.18284191 },
          { "x": 0.20885682, "y": 0.18281838 },
          { "x": 0.20886591, "y": 0.19139509 },
          { "x": 0.18102336, "y": 0.1914186 }
        ]
      },
      "id": "c398e562-0e42-44ea-b1db-8562599fce51",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85644,
      "text": "UBU",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024337409,
          "height": 0.00826022,
          "left": 0.21405056,
          "top": 0.18302515
        },
        "polygon": [
          { "x": 0.21405056, "y": 0.18304572 },
          { "x": 0.23837914, "y": 0.18302515 },
          { "x": 0.23838797, "y": 0.19126482 },
          { "x": 0.21405932, "y": 0.19128537 }
        ]
      },
      "id": "f12b8d69-639f-422c-bce6-f7e92c6ae5c5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.981926,
      "text": "Speed",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.035376716,
          "height": 0.010174959,
          "left": 0.24268907,
          "top": 0.18294354
        },
        "polygon": [
          { "x": 0.24268907, "y": 0.18297341 },
          { "x": 0.27805474, "y": 0.18294354 },
          { "x": 0.2780658, "y": 0.1930886 },
          { "x": 0.24269997, "y": 0.19311848 }
        ]
      },
      "id": "97757008-f0de-4815-944e-4e51e55478da",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.26898,
      "text": "Series-S5-M",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06822607,
          "height": 0.00877116,
          "left": 0.28228176,
          "top": 0.18281732
        },
        "polygon": [
          { "x": 0.28228176, "y": 0.18287496 },
          { "x": 0.35049808, "y": 0.18281732 },
          { "x": 0.35050783, "y": 0.19153085 },
          { "x": 0.28229123, "y": 0.19158848 }
        ]
      },
      "id": "1a18d0e7-e715-44de-8dd8-9ebd4ef83e4a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88162,
      "text": "Outdoor",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04739928,
          "height": 0.008410493,
          "left": 0.57432795,
          "top": 0.18303345
        },
        "polygon": [
          { "x": 0.57432795, "y": 0.18307349 },
          { "x": 0.62171704, "y": 0.18303345 },
          { "x": 0.6217272, "y": 0.19140391 },
          { "x": 0.5743381, "y": 0.19144394 }
        ]
      },
      "id": "bbf92cd0-db6e-463a-b591-d177681a7650",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88495,
      "text": "Weather:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05259412,
          "height": 0.008593807,
          "left": 0.6253023,
          "top": 0.182903
        },
        "polygon": [
          { "x": 0.6253023, "y": 0.18294744 },
          { "x": 0.67788583, "y": 0.182903 },
          { "x": 0.67789644, "y": 0.19145238 },
          { "x": 0.6253128, "y": 0.1914968 }
        ]
      },
      "id": "6126310b-c8da-4c90-ab40-c8f8658b50eb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63256,
      "text": "Rain,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.028226776,
          "height": 0.009808284,
          "left": 0.68309325,
          "top": 0.18294495
        },
        "polygon": [
          { "x": 0.68309325, "y": 0.1829688 },
          { "x": 0.71130776, "y": 0.18294495 },
          { "x": 0.71132004, "y": 0.19272941 },
          { "x": 0.68310547, "y": 0.19275324 }
        ]
      },
      "id": "043464b1-9fce-46e8-a6e6-b77e1fbcc8ae",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.83502,
      "text": "cold,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026757322,
          "height": 0.009809797,
          "left": 0.71595573,
          "top": 0.1829172
        },
        "polygon": [
          { "x": 0.71595573, "y": 0.18293978 },
          { "x": 0.74270064, "y": 0.1829172 },
          { "x": 0.7427131, "y": 0.1927044 },
          { "x": 0.7159681, "y": 0.19272698 }
        ]
      },
      "id": "a3135077-c435-4e02-92f6-565ffcce7d2c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92742,
      "text": "windy,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037321508,
          "height": 0.0103163645,
          "left": 0.74715817,
          "top": 0.18287116
        },
        "polygon": [
          { "x": 0.74715817, "y": 0.1829027 },
          { "x": 0.78446645, "y": 0.18287116 },
          { "x": 0.7844797, "y": 0.19315602 },
          { "x": 0.7471712, "y": 0.19318753 }
        ]
      },
      "id": "66609a4a-bcb6-4198-9593-b267bc366135",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.99165,
      "text": "and",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021218684,
          "height": 0.008529178,
          "left": 0.7892203,
          "top": 0.18290745
        },
        "polygon": [
          { "x": 0.7892203, "y": 0.18292537 },
          { "x": 0.8104279, "y": 0.18290745 },
          { "x": 0.81043893, "y": 0.19141872 },
          { "x": 0.78923124, "y": 0.19143663 }
        ]
      },
      "id": "c1bd9b36-7282-4eb5-ad36-f8178669fa2d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.92498,
      "text": "miserable,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.058406655,
          "height": 0.009938008,
          "left": 0.81477195,
          "top": 0.18279605
        },
        "polygon": [
          { "x": 0.81477195, "y": 0.18284538 },
          { "x": 0.87316555, "y": 0.18279605 },
          { "x": 0.8731786, "y": 0.19268472 },
          { "x": 0.81478477, "y": 0.19273405 }
        ]
      },
      "id": "723d556a-141f-4840-af82-f3e461503fba",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.970795,
      "text": "Wind",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029153021,
          "height": 0.008585847,
          "left": 0.87799823,
          "top": 0.18280162
        },
        "polygon": [
          { "x": 0.87799823, "y": 0.18282625 },
          { "x": 0.90713984, "y": 0.18280162 },
          { "x": 0.9071512, "y": 0.19136286 },
          { "x": 0.87800956, "y": 0.19138747 }
        ]
      },
      "id": "8fcfbf52-af4a-4f04-86b5-36e707dc891b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.64786,
      "text": "Chill:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027836602,
          "height": 0.0087559195,
          "left": 0.91141546,
          "top": 0.18270877
        },
        "polygon": [
          { "x": 0.91141546, "y": 0.18273228 },
          { "x": 0.9392403, "y": 0.18270877 },
          { "x": 0.9392521, "y": 0.19144118 },
          { "x": 0.91142714, "y": 0.19146469 }
        ]
      },
      "id": "6078ea14-f2a2-43d1-8feb-fb66a71edb5f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9386,
      "text": "38",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014107776,
          "height": 0.008356533,
          "left": 0.944184,
          "top": 0.18304572
        },
        "polygon": [
          { "x": 0.944184, "y": 0.18305762 },
          { "x": 0.9582805, "y": 0.18304572 },
          { "x": 0.9582918, "y": 0.19139034 },
          { "x": 0.9441953, "y": 0.19140224 }
        ]
      },
      "id": "35db8c04-c955-44a4-90be-2faa91031d71",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.76677,
      "text": "Officials",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05353244,
          "height": 0.008564244,
          "left": 0.4687055,
          "top": 0.20550719
        },
        "polygon": [
          { "x": 0.4687055, "y": 0.2055524 },
          { "x": 0.5222279, "y": 0.20550719 },
          { "x": 0.52223796, "y": 0.21402624 },
          { "x": 0.4687154, "y": 0.21407144 }
        ]
      },
      "id": "3318df26-fc47-44d3-97e7-d21989046d7b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.4729,
      "text": "Referee:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.047863536,
          "height": 0.0084905615,
          "left": 0.09130877,
          "top": 0.22485878
        },
        "polygon": [
          { "x": 0.09130877, "y": 0.22489919 },
          { "x": 0.13916358, "y": 0.22485878 },
          { "x": 0.13917232, "y": 0.23330896 },
          { "x": 0.09131735, "y": 0.23334934 }
        ]
      },
      "id": "50124ddb-23ca-4ce9-858d-57b53e74c933",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.40563,
      "text": "Allen,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.031766713,
          "height": 0.009567847,
          "left": 0.14770232,
          "top": 0.22493294
        },
        "polygon": [
          { "x": 0.14770232, "y": 0.22495975 },
          { "x": 0.17945902, "y": 0.22493294 },
          { "x": 0.17946903, "y": 0.23447397 },
          { "x": 0.1477122, "y": 0.23450078 }
        ]
      },
      "id": "7a5a3490-bb5e-4068-9c88-fad1864addef",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88049,
      "text": "Brad",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026104802,
          "height": 0.008302487,
          "left": 0.18452634,
          "top": 0.22488123
        },
        "polygon": [
          { "x": 0.18452634, "y": 0.22490327 },
          { "x": 0.21062236, "y": 0.22488123 },
          { "x": 0.21063115, "y": 0.23316169 },
          { "x": 0.18453504, "y": 0.23318373 }
        ]
      },
      "id": "68d70640-0b42-4893-851f-a3e7e2976e92",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89284,
      "text": "(122)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030975722,
          "height": 0.010322631,
          "left": 0.21487008,
          "top": 0.2247515
        },
        "polygon": [
          { "x": 0.21487008, "y": 0.22477764 },
          { "x": 0.24583474, "y": 0.2247515 },
          { "x": 0.24584581, "y": 0.235048 },
          { "x": 0.21488103, "y": 0.23507413 }
        ]
      },
      "id": "b47022e8-5ad6-4656-9356-e370dc983c63",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.64037,
      "text": "Umpire:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044458024,
          "height": 0.0099962205,
          "left": 0.41054708,
          "top": 0.2250299
        },
        "polygon": [
          { "x": 0.41054708, "y": 0.22506742 },
          { "x": 0.45499358, "y": 0.2250299 },
          { "x": 0.4550051, "y": 0.2349886 },
          { "x": 0.41055843, "y": 0.23502612 }
        ]
      },
      "id": "204b80e1-92f5-4873-9c6e-1aecfb1dd766",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8613,
      "text": "Heydt,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.036949683,
          "height": 0.010084647,
          "left": 0.46355742,
          "top": 0.22497521
        },
        "polygon": [
          { "x": 0.46355742, "y": 0.2250064 },
          { "x": 0.5004953, "y": 0.22497521 },
          { "x": 0.5005071, "y": 0.23502868 },
          { "x": 0.4635691, "y": 0.23505986 }
        ]
      },
      "id": "72dfbdf9-15e2-4de1-a59f-7a0d75bf9447",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81887,
      "text": "Duane",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03703291,
          "height": 0.008119069,
          "left": 0.50543827,
          "top": 0.22504902
        },
        "polygon": [
          { "x": 0.50543827, "y": 0.22508028 },
          { "x": 0.5424616, "y": 0.22504902 },
          { "x": 0.5424712, "y": 0.23313683 },
          { "x": 0.5054478, "y": 0.23316808 }
        ]
      },
      "id": "79a7a42a-173d-43a0-945b-8be1f19168e7",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86116,
      "text": "(42)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023597503,
          "height": 0.010384071,
          "left": 0.54669327,
          "top": 0.22478226
        },
        "polygon": [
          { "x": 0.54669327, "y": 0.22480217 },
          { "x": 0.5702783, "y": 0.22478226 },
          { "x": 0.57029074, "y": 0.23514642 },
          { "x": 0.5467056, "y": 0.23516633 }
        ]
      },
      "id": "ff0e4d27-72ec-498b-86fa-d89496429fa2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95719,
      "text": "Down",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.032488737,
          "height": 0.008039746,
          "left": 0.6958886,
          "top": 0.2251034
        },
        "polygon": [
          { "x": 0.6958886, "y": 0.22513081 },
          { "x": 0.72836715, "y": 0.2251034 },
          { "x": 0.7283773, "y": 0.23311572 },
          { "x": 0.6958986, "y": 0.23314314 }
        ]
      },
      "id": "bafcf6b0-2ec6-4e7d-9466-705945264ce1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.454605,
      "text": "Judge:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037824452,
          "height": 0.010190981,
          "left": 0.7322088,
          "top": 0.22497548
        },
        "polygon": [
          { "x": 0.7322088, "y": 0.22500741 },
          { "x": 0.77002025, "y": 0.22497548 },
          { "x": 0.77003324, "y": 0.23513456 },
          { "x": 0.73222166, "y": 0.23516646 }
        ]
      },
      "id": "da0fca09-535b-42e3-a073-64bb535fc603",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.56564,
      "text": "Thomas,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.049156647,
          "height": 0.009790653,
          "left": 0.7781223,
          "top": 0.22484396
        },
        "polygon": [
          { "x": 0.7781223, "y": 0.22488546 },
          { "x": 0.8272662, "y": 0.22484396 },
          { "x": 0.827279, "y": 0.23459314 },
          { "x": 0.7781348, "y": 0.23463462 }
        ]
      },
      "id": "74e80001-7972-4251-adb4-1adaca3ead8f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95291,
      "text": "Sarah",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.032795325,
          "height": 0.008385509,
          "left": 0.83196765,
          "top": 0.224812
        },
        "polygon": [
          { "x": 0.83196765, "y": 0.22483967 },
          { "x": 0.86475194, "y": 0.224812 },
          { "x": 0.86476296, "y": 0.23316982 },
          { "x": 0.83197856, "y": 0.23319751 }
        ]
      },
      "id": "b22d159d-84eb-40ed-8284-41607508ca09",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.961975,
      "text": "(53)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023577774,
          "height": 0.010342933,
          "left": 0.86928654,
          "top": 0.22483557
        },
        "polygon": [
          { "x": 0.86928654, "y": 0.22485547 },
          { "x": 0.8928506, "y": 0.22483557 },
          { "x": 0.89286435, "y": 0.23515862 },
          { "x": 0.8693002, "y": 0.23517852 }
        ]
      },
      "id": "5048c518-df59-40fd-be25-805fbacc4260",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94693,
      "text": "Line",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02340399,
          "height": 0.007907247,
          "left": 0.07397538,
          "top": 0.24029641
        },
        "polygon": [
          { "x": 0.07397538, "y": 0.24031617 },
          { "x": 0.09737134, "y": 0.24029641 },
          { "x": 0.097379364, "y": 0.24818392 },
          { "x": 0.07398332, "y": 0.24820367 }
        ]
      },
      "id": "7f14ede0-9576-4d1b-8692-4f29b6523118",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.47942,
      "text": "Judge:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037885033,
          "height": 0.0101492265,
          "left": 0.10107543,
          "top": 0.240114
        },
        "polygon": [
          { "x": 0.10107543, "y": 0.24014597 },
          { "x": 0.13895, "y": 0.240114 },
          { "x": 0.13896047, "y": 0.25023127 },
          { "x": 0.10108573, "y": 0.25026324 }
        ]
      },
      "id": "68be42ca-8dee-4ff5-a777-cb6b87a6ca42",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.45365,
      "text": "Gallagher,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.057019103,
          "height": 0.010528547,
          "left": 0.1488043,
          "top": 0.23980142
        },
        "polygon": [
          { "x": 0.1488043, "y": 0.23984954 },
          { "x": 0.2058123, "y": 0.23980142 },
          { "x": 0.2058234, "y": 0.25028187 },
          { "x": 0.14881517, "y": 0.25032997 }
        ]
      },
      "id": "d15b8c4f-e130-463d-b3ae-f9a82da6b95a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.899185,
      "text": "Daniel",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03548471,
          "height": 0.008280828,
          "left": 0.21099004,
          "top": 0.24003391
        },
        "polygon": [
          { "x": 0.21099004, "y": 0.24006386 },
          { "x": 0.24646588, "y": 0.24003391 },
          { "x": 0.24647476, "y": 0.2482848 },
          { "x": 0.2109988, "y": 0.24831474 }
        ]
      },
      "id": "79336921-d6f8-4668-be6d-e4ed91fab0c5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97518,
      "text": "(85)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023564018,
          "height": 0.010481574,
          "left": 0.25107065,
          "top": 0.23989637
        },
        "polygon": [
          { "x": 0.25107065, "y": 0.23991625 },
          { "x": 0.2746233, "y": 0.23989637 },
          { "x": 0.27463466, "y": 0.25035807 },
          { "x": 0.2510819, "y": 0.25037795 }
        ]
      },
      "id": "c60ec998-10de-4677-89bc-400c01f5d09e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88069,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026210207,
          "height": 0.008154502,
          "left": 0.3871193,
          "top": 0.240104
        },
        "polygon": [
          { "x": 0.3871193, "y": 0.24012612 },
          { "x": 0.4133202, "y": 0.240104 },
          { "x": 0.41332948, "y": 0.2482364 },
          { "x": 0.38712847, "y": 0.2482585 }
        ]
      },
      "id": "f34e5caf-5cd5-4f78-9724-62db590c48cc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.41131,
      "text": "Judge:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03816704,
          "height": 0.010179068,
          "left": 0.4170772,
          "top": 0.24012427
        },
        "polygon": [
          { "x": 0.4170772, "y": 0.24015647 },
          { "x": 0.4552325, "y": 0.24012427 },
          { "x": 0.45524424, "y": 0.25027114 },
          { "x": 0.4170888, "y": 0.25030333 }
        ]
      },
      "id": "5b82fb4c-ca7f-4eb4-8a2e-2f9edf8e6aac",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.56058,
      "text": "Patterson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.057718407,
          "height": 0.009586424,
          "left": 0.46347502,
          "top": 0.2401517
        },
        "polygon": [
          { "x": 0.46347502, "y": 0.2402004 },
          { "x": 0.5211821, "y": 0.2401517 },
          { "x": 0.52119344, "y": 0.24968943 },
          { "x": 0.46348608, "y": 0.24973813 }
        ]
      },
      "id": "eed3a8ef-ed53-49ff-8a8f-5e48e226a74c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94623,
      "text": "Rick",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023798164,
          "height": 0.008287077,
          "left": 0.5262501,
          "top": 0.24009646
        },
        "polygon": [
          { "x": 0.5262501, "y": 0.24011655 },
          { "x": 0.5500384, "y": 0.24009646 },
          { "x": 0.5500483, "y": 0.24836347 },
          { "x": 0.5262599, "y": 0.24838355 }
        ]
      },
      "id": "58e8953d-15ce-4a83-b09a-933dadfcd3d0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.960724,
      "text": "(15)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023574797,
          "height": 0.010514464,
          "left": 0.5540172,
          "top": 0.23987691
        },
        "polygon": [
          { "x": 0.5540172, "y": 0.23989679 },
          { "x": 0.5775794, "y": 0.23987691 },
          { "x": 0.577592, "y": 0.2503715 },
          { "x": 0.55402976, "y": 0.25039136 }
        ]
      },
      "id": "0b355e11-b011-47d8-a24a-56f09e71d28a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.945816,
      "text": "Side",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024584299,
          "height": 0.00825184,
          "left": 0.70414764,
          "top": 0.23997888
        },
        "polygon": [
          { "x": 0.70414764, "y": 0.23999962 },
          { "x": 0.72872156, "y": 0.23997888 },
          { "x": 0.72873193, "y": 0.24820998 },
          { "x": 0.704158, "y": 0.24823071 }
        ]
      },
      "id": "eaa2ac01-99fb-407c-a569-acd12ea23c48",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.502205,
      "text": "Judge:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03778331,
          "height": 0.010246939,
          "left": 0.7323193,
          "top": 0.24005783
        },
        "polygon": [
          { "x": 0.7323193, "y": 0.2400897 },
          { "x": 0.77008957, "y": 0.24005783 },
          { "x": 0.7701026, "y": 0.2502729 },
          { "x": 0.7323322, "y": 0.25030476 }
        ]
      },
      "id": "186706ae-e456-40ce-ac52-e4984ef1cbf6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.73124,
      "text": "Cheek,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.038291942,
          "height": 0.009938479,
          "left": 0.77857786,
          "top": 0.23995109
        },
        "polygon": [
          { "x": 0.77857786, "y": 0.2399834 },
          { "x": 0.816857, "y": 0.23995109 },
          { "x": 0.8168698, "y": 0.24985726 },
          { "x": 0.7785906, "y": 0.24988957 }
        ]
      },
      "id": "fd61ed67-dde2-4025-bb6a-132db8bcd0b0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.69222,
      "text": "Boris",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02829532,
          "height": 0.008342701,
          "left": 0.82208395,
          "top": 0.24002442
        },
        "polygon": [
          { "x": 0.82208395, "y": 0.24004829 },
          { "x": 0.8503684, "y": 0.24002442 },
          { "x": 0.8503793, "y": 0.24834326 },
          { "x": 0.8220948, "y": 0.24836713 }
        ]
      },
      "id": "a0abbd31-c2f0-43f1-97d4-d3bb3947d9f6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94838,
      "text": "(41)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02369843,
          "height": 0.01047829,
          "left": 0.85448897,
          "top": 0.23985398
        },
        "polygon": [
          { "x": 0.85448897, "y": 0.23987398 },
          { "x": 0.87817353, "y": 0.23985398 },
          { "x": 0.87818736, "y": 0.2503123 },
          { "x": 0.8545027, "y": 0.25033227 }
        ]
      },
      "id": "22003982-876e-4810-9489-d0de5bb04f6a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8667,
      "text": "Back",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026690982,
          "height": 0.008013255,
          "left": 0.070693366,
          "top": 0.2553177
        },
        "polygon": [
          { "x": 0.070693366, "y": 0.2553402 },
          { "x": 0.09737623, "y": 0.2553177 },
          { "x": 0.09738435, "y": 0.2633084 },
          { "x": 0.07070141, "y": 0.26333094 }
        ]
      },
      "id": "10ca3933-8602-4b69-94ad-5f7654444f43",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.53922,
      "text": "Judge:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03797873,
          "height": 0.01022994,
          "left": 0.10105625,
          "top": 0.25522792
        },
        "polygon": [
          { "x": 0.10105625, "y": 0.25525996 },
          { "x": 0.13902445, "y": 0.25522792 },
          { "x": 0.13903499, "y": 0.26542583 },
          { "x": 0.101066634, "y": 0.26545787 }
        ]
      },
      "id": "ebdce146-9693-4ca7-aa03-6db365fda81f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.19973,
      "text": "Josselyn,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.051464293,
          "height": 0.010207581,
          "left": 0.14775474,
          "top": 0.25526044
        },
        "polygon": [
          { "x": 0.14775474, "y": 0.25530386 },
          { "x": 0.19920829, "y": 0.25526044 },
          { "x": 0.19921903, "y": 0.26542464 },
          { "x": 0.14776528, "y": 0.26546803 }
        ]
      },
      "id": "4f3181c3-7757-49b7-871a-2510634d9dca",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96255,
      "text": "Tony",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.028757628,
          "height": 0.010191854,
          "left": 0.20388497,
          "top": 0.2552839
        },
        "polygon": [
          { "x": 0.20388497, "y": 0.25530815 },
          { "x": 0.23263173, "y": 0.2552839 },
          { "x": 0.2326426, "y": 0.2654515 },
          { "x": 0.20389573, "y": 0.26547575 }
        ]
      },
      "id": "a5e24a05-a366-4189-81bc-b46b16d624d8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.884056,
      "text": "(67)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023276148,
          "height": 0.010485805,
          "left": 0.23739232,
          "top": 0.25503427
        },
        "polygon": [
          { "x": 0.23739232, "y": 0.25505388 },
          { "x": 0.26065716, "y": 0.25503427 },
          { "x": 0.2606685, "y": 0.26550043 },
          { "x": 0.23740354, "y": 0.26552007 }
        ]
      },
      "id": "260caac2-ce0e-4a7b-95d3-e10bb0be56e2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96792,
      "text": "Replay",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.038101338,
          "height": 0.010162539,
          "left": 0.37006667,
          "top": 0.25532925
        },
        "polygon": [
          { "x": 0.37006667, "y": 0.25536138 },
          { "x": 0.40815648, "y": 0.25532925 },
          { "x": 0.40816802, "y": 0.26545966 },
          { "x": 0.37007806, "y": 0.26549178 }
        ]
      },
      "id": "1fcfe993-dac6-4eba-b49e-44a4128a9ac0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.606964,
      "text": "Official:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04274199,
          "height": 0.008521327,
          "left": 0.41233894,
          "top": 0.25504005
        },
        "polygon": [
          { "x": 0.41233894, "y": 0.2550761 },
          { "x": 0.45507112, "y": 0.25504005 },
          { "x": 0.45508093, "y": 0.26352534 },
          { "x": 0.41234863, "y": 0.26356137 }
        ]
      },
      "id": "45666745-7bb7-4587-aef4-5289af6ed21f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.24041,
      "text": "Young-Seigler,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08265336,
          "height": 0.010389112,
          "left": 0.46316433,
          "top": 0.25515118
        },
        "polygon": [
          { "x": 0.46316433, "y": 0.2552209 },
          { "x": 0.54580534, "y": 0.25515118 },
          { "x": 0.5458177, "y": 0.26547056 },
          { "x": 0.46317628, "y": 0.26554027 }
        ]
      },
      "id": "a6f112f9-8651-49da-9e02-085c0fe88e6b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63525,
      "text": "Artenzia",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.047136936,
          "height": 0.008475141,
          "left": 0.5511059,
          "top": 0.25522572
        },
        "polygon": [
          { "x": 0.5511059, "y": 0.25526547 },
          { "x": 0.5982326, "y": 0.25522572 },
          { "x": 0.5982428, "y": 0.2636611 },
          { "x": 0.551116, "y": 0.26370084 }
        ]
      },
      "id": "9022463f-48f1-4b50-8faf-c04dec955936",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79038,
      "text": "(0)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016491717,
          "height": 0.010451694,
          "left": 0.60257053,
          "top": 0.25496736
        },
        "polygon": [
          { "x": 0.60257053, "y": 0.25498128 },
          { "x": 0.6190495, "y": 0.25496736 },
          { "x": 0.61906224, "y": 0.26540515 },
          { "x": 0.6025832, "y": 0.26541907 }
        ]
      },
      "id": "7f0ed945-ba8a-413e-b215-6765b9d6909f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.58865,
      "text": "Lineups",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05072089,
          "height": 0.010580468,
          "left": 0.47261566,
          "top": 0.27763164
        },
        "polygon": [
          { "x": 0.47261566, "y": 0.2776744 },
          { "x": 0.5233241, "y": 0.27763164 },
          { "x": 0.5233365, "y": 0.28816935 },
          { "x": 0.47262794, "y": 0.2882121 }
        ]
      },
      "id": "e860a832-3798-4710-9227-82df16ba387f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.48858,
      "text": "Jacksonville",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08021952,
          "height": 0.008802056,
          "left": 0.19329529,
          "top": 0.29826838
        },
        "polygon": [
          { "x": 0.19329529, "y": 0.29833597 },
          { "x": 0.27350533, "y": 0.29826838 },
          { "x": 0.2735148, "y": 0.3070028 },
          { "x": 0.1933045, "y": 0.30707043 }
        ]
      },
      "id": "e7eb8c0d-787a-40eb-9199-fc314f969f4a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.40324,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.051413573,
          "height": 0.010221106,
          "left": 0.27694812,
          "top": 0.29845256
        },
        "polygon": [
          { "x": 0.27694812, "y": 0.2984959 },
          { "x": 0.32835042, "y": 0.29845256 },
          { "x": 0.32836172, "y": 0.30863032 },
          { "x": 0.2769592, "y": 0.30867365 }
        ]
      },
      "id": "e545bf9a-0489-491c-a41d-110f1c27b8e2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93878,
      "text": "New",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02890731,
          "height": 0.008298971,
          "left": 0.6856145,
          "top": 0.29848006
        },
        "polygon": [
          { "x": 0.6856145, "y": 0.2985044 },
          { "x": 0.7145114, "y": 0.29848006 },
          { "x": 0.7145218, "y": 0.30675468 },
          { "x": 0.68562484, "y": 0.30677903 }
        ]
      },
      "id": "03253f5c-5b54-4583-851f-6847019fc55e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.52619,
      "text": "York",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030407192,
          "height": 0.008350889,
          "left": 0.71853316,
          "top": 0.29837567
        },
        "polygon": [
          { "x": 0.71853316, "y": 0.2984013 },
          { "x": 0.74892974, "y": 0.29837567 },
          { "x": 0.74894035, "y": 0.30670094 },
          { "x": 0.71854365, "y": 0.30672655 }
        ]
      },
      "id": "1139de3c-8b4c-40ef-873b-79dd0df1026d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63107,
      "text": "Jets",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02681395,
          "height": 0.00857193,
          "left": 0.75223356,
          "top": 0.29841647
        },
        "polygon": [
          { "x": 0.75223356, "y": 0.29843906 },
          { "x": 0.7790365, "y": 0.29841647 },
          { "x": 0.7790475, "y": 0.3069658 },
          { "x": 0.7522444, "y": 0.3069884 }
        ]
      },
      "id": "46dc2358-9c21-4f82-be20-4c99fd634edd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.75024,
      "text": "Offense",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050557513,
          "height": 0.008835805,
          "left": 0.12328466,
          "top": 0.31332764
        },
        "polygon": [
          { "x": 0.12328466, "y": 0.31337023 },
          { "x": 0.17383297, "y": 0.31332764 },
          { "x": 0.17384218, "y": 0.32212085 },
          { "x": 0.12329369, "y": 0.32216343 }
        ]
      },
      "id": "d737e153-de36-4edb-9d26-1d506b454d08",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9057,
      "text": "Defense",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052853573,
          "height": 0.008637659,
          "left": 0.35645828,
          "top": 0.3134403
        },
        "polygon": [
          { "x": 0.35645828, "y": 0.31348482 },
          { "x": 0.40930206, "y": 0.3134403 },
          { "x": 0.40931183, "y": 0.3220334 },
          { "x": 0.35646787, "y": 0.32207796 }
        ]
      },
      "id": "d6b69496-73e8-4479-9d14-a6f168e6bf0d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.74326,
      "text": "Offense",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050768178,
          "height": 0.008745773,
          "left": 0.6126439,
          "top": 0.3133909
        },
        "polygon": [
          { "x": 0.6126439, "y": 0.31343368 },
          { "x": 0.6634013, "y": 0.3133909 },
          { "x": 0.6634121, "y": 0.3220939 },
          { "x": 0.6126545, "y": 0.32213667 }
        ]
      },
      "id": "8d811ae5-8745-4d07-aee6-e74ba5c6346f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92857,
      "text": "Defense",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053015616,
          "height": 0.0087166615,
          "left": 0.83652157,
          "top": 0.31342632
        },
        "polygon": [
          { "x": 0.83652157, "y": 0.313471 },
          { "x": 0.8895257, "y": 0.31342632 },
          { "x": 0.8895372, "y": 0.3220983 },
          { "x": 0.83653295, "y": 0.322143 }
        ]
      },
      "id": "a651422a-ffc0-43da-8bf8-18dc635c7545",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.73786,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015731977,
          "height": 0.008131004,
          "left": 0.07055111,
          "top": 0.33180976
        },
        "polygon": [
          { "x": 0.07055111, "y": 0.331823 },
          { "x": 0.08627487, "y": 0.33180976 },
          { "x": 0.086283095, "y": 0.33992752 },
          { "x": 0.070559286, "y": 0.33994076 }
        ]
      },
      "id": "b776624f-838a-4e9f-886e-81df3b013ceb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.78302,
      "text": "84",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014223727,
          "height": 0.008198615,
          "left": 0.10005936,
          "top": 0.33176208
        },
        "polygon": [
          { "x": 0.10005936, "y": 0.33177406 },
          { "x": 0.11427471, "y": 0.33176208 },
          { "x": 0.11428309, "y": 0.3399487 },
          { "x": 0.1000677, "y": 0.3399607 }
        ]
      },
      "id": "332ac746-54d0-4237-9129-373bf21d7324",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.59354,
      "text": "C.Manhertz",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.065168954,
          "height": 0.008542773,
          "left": 0.121378645,
          "top": 0.33167267
        },
        "polygon": [
          { "x": 0.121378645, "y": 0.33172756 },
          { "x": 0.18653867, "y": 0.33167267 },
          { "x": 0.18654759, "y": 0.34016055 },
          { "x": 0.121387355, "y": 0.34021544 }
        ]
      },
      "id": "bc98b071-4cd9-4897-a893-6c568de8462c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.72369,
      "text": "DE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016302332,
          "height": 0.008102107,
          "left": 0.3031366,
          "top": 0.33187035
        },
        "polygon": [
          { "x": 0.3031366, "y": 0.33188406 },
          { "x": 0.31943, "y": 0.33187035 },
          { "x": 0.3194389, "y": 0.33995873 },
          { "x": 0.30314544, "y": 0.33997244 }
        ]
      },
      "id": "95e08fb0-9f8b-44f4-92e3-af54d9c0a5ba",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.826355,
      "text": "95",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014000754,
          "height": 0.008211087,
          "left": 0.3329757,
          "top": 0.33184874
        },
        "polygon": [
          { "x": 0.3329757, "y": 0.3318605 },
          { "x": 0.3469673, "y": 0.33184874 },
          { "x": 0.34697643, "y": 0.34004804 },
          { "x": 0.33298478, "y": 0.34005982 }
        ]
      },
      "id": "f5d044a0-9eb4-431b-a1e5-60b77db17b36",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 93.960434,
      "text": "R.Robertson-Harris",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.108544864,
          "height": 0.008439574,
          "left": 0.35495713,
          "top": 0.33175492
        },
        "polygon": [
          { "x": 0.35495713, "y": 0.33184636 },
          { "x": 0.46349233, "y": 0.33175492 },
          { "x": 0.46350202, "y": 0.3401031 },
          { "x": 0.3549665, "y": 0.3401945 }
        ]
      },
      "id": "2147b9a1-912a-42d8-bf62-b49d8e536f04",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84805,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.019957598,
          "height": 0.008123632,
          "left": 0.5496474,
          "top": 0.33191672
        },
        "polygon": [
          { "x": 0.5496474, "y": 0.33193353 },
          { "x": 0.5695952, "y": 0.33191672 },
          { "x": 0.569605, "y": 0.34002355 },
          { "x": 0.54965705, "y": 0.34004036 }
        ]
      },
      "id": "e08c9f70-e1af-4046-aa09-03fec0320f38",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92348,
      "text": "8",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070073884,
          "height": 0.0082581425,
          "left": 0.59271973,
          "top": 0.33173734
        },
        "polygon": [
          { "x": 0.59271973, "y": 0.33174324 },
          { "x": 0.5997171, "y": 0.33173734 },
          { "x": 0.59972715, "y": 0.3399896 },
          { "x": 0.59272975, "y": 0.3399955 }
        ]
      },
      "id": "3b83b7b1-21c4-42fe-a990-fa15d7a1b53c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.57466,
      "text": "E.Moore",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04682363,
          "height": 0.008421687,
          "left": 0.61080635,
          "top": 0.3318733
        },
        "polygon": [
          { "x": 0.61080635, "y": 0.33191276 },
          { "x": 0.6576196, "y": 0.3318733 },
          { "x": 0.65762997, "y": 0.34025556 },
          { "x": 0.61081654, "y": 0.340295 }
        ]
      },
      "id": "d837985e-b1d5-4df9-a4e3-edabe4092376",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.861916,
      "text": "EDGE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.031930655,
          "height": 0.008193728,
          "left": 0.7675912,
          "top": 0.3319431
        },
        "polygon": [
          { "x": 0.7675912, "y": 0.33196998 },
          { "x": 0.79951125, "y": 0.3319431 },
          { "x": 0.7995218, "y": 0.34010994 },
          { "x": 0.7676016, "y": 0.34013683 }
        ]
      },
      "id": "b5673bcf-7ac4-4409-9c69-d09a2d8ee234",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79657,
      "text": "91",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013290544,
          "height": 0.008421653,
          "left": 0.81340754,
          "top": 0.33183345
        },
        "polygon": [
          { "x": 0.81340754, "y": 0.33184463 },
          { "x": 0.8266871, "y": 0.33183345 },
          { "x": 0.82669806, "y": 0.3402439 },
          { "x": 0.81341845, "y": 0.3402551 }
        ]
      },
      "id": "bfc6d0da-9d16-46a9-904d-1bfb3523bab9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.92589,
      "text": "J.Franklin-Myers",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.09390847,
          "height": 0.010482714,
          "left": 0.83442324,
          "top": 0.33155963
        },
        "polygon": [
          { "x": 0.83442324, "y": 0.33163875 },
          { "x": 0.9283178, "y": 0.33155963 },
          { "x": 0.92833173, "y": 0.34196326 },
          { "x": 0.83443683, "y": 0.34204236 }
        ]
      },
      "id": "c5938ce4-ff11-4bb0-9ca9-54ba4b88e364",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88824,
      "text": "LT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014164558,
          "height": 0.008171874,
          "left": 0.07228526,
          "top": 0.34696338
        },
        "polygon": [
          { "x": 0.07228526, "y": 0.3469753 },
          { "x": 0.086441554, "y": 0.34696338 },
          { "x": 0.08644982, "y": 0.35512334 },
          { "x": 0.072293475, "y": 0.35513526 }
        ]
      },
      "id": "8683e286-f5b0-4173-8560-b2fd93060ce0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.821045,
      "text": "72",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014299956,
          "height": 0.008228569,
          "left": 0.09985976,
          "top": 0.3468923
        },
        "polygon": [
          { "x": 0.09985976, "y": 0.34690434 },
          { "x": 0.11415131, "y": 0.3468923 },
          { "x": 0.11415971, "y": 0.35510886 },
          { "x": 0.09986812, "y": 0.35512087 }
        ]
      },
      "id": "f32b9df9-0ba4-4a1b-a045-6b239df33edb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.66453,
      "text": "W.Little",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04407971,
          "height": 0.0085842805,
          "left": 0.121157035,
          "top": 0.3468194
        },
        "polygon": [
          { "x": 0.121157035, "y": 0.3468565 },
          { "x": 0.16522783, "y": 0.3468194 },
          { "x": 0.16523674, "y": 0.35536656 },
          { "x": 0.121165805, "y": 0.35540366 }
        ]
      },
      "id": "8581d81e-d14b-4230-a718-562bab03aed2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.896034,
      "text": "NT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015982356,
          "height": 0.008141746,
          "left": 0.30320334,
          "top": 0.34691918
        },
        "polygon": [
          { "x": 0.30320334, "y": 0.34693265 },
          { "x": 0.3191767, "y": 0.34691918 },
          { "x": 0.3191857, "y": 0.3550475 },
          { "x": 0.30321226, "y": 0.35506094 }
        ]
      },
      "id": "e9804005-d842-4a95-9ddd-f58dfe73f994",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.71394,
      "text": "52",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013750318,
          "height": 0.008312538,
          "left": 0.33329743,
          "top": 0.346982
        },
        "polygon": [
          { "x": 0.33329743, "y": 0.34699357 },
          { "x": 0.3470385, "y": 0.346982 },
          { "x": 0.34704775, "y": 0.35528296 },
          { "x": 0.33330664, "y": 0.35529453 }
        ]
      },
      "id": "4db3d833-db1e-49b6-b5e6-e9e686c3dab7",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.4909,
      "text": "D.Hamilton",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06311631,
          "height": 0.008408657,
          "left": 0.35495618,
          "top": 0.34688368
        },
        "polygon": [
          { "x": 0.35495618, "y": 0.34693682 },
          { "x": 0.41806293, "y": 0.34688368 },
          { "x": 0.4180725, "y": 0.3552392 },
          { "x": 0.3549655, "y": 0.35529235 }
        ]
      },
      "id": "9171ed6b-14e2-4fee-b1ce-70a4f68f9baf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86749,
      "text": "LT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014303473,
          "height": 0.008199431,
          "left": 0.5556025,
          "top": 0.34712157
        },
        "polygon": [
          { "x": 0.5556025, "y": 0.3471336 },
          { "x": 0.5698961, "y": 0.34712157 },
          { "x": 0.56990594, "y": 0.35530895 },
          { "x": 0.55561227, "y": 0.355321 }
        ]
      },
      "id": "e5696d43-be35-4da8-b2b0-520371e6bf52",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82122,
      "text": "71",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013321043,
          "height": 0.008302272,
          "left": 0.5855303,
          "top": 0.34689477
        },
        "polygon": [
          { "x": 0.5855303, "y": 0.34690598 },
          { "x": 0.59884125, "y": 0.34689477 },
          { "x": 0.5988513, "y": 0.35518584 },
          { "x": 0.5855403, "y": 0.35519704 }
        ]
      },
      "id": "0c41f171-16c2-4795-ae08-a86a469c46af",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.40343,
      "text": "D.Brown",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048449203,
          "height": 0.008519518,
          "left": 0.61118144,
          "top": 0.3468562
        },
        "polygon": [
          { "x": 0.61118144, "y": 0.346897 },
          { "x": 0.6596201, "y": 0.3468562 },
          { "x": 0.6596306, "y": 0.35533494 },
          { "x": 0.61119175, "y": 0.35537574 }
        ]
      },
      "id": "1ee2b267-26cb-4f28-8b66-3ff082dba7c9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.55408,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015408449,
          "height": 0.008190535,
          "left": 0.7845666,
          "top": 0.3470995
        },
        "polygon": [
          { "x": 0.7845666, "y": 0.3471125 },
          { "x": 0.7999644, "y": 0.3470995 },
          { "x": 0.799975, "y": 0.3552771 },
          { "x": 0.7845771, "y": 0.35529006 }
        ]
      },
      "id": "629d4364-38bf-4ef1-92b0-7472cd3cdb6f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.70946,
      "text": "98",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0137486905,
          "height": 0.008360017,
          "left": 0.81351995,
          "top": 0.3469949
        },
        "polygon": [
          { "x": 0.81351995, "y": 0.34700647 },
          { "x": 0.8272578, "y": 0.3469949 },
          { "x": 0.82726866, "y": 0.35534337 },
          { "x": 0.8135308, "y": 0.35535493 }
        ]
      },
      "id": "cf8df15e-f70e-4c0d-a3cd-38fe45f25f0c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.65964,
      "text": "S.Rankins",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05622562,
          "height": 0.008688095,
          "left": 0.8346278,
          "top": 0.34672812
        },
        "polygon": [
          { "x": 0.8346278, "y": 0.34677547 },
          { "x": 0.89084196, "y": 0.34672812 },
          { "x": 0.89085346, "y": 0.35536888 },
          { "x": 0.83463913, "y": 0.3554162 }
        ]
      },
      "id": "b8141182-74df-47ab-b37c-768f8b0d9bf0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84512,
      "text": "LG",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015008307,
          "height": 0.008303064,
          "left": 0.07112001,
          "top": 0.3620244
        },
        "polygon": [
          { "x": 0.07112001, "y": 0.36203703 },
          { "x": 0.08611992, "y": 0.3620244 },
          { "x": 0.08612832, "y": 0.37031484 },
          { "x": 0.07112835, "y": 0.37032747 }
        ]
      },
      "id": "6cff0f7f-bf4f-4fbf-85a5-b0516da03c4f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8906,
      "text": "69",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014017952,
          "height": 0.008334047,
          "left": 0.100039706,
          "top": 0.3620064
        },
        "polygon": [
          { "x": 0.100039706, "y": 0.36201817 },
          { "x": 0.11404914, "y": 0.3620064 },
          { "x": 0.11405765, "y": 0.37032863 },
          { "x": 0.10004818, "y": 0.37034044 }
        ]
      },
      "id": "b1d674eb-f01e-4f3e-87d9-187527f95abd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87578,
      "text": "T.Shatley",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054024424,
          "height": 0.010510147,
          "left": 0.12118286,
          "top": 0.36194867
        },
        "polygon": [
          { "x": 0.12118286, "y": 0.36199415 },
          { "x": 0.17519632, "y": 0.36194867 },
          { "x": 0.17520729, "y": 0.37241334 },
          { "x": 0.121193595, "y": 0.37245882 }
        ]
      },
      "id": "e93f3528-f365-4602-9bc7-07607c63c53f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.878746,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015731541,
          "height": 0.008272504,
          "left": 0.30379194,
          "top": 0.3621031
        },
        "polygon": [
          { "x": 0.30379194, "y": 0.36211634 },
          { "x": 0.31951436, "y": 0.3621031 },
          { "x": 0.31952348, "y": 0.37036237 },
          { "x": 0.303801, "y": 0.3703756 }
        ]
      },
      "id": "5db7cefb-3c9d-455a-b066-a9436e82649c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9328,
      "text": "98",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0140211005,
          "height": 0.008271638,
          "left": 0.33303013,
          "top": 0.3620724
        },
        "polygon": [
          { "x": 0.33303013, "y": 0.3620842 },
          { "x": 0.34704202, "y": 0.3620724 },
          { "x": 0.34705123, "y": 0.37033227 },
          { "x": 0.3330393, "y": 0.37034407 }
        ]
      },
      "id": "458b1b13-85c3-46f4-bd0a-60963fffd6ea",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.56996,
      "text": "C.Peters",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.047531173,
          "height": 0.0086908145,
          "left": 0.35447767,
          "top": 0.3619875
        },
        "polygon": [
          { "x": 0.35447767, "y": 0.3620275 },
          { "x": 0.40199903, "y": 0.3619875 },
          { "x": 0.40200886, "y": 0.3706383 },
          { "x": 0.35448736, "y": 0.3706783 }
        ]
      },
      "id": "6a725610-2885-4dd1-93fb-db92adbdc903",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.895325,
      "text": "LG",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0153924255,
          "height": 0.008481218,
          "left": 0.5546075,
          "top": 0.36212796
        },
        "polygon": [
          { "x": 0.5546075, "y": 0.36214092 },
          { "x": 0.56998974, "y": 0.36212796 },
          { "x": 0.56999993, "y": 0.37059623 },
          { "x": 0.55461764, "y": 0.3706092 }
        ]
      },
      "id": "5c61a43e-2106-478c-83c8-d2db5c710fc8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92756,
      "text": "78",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013946813,
          "height": 0.008210999,
          "left": 0.5856445,
          "top": 0.36200535
        },
        "polygon": [
          { "x": 0.5856445, "y": 0.36201707 },
          { "x": 0.59958136, "y": 0.36200535 },
          { "x": 0.5995913, "y": 0.3702046 },
          { "x": 0.5856544, "y": 0.37021634 }
        ]
      },
      "id": "8b0d9413-1c00-4ade-b124-aacec6f3ec29",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.210434,
      "text": "L.Tomlinson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06862598,
          "height": 0.008598834,
          "left": 0.61109865,
          "top": 0.361944
        },
        "polygon": [
          { "x": 0.61109865, "y": 0.36200175 },
          { "x": 0.67971396, "y": 0.361944 },
          { "x": 0.67972463, "y": 0.37048507 },
          { "x": 0.6111091, "y": 0.37054282 }
        ]
      },
      "id": "f899ece0-35b9-4327-bbc6-0b965ed32f27",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85598,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015423155,
          "height": 0.008198787,
          "left": 0.78455657,
          "top": 0.36221892
        },
        "polygon": [
          { "x": 0.78455657, "y": 0.36223188 },
          { "x": 0.79996914, "y": 0.36221892 },
          { "x": 0.79997975, "y": 0.37040472 },
          { "x": 0.7845671, "y": 0.3704177 }
        ]
      },
      "id": "734a67ea-58e2-410f-a615-8d447af69b6a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.66916,
      "text": "95",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013573445,
          "height": 0.008338662,
          "left": 0.813695,
          "top": 0.3621001
        },
        "polygon": [
          { "x": 0.813695, "y": 0.3621115 },
          { "x": 0.82725763, "y": 0.3621001 },
          { "x": 0.8272685, "y": 0.37042734 },
          { "x": 0.8137058, "y": 0.37043875 }
        ]
      },
      "id": "23fc0552-c8f3-4d83-abce-5cea6bfaf0b8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.479774,
      "text": "Q.Williams",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06018284,
          "height": 0.010204657,
          "left": 0.83508873,
          "top": 0.36190015
        },
        "polygon": [
          { "x": 0.83508873, "y": 0.3619508 },
          { "x": 0.89525807, "y": 0.36190015 },
          { "x": 0.89527154, "y": 0.37205416 },
          { "x": 0.83510196, "y": 0.3721048 }
        ]
      },
      "id": "981f2bc3-73c6-409f-bfb6-0787765515b6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 91.091576,
      "text": "C",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.008356974,
          "height": 0.008332511,
          "left": 0.078343876,
          "top": 0.3772532
        },
        "polygon": [
          { "x": 0.078343876, "y": 0.37726024 },
          { "x": 0.08669242, "y": 0.3772532 },
          { "x": 0.08670085, "y": 0.3855787 },
          { "x": 0.07835228, "y": 0.3855857 }
        ]
      },
      "id": "b661cdb1-fa2b-41e1-b9fa-f65a2b0044a5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87533,
      "text": "79",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014176339,
          "height": 0.008338023,
          "left": 0.100012824,
          "top": 0.3771577
        },
        "polygon": [
          { "x": 0.100012824, "y": 0.3771696 },
          { "x": 0.11418064, "y": 0.3771577 },
          { "x": 0.11418916, "y": 0.38548377 },
          { "x": 0.100021295, "y": 0.3854957 }
        ]
      },
      "id": "00c95fc5-4794-4c42-96bf-779a2656a169",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.614296,
      "text": "L.Fortner",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052269712,
          "height": 0.008565612,
          "left": 0.12172916,
          "top": 0.37718844
        },
        "polygon": [
          { "x": 0.12172916, "y": 0.37723243 },
          { "x": 0.17398995, "y": 0.37718844 },
          { "x": 0.17399886, "y": 0.38571006 },
          { "x": 0.1217379, "y": 0.38575405 }
        ]
      },
      "id": "ed25f08e-b3de-41be-a5a1-0029580352f2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.921104,
      "text": "WILL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029619869,
          "height": 0.007988068,
          "left": 0.28949445,
          "top": 0.3772504
        },
        "polygon": [
          { "x": 0.28949445, "y": 0.37727535 },
          { "x": 0.31910554, "y": 0.3772504 },
          { "x": 0.3191143, "y": 0.38521355 },
          { "x": 0.28950313, "y": 0.38523847 }
        ]
      },
      "id": "f3c7009c-6499-4ef0-b269-2236c3f4f6a6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85218,
      "text": "41",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013587041,
          "height": 0.008191,
          "left": 0.33282384,
          "top": 0.37729347
        },
        "polygon": [
          { "x": 0.33282384, "y": 0.37730488 },
          { "x": 0.34640178, "y": 0.37729347 },
          { "x": 0.3464109, "y": 0.38547304 },
          { "x": 0.33283293, "y": 0.38548446 }
        ]
      },
      "id": "caacc54f-ff4a-4591-9ef4-f1a3e9119b19",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.72083,
      "text": "J.Allen",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037506923,
          "height": 0.008407555,
          "left": 0.35390136,
          "top": 0.37722427
        },
        "polygon": [
          { "x": 0.35390136, "y": 0.37725583 },
          { "x": 0.3913988, "y": 0.37722427 },
          { "x": 0.39140826, "y": 0.38560027 },
          { "x": 0.3539107, "y": 0.38563183 }
        ]
      },
      "id": "b0f80cc8-d0a2-4f3b-89e3-e9454c24afda",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 93.48424,
      "text": "C",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0087235775,
          "height": 0.008332644,
          "left": 0.5616346,
          "top": 0.37727705
        },
        "polygon": [
          { "x": 0.5616346, "y": 0.37728438 },
          { "x": 0.57034814, "y": 0.37727705 },
          { "x": 0.57035816, "y": 0.38560236 },
          { "x": 0.56164455, "y": 0.3856097 }
        ]
      },
      "id": "e74cc010-4978-400f-8112-dba20d756c10",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96662,
      "text": "60",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014045417,
          "height": 0.008372891,
          "left": 0.58560294,
          "top": 0.3771526
        },
        "polygon": [
          { "x": 0.58560294, "y": 0.3771644 },
          { "x": 0.5996382, "y": 0.3771526 },
          { "x": 0.59964836, "y": 0.38551366 },
          { "x": 0.5856131, "y": 0.38552547 }
        ]
      },
      "id": "55767d83-c954-46f3-a138-52217fb3259f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.636215,
      "text": "C.McGovern",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06819381,
          "height": 0.008689677,
          "left": 0.6108186,
          "top": 0.37704468
        },
        "polygon": [
          { "x": 0.6108186, "y": 0.37710208 },
          { "x": 0.6790017, "y": 0.37704468 },
          { "x": 0.6790124, "y": 0.38567698 },
          { "x": 0.6108292, "y": 0.38573435 }
        ]
      },
      "id": "af388ad7-02a2-446e-afd5-5547df3600c3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87401,
      "text": "EDGE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.032152347,
          "height": 0.008242084,
          "left": 0.7675683,
          "top": 0.3773524
        },
        "polygon": [
          { "x": 0.7675683, "y": 0.37737945 },
          { "x": 0.79971004, "y": 0.3773524 },
          { "x": 0.79972064, "y": 0.38556743 },
          { "x": 0.76757884, "y": 0.38559446 }
        ]
      },
      "id": "f420a700-102d-4069-944f-0a5b148ddf3a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90752,
      "text": "58",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0135793,
          "height": 0.008439579,
          "left": 0.8140883,
          "top": 0.37719956
        },
        "polygon": [
          { "x": 0.8140883, "y": 0.377211 },
          { "x": 0.8276566, "y": 0.37719956 },
          { "x": 0.8276676, "y": 0.38562775 },
          { "x": 0.81409925, "y": 0.38563916 }
        ]
      },
      "id": "0d7f8ae0-0274-49e0-8828-38af1f9ea0f6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.737495,
      "text": "C.Lawson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054895226,
          "height": 0.008611306,
          "left": 0.83453894,
          "top": 0.37721443
        },
        "polygon": [
          { "x": 0.83453894, "y": 0.37726063 },
          { "x": 0.88942283, "y": 0.37721443 },
          { "x": 0.88943416, "y": 0.38577956 },
          { "x": 0.83455014, "y": 0.38582572 }
        ]
      },
      "id": "a29971b1-4835-4b9f-8494-e3dc9bdcf1f1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.602325,
      "text": "RG",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01665755,
          "height": 0.0084012225,
          "left": 0.06952849,
          "top": 0.39236405
        },
        "polygon": [
          { "x": 0.06952849, "y": 0.39237806 },
          { "x": 0.08617755, "y": 0.39236405 },
          { "x": 0.086186044, "y": 0.4007513 },
          { "x": 0.069536924, "y": 0.4007653 }
        ]
      },
      "id": "04b05bf5-825d-46e5-9a2b-d1f2b153d032",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8437,
      "text": "68",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014094765,
          "height": 0.008332022,
          "left": 0.10009193,
          "top": 0.3923013
        },
        "polygon": [
          { "x": 0.10009193, "y": 0.39231312 },
          { "x": 0.11417817, "y": 0.3923013 },
          { "x": 0.11418669, "y": 0.40062144 },
          { "x": 0.10010039, "y": 0.4006333 }
        ]
      },
      "id": "c389f85d-b74b-40b2-8650-45ecd2096820",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.26989,
      "text": "B.Scherff",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052380603,
          "height": 0.008844863,
          "left": 0.12195109,
          "top": 0.39209056
        },
        "polygon": [
          { "x": 0.12195109, "y": 0.3921346 },
          { "x": 0.17432247, "y": 0.39209056 },
          { "x": 0.1743317, "y": 0.40089133 },
          { "x": 0.12196012, "y": 0.4009354 }
        ]
      },
      "id": "182fbeb9-7ebc-4951-80d1-41afd156fed6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63212,
      "text": "OLB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023625532,
          "height": 0.008182305,
          "left": 0.2956302,
          "top": 0.39253044
        },
        "polygon": [
          { "x": 0.2956302, "y": 0.39255032 },
          { "x": 0.3192467, "y": 0.39253044 },
          { "x": 0.3192557, "y": 0.40069288 },
          { "x": 0.29563913, "y": 0.40071276 }
        ]
      },
      "id": "3c596f21-9e5c-46a3-9cfc-0ff7b0042513",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.78976,
      "text": "49",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014269084,
          "height": 0.008272485,
          "left": 0.33281493,
          "top": 0.39239624
        },
        "polygon": [
          { "x": 0.33281493, "y": 0.39240822 },
          { "x": 0.3470748, "y": 0.39239624 },
          { "x": 0.34708402, "y": 0.40065673 },
          { "x": 0.33282408, "y": 0.4006687 }
        ]
      },
      "id": "c92afc14-84bd-40f9-a841-7b9f889a14b3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.6577,
      "text": "A.Key",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03319189,
          "height": 0.010151648,
          "left": 0.3537958,
          "top": 0.39243007
        },
        "polygon": [
          { "x": 0.3537958, "y": 0.392458 },
          { "x": 0.38697624, "y": 0.39243007 },
          { "x": 0.3869877, "y": 0.40255383 },
          { "x": 0.3538071, "y": 0.40258172 }
        ]
      },
      "id": "c23af39f-295d-42fa-b886-4445b05f62d9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.740486,
      "text": "RG",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016630212,
          "height": 0.008453856,
          "left": 0.55300295,
          "top": 0.3923773
        },
        "polygon": [
          { "x": 0.55300295, "y": 0.39239126 },
          { "x": 0.569623, "y": 0.3923773 },
          { "x": 0.5696331, "y": 0.40081716 },
          { "x": 0.553013, "y": 0.40083116 }
        ]
      },
      "id": "ea9101f9-119c-499d-8931-bda77690a992",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93996,
      "text": "65",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013822774,
          "height": 0.008348644,
          "left": 0.5856517,
          "top": 0.3923518
        },
        "polygon": [
          { "x": 0.5856517, "y": 0.39236343 },
          { "x": 0.59946436, "y": 0.3923518 },
          { "x": 0.5994745, "y": 0.40068883 },
          { "x": 0.58566177, "y": 0.40070045 }
        ]
      },
      "id": "652fc38a-fc60-4df1-9c3c-40e9a9be84f2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.296196,
      "text": "N.Herbig",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050279338,
          "height": 0.010420009,
          "left": 0.61048245,
          "top": 0.39234
        },
        "polygon": [
          { "x": 0.61048245, "y": 0.3923823 },
          { "x": 0.6607489, "y": 0.39234 },
          { "x": 0.6607618, "y": 0.40271774 },
          { "x": 0.6104951, "y": 0.40276003 }
        ]
      },
      "id": "6f748cf0-cc61-418b-a85e-d5f01fd7fac4",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82241,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014029752,
          "height": 0.008210837,
          "left": 0.7855909,
          "top": 0.39239863
        },
        "polygon": [
          { "x": 0.7855909, "y": 0.3924104 },
          { "x": 0.79961, "y": 0.39239863 },
          { "x": 0.7996206, "y": 0.40059766 },
          { "x": 0.78560144, "y": 0.40060946 }
        ]
      },
      "id": "88738958-a061-4fa4-8020-dbac143ac13e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81105,
      "text": "56",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01368904,
          "height": 0.00855961,
          "left": 0.8139002,
          "top": 0.39222875
        },
        "polygon": [
          { "x": 0.8139002, "y": 0.39224026 },
          { "x": 0.82757807, "y": 0.39222875 },
          { "x": 0.8275892, "y": 0.40077686 },
          { "x": 0.8139113, "y": 0.40078837 }
        ]
      },
      "id": "7a3a9502-12b8-469a-a2b6-100aee6e0f56",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.27572,
      "text": "Qu.Williams",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.068262696,
          "height": 0.01045685,
          "left": 0.8344396,
          "top": 0.39220357
        },
        "polygon": [
          { "x": 0.8344396, "y": 0.392261 },
          { "x": 0.90268844, "y": 0.39220357 },
          { "x": 0.9027023, "y": 0.402603 },
          { "x": 0.83445317, "y": 0.40266043 }
        ]
      },
      "id": "125120f0-4be0-4641-b021-dd9cca801819",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87533,
      "text": "RT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015758907,
          "height": 0.008238398,
          "left": 0.070502736,
          "top": 0.40764555
        },
        "polygon": [
          { "x": 0.070502736, "y": 0.4076588 },
          { "x": 0.08625332, "y": 0.40764555 },
          { "x": 0.086261645, "y": 0.4158707 },
          { "x": 0.07051101, "y": 0.41588393 }
        ]
      },
      "id": "9fd6a2a2-ca2e-4275-8a68-97867a6a2176",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.801956,
      "text": "75",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014280353,
          "height": 0.0083998935,
          "left": 0.09992749,
          "top": 0.40757322
        },
        "polygon": [
          { "x": 0.09992749, "y": 0.40758523 },
          { "x": 0.11419926, "y": 0.40757322 },
          { "x": 0.11420784, "y": 0.41596112 },
          { "x": 0.09993603, "y": 0.41597313 }
        ]
      },
      "id": "abd7124d-42e5-4de0-bdd3-45e3012b374c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.9695,
      "text": "J.Taylor",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.045128953,
          "height": 0.010225877,
          "left": 0.12163081,
          "top": 0.40744498
        },
        "polygon": [
          { "x": 0.12163081, "y": 0.40748295 },
          { "x": 0.16674913, "y": 0.40744498 },
          { "x": 0.16675976, "y": 0.41763294 },
          { "x": 0.12164126, "y": 0.41767088 }
        ]
      },
      "id": "0905dff2-16fd-433e-b798-0b0cf3185c6a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.865974,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0140507845,
          "height": 0.008259683,
          "left": 0.30508414,
          "top": 0.40762806
        },
        "polygon": [
          { "x": 0.30508414, "y": 0.4076399 },
          { "x": 0.31912583, "y": 0.40762806 },
          { "x": 0.31913492, "y": 0.41587594 },
          { "x": 0.3050932, "y": 0.41588774 }
        ]
      },
      "id": "e748c74c-aa8d-4bfe-802d-508be3cfc070",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88274,
      "text": "23",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013964559,
          "height": 0.008357378,
          "left": 0.3329299,
          "top": 0.4075143
        },
        "polygon": [
          { "x": 0.3329299, "y": 0.40752602 },
          { "x": 0.34688517, "y": 0.4075143 },
          { "x": 0.34689447, "y": 0.41585994 },
          { "x": 0.33293918, "y": 0.41587168 }
        ]
      },
      "id": "eb963c92-f459-4eef-a445-b00d0440b439",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.35351,
      "text": "F.Oluokun",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.058052383,
          "height": 0.008691749,
          "left": 0.35431883,
          "top": 0.40733302
        },
        "polygon": [
          { "x": 0.35431883, "y": 0.40738183 },
          { "x": 0.41236135, "y": 0.40733302 },
          { "x": 0.41237122, "y": 0.41597596 },
          { "x": 0.35432848, "y": 0.41602477 }
        ]
      },
      "id": "076d4d6f-70e5-4013-b2a0-3b1502631bca",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93573,
      "text": "LT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014528125,
          "height": 0.008314704,
          "left": 0.55556214,
          "top": 0.40752047
        },
        "polygon": [
          { "x": 0.55556214, "y": 0.4075327 },
          { "x": 0.5700803, "y": 0.40752047 },
          { "x": 0.57009023, "y": 0.41582298 },
          { "x": 0.5555721, "y": 0.4158352 }
        ]
      },
      "id": "cf80424d-50ad-4171-bd7f-020ceacc1404",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97596,
      "text": "76",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013984699,
          "height": 0.008467739,
          "left": 0.58557606,
          "top": 0.40738314
        },
        "polygon": [
          { "x": 0.58557606, "y": 0.4073949 },
          { "x": 0.5995505, "y": 0.40738314 },
          { "x": 0.59956074, "y": 0.41583914 },
          { "x": 0.5855863, "y": 0.41585088 }
        ]
      },
      "id": "86da7340-bf73-41f4-b527-0a7fb722cc91",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.41746,
      "text": "G.Fant",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.038129877,
          "height": 0.008736823,
          "left": 0.6104783,
          "top": 0.40734038
        },
        "polygon": [
          { "x": 0.6104783, "y": 0.40737244 },
          { "x": 0.6485974, "y": 0.40734038 },
          { "x": 0.64860815, "y": 0.41604513 },
          { "x": 0.6104889, "y": 0.4160772 }
        ]
      },
      "id": "fd1bcd3d-c758-428e-999c-f2bc3d43e00f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82838,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014114883,
          "height": 0.00821532,
          "left": 0.78551525,
          "top": 0.40755093
        },
        "polygon": [
          { "x": 0.78551525, "y": 0.4075628 },
          { "x": 0.79961956, "y": 0.40755093 },
          { "x": 0.7996301, "y": 0.41575438 },
          { "x": 0.7855258, "y": 0.41576624 }
        ]
      },
      "id": "f06d038a-2e2a-4e66-b6b5-0a8845fe3ceb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.67784,
      "text": "57",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013529927,
          "height": 0.008500019,
          "left": 0.8137202,
          "top": 0.40748835
        },
        "polygon": [
          { "x": 0.8137202, "y": 0.4074997 },
          { "x": 0.8272391, "y": 0.40748835 },
          { "x": 0.8272502, "y": 0.41597697 },
          { "x": 0.81373125, "y": 0.41598836 }
        ]
      },
      "id": "7beb292e-6583-4b72-aded-bd7829349ad6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.80566,
      "text": "C.Mosley",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050886262,
          "height": 0.010394923,
          "left": 0.83513206,
          "top": 0.40737775
        },
        "polygon": [
          { "x": 0.83513206, "y": 0.40742055 },
          { "x": 0.88600457, "y": 0.40737775 },
          { "x": 0.8860183, "y": 0.41772988 },
          { "x": 0.83514553, "y": 0.41777268 }
        ]
      },
      "id": "99155ce0-221d-46d6-88f5-ad905daa9e53",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.76301,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015516636,
          "height": 0.008284685,
          "left": 0.07069884,
          "top": 0.42277136
        },
        "polygon": [
          { "x": 0.07069884, "y": 0.42278442 },
          { "x": 0.08620711, "y": 0.42277136 },
          { "x": 0.08621548, "y": 0.431043 },
          { "x": 0.07070717, "y": 0.43105605 }
        ]
      },
      "id": "2ff98073-fb18-49a5-9cb3-2a7ef01333f9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.60707,
      "text": "17",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013539122,
          "height": 0.00835468,
          "left": 0.100767545,
          "top": 0.42271253
        },
        "polygon": [
          { "x": 0.100767545, "y": 0.42272392 },
          { "x": 0.114298135, "y": 0.42271253 },
          { "x": 0.11430667, "y": 0.43105584 },
          { "x": 0.10077605, "y": 0.43106723 }
        ]
      },
      "id": "459e3bf2-2cc6-4ee5-89d4-af34efb92619",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.25653,
      "text": "E.Engram",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05521984,
          "height": 0.010545038,
          "left": 0.12146142,
          "top": 0.42242816
        },
        "polygon": [
          { "x": 0.12146142, "y": 0.42247456 },
          { "x": 0.17667025, "y": 0.42242816 },
          { "x": 0.17668127, "y": 0.43292677 },
          { "x": 0.121472195, "y": 0.43297318 }
        ]
      },
      "id": "e07c8b88-ffd1-463c-9c5b-0330b86d72cf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.852554,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014277247,
          "height": 0.008371868,
          "left": 0.30504042,
          "top": 0.42272803
        },
        "polygon": [
          { "x": 0.30504042, "y": 0.42274 },
          { "x": 0.31930843, "y": 0.42272803 },
          { "x": 0.31931767, "y": 0.43108788 },
          { "x": 0.3050496, "y": 0.4310999 }
        ]
      },
      "id": "f85f8045-588e-4087-9d25-92fa570a01df",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82766,
      "text": "33",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013765371,
          "height": 0.008420771,
          "left": 0.3330569,
          "top": 0.42263958
        },
        "polygon": [
          { "x": 0.3330569, "y": 0.42265117 },
          { "x": 0.34681287, "y": 0.42263958 },
          { "x": 0.34682226, "y": 0.4310488 },
          { "x": 0.33306623, "y": 0.43106037 }
        ]
      },
      "id": "c79a5420-8ca4-4caf-b2b0-c0ce8cf45a06",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.40778,
      "text": "D.Lloyd",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.042627238,
          "height": 0.01028295,
          "left": 0.35436806,
          "top": 0.42265862
        },
        "polygon": [
          { "x": 0.35436806, "y": 0.42269447 },
          { "x": 0.39698368, "y": 0.42265862 },
          { "x": 0.3969953, "y": 0.43290576 },
          { "x": 0.35437953, "y": 0.4329416 }
        ]
      },
      "id": "493f1296-6c6a-450e-9568-8df61a2eb43d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.78997,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015847558,
          "height": 0.008425649,
          "left": 0.5542323,
          "top": 0.422595
        },
        "polygon": [
          { "x": 0.5542323, "y": 0.42260832 },
          { "x": 0.57006973, "y": 0.422595 },
          { "x": 0.5700798, "y": 0.43100733 },
          { "x": 0.5542423, "y": 0.43102065 }
        ]
      },
      "id": "32b6b7b0-8b1e-4d30-b463-dccf32812c21",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.922615,
      "text": "87",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014055465,
          "height": 0.008453394,
          "left": 0.5855271,
          "top": 0.4225327
        },
        "polygon": [
          { "x": 0.5855271, "y": 0.4225445 },
          { "x": 0.59957236, "y": 0.4225327 },
          { "x": 0.5995826, "y": 0.4309743 },
          { "x": 0.5855374, "y": 0.4309861 }
        ]
      },
      "id": "803a830a-7938-4f1e-bc45-f3aa489bdce1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.507965,
      "text": "C.Uzomah",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.057537474,
          "height": 0.008772098,
          "left": 0.61074877,
          "top": 0.42258593
        },
        "polygon": [
          { "x": 0.61074877, "y": 0.4226343 },
          { "x": 0.6682754, "y": 0.42258593 },
          { "x": 0.66828626, "y": 0.43130967 },
          { "x": 0.61075944, "y": 0.43135804 }
        ]
      },
      "id": "aa3eaa15-a1c7-47ef-a503-900e98ed9c22",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87297,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014001577,
          "height": 0.008188352,
          "left": 0.78551704,
          "top": 0.4227278
        },
        "polygon": [
          { "x": 0.78551704, "y": 0.42273954 },
          { "x": 0.79950804, "y": 0.4227278 },
          { "x": 0.7995186, "y": 0.43090436 },
          { "x": 0.7855275, "y": 0.43091613 }
        ]
      },
      "id": "33903b8c-c600-4580-a7bf-537148f64e14",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.56411,
      "text": "9",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069613922,
          "height": 0.008250548,
          "left": 0.8205983,
          "top": 0.4228754
        },
        "polygon": [
          { "x": 0.8205983, "y": 0.42288125 },
          { "x": 0.827549, "y": 0.4228754 },
          { "x": 0.8275597, "y": 0.43112013 },
          { "x": 0.82060903, "y": 0.43112597 }
        ]
      },
      "id": "3e1253c6-1228-4357-8be1-4f83f91abc88",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.070946,
      "text": "K.Alexander",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06822928,
          "height": 0.008789797,
          "left": 0.83515537,
          "top": 0.4224516
        },
        "polygon": [
          { "x": 0.83515537, "y": 0.42250896 },
          { "x": 0.903373, "y": 0.4224516 },
          { "x": 0.9033847, "y": 0.43118402 },
          { "x": 0.8351668, "y": 0.4312414 }
        ]
      },
      "id": "e9671328-e5b3-4dfc-8800-606f455b6b51",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.72324,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020269498,
          "height": 0.008104364,
          "left": 0.06599271,
          "top": 0.4379364
        },
        "polygon": [
          { "x": 0.06599271, "y": 0.43795344 },
          { "x": 0.08625403, "y": 0.4379364 },
          { "x": 0.08626221, "y": 0.44602373 },
          { "x": 0.06600084, "y": 0.44604075 }
        ]
      },
      "id": "8b0cc316-cea9-4b17-9a48-7be79aa59906",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.69751,
      "text": "13",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013348989,
          "height": 0.008361704,
          "left": 0.10073758,
          "top": 0.4378116
        },
        "polygon": [
          { "x": 0.10073758, "y": 0.43782282 },
          { "x": 0.11407802, "y": 0.4378116 },
          { "x": 0.11408657, "y": 0.4461621 },
          { "x": 0.10074608, "y": 0.4461733 }
        ]
      },
      "id": "4d70c4e5-c18b-43f1-99bc-5f7055d68e74",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.50758,
      "text": "C.Kirk",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03373976,
          "height": 0.008631327,
          "left": 0.12142002,
          "top": 0.4376739
        },
        "polygon": [
          { "x": 0.12142002, "y": 0.43770227 },
          { "x": 0.15515083, "y": 0.4376739 },
          { "x": 0.15515977, "y": 0.44627687 },
          { "x": 0.12142885, "y": 0.44630522 }
        ]
      },
      "id": "d2373eae-678c-4918-88d3-a9ec856bc842",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.881226,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015912436,
          "height": 0.008307305,
          "left": 0.30361947,
          "top": 0.4378714
        },
        "polygon": [
          { "x": 0.30361947, "y": 0.43788475 },
          { "x": 0.31952274, "y": 0.4378714 },
          { "x": 0.31953192, "y": 0.44616532 },
          { "x": 0.30362856, "y": 0.44617867 }
        ]
      },
      "id": "f5a673fc-a9d0-444b-841a-e9e3e6816d8d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79467,
      "text": "31",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013457703,
          "height": 0.008531207,
          "left": 0.33295038,
          "top": 0.4377234
        },
        "polygon": [
          { "x": 0.33295038, "y": 0.43773472 },
          { "x": 0.3463986, "y": 0.4377234 },
          { "x": 0.3464081, "y": 0.44624332 },
          { "x": 0.33295983, "y": 0.4462546 }
        ]
      },
      "id": "22673e32-1f08-4965-9e87-2e2ffa7512bd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.529526,
      "text": "D.Williams",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06034589,
          "height": 0.008803188,
          "left": 0.35428143,
          "top": 0.43759403
        },
        "polygon": [
          { "x": 0.35428143, "y": 0.43764475 },
          { "x": 0.41461733, "y": 0.43759403 },
          { "x": 0.4146273, "y": 0.44634652 },
          { "x": 0.3542912, "y": 0.44639722 }
        ]
      },
      "id": "e24208e9-eb6e-456e-ae73-e7e344f82e9e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.76996,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020264305,
          "height": 0.008283419,
          "left": 0.5495744,
          "top": 0.4378085
        },
        "polygon": [
          { "x": 0.5495744, "y": 0.43782553 },
          { "x": 0.5698287, "y": 0.4378085 },
          { "x": 0.56983864, "y": 0.4460749 },
          { "x": 0.5495842, "y": 0.44609192 }
        ]
      },
      "id": "fd71d119-7378-4b5c-bae5-907aefb7e293",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.947136,
      "text": "15",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013266053,
          "height": 0.008429771,
          "left": 0.58625996,
          "top": 0.43777305
        },
        "polygon": [
          { "x": 0.58625996, "y": 0.4377842 },
          { "x": 0.5995158, "y": 0.43777305 },
          { "x": 0.599526, "y": 0.44619167 },
          { "x": 0.58627015, "y": 0.4462028 }
        ]
      },
      "id": "6f99e282-2137-4163-b421-e5ec22b36906",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 94.84383,
      "text": "C.Streveler",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.062328395,
          "height": 0.008791449,
          "left": 0.6109424,
          "top": 0.43754768
        },
        "polygon": [
          { "x": 0.6109424, "y": 0.43760008 },
          { "x": 0.67326, "y": 0.43754768 },
          { "x": 0.6732708, "y": 0.44628677 },
          { "x": 0.6109531, "y": 0.44633913 }
        ]
      },
      "id": "02953766-e697-4343-9400-07c10cf05e31",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87295,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015692474,
          "height": 0.008302665,
          "left": 0.7839901,
          "top": 0.43784085
        },
        "polygon": [
          { "x": 0.7839901, "y": 0.43785402 },
          { "x": 0.7996719, "y": 0.43784085 },
          { "x": 0.79968256, "y": 0.44613034 },
          { "x": 0.78400075, "y": 0.4461435 }
        ]
      },
      "id": "0831a24f-c892-40e7-b24e-6576d1435630",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.12143,
      "text": "4",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070544244,
          "height": 0.007957787,
          "left": 0.82056314,
          "top": 0.43795305
        },
        "polygon": [
          { "x": 0.82056314, "y": 0.437959 },
          { "x": 0.8276072, "y": 0.43795305 },
          { "x": 0.8276176, "y": 0.4459049 },
          { "x": 0.8205735, "y": 0.44591084 }
        ]
      },
      "id": "2066caa8-a11b-45db-a2aa-fdf14f61269f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86203,
      "text": "D.Reed",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04098352,
          "height": 0.008465777,
          "left": 0.83522004,
          "top": 0.43776914
        },
        "polygon": [
          { "x": 0.83522004, "y": 0.4378036 },
          { "x": 0.8761924, "y": 0.43776914 },
          { "x": 0.87620354, "y": 0.4462005 },
          { "x": 0.83523107, "y": 0.4462349 }
        ]
      },
      "id": "1fa8572b-212c-4170-8c86-b6b5bda9c939",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.864426,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020297952,
          "height": 0.0082222475,
          "left": 0.06603691,
          "top": 0.45309144
        },
        "polygon": [
          { "x": 0.06603691, "y": 0.4531085 },
          { "x": 0.086326554, "y": 0.45309144 },
          { "x": 0.08633486, "y": 0.46129665 },
          { "x": 0.06604515, "y": 0.4613137 }
        ]
      },
      "id": "fb2a5a54-50f9-438e-bd03-39c93e2dff23",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.28475,
      "text": "7",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00705813,
          "height": 0.008156132,
          "left": 0.10737652,
          "top": 0.45303243
        },
        "polygon": [
          { "x": 0.10737652, "y": 0.45303836 },
          { "x": 0.114426315, "y": 0.45303243 },
          { "x": 0.11443466, "y": 0.46118262 },
          { "x": 0.107384846, "y": 0.46118855 }
        ]
      },
      "id": "7397bc2c-c41a-4da2-84e1-bbebfaed2c86",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.59984,
      "text": "Z.Jones",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044119112,
          "height": 0.008608616,
          "left": 0.121113785,
          "top": 0.4531511
        },
        "polygon": [
          { "x": 0.121113785, "y": 0.45318815 },
          { "x": 0.16522396, "y": 0.4531511 },
          { "x": 0.1652329, "y": 0.46172264 },
          { "x": 0.121122584, "y": 0.46175972 }
        ]
      },
      "id": "e3d7bfae-e2ea-4150-85de-4ff1cce3d85d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8936,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015906993,
          "height": 0.008378317,
          "left": 0.30360898,
          "top": 0.45299065
        },
        "polygon": [
          { "x": 0.30360898, "y": 0.453004 },
          { "x": 0.31950676, "y": 0.45299065 },
          { "x": 0.31951597, "y": 0.4613556 },
          { "x": 0.30361816, "y": 0.46136895 }
        ]
      },
      "id": "40b4e3a5-400b-40c0-a0a5-fc08f03f0300",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.653564,
      "text": "32",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01422589,
          "height": 0.008452148,
          "left": 0.33298203,
          "top": 0.45291403
        },
        "polygon": [
          { "x": 0.33298203, "y": 0.45292598 },
          { "x": 0.34719852, "y": 0.45291403 },
          { "x": 0.3472079, "y": 0.46135426 },
          { "x": 0.3329914, "y": 0.46136618 }
        ]
      },
      "id": "128465be-0328-4858-9a93-4be28227e100",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.04868,
      "text": "T.Campbell",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06501945,
          "height": 0.010484284,
          "left": 0.35380194,
          "top": 0.45276085
        },
        "polygon": [
          { "x": 0.35380194, "y": 0.4528155 },
          { "x": 0.41880947, "y": 0.45276085 },
          { "x": 0.4188214, "y": 0.46319053 },
          { "x": 0.3538136, "y": 0.46324515 }
        ]
      },
      "id": "376ec8fe-e0bf-45fd-aae2-0bc2c4c637a5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84978,
      "text": "QB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017294241,
          "height": 0.009690748,
          "left": 0.55243444,
          "top": 0.4530707
        },
        "polygon": [
          { "x": 0.55243444, "y": 0.4530852 },
          { "x": 0.56971705, "y": 0.4530707 },
          { "x": 0.5697287, "y": 0.46274692 },
          { "x": 0.552446, "y": 0.46276143 }
        ]
      },
      "id": "6dad33d6-665b-4130-8f01-9f35bda2965e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.78612,
      "text": "2",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0071695144,
          "height": 0.008160244,
          "left": 0.5926689,
          "top": 0.4530354
        },
        "polygon": [
          { "x": 0.5926689, "y": 0.4530414 },
          { "x": 0.59982854, "y": 0.4530354 },
          { "x": 0.59983844, "y": 0.46118963 },
          { "x": 0.5926788, "y": 0.46119565 }
        ]
      },
      "id": "f5f32587-0a8b-4593-af31-f2aeb9641ac3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.51629,
      "text": "Z.Wilson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048871487,
          "height": 0.008615612,
          "left": 0.61068404,
          "top": 0.4528582
        },
        "polygon": [
          { "x": 0.61068404, "y": 0.45289928 },
          { "x": 0.65954494, "y": 0.4528582 },
          { "x": 0.65955555, "y": 0.46143275 },
          { "x": 0.6106945, "y": 0.46147382 }
        ]
      },
      "id": "230f9754-ae51-4221-a339-54e532c342e1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.905304,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015879313,
          "height": 0.008383902,
          "left": 0.7839076,
          "top": 0.452998
        },
        "polygon": [
          { "x": 0.7839076, "y": 0.45301133 },
          { "x": 0.7997761, "y": 0.452998 },
          { "x": 0.79978687, "y": 0.4613686 },
          { "x": 0.7839183, "y": 0.4613819 }
        ]
      },
      "id": "b90a73e8-c8f6-459e-a5a2-43a121b66e6d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.96625,
      "text": "1",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.005267613,
          "height": 0.00823673,
          "left": 0.82145363,
          "top": 0.45317885
        },
        "polygon": [
          { "x": 0.82145363, "y": 0.45318326 },
          { "x": 0.8267105, "y": 0.45317885 },
          { "x": 0.82672125, "y": 0.46141118 },
          { "x": 0.82146436, "y": 0.4614156 }
        ]
      },
      "id": "68903ba9-899e-4edf-9f40-1bad19ac02ed",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.19879,
      "text": "A.Gardner",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.058392666,
          "height": 0.008632812,
          "left": 0.8346989,
          "top": 0.45285863
        },
        "polygon": [
          { "x": 0.8346989, "y": 0.45290768 },
          { "x": 0.8930802, "y": 0.45285863 },
          { "x": 0.89309156, "y": 0.46144238 },
          { "x": 0.8347101, "y": 0.46149144 }
        ]
      },
      "id": "c87f9e0c-49d6-4664-9804-66bba973e6e8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.80202,
      "text": "QB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017333444,
          "height": 0.009646002,
          "left": 0.068960264,
          "top": 0.46817753
        },
        "polygon": [
          { "x": 0.068960264, "y": 0.46819207 },
          { "x": 0.08628396, "y": 0.46817753 },
          { "x": 0.086293705, "y": 0.47780895 },
          { "x": 0.06896995, "y": 0.47782353 }
        ]
      },
      "id": "83811c14-da94-4c7c-8c28-b05ab47c305f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92481,
      "text": "16",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013451021,
          "height": 0.008336073,
          "left": 0.10085487,
          "top": 0.46812114
        },
        "polygon": [
          { "x": 0.10085487, "y": 0.46813244 },
          { "x": 0.114297375, "y": 0.46812114 },
          { "x": 0.1143059, "y": 0.4764459 },
          { "x": 0.10086335, "y": 0.4764572 }
        ]
      },
      "id": "59cece99-c677-4200-92b0-27e77c329996",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.087006,
      "text": "T.Lawrence",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0668444,
          "height": 0.008527993,
          "left": 0.121106565,
          "top": 0.4680624
        },
        "polygon": [
          { "x": 0.121106565, "y": 0.46811855 },
          { "x": 0.18794204, "y": 0.4680624 },
          { "x": 0.18795097, "y": 0.47653425 },
          { "x": 0.12111526, "y": 0.4765904 }
        ]
      },
      "id": "ac7e54cf-fe80-42d0-b45a-57ed4193d21a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.745804,
      "text": "FS",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013874255,
          "height": 0.008565927,
          "left": 0.305434,
          "top": 0.46801212
        },
        "polygon": [
          { "x": 0.305434, "y": 0.46802378 },
          { "x": 0.31929877, "y": 0.46801212 },
          { "x": 0.31930822, "y": 0.4765664 },
          { "x": 0.30544338, "y": 0.47657806 }
        ]
      },
      "id": "64f9af34-1f9c-4719-a084-d6b91a3b6440",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.46326,
      "text": "5",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006590561,
          "height": 0.008402609,
          "left": 0.34042618,
          "top": 0.46805444
        },
        "polygon": [
          { "x": 0.34042618, "y": 0.46806 },
          { "x": 0.3470074, "y": 0.46805444 },
          { "x": 0.34701675, "y": 0.47645152 },
          { "x": 0.34043553, "y": 0.47645706 }
        ]
      },
      "id": "a925da2d-dc3b-4cc3-a30e-ce31a5610fab",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.69785,
      "text": "A.Cisco",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04195964,
          "height": 0.008573561,
          "left": 0.353862,
          "top": 0.46807107
        },
        "polygon": [
          { "x": 0.353862, "y": 0.46810633 },
          { "x": 0.39581195, "y": 0.46807107 },
          { "x": 0.39582163, "y": 0.4766094 },
          { "x": 0.35387152, "y": 0.47664464 }
        ]
      },
      "id": "de57777d-5776-4420-8ebe-0035b9b33814",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.80891,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016060427,
          "height": 0.008123401,
          "left": 0.5538722,
          "top": 0.46824244
        },
        "polygon": [
          { "x": 0.5538722, "y": 0.4682559 },
          { "x": 0.5699229, "y": 0.46824244 },
          { "x": 0.5699327, "y": 0.47635233 },
          { "x": 0.55388194, "y": 0.47636583 }
        ]
      },
      "id": "d0851b39-26a7-41a9-9bac-a4ec0f6ca8f0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87033,
      "text": "27",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014172322,
          "height": 0.008221135,
          "left": 0.58548933,
          "top": 0.46812534
        },
        "polygon": [
          { "x": 0.58548933, "y": 0.46813723 },
          { "x": 0.5996517, "y": 0.46812534 },
          { "x": 0.59966165, "y": 0.47633457 },
          { "x": 0.5854993, "y": 0.4763465 }
        ]
      },
      "id": "c94bf2f3-bb85-450c-9c4e-696517dd7839",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.36839,
      "text": "Z.Knight",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048313532,
          "height": 0.010482907,
          "left": 0.61098677,
          "top": 0.46789548
        },
        "polygon": [
          { "x": 0.61098677, "y": 0.46793604 },
          { "x": 0.6592874, "y": 0.46789548 },
          { "x": 0.6593003, "y": 0.4783378 },
          { "x": 0.6109995, "y": 0.4783784 }
        ]
      },
      "id": "22d00141-3cc5-496d-88ca-5e95b3d4379a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.376175,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00752626,
          "height": 0.00871021,
          "left": 0.79223627,
          "top": 0.4680646
        },
        "polygon": [
          { "x": 0.79223627, "y": 0.46807092 },
          { "x": 0.7997513, "y": 0.4680646 },
          { "x": 0.7997625, "y": 0.47676852 },
          { "x": 0.7922475, "y": 0.47677484 }
        ]
      },
      "id": "a43a6b42-5209-4a60-b48c-69bc33bdcc37",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91519,
      "text": "39",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0139782075,
          "height": 0.008555618,
          "left": 0.8134626,
          "top": 0.46805498
        },
        "polygon": [
          { "x": 0.8134626, "y": 0.4680667 },
          { "x": 0.8274297, "y": 0.46805498 },
          { "x": 0.82744086, "y": 0.47659886 },
          { "x": 0.8134737, "y": 0.4766106 }
        ]
      },
      "id": "193b4b4a-59e3-4a41-934a-dc2b8b8bf59f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.39285,
      "text": "W.Parks",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.047105037,
          "height": 0.008629363,
          "left": 0.83471805,
          "top": 0.4679505
        },
        "polygon": [
          { "x": 0.83471805, "y": 0.46799007 },
          { "x": 0.8818117, "y": 0.4679505 },
          { "x": 0.88182306, "y": 0.4765403 },
          { "x": 0.83472925, "y": 0.47657987 }
        ]
      },
      "id": "11e3ea99-66d7-44e0-b6e2-d2cefadbf35c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.74767,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015836516,
          "height": 0.008199539,
          "left": 0.07046338,
          "top": 0.4833969
        },
        "polygon": [
          { "x": 0.07046338, "y": 0.48341018 },
          { "x": 0.08629161, "y": 0.4833969 },
          { "x": 0.086299896, "y": 0.49158314 },
          { "x": 0.070471615, "y": 0.49159643 }
        ]
      },
      "id": "43ae8eeb-92ec-4595-b262-814b0bf38550",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.29409,
      "text": "1",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0054275244,
          "height": 0.008153895,
          "left": 0.10818306,
          "top": 0.4835219
        },
        "polygon": [
          { "x": 0.10818306, "y": 0.48352647 },
          { "x": 0.11360225, "y": 0.4835219 },
          { "x": 0.11361059, "y": 0.49167126 },
          { "x": 0.108191386, "y": 0.4916758 }
        ]
      },
      "id": "a1b84f0d-9b63-4ada-805f-6971594225f0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.72874,
      "text": "T.Etienne",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05430191,
          "height": 0.008483894,
          "left": 0.12162656,
          "top": 0.48332483
        },
        "polygon": [
          { "x": 0.12162656, "y": 0.48337042 },
          { "x": 0.17591964, "y": 0.48332483 },
          { "x": 0.17592847, "y": 0.49176314 },
          { "x": 0.12163522, "y": 0.49180874 }
        ]
      },
      "id": "b1d49a3e-8c7a-4ee3-9c5d-fb359ddb76d5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.290886,
      "text": "SS",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0150016695,
          "height": 0.008837834,
          "left": 0.3043163,
          "top": 0.48311478
        },
        "polygon": [
          { "x": 0.3043163, "y": 0.4831274 },
          { "x": 0.31930822, "y": 0.48311478 },
          { "x": 0.31931797, "y": 0.49194002 },
          { "x": 0.304326, "y": 0.49195263 }
        ]
      },
      "id": "673a48b2-3c0a-4241-83da-b9cfe84c27a1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.3231,
      "text": "2",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067378064,
          "height": 0.008239475,
          "left": 0.34038118,
          "top": 0.4833779
        },
        "polygon": [
          { "x": 0.34038118, "y": 0.48338354 },
          { "x": 0.3471098, "y": 0.4833779 },
          { "x": 0.34711897, "y": 0.49161172 },
          { "x": 0.34039032, "y": 0.49161738 }
        ]
      },
      "id": "63873860-6119-4255-b5d3-21e2e15bfaad",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.34168,
      "text": "R.Jenkins",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053410653,
          "height": 0.008611867,
          "left": 0.35506356,
          "top": 0.4831693
        },
        "polygon": [
          { "x": 0.35506356, "y": 0.48321414 },
          { "x": 0.40846446, "y": 0.4831693 },
          { "x": 0.4084742, "y": 0.4917363 },
          { "x": 0.35507315, "y": 0.49178115 }
        ]
      },
      "id": "0866cdf0-b133-4904-8ae1-6785d101b657",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81858,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020250404,
          "height": 0.008259815,
          "left": 0.5495234,
          "top": 0.48337588
        },
        "polygon": [
          { "x": 0.5495234, "y": 0.48339286 },
          { "x": 0.5697639, "y": 0.48337588 },
          { "x": 0.56977385, "y": 0.4916187 },
          { "x": 0.54953325, "y": 0.49163568 }
        ]
      },
      "id": "4045058f-2b0b-476c-b1bf-e98859b3ee72",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89487,
      "text": "17",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013551484,
          "height": 0.00839649,
          "left": 0.5861825,
          "top": 0.48323658
        },
        "polygon": [
          { "x": 0.5861825, "y": 0.48324794 },
          { "x": 0.59972376, "y": 0.48323658 },
          { "x": 0.59973395, "y": 0.49162167 },
          { "x": 0.5861926, "y": 0.49163306 }
        ]
      },
      "id": "0e5ed659-a156-4c5d-a40e-e70d21856458",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.35413,
      "text": "G.Wilson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050217945,
          "height": 0.008741864,
          "left": 0.6108129,
          "top": 0.4831198
        },
        "polygon": [
          { "x": 0.6108129, "y": 0.48316196 },
          { "x": 0.66102004, "y": 0.4831198 },
          { "x": 0.6610308, "y": 0.4918195 },
          { "x": 0.61082345, "y": 0.49186164 }
        ]
      },
      "id": "97e75fd3-aa91-48b2-b2af-e4d56c2127f6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.984436,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0074663237,
          "height": 0.008928616,
          "left": 0.7922967,
          "top": 0.483159
        },
        "polygon": [
          { "x": 0.7922967, "y": 0.48316526 },
          { "x": 0.7997515, "y": 0.483159 },
          { "x": 0.7997631, "y": 0.49208137 },
          { "x": 0.7923082, "y": 0.49208763 }
        ]
      },
      "id": "fbd7d8ad-c1e7-4421-ab7c-1150f7ca62c8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.65095,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0066578775,
          "height": 0.008461494,
          "left": 0.82065284,
          "top": 0.4832203
        },
        "polygon": [
          { "x": 0.82065284, "y": 0.4832259 },
          { "x": 0.82729965, "y": 0.4832203 },
          { "x": 0.8273107, "y": 0.49167624 },
          { "x": 0.8206638, "y": 0.4916818 }
        ]
      },
      "id": "2d631a28-9aed-48f0-8a2a-aec6917ee724",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.5329,
      "text": "J.Whitehead",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07142935,
          "height": 0.008775884,
          "left": 0.8341511,
          "top": 0.48313245
        },
        "polygon": [
          { "x": 0.8341511, "y": 0.48319244 },
          { "x": 0.9055688, "y": 0.48313245 },
          { "x": 0.9055804, "y": 0.49184838 },
          { "x": 0.8341625, "y": 0.49190834 }
        ]
      },
      "id": "da55c736-3de2-4a45-bfa6-0f0a7c487ea0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.3944,
      "text": "Substitutions",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08694241,
          "height": 0.008902429,
          "left": 0.22119077,
          "top": 0.51810443
        },
        "polygon": [
          { "x": 0.22119077, "y": 0.5181774 },
          { "x": 0.30812347, "y": 0.51810443 },
          { "x": 0.30813316, "y": 0.5269339 },
          { "x": 0.22120017, "y": 0.52700686 }
        ]
      },
      "id": "c5eaa612-f085-4e91-af02-5a387009c45c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.33106,
      "text": "Substitutions",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08762426,
          "height": 0.008900912,
          "left": 0.69147635,
          "top": 0.5181562
        },
        "polygon": [
          { "x": 0.69147635, "y": 0.51822966 },
          { "x": 0.7790893, "y": 0.5181562 },
          { "x": 0.77910066, "y": 0.52698356 },
          { "x": 0.69148743, "y": 0.52705705 }
        ]
      },
      "id": "8a4deba3-09bd-4cac-b2b9-d77efcbc36a0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.53597,
      "text": "QB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017578354,
          "height": 0.009929551,
          "left": 0.03553879,
          "top": 0.53668404
        },
        "polygon": [
          { "x": 0.03553879, "y": 0.53669876 },
          { "x": 0.053107236, "y": 0.53668404 },
          { "x": 0.053117145, "y": 0.54659885 },
          { "x": 0.03554863, "y": 0.5466136 }
        ]
      },
      "id": "b3cc1f15-ea05-4185-b86e-35c2ba4ca0b2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 94.48512,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006853609,
          "height": 0.008396594,
          "left": 0.05657668,
          "top": 0.5366481
        },
        "polygon": [
          { "x": 0.05657668, "y": 0.5366539 },
          { "x": 0.06342187, "y": 0.5366481 },
          { "x": 0.06343029, "y": 0.54503894 },
          { "x": 0.056585077, "y": 0.5450447 }
        ]
      },
      "id": "6535393b-4e6d-4c59-a43b-2e41b56d3d3c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.22962,
      "text": "C.Beathard,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06719506,
          "height": 0.009915941,
          "left": 0.0674155,
          "top": 0.53649044
        },
        "polygon": [
          { "x": 0.0674155, "y": 0.5365468 },
          { "x": 0.13460039, "y": 0.53649044 },
          { "x": 0.13461055, "y": 0.54635006 },
          { "x": 0.06742541, "y": 0.5464064 }
        ]
      },
      "id": "7ed66d63-1d19-4891-8fbf-a1d5e8253628",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.69063,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015610396,
          "height": 0.00824063,
          "left": 0.1394575,
          "top": 0.5366278
        },
        "polygon": [
          { "x": 0.1394575, "y": 0.53664094 },
          { "x": 0.15505934, "y": 0.5366278 },
          { "x": 0.15506789, "y": 0.5448554 },
          { "x": 0.13946599, "y": 0.54486847 }
        ]
      },
      "id": "32323c60-94a6-4fb9-89ff-3d07f0bbe237",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.902885,
      "text": "6",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0072460035,
          "height": 0.008280179,
          "left": 0.15914771,
          "top": 0.5365668
        },
        "polygon": [
          { "x": 0.15914771, "y": 0.5365729 },
          { "x": 0.16638508, "y": 0.5365668 },
          { "x": 0.16639371, "y": 0.5448409 },
          { "x": 0.15915632, "y": 0.54484695 }
        ]
      },
      "id": "4f717ae9-50ac-4756-a067-294a68456945",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.26957,
      "text": "C.Claybrooks,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07765249,
          "height": 0.010465624,
          "left": 0.17033912,
          "top": 0.5365099
        },
        "polygon": [
          { "x": 0.17033912, "y": 0.53657496 },
          { "x": 0.24798043, "y": 0.5365099 },
          { "x": 0.24799162, "y": 0.54691035 },
          { "x": 0.17035, "y": 0.5469755 }
        ]
      },
      "id": "6bb6e0ff-087c-4aac-8fc0-4a4b71723d76",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 89.48796,
      "text": "9",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007025909,
          "height": 0.008296225,
          "left": 0.26401022,
          "top": 0.53691214
        },
        "polygon": [
          { "x": 0.26401022, "y": 0.53691804 },
          { "x": 0.27102712, "y": 0.53691214 },
          { "x": 0.27103612, "y": 0.5452025 },
          { "x": 0.2640192, "y": 0.5452084 }
        ]
      },
      "id": "c7d052e1-8df9-48d7-b614-944d002368e5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.551544,
      "text": "L.Cooke,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048316922,
          "height": 0.01001278,
          "left": 0.27619946,
          "top": 0.5364849
        },
        "polygon": [
          { "x": 0.27619946, "y": 0.5365254 },
          { "x": 0.32450536, "y": 0.5364849 },
          { "x": 0.3245164, "y": 0.5464572 },
          { "x": 0.2762103, "y": 0.5464977 }
        ]
      },
      "id": "99290727-b627-4fb2-9d23-dd1b18c281ed",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.74975,
      "text": "K",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007940428,
          "height": 0.008153192,
          "left": 0.32931098,
          "top": 0.5367186
        },
        "polygon": [
          { "x": 0.32931098, "y": 0.5367253 },
          { "x": 0.33724236, "y": 0.5367186 },
          { "x": 0.33725142, "y": 0.54486513 },
          { "x": 0.32932, "y": 0.5448718 }
        ]
      },
      "id": "015ca364-b0e3-46d9-9d5d-6ba417f4ccf5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.865135,
      "text": "10",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013241675,
          "height": 0.008255415,
          "left": 0.34175348,
          "top": 0.53663987
        },
        "polygon": [
          { "x": 0.34175348, "y": 0.53665096 },
          { "x": 0.35498595, "y": 0.53663987 },
          { "x": 0.35499516, "y": 0.54488415 },
          { "x": 0.34176266, "y": 0.5448953 }
        ]
      },
      "id": "8a7ebf70-76b2-4769-a1c5-b8c593a0f621",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.47733,
      "text": "R.Patterson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.069925055,
          "height": 0.010093377,
          "left": 0.35935664,
          "top": 0.5365328
        },
        "polygon": [
          { "x": 0.35935664, "y": 0.5365915 },
          { "x": 0.42927018, "y": 0.5365328 },
          { "x": 0.42928168, "y": 0.54656756 },
          { "x": 0.35936788, "y": 0.5466262 }
        ]
      },
      "id": "a1438ad9-73e5-41be-82a0-3e82286b1f63",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.435524,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020117063,
          "height": 0.008150263,
          "left": 0.4336799,
          "top": 0.53667456
        },
        "polygon": [
          { "x": 0.4336799, "y": 0.5366914 },
          { "x": 0.45378757, "y": 0.53667456 },
          { "x": 0.45379698, "y": 0.5448079 },
          { "x": 0.43368927, "y": 0.5448248 }
        ]
      },
      "id": "1d6df24b-b176-4066-8cc0-62089d23e12a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.5559,
      "text": "11",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0126436865,
          "height": 0.008032656,
          "left": 0.458451,
          "top": 0.53668344
        },
        "polygon": [
          { "x": 0.458451, "y": 0.53669405 },
          { "x": 0.47108537, "y": 0.53668344 },
          { "x": 0.4710947, "y": 0.5447055 },
          { "x": 0.4584603, "y": 0.5447161 }
        ]
      },
      "id": "c1b8a01e-6fb4-4347-af0a-22d67d2b069a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 84.77004,
      "text": "K",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.008182391,
          "height": 0.00837728,
          "left": 0.5065703,
          "top": 0.5366775
        },
        "polygon": [
          { "x": 0.5065703, "y": 0.53668433 },
          { "x": 0.5147428, "y": 0.5366775 },
          { "x": 0.5147527, "y": 0.5450479 },
          { "x": 0.5065801, "y": 0.54505473 }
        ]
      },
      "id": "be1271b8-0690-45e6-ae35-fb231045a517",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.650894,
      "text": "G.Zuerlein,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06238542,
          "height": 0.010110423,
          "left": 0.5289953,
          "top": 0.53648645
        },
        "polygon": [
          { "x": 0.5289953, "y": 0.5365388 },
          { "x": 0.59136856, "y": 0.53648645 },
          { "x": 0.5913807, "y": 0.54654455 },
          { "x": 0.52900726, "y": 0.5465968 }
        ]
      },
      "id": "94ca59b3-6a35-4185-b45c-f03e69a92d88",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.54483,
      "text": "P",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007560668,
          "height": 0.008077582,
          "left": 0.59624374,
          "top": 0.53670704
        },
        "polygon": [
          { "x": 0.59624374, "y": 0.5367134 },
          { "x": 0.6037946, "y": 0.53670704 },
          { "x": 0.6038044, "y": 0.54477835 },
          { "x": 0.5962535, "y": 0.54478467 }
        ]
      },
      "id": "04f93af3-b2d7-4e1e-9a5e-93803122c9ac",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 93.85223,
      "text": "7",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0072027436,
          "height": 0.008195834,
          "left": 0.60743713,
          "top": 0.53665566
        },
        "polygon": [
          { "x": 0.60743713, "y": 0.5366617 },
          { "x": 0.61462986, "y": 0.53665566 },
          { "x": 0.6146399, "y": 0.54484546 },
          { "x": 0.6074471, "y": 0.5448515 }
        ]
      },
      "id": "8d19db12-801e-419b-945c-72306f56bb5b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.47653,
      "text": "B.Mann,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.045913998,
          "height": 0.010058814,
          "left": 0.6190762,
          "top": 0.53658897
        },
        "polygon": [
          { "x": 0.6190762, "y": 0.5366275 },
          { "x": 0.6649778, "y": 0.53658897 },
          { "x": 0.6649902, "y": 0.5466093 },
          { "x": 0.6190884, "y": 0.5466478 }
        ]
      },
      "id": "82088f75-6d36-4d50-8591-7cf654d89f0c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.77241,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020426372,
          "height": 0.008154466,
          "left": 0.6695518,
          "top": 0.53672284
        },
        "polygon": [
          { "x": 0.6695518, "y": 0.53674 },
          { "x": 0.689968, "y": 0.53672284 },
          { "x": 0.6899782, "y": 0.5448602 },
          { "x": 0.66956186, "y": 0.5448773 }
        ]
      },
      "id": "edebed99-5626-4a49-8d80-53bf34014768",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.61881,
      "text": "10",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013460505,
          "height": 0.008201871,
          "left": 0.69459397,
          "top": 0.53664917
        },
        "polygon": [
          { "x": 0.69459397, "y": 0.5366605 },
          { "x": 0.70804423, "y": 0.53664917 },
          { "x": 0.7080545, "y": 0.5448398 },
          { "x": 0.6946042, "y": 0.54485106 }
        ]
      },
      "id": "9c6bc8ce-361e-4c21-8d48-c37fcc536d67",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.08506,
      "text": "B.Berrios,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05449448,
          "height": 0.009945195,
          "left": 0.7125789,
          "top": 0.53658915
        },
        "polygon": [
          { "x": 0.7125789, "y": 0.53663486 },
          { "x": 0.7670607, "y": 0.53658915 },
          { "x": 0.7670734, "y": 0.54648864 },
          { "x": 0.71259135, "y": 0.54653436 }
        ]
      },
      "id": "7017738d-39b3-4c4a-8a39-6f3de1b54f70",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 91.88516,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007713484,
          "height": 0.008363114,
          "left": 0.7717099,
          "top": 0.5366766
        },
        "polygon": [
          { "x": 0.7717099, "y": 0.5366831 },
          { "x": 0.7794127, "y": 0.5366766 },
          { "x": 0.7794234, "y": 0.5450333 },
          { "x": 0.77172065, "y": 0.5450397 }
        ]
      },
      "id": "bed50b9b-2e85-41b8-8aa1-c3a444f12262",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.44652,
      "text": "21",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013278004,
          "height": 0.008261209,
          "left": 0.78330576,
          "top": 0.53660256
        },
        "polygon": [
          { "x": 0.78330576, "y": 0.53661364 },
          { "x": 0.7965731, "y": 0.53660256 },
          { "x": 0.7965838, "y": 0.5448526 },
          { "x": 0.7833164, "y": 0.54486376 }
        ]
      },
      "id": "b0ce077c-9acf-4cc1-b606-0a8d86390088",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.21889,
      "text": "A.Davis,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.046157874,
          "height": 0.009834941,
          "left": 0.80140114,
          "top": 0.5365771
        },
        "polygon": [
          { "x": 0.80140114, "y": 0.5366158 },
          { "x": 0.84754616, "y": 0.5365771 },
          { "x": 0.84755903, "y": 0.5463733 },
          { "x": 0.80141383, "y": 0.546412 }
        ]
      },
      "id": "48f2ebb2-d82d-4b48-878c-1d756dfe73d1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.5837,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0075568184,
          "height": 0.0084124515,
          "left": 0.8521816,
          "top": 0.5366366
        },
        "polygon": [
          { "x": 0.8521816, "y": 0.5366429 },
          { "x": 0.8597274, "y": 0.5366366 },
          { "x": 0.8597384, "y": 0.5450427 },
          { "x": 0.85219264, "y": 0.545049 }
        ]
      },
      "id": "8ac9aac2-4bb0-4722-8a20-1a5c0bbb9db5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.20435,
      "text": "22",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014156124,
          "height": 0.008261428,
          "left": 0.86359215,
          "top": 0.5366572
        },
        "polygon": [
          { "x": 0.86359215, "y": 0.5366691 },
          { "x": 0.87773734, "y": 0.5366572 },
          { "x": 0.8777483, "y": 0.5449068 },
          { "x": 0.86360306, "y": 0.54491866 }
        ]
      },
      "id": "452cf670-d50f-474c-86b1-d38e606a8ba9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.56958,
      "text": "T.Adams,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05328292,
          "height": 0.009979527,
          "left": 0.8822946,
          "top": 0.5365027
        },
        "polygon": [
          { "x": 0.8822946, "y": 0.5365474 },
          { "x": 0.93556416, "y": 0.5365027 },
          { "x": 0.9355775, "y": 0.54643756 },
          { "x": 0.88230777, "y": 0.54648226 }
        ]
      },
      "id": "0409817b-5a3f-460e-a5ab-fb2cc60968e8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84004,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015759973,
          "height": 0.00824107,
          "left": 0.9402865,
          "top": 0.5367328
        },
        "polygon": [
          { "x": 0.9402865, "y": 0.536746 },
          { "x": 0.9560354, "y": 0.5367328 },
          { "x": 0.9560465, "y": 0.5449607 },
          { "x": 0.9402976, "y": 0.5449739 }
        ]
      },
      "id": "b9846e42-2be5-4fc5-bce4-e85f5f14a8cd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.18626,
      "text": "M.Jones,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.049407914,
          "height": 0.009745432,
          "left": 0.03610011,
          "top": 0.5487017
        },
        "polygon": [
          { "x": 0.03610011, "y": 0.5487431 },
          { "x": 0.0854982, "y": 0.5487017 },
          { "x": 0.08550802, "y": 0.5584057 },
          { "x": 0.036109738, "y": 0.5584471 }
        ]
      },
      "id": "e4363bcf-7342-40ba-9b9d-9c10dda0d0fd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.76289,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020201929,
          "height": 0.0084777,
          "left": 0.08992543,
          "top": 0.54869586
        },
        "polygon": [
          { "x": 0.08992543, "y": 0.54871285 },
          { "x": 0.11011872, "y": 0.54869586 },
          { "x": 0.11012736, "y": 0.5571567 },
          { "x": 0.08993401, "y": 0.5571736 }
        ]
      },
      "id": "b660a5ae-48cf-4b46-8a91-5b2a326b745e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.72557,
      "text": "15",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013253963,
          "height": 0.008458799,
          "left": 0.11489722,
          "top": 0.54872686
        },
        "polygon": [
          { "x": 0.11489722, "y": 0.54873794 },
          { "x": 0.12814249, "y": 0.54872686 },
          { "x": 0.12815118, "y": 0.55717456 },
          { "x": 0.114905864, "y": 0.55718565 }
        ]
      },
      "id": "b0a097a3-691a-4047-946e-4077c3560eba",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.69585,
      "text": "T.Jones,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.046930626,
          "height": 0.009858702,
          "left": 0.13287057,
          "top": 0.54866505
        },
        "polygon": [
          { "x": 0.13287057, "y": 0.54870445 },
          { "x": 0.1797909, "y": 0.54866505 },
          { "x": 0.1798012, "y": 0.55848444 },
          { "x": 0.13288069, "y": 0.5585238 }
        ]
      },
      "id": "e5d6eea8-477a-4a3a-95b3-01aaaa710dd8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.86052,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0076300655,
          "height": 0.008619167,
          "left": 0.18426244,
          "top": 0.5486861
        },
        "polygon": [
          { "x": 0.18426244, "y": 0.54869246 },
          { "x": 0.19188343, "y": 0.5486861 },
          { "x": 0.1918925, "y": 0.55729884 },
          { "x": 0.18427148, "y": 0.5573053 }
        ]
      },
      "id": "ce453f1f-0b05-4a7e-b11c-5d3392c2fbca",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.0939,
      "text": "20",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014510805,
          "height": 0.008481742,
          "left": 0.19576833,
          "top": 0.548753
        },
        "polygon": [
          { "x": 0.19576833, "y": 0.5487652 },
          { "x": 0.21027014, "y": 0.548753 },
          { "x": 0.21027912, "y": 0.5572226 },
          { "x": 0.19577727, "y": 0.55723476 }
        ]
      },
      "id": "afad632a-d39e-4aef-b1f2-1e3e9afa80dd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.56494,
      "text": "D.Thomas,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.061401315,
          "height": 0.009931107,
          "left": 0.21465452,
          "top": 0.54854304
        },
        "polygon": [
          { "x": 0.21465452, "y": 0.54859453 },
          { "x": 0.2760451, "y": 0.54854304 },
          { "x": 0.27605584, "y": 0.5584226 },
          { "x": 0.21466503, "y": 0.5584741 }
        ]
      },
      "id": "fdaae1a4-8a83-493b-8e43-7adf5072e843",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.268,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015650896,
          "height": 0.008284798,
          "left": 0.2807619,
          "top": 0.5488359
        },
        "polygon": [
          { "x": 0.2807619, "y": 0.548849 },
          { "x": 0.29640374, "y": 0.5488359 },
          { "x": 0.2964128, "y": 0.55710757 },
          { "x": 0.2807709, "y": 0.5571207 }
        ]
      },
      "id": "4b888895-385f-43a6-adc3-6684c1c159d0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.987404,
      "text": "22",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014239888,
          "height": 0.008388399,
          "left": 0.30067688,
          "top": 0.5487558
        },
        "polygon": [
          { "x": 0.30067688, "y": 0.54876775 },
          { "x": 0.31490752, "y": 0.5487558 },
          { "x": 0.31491676, "y": 0.5571323 },
          { "x": 0.30068606, "y": 0.5571442 }
        ]
      },
      "id": "ac9d7d93-91df-4dc1-8414-9e38b311e94b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.72443,
      "text": "J.Hasty,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04480921,
          "height": 0.010281827,
          "left": 0.3190657,
          "top": 0.5487656
        },
        "polygon": [
          { "x": 0.3190657, "y": 0.5488032 },
          { "x": 0.3638634, "y": 0.5487656 },
          { "x": 0.3638749, "y": 0.55900985 },
          { "x": 0.319077, "y": 0.55904746 }
        ]
      },
      "id": "5c496843-dcb1-416d-8859-571fe3a7a0a3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.69161,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01574094,
          "height": 0.008377772,
          "left": 0.36893365,
          "top": 0.5487802
        },
        "polygon": [
          { "x": 0.36893365, "y": 0.54879344 },
          { "x": 0.38466513, "y": 0.5487802 },
          { "x": 0.38467458, "y": 0.5571448 },
          { "x": 0.36894304, "y": 0.557158 }
        ]
      },
      "id": "f09a246d-66cf-4995-b1c2-a54d1edab4cf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.2987,
      "text": "24",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014245012,
          "height": 0.008453476,
          "left": 0.38868508,
          "top": 0.54866797
        },
        "polygon": [
          { "x": 0.38868508, "y": 0.5486799 },
          { "x": 0.40292048, "y": 0.54866797 },
          { "x": 0.40293008, "y": 0.5571095 },
          { "x": 0.3886946, "y": 0.55712146 }
        ]
      },
      "id": "309d73b1-aaf9-49a3-99d1-955f0fa0b97a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.160255,
      "text": "S.Conner,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054562647,
          "height": 0.0097721815,
          "left": 0.40769705,
          "top": 0.5485934
        },
        "polygon": [
          { "x": 0.40769705, "y": 0.5486391 },
          { "x": 0.46224844, "y": 0.5485934 },
          { "x": 0.4622597, "y": 0.5583198 },
          { "x": 0.40770814, "y": 0.5583656 }
        ]
      },
      "id": "28d4afa6-77b2-4745-8e71-fd61ccadc677",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.78318,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0156020215,
          "height": 0.008268895,
          "left": 0.46729568,
          "top": 0.5487773
        },
        "polygon": [
          { "x": 0.46729568, "y": 0.54879034 },
          { "x": 0.48288807, "y": 0.5487773 },
          { "x": 0.4828977, "y": 0.5570331 },
          { "x": 0.46730527, "y": 0.5570462 }
        ]
      },
      "id": "6d5fcd3c-bff7-4e50-ba2b-c753755a75b6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.44766,
      "text": "25",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013875424,
          "height": 0.008264722,
          "left": 0.5064127,
          "top": 0.54883236
        },
        "polygon": [
          { "x": 0.5064127, "y": 0.548844 },
          { "x": 0.52027833, "y": 0.54883236 },
          { "x": 0.5202881, "y": 0.55708545 },
          { "x": 0.5064224, "y": 0.5570971 }
        ]
      },
      "id": "5e653b0c-55e0-4e12-9d0e-37a42c5ed0f9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.201904,
      "text": "T.Johnson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.062245112,
          "height": 0.009969265,
          "left": 0.52426296,
          "top": 0.54862714
        },
        "polygon": [
          { "x": 0.52426296, "y": 0.5486793 },
          { "x": 0.5864961, "y": 0.54862714 },
          { "x": 0.5865081, "y": 0.55854416 },
          { "x": 0.5242747, "y": 0.5585964 }
        ]
      },
      "id": "6905760f-f4d2-44ba-ac27-f0128738b975",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90935,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015885763,
          "height": 0.008210526,
          "left": 0.5912084,
          "top": 0.5488979
        },
        "polygon": [
          { "x": 0.5912084, "y": 0.5489112 },
          { "x": 0.60708416, "y": 0.5488979 },
          { "x": 0.60709417, "y": 0.5570951 },
          { "x": 0.5912183, "y": 0.55710846 }
        ]
      },
      "id": "516fb912-d037-4a1e-8f14-cd095a4b9775",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89661,
      "text": "30",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014072298,
          "height": 0.008462897,
          "left": 0.6112084,
          "top": 0.54871124
        },
        "polygon": [
          { "x": 0.6112084, "y": 0.54872304 },
          { "x": 0.6252703, "y": 0.54871124 },
          { "x": 0.6252807, "y": 0.55716234 },
          { "x": 0.6112187, "y": 0.55717415 }
        ]
      },
      "id": "2cd7cc85-d437-487a-9135-bbf429837bce",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.17042,
      "text": "M.Carter,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05197025,
          "height": 0.00993948,
          "left": 0.630169,
          "top": 0.54862064
        },
        "polygon": [
          { "x": 0.630169, "y": 0.5486642 },
          { "x": 0.68212694, "y": 0.54862064 },
          { "x": 0.6821392, "y": 0.55851656 },
          { "x": 0.63018113, "y": 0.55856013 }
        ]
      },
      "id": "071f5cd3-6e0f-486d-8ebd-506be91172fa",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.664825,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015759103,
          "height": 0.008121824,
          "left": 0.68705636,
          "top": 0.5489321
        },
        "polygon": [
          { "x": 0.68705636, "y": 0.54894525 },
          { "x": 0.70280534, "y": 0.5489321 },
          { "x": 0.7028155, "y": 0.5570407 },
          { "x": 0.6870665, "y": 0.55705386 }
        ]
      },
      "id": "a85bdd16-2c6e-4210-b04b-53f826c68e52",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.05181,
      "text": "32",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013758435,
          "height": 0.008350613,
          "left": 0.70687544,
          "top": 0.54874957
        },
        "polygon": [
          { "x": 0.70687544, "y": 0.5487611 },
          { "x": 0.7206233, "y": 0.54874957 },
          { "x": 0.72063386, "y": 0.5570887 },
          { "x": 0.7068859, "y": 0.5571002 }
        ]
      },
      "id": "553830bc-a9a3-471f-9009-347e81236cc1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.99796,
      "text": "Mi.Carter,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.055639535,
          "height": 0.009989384,
          "left": 0.7251437,
          "top": 0.54860806
        },
        "polygon": [
          { "x": 0.7251437, "y": 0.54865474 },
          { "x": 0.7807704, "y": 0.54860806 },
          { "x": 0.7807832, "y": 0.5585508 },
          { "x": 0.72515625, "y": 0.55859745 }
        ]
      },
      "id": "b07ec54c-f6dd-4fc1-af17-599117cc3831",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.0219,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015842626,
          "height": 0.008293095,
          "left": 0.7851694,
          "top": 0.54876935
        },
        "polygon": [
          { "x": 0.7851694, "y": 0.54878265 },
          { "x": 0.80100137, "y": 0.54876935 },
          { "x": 0.80101204, "y": 0.55704916 },
          { "x": 0.7851801, "y": 0.55706245 }
        ]
      },
      "id": "c687d06e-a4ca-4433-84c4-c8873a159b45",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.36877,
      "text": "34",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014359105,
          "height": 0.008246633,
          "left": 0.80509883,
          "top": 0.5488144
        },
        "polygon": [
          { "x": 0.80509883, "y": 0.54882646 },
          { "x": 0.8194472, "y": 0.5488144 },
          { "x": 0.8194579, "y": 0.55704904 },
          { "x": 0.80510944, "y": 0.5570611 }
        ]
      },
      "id": "20fd6981-d9ac-4715-8ca2-47ba44cb8ba3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.70663,
      "text": "J.Hardee,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054335013,
          "height": 0.00992854,
          "left": 0.8232097,
          "top": 0.5486389
        },
        "polygon": [
          { "x": 0.8232097, "y": 0.5486844 },
          { "x": 0.87753165, "y": 0.5486389 },
          { "x": 0.87754476, "y": 0.55852187 },
          { "x": 0.8232226, "y": 0.5585674 }
        ]
      },
      "id": "b4956f4a-73ee-4fbf-8a2d-856c33b310fa",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.69881,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015795523,
          "height": 0.008360005,
          "left": 0.88211745,
          "top": 0.5487543
        },
        "polygon": [
          { "x": 0.88211745, "y": 0.5487675 },
          { "x": 0.8979019, "y": 0.5487543 },
          { "x": 0.897913, "y": 0.5571011 },
          { "x": 0.88212854, "y": 0.5571143 }
        ]
      },
      "id": "3aa1b25a-7ab8-41bd-9396-cda0c2a2cfbf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.642975,
      "text": "37",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014313512,
          "height": 0.008382435,
          "left": 0.9017208,
          "top": 0.54878086
        },
        "polygon": [
          { "x": 0.9017208, "y": 0.54879284 },
          { "x": 0.91602314, "y": 0.54878086 },
          { "x": 0.91603434, "y": 0.55715126 },
          { "x": 0.901732, "y": 0.5571633 }
        ]
      },
      "id": "3b73373d-ce35-4f51-9262-fb518bca4f30",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.57022,
      "text": "B.Hall,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.036085386,
          "height": 0.009950729,
          "left": 0.9205839,
          "top": 0.5485938
        },
        "polygon": [
          { "x": 0.9205839, "y": 0.5486241 },
          { "x": 0.95665586, "y": 0.5485938 },
          { "x": 0.95666933, "y": 0.5585143 },
          { "x": 0.9205972, "y": 0.5585445 }
        ]
      },
      "id": "11fdb6f2-2fbf-45f2-991a-50a9d0853174",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 90.16445,
      "text": "29",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014245532,
          "height": 0.008246059,
          "left": 0.035502147,
          "top": 0.5609658
        },
        "polygon": [
          { "x": 0.035502147, "y": 0.5609777 },
          { "x": 0.04973946, "y": 0.5609658 },
          { "x": 0.04974768, "y": 0.56919986 },
          { "x": 0.035510316, "y": 0.56921184 }
        ]
      },
      "id": "38e77ae7-c34b-4014-9e5f-f8545a3ff221",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.302185,
      "text": "Te.Campbell,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07508788,
          "height": 0.010536706,
          "left": 0.052762214,
          "top": 0.56072724
        },
        "polygon": [
          { "x": 0.052762214, "y": 0.5607902 },
          { "x": 0.12783933, "y": 0.56072724 },
          { "x": 0.1278501, "y": 0.571201 },
          { "x": 0.05277268, "y": 0.57126397 }
        ]
      },
      "id": "87f0d396-8f7a-42f3-8754-a71fde4add04",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.487144,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015600796,
          "height": 0.008102746,
          "left": 0.13327567,
          "top": 0.5609972
        },
        "polygon": [
          { "x": 0.13327567, "y": 0.56101024 },
          { "x": 0.14886808, "y": 0.5609972 },
          { "x": 0.14887647, "y": 0.56908685 },
          { "x": 0.13328402, "y": 0.5690999 }
        ]
      },
      "id": "5baae64f-cfc5-4276-a502-083b0b76254a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.89837,
      "text": "37",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0140717905,
          "height": 0.00829058,
          "left": 0.15304706,
          "top": 0.56086475
        },
        "polygon": [
          { "x": 0.15304706, "y": 0.5608765 },
          { "x": 0.1671102, "y": 0.56086475 },
          { "x": 0.16711885, "y": 0.56914353 },
          { "x": 0.15305565, "y": 0.5691553 }
        ]
      },
      "id": "12eb59bf-eba6-4532-9fee-f380ee637bec",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.88373,
      "text": "T.Herndon,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06479308,
          "height": 0.009673333,
          "left": 0.17069252,
          "top": 0.56096447
        },
        "polygon": [
          { "x": 0.17069252, "y": 0.56101876 },
          { "x": 0.23547529, "y": 0.56096447 },
          { "x": 0.2354856, "y": 0.57058346 },
          { "x": 0.17070258, "y": 0.57063776 }
        ]
      },
      "id": "3d598bb2-7a1a-4546-a921-0e6f21fb2dd6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.61732,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020276405,
          "height": 0.008089203,
          "left": 0.23981923,
          "top": 0.5609905
        },
        "polygon": [
          { "x": 0.23981923, "y": 0.5610075 },
          { "x": 0.26008692, "y": 0.5609905 },
          { "x": 0.26009563, "y": 0.5690627 },
          { "x": 0.2398279, "y": 0.5690797 }
        ]
      },
      "id": "26ead6d2-8f70-4398-ae89-45100c98def5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.063705,
      "text": "39",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01425003,
          "height": 0.0082773,
          "left": 0.26404476,
          "top": 0.56090236
        },
        "polygon": [
          { "x": 0.26404476, "y": 0.56091434 },
          { "x": 0.2782858, "y": 0.56090236 },
          { "x": 0.2782948, "y": 0.56916773 },
          { "x": 0.2640537, "y": 0.5691797 }
        ]
      },
      "id": "6e65ec36-3dfc-476c-8f2b-13d960ae93bc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.84582,
      "text": "J.Agnew,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.051909097,
          "height": 0.010231357,
          "left": 0.2820869,
          "top": 0.560996
        },
        "polygon": [
          { "x": 0.2820869, "y": 0.56103957 },
          { "x": 0.3339847, "y": 0.560996 },
          { "x": 0.333996, "y": 0.57118386 },
          { "x": 0.282098, "y": 0.5712274 }
        ]
      },
      "id": "729571fd-55ab-426b-ad55-ade24c61fc60",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.651184,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007682046,
          "height": 0.008360413,
          "left": 0.33859438,
          "top": 0.5609869
        },
        "polygon": [
          { "x": 0.33859438, "y": 0.5609933 },
          { "x": 0.34626713, "y": 0.5609869 },
          { "x": 0.34627643, "y": 0.5693408 },
          { "x": 0.33860368, "y": 0.56934726 }
        ]
      },
      "id": "b8c8a292-eb97-4d03-8d1c-7444dc9088bf",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.31928,
      "text": "42",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014064115,
          "height": 0.008266116,
          "left": 0.35012436,
          "top": 0.56087816
        },
        "polygon": [
          { "x": 0.35012436, "y": 0.56088996 },
          { "x": 0.36417922, "y": 0.56087816 },
          { "x": 0.36418846, "y": 0.56913245 },
          { "x": 0.35013357, "y": 0.56914425 }
        ]
      },
      "id": "2f445483-eda4-413b-bf09-c89163d33722",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.46736,
      "text": "A.Wingard,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0618204,
          "height": 0.010164478,
          "left": 0.36918697,
          "top": 0.56094104
        },
        "polygon": [
          { "x": 0.36918697, "y": 0.56099284 },
          { "x": 0.43099576, "y": 0.56094104 },
          { "x": 0.43100736, "y": 0.5710537 },
          { "x": 0.36919832, "y": 0.57110554 }
        ]
      },
      "id": "a17be720-4134-4414-be4c-8058492cce83",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.61086,
      "text": "OLB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023173902,
          "height": 0.008202309,
          "left": 0.43639818,
          "top": 0.56090254
        },
        "polygon": [
          { "x": 0.43639818, "y": 0.56092197 },
          { "x": 0.4595626, "y": 0.56090254 },
          { "x": 0.4595721, "y": 0.5690854 },
          { "x": 0.4364076, "y": 0.56910485 }
        ]
      },
      "id": "b2636768-0285-46d6-99b3-4450266594ee",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.847435,
      "text": "45",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014055371,
          "height": 0.008205218,
          "left": 0.4637656,
          "top": 0.5609781
        },
        "polygon": [
          { "x": 0.4637656, "y": 0.5609899 },
          { "x": 0.4778114, "y": 0.5609781 },
          { "x": 0.47782096, "y": 0.56917155 },
          { "x": 0.4637751, "y": 0.56918335 }
        ]
      },
      "id": "400ece21-1afa-4b29-b849-a12583137643",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.95147,
      "text": "LS",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013197228,
          "height": 0.008035474,
          "left": 0.5068501,
          "top": 0.561025
        },
        "polygon": [
          { "x": 0.5068501, "y": 0.56103605 },
          { "x": 0.5200379, "y": 0.561025 },
          { "x": 0.52004737, "y": 0.5690494 },
          { "x": 0.5068596, "y": 0.5690605 }
        ]
      },
      "id": "4e59678a-84dd-45c5-a993-1a3de51e1135",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.610214,
      "text": "42",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014400779,
          "height": 0.008021901,
          "left": 0.524117,
          "top": 0.5610206
        },
        "polygon": [
          { "x": 0.524117, "y": 0.56103265 },
          { "x": 0.53850824, "y": 0.5610206 },
          { "x": 0.5385178, "y": 0.5690304 },
          { "x": 0.5241265, "y": 0.5690425 }
        ]
      },
      "id": "9330d5e4-1079-4619-9920-e26b29e64051",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.49134,
      "text": "T.Hennessy,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06995735,
          "height": 0.010372342,
          "left": 0.5426635,
          "top": 0.5608729
        },
        "polygon": [
          { "x": 0.5426635, "y": 0.56093156 },
          { "x": 0.6126083, "y": 0.5608729 },
          { "x": 0.6126209, "y": 0.5711866 },
          { "x": 0.5426758, "y": 0.57124525 }
        ]
      },
      "id": "d7410c69-1724-4751-8804-6a9ed7139c1a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.729126,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014044985,
          "height": 0.008215782,
          "left": 0.6175424,
          "top": 0.56092376
        },
        "polygon": [
          { "x": 0.6175424, "y": 0.56093556 },
          { "x": 0.6315773, "y": 0.56092376 },
          { "x": 0.6315873, "y": 0.5691278 },
          { "x": 0.6175524, "y": 0.56913954 }
        ]
      },
      "id": "c386e065-a7c9-4031-9724-353d1b35a797",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.55146,
      "text": "44",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01450774,
          "height": 0.00784882,
          "left": 0.6355365,
          "top": 0.5610223
        },
        "polygon": [
          { "x": 0.6355365, "y": 0.56103444 },
          { "x": 0.65003455, "y": 0.5610223 },
          { "x": 0.6500442, "y": 0.5688589 },
          { "x": 0.6355461, "y": 0.5688711 }
        ]
      },
      "id": "1094f04c-0a63-4e1b-97fa-2da98bdac202",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.04408,
      "text": "J.Sherwood,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.069800705,
          "height": 0.009932887,
          "left": 0.65382344,
          "top": 0.5607
        },
        "polygon": [
          { "x": 0.65382344, "y": 0.56075853 },
          { "x": 0.72361165, "y": 0.5607 },
          { "x": 0.7236241, "y": 0.5705744 },
          { "x": 0.6538356, "y": 0.5706329 }
        ]
      },
      "id": "982067f9-44da-4cc6-adc9-1e661c732f22",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.09122,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013962827,
          "height": 0.008047595,
          "left": 0.72876483,
          "top": 0.56101155
        },
        "polygon": [
          { "x": 0.72876483, "y": 0.56102324 },
          { "x": 0.74271744, "y": 0.56101155 },
          { "x": 0.74272764, "y": 0.56904745 },
          { "x": 0.72877496, "y": 0.56905913 }
        ]
      },
      "id": "60a452c8-5599-4b59-bcc7-023cbb591c4d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.533295,
      "text": "45",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014432659,
          "height": 0.008200237,
          "left": 0.74666023,
          "top": 0.5609401
        },
        "polygon": [
          { "x": 0.74666023, "y": 0.5609522 },
          { "x": 0.7610824, "y": 0.5609401 },
          { "x": 0.7610929, "y": 0.5691282 },
          { "x": 0.74667066, "y": 0.5691403 }
        ]
      },
      "id": "f2b7c57f-1ef3-4758-ac67-51c3edb79b80",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.745,
      "text": "H.Nasirildeen,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.079207204,
          "height": 0.010053889,
          "left": 0.76538444,
          "top": 0.56081814
        },
        "polygon": [
          { "x": 0.76538444, "y": 0.56088454 },
          { "x": 0.84457856, "y": 0.56081814 },
          { "x": 0.8445916, "y": 0.5708056 },
          { "x": 0.7653972, "y": 0.570872 }
        ]
      },
      "id": "52a29865-3f06-4b90-b4f8-37d60c3033ba",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.904205,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015569767,
          "height": 0.00824887,
          "left": 0.8495591,
          "top": 0.5609429
        },
        "polygon": [
          { "x": 0.8495591, "y": 0.56095594 },
          { "x": 0.865118, "y": 0.5609429 },
          { "x": 0.8651289, "y": 0.56917876 },
          { "x": 0.8495699, "y": 0.56919175 }
        ]
      },
      "id": "ad6340ba-5a4f-4516-8195-54c35758d05d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84534,
      "text": "47",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01436518,
          "height": 0.008304451,
          "left": 0.8686607,
          "top": 0.56079674
        },
        "polygon": [
          { "x": 0.8686607, "y": 0.5608088 },
          { "x": 0.88301486, "y": 0.56079674 },
          { "x": 0.8830259, "y": 0.5690891 },
          { "x": 0.86867166, "y": 0.56910115 }
        ]
      },
      "id": "751bf5d5-38b3-4aff-938a-c1836f07da25",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.21277,
      "text": "B.Huff,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.038559247,
          "height": 0.00991952,
          "left": 0.88768256,
          "top": 0.5607412
        },
        "polygon": [
          { "x": 0.88768256, "y": 0.56077355 },
          { "x": 0.9262285, "y": 0.5607412 },
          { "x": 0.9262418, "y": 0.5706284 },
          { "x": 0.88769567, "y": 0.5706607 }
        ]
      },
      "id": "c37466a5-a2ab-4b3b-a6c7-1d5bb50635f1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.74643,
      "text": "DE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016323837,
          "height": 0.008165427,
          "left": 0.9312573,
          "top": 0.56094384
        },
        "polygon": [
          { "x": 0.9312573, "y": 0.56095755 },
          { "x": 0.9475701, "y": 0.56094384 },
          { "x": 0.9475811, "y": 0.5690956 },
          { "x": 0.9312682, "y": 0.56910926 }
        ]
      },
      "id": "4d01c2e9-f7fc-4788-983e-24bc4818acd1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.77496,
      "text": "K.Chaisson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06598673,
          "height": 0.010175411,
          "left": 0.035652995,
          "top": 0.5727724
        },
        "polygon": [
          { "x": 0.035652995, "y": 0.5728277 },
          { "x": 0.10162941, "y": 0.5727724 },
          { "x": 0.101639725, "y": 0.58289254 },
          { "x": 0.03566304, "y": 0.5829478 }
        ]
      },
      "id": "eecc22d2-e6cf-4126-b315-d2787a9ae97d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.94532,
      "text": "LS",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013862152,
          "height": 0.008312799,
          "left": 0.10636306,
          "top": 0.5730627
        },
        "polygon": [
          { "x": 0.10636306, "y": 0.5730743 },
          { "x": 0.1202167, "y": 0.5730627 },
          { "x": 0.12022521, "y": 0.58136386 },
          { "x": 0.10637153, "y": 0.5813755 }
        ]
      },
      "id": "39e5721b-fc04-4a1b-8f9e-52d9b2d6e9b0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.34448,
      "text": "46",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014657615,
          "height": 0.008203633,
          "left": 0.12367195,
          "top": 0.57314104
        },
        "polygon": [
          { "x": 0.12367195, "y": 0.5731533 },
          { "x": 0.1383211, "y": 0.57314104 },
          { "x": 0.13832957, "y": 0.5813324 },
          { "x": 0.12368036, "y": 0.58134466 }
        ]
      },
      "id": "040165f8-8abc-47b1-b206-d4775643b8d4",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 94.050446,
      "text": "R.Matiscik,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06042651,
          "height": 0.009957615,
          "left": 0.1428484,
          "top": 0.5728885
        },
        "polygon": [
          { "x": 0.1428484, "y": 0.57293916 },
          { "x": 0.20326443, "y": 0.5728885 },
          { "x": 0.20327492, "y": 0.58279544 },
          { "x": 0.14285865, "y": 0.5828461 }
        ]
      },
      "id": "c38a6c16-439c-4836-b942-87421d03bf99",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.76851,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014791412,
          "height": 0.008362644,
          "left": 0.20802143,
          "top": 0.5731834
        },
        "polygon": [
          { "x": 0.20802143, "y": 0.5731958 },
          { "x": 0.22280395, "y": 0.5731834 },
          { "x": 0.22281285, "y": 0.5815337 },
          { "x": 0.20803028, "y": 0.58154607 }
        ]
      },
      "id": "cf12a6ec-1acf-4e43-8c4e-4fc8a1a7fd6b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.34344,
      "text": "48",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014489885,
          "height": 0.008280179,
          "left": 0.22628842,
          "top": 0.57307416
        },
        "polygon": [
          { "x": 0.22628842, "y": 0.5730863 },
          { "x": 0.24076945, "y": 0.57307416 },
          { "x": 0.24077831, "y": 0.5813422 },
          { "x": 0.22629726, "y": 0.5813544 }
        ]
      },
      "id": "7ab50056-5689-4dca-9f29-8446665c155a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.41147,
      "text": "C.Muma,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04985977,
          "height": 0.009952644,
          "left": 0.24524966,
          "top": 0.57303
        },
        "polygon": [
          { "x": 0.24524966, "y": 0.5730718 },
          { "x": 0.29509857, "y": 0.57303 },
          { "x": 0.29510942, "y": 0.5829408 },
          { "x": 0.2452603, "y": 0.5829826 }
        ]
      },
      "id": "a40f764b-5f53-4e6d-95f4-84c05fa9252f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.67435,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014533994,
          "height": 0.008274482,
          "left": 0.29970652,
          "top": 0.5730337
        },
        "polygon": [
          { "x": 0.29970652, "y": 0.5730459 },
          { "x": 0.3142314, "y": 0.5730337 },
          { "x": 0.31424052, "y": 0.581296 },
          { "x": 0.29971558, "y": 0.5813082 }
        ]
      },
      "id": "4b402943-75b0-4118-a441-3ed696087622",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84391,
      "text": "50",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014202737,
          "height": 0.008059059,
          "left": 0.31798968,
          "top": 0.5732559
        },
        "polygon": [
          { "x": 0.31798968, "y": 0.5732678 },
          { "x": 0.3321835, "y": 0.5732559 },
          { "x": 0.33219242, "y": 0.58130306 },
          { "x": 0.31799856, "y": 0.581315 }
        ]
      },
      "id": "41f1e617-caac-431f-b2b7-9dc9ff5bd85e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.800606,
      "text": "S.Quarterman,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.08338503,
          "height": 0.01046366,
          "left": 0.33668283,
          "top": 0.5727841
        },
        "polygon": [
          { "x": 0.33668283, "y": 0.57285404 },
          { "x": 0.42005596, "y": 0.5727841 },
          { "x": 0.42006785, "y": 0.5831779 },
          { "x": 0.33669436, "y": 0.5832478 }
        ]
      },
      "id": "298aff64-2592-4196-87a4-8aacaf6815a6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.82895,
      "text": "LB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014272092,
          "height": 0.008289354,
          "left": 0.42465997,
          "top": 0.5731245
        },
        "polygon": [
          { "x": 0.42465997, "y": 0.5731365 },
          { "x": 0.43892252, "y": 0.5731245 },
          { "x": 0.43893206, "y": 0.58140194 },
          { "x": 0.42466944, "y": 0.5814139 }
        ]
      },
      "id": "09903614-1a4b-4694-b4ea-636f160b79c9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.200516,
      "text": "57",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013999119,
          "height": 0.008309986,
          "left": 0.44317076,
          "top": 0.57303995
        },
        "polygon": [
          { "x": 0.44317076, "y": 0.57305163 },
          { "x": 0.4571603, "y": 0.57303995 },
          { "x": 0.4571699, "y": 0.58133817 },
          { "x": 0.44318032, "y": 0.5813499 }
        ]
      },
      "id": "f50e86b0-4d08-4ea6-950f-788341f9eb7f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81335,
      "text": "52",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013607,
          "height": 0.008286649,
          "left": 0.5066914,
          "top": 0.5731259
        },
        "polygon": [
          { "x": 0.5066914, "y": 0.57313734 },
          { "x": 0.5202886, "y": 0.5731259 },
          { "x": 0.5202984, "y": 0.58140117 },
          { "x": 0.5067011, "y": 0.58141255 }
        ]
      },
      "id": "71887105-179a-447d-b1d0-55ea3a735d47",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.90669,
      "text": "J.Johnson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05939241,
          "height": 0.0100998515,
          "left": 0.52491605,
          "top": 0.5728773
        },
        "polygon": [
          { "x": 0.52491605, "y": 0.57292706 },
          { "x": 0.58429635, "y": 0.5728773 },
          { "x": 0.5843085, "y": 0.58292735 },
          { "x": 0.524928, "y": 0.5829771 }
        ]
      },
      "id": "93ab661e-5eba-426e-8ef2-e3aa82655942",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.7723,
      "text": "OL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016357334,
          "height": 0.008349343,
          "left": 0.58902514,
          "top": 0.5730557
        },
        "polygon": [
          { "x": 0.58902514, "y": 0.5730694 },
          { "x": 0.60537237, "y": 0.5730557 },
          { "x": 0.6053825, "y": 0.58139133 },
          { "x": 0.5890352, "y": 0.58140504 }
        ]
      },
      "id": "37c9f79c-dcac-4eb4-a49d-7569f30e15e5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.70139,
      "text": "66",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014356919,
          "height": 0.00862564,
          "left": 0.6091625,
          "top": 0.5728637
        },
        "polygon": [
          { "x": 0.6091625, "y": 0.5728757 },
          { "x": 0.62350893, "y": 0.5728637 },
          { "x": 0.6235194, "y": 0.5814773 },
          { "x": 0.609173, "y": 0.5814893 }
        ]
      },
      "id": "76749e00-4623-453b-a2e6-6bf99078d43c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.456764,
      "text": "L.Duvernay-Tardif,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.106550165,
          "height": 0.010480402,
          "left": 0.62760377,
          "top": 0.5728438
        },
        "polygon": [
          { "x": 0.62760377, "y": 0.5729331 },
          { "x": 0.73414075, "y": 0.5728438 },
          { "x": 0.7341539, "y": 0.58323485 },
          { "x": 0.62761647, "y": 0.5833242 }
        ]
      },
      "id": "7a22a712-12a1-4085-997c-e5f617eb0688",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.71993,
      "text": "OL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015899014,
          "height": 0.008330402,
          "left": 0.73910075,
          "top": 0.57308567
        },
        "polygon": [
          { "x": 0.73910075, "y": 0.573099 },
          { "x": 0.7549892, "y": 0.57308567 },
          { "x": 0.7549998, "y": 0.5814028 },
          { "x": 0.7391113, "y": 0.5814161 }
        ]
      },
      "id": "c3c9883e-c7ff-4e3e-9cf7-d49aef9b561a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.98176,
      "text": "67",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0141488975,
          "height": 0.008447207,
          "left": 0.7590162,
          "top": 0.5729401
        },
        "polygon": [
          { "x": 0.7590162, "y": 0.5729519 },
          { "x": 0.7731543, "y": 0.5729401 },
          { "x": 0.7731651, "y": 0.5813754 },
          { "x": 0.759027, "y": 0.5813873 }
        ]
      },
      "id": "b4da4ca3-05da-4518-ae5c-e7c3b58d4c94",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.584076,
      "text": "D.Feeney,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.056679077,
          "height": 0.010436133,
          "left": 0.77786225,
          "top": 0.5729069
        },
        "polygon": [
          { "x": 0.77786225, "y": 0.5729544 },
          { "x": 0.83452773, "y": 0.5729069 },
          { "x": 0.8345413, "y": 0.5832956 },
          { "x": 0.7778756, "y": 0.583343 }
        ]
      },
      "id": "cba0d89f-7916-4c3e-89e4-341a382d6beb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.83789,
      "text": "OL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016046666,
          "height": 0.008417481,
          "left": 0.83916736,
          "top": 0.5730693
        },
        "polygon": [
          { "x": 0.83916736, "y": 0.57308275 },
          { "x": 0.855203, "y": 0.5730693 },
          { "x": 0.855214, "y": 0.58147335 },
          { "x": 0.8391783, "y": 0.58148676 }
        ]
      },
      "id": "1bcd74f7-2213-4f14-8352-6a8dd87138ae",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89812,
      "text": "68",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014182617,
          "height": 0.008539446,
          "left": 0.859187,
          "top": 0.572919
        },
        "polygon": [
          { "x": 0.859187, "y": 0.5729309 },
          { "x": 0.87335837, "y": 0.572919 },
          { "x": 0.87336963, "y": 0.5814466 },
          { "x": 0.8591982, "y": 0.58145845 }
        ]
      },
      "id": "88323cbd-8a21-459b-84d8-1549630afef6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.161606,
      "text": "M.Remmers,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07122205,
          "height": 0.010059432,
          "left": 0.87806237,
          "top": 0.57287943
        },
        "polygon": [
          { "x": 0.87806237, "y": 0.57293916 },
          { "x": 0.94927096, "y": 0.57287943 },
          { "x": 0.94928443, "y": 0.5828792 },
          { "x": 0.8780756, "y": 0.5829389 }
        ]
      },
      "id": "724f86a5-439d-488f-aca1-3b62e3744c1c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.79331,
      "text": "C.Johnson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.062456805,
          "height": 0.009974414,
          "left": 0.035605323,
          "top": 0.58499193
        },
        "polygon": [
          { "x": 0.035605323, "y": 0.58504426 },
          { "x": 0.09805204, "y": 0.58499193 },
          { "x": 0.09806213, "y": 0.594914 },
          { "x": 0.03561517, "y": 0.59496635 }
        ]
      },
      "id": "b36e634c-0ce9-485a-96c0-bff6f2588065",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.627846,
      "text": "OT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01713438,
          "height": 0.008422928,
          "left": 0.10256641,
          "top": 0.5851485
        },
        "polygon": [
          { "x": 0.10256641, "y": 0.5851628 },
          { "x": 0.11969217, "y": 0.5851485 },
          { "x": 0.11970079, "y": 0.59355706 },
          { "x": 0.102574974, "y": 0.5935714 }
        ]
      },
      "id": "17b90255-df6b-45c6-b664-83cb245cdda0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88286,
      "text": "64",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014348416,
          "height": 0.008603805,
          "left": 0.12342912,
          "top": 0.5850581
        },
        "polygon": [
          { "x": 0.12342912, "y": 0.58507013 },
          { "x": 0.13776867, "y": 0.5850581 },
          { "x": 0.13777754, "y": 0.59364986 },
          { "x": 0.12343794, "y": 0.5936619 }
        ]
      },
      "id": "61100e3f-8d65-49ff-af98-559afe637adb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 93.12942,
      "text": "C.Cronk,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04841827,
          "height": 0.009880166,
          "left": 0.14211953,
          "top": 0.58506876
        },
        "polygon": [
          { "x": 0.14211953, "y": 0.5851093 },
          { "x": 0.19052742, "y": 0.58506876 },
          { "x": 0.1905378, "y": 0.59490836 },
          { "x": 0.1421297, "y": 0.5949489 }
        ]
      },
      "id": "0199c5ec-831a-4d72-a4a6-d68059dd8308",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8533,
      "text": "OL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015964132,
          "height": 0.008263235,
          "left": 0.1951283,
          "top": 0.58525443
        },
        "polygon": [
          { "x": 0.1951283, "y": 0.58526784 },
          { "x": 0.21108368, "y": 0.58525443 },
          { "x": 0.21109243, "y": 0.5935043 },
          { "x": 0.19513701, "y": 0.59351766 }
        ]
      },
      "id": "a16b025c-d8af-488d-a9c9-c3bf7b0e7a68",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.7547,
      "text": "70",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0141941765,
          "height": 0.008193106,
          "left": 0.21510087,
          "top": 0.585252
        },
        "polygon": [
          { "x": 0.21510087, "y": 0.5852639 },
          { "x": 0.22928631, "y": 0.585252 },
          { "x": 0.22929505, "y": 0.59343326 },
          { "x": 0.21510957, "y": 0.5934451 }
        ]
      },
      "id": "ce6c5b79-8e22-4d19-9ec5-35f0d117e7b0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.229416,
      "text": "C.Van",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03328423,
          "height": 0.008219784,
          "left": 0.23373282,
          "top": 0.5851995
        },
        "polygon": [
          { "x": 0.23373282, "y": 0.5852274 },
          { "x": 0.2670082, "y": 0.5851995 },
          { "x": 0.26701707, "y": 0.5933914 },
          { "x": 0.2337416, "y": 0.59341925 }
        ]
      },
      "id": "ced42e4e-325a-4a18-84ea-a6db3d42b793",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.830666,
      "text": "Lanen,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037410118,
          "height": 0.009535096,
          "left": 0.2716139,
          "top": 0.5852561
        },
        "polygon": [
          { "x": 0.2716139, "y": 0.58528745 },
          { "x": 0.30901355, "y": 0.5852561 },
          { "x": 0.309024, "y": 0.5947598 },
          { "x": 0.2716242, "y": 0.5947912 }
        ]
      },
      "id": "e55ade3a-3966-46b5-ba83-cc771492f017",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.749695,
      "text": "OL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016224148,
          "height": 0.008155222,
          "left": 0.31396252,
          "top": 0.5853657
        },
        "polygon": [
          { "x": 0.31396252, "y": 0.5853793 },
          { "x": 0.33017766, "y": 0.5853657 },
          { "x": 0.33018667, "y": 0.59350735 },
          { "x": 0.3139715, "y": 0.59352094 }
        ]
      },
      "id": "471313d5-66d9-4582-830d-57519a61dd26",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.34304,
      "text": "73",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013849912,
          "height": 0.008265801,
          "left": 0.33388203,
          "top": 0.5852852
        },
        "polygon": [
          { "x": 0.33388203, "y": 0.5852968 },
          { "x": 0.34772274, "y": 0.5852852 },
          { "x": 0.34773195, "y": 0.5935394 },
          { "x": 0.33389118, "y": 0.593551 }
        ]
      },
      "id": "008a3ff1-8b92-4125-a07e-f05c7bad8111",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.835495,
      "text": "B.Hance,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050423577,
          "height": 0.009810219,
          "left": 0.35244572,
          "top": 0.58511716
        },
        "polygon": [
          { "x": 0.35244572, "y": 0.5851594 },
          { "x": 0.4028582, "y": 0.58511716 },
          { "x": 0.4028693, "y": 0.5948851 },
          { "x": 0.35245663, "y": 0.5949274 }
        ]
      },
      "id": "d8ec2884-4238-4844-be17-673ebc2e78f8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.17481,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015110703,
          "height": 0.008182779,
          "left": 0.40746823,
          "top": 0.58521146
        },
        "polygon": [
          { "x": 0.40746823, "y": 0.5852241 },
          { "x": 0.4225696, "y": 0.58521146 },
          { "x": 0.42257893, "y": 0.5933816 },
          { "x": 0.40747753, "y": 0.5933942 }
        ]
      },
      "id": "e38b6bf7-ab52-4377-be33-df3267230fb2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.3617,
      "text": "85",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013705935,
          "height": 0.008232204,
          "left": 0.42692026,
          "top": 0.58523923
        },
        "polygon": [
          { "x": 0.42692026, "y": 0.58525074 },
          { "x": 0.44061676, "y": 0.58523923 },
          { "x": 0.4406262, "y": 0.59345996 },
          { "x": 0.42692968, "y": 0.5934714 }
        ]
      },
      "id": "145c7e10-c4c9-49fa-be27-d0736af69c5a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.04861,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015367832,
          "height": 0.007880346,
          "left": 0.5066499,
          "top": 0.58542997
        },
        "polygon": [
          { "x": 0.5066499, "y": 0.58544284 },
          { "x": 0.5220084, "y": 0.58542997 },
          { "x": 0.5220177, "y": 0.5932974 },
          { "x": 0.50665915, "y": 0.5933103 }
        ]
      },
      "id": "b28b7d27-7f88-4682-8463-0d3a3b2beafe",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.330315,
      "text": "72",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014660704,
          "height": 0.007979367,
          "left": 0.5255931,
          "top": 0.58539885
        },
        "polygon": [
          { "x": 0.5255931, "y": 0.58541113 },
          { "x": 0.54024434, "y": 0.58539885 },
          { "x": 0.5402538, "y": 0.5933659 },
          { "x": 0.5256025, "y": 0.5933782 }
        ]
      },
      "id": "b0ce0f4e-01e4-428b-bcc8-a7e6944f9281",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.99569,
      "text": "M.Clemons,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.066161245,
          "height": 0.009944523,
          "left": 0.5443022,
          "top": 0.5850575
        },
        "polygon": [
          { "x": 0.5443022, "y": 0.585113 },
          { "x": 0.6104514, "y": 0.5850575 },
          { "x": 0.61046344, "y": 0.5949466 },
          { "x": 0.544314, "y": 0.59500206 }
        ]
      },
      "id": "613c4317-1e92-4d13-8022-8fc24ba08676",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.93296,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015128211,
          "height": 0.00826577,
          "left": 0.6147413,
          "top": 0.58516175
        },
        "polygon": [
          { "x": 0.6147413, "y": 0.5851744 },
          { "x": 0.62985945, "y": 0.58516175 },
          { "x": 0.6298695, "y": 0.59341484 },
          { "x": 0.6147514, "y": 0.5934275 }
        ]
      },
      "id": "8f2527ff-15bc-4084-ba59-01d9bc72a556",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.045044,
      "text": "83",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013573373,
          "height": 0.008245199,
          "left": 0.63415414,
          "top": 0.58521116
        },
        "polygon": [
          { "x": 0.63415414, "y": 0.5852225 },
          { "x": 0.6477174, "y": 0.58521116 },
          { "x": 0.64772755, "y": 0.59344494 },
          { "x": 0.6341643, "y": 0.5934563 }
        ]
      },
      "id": "3c30aab6-8a36-4194-be0e-cdf59491c326",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 96.41651,
      "text": "T.Conklin,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.057561096,
          "height": 0.009661964,
          "left": 0.6516153,
          "top": 0.5851307
        },
        "polygon": [
          { "x": 0.6516153, "y": 0.5851789 },
          { "x": 0.7091643, "y": 0.5851307 },
          { "x": 0.7091764, "y": 0.59474444 },
          { "x": 0.6516272, "y": 0.59479266 }
        ]
      },
      "id": "05cf011f-f731-4891-b379-758343c460a1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.602036,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020309044,
          "height": 0.008076037,
          "left": 0.71359444,
          "top": 0.58527124
        },
        "polygon": [
          { "x": 0.71359444, "y": 0.5852883 },
          { "x": 0.7338933, "y": 0.58527124 },
          { "x": 0.7339035, "y": 0.59333026 },
          { "x": 0.71360457, "y": 0.5933473 }
        ]
      },
      "id": "b4bc12bd-fc12-4c2b-a2e9-a2b2dd7b0c28",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.409996,
      "text": "84",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014208104,
          "height": 0.008163122,
          "left": 0.737976,
          "top": 0.58516484
        },
        "polygon": [
          { "x": 0.737976, "y": 0.58517677 },
          { "x": 0.7521737, "y": 0.58516484 },
          { "x": 0.7521841, "y": 0.5933161 },
          { "x": 0.7379863, "y": 0.593328 }
        ]
      },
      "id": "6c5b13fb-09e8-4a7e-96fd-4a35b4440249",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.50987,
      "text": "C.Davis,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.046023004,
          "height": 0.0097514335,
          "left": 0.7563479,
          "top": 0.5851527
        },
        "polygon": [
          { "x": 0.7563479, "y": 0.58519125 },
          { "x": 0.8023584, "y": 0.5851527 },
          { "x": 0.8023709, "y": 0.59486556 },
          { "x": 0.7563603, "y": 0.5949041 }
        ]
      },
      "id": "dc0e4feb-e3f7-4f70-b41e-bb4dcb3d1b10",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63357,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0152938645,
          "height": 0.008066346,
          "left": 0.8067373,
          "top": 0.58531207
        },
        "polygon": [
          { "x": 0.8067373, "y": 0.5853249 },
          { "x": 0.8220207, "y": 0.58531207 },
          { "x": 0.8220312, "y": 0.5933656 },
          { "x": 0.80674773, "y": 0.59337837 }
        ]
      },
      "id": "aa41d2c6-4167-4f93-8d20-99f67fd31542",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.8133,
      "text": "88",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013917532,
          "height": 0.00815727,
          "left": 0.82614815,
          "top": 0.58534503
        },
        "polygon": [
          { "x": 0.82614815, "y": 0.58535665 },
          { "x": 0.84005505, "y": 0.58534503 },
          { "x": 0.8400657, "y": 0.5934906 },
          { "x": 0.82615876, "y": 0.5935023 }
        ]
      },
      "id": "d36daee9-1f76-472c-bf78-30d77b521a33",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.48942,
      "text": "K.Yeboah,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.057500716,
          "height": 0.010014314,
          "left": 0.8445825,
          "top": 0.58508706
        },
        "polygon": [
          { "x": 0.8445825, "y": 0.5851352 },
          { "x": 0.90207, "y": 0.58508706 },
          { "x": 0.9020832, "y": 0.5950532 },
          { "x": 0.8445956, "y": 0.59510136 }
        ]
      },
      "id": "64b99816-9bd1-4748-a4d9-edb7ab1dddfb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.682556,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0153117785,
          "height": 0.007937674,
          "left": 0.907225,
          "top": 0.5854111
        },
        "polygon": [
          { "x": 0.907225, "y": 0.5854239 },
          { "x": 0.9225262, "y": 0.5854111 },
          { "x": 0.9225368, "y": 0.5933359 },
          { "x": 0.9072356, "y": 0.59334874 }
        ]
      },
      "id": "9127a35c-3a48-4583-ba38-24bcd01120ca",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.776726,
      "text": "94",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01423855,
          "height": 0.0081737265,
          "left": 0.9264021,
          "top": 0.58524096
        },
        "polygon": [
          { "x": 0.9264021, "y": 0.58525294 },
          { "x": 0.94062966, "y": 0.58524096 },
          { "x": 0.9406406, "y": 0.5934028 },
          { "x": 0.92641306, "y": 0.5934147 }
        ]
      },
      "id": "5cfda8be-7b9d-4695-aa02-3579b751b766",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.73332,
      "text": "D.Arnold,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052740183,
          "height": 0.009996993,
          "left": 0.036109798,
          "top": 0.59744227
        },
        "polygon": [
          { "x": 0.036109798, "y": 0.5974865 },
          { "x": 0.088839896, "y": 0.59744227 },
          { "x": 0.088849984, "y": 0.6073951 },
          { "x": 0.036119677, "y": 0.6074393 }
        ]
      },
      "id": "ecf33a2d-fe8a-411f-b746-79ed27df56eb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.66804,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015492049,
          "height": 0.008370335,
          "left": 0.09318832,
          "top": 0.5974487
        },
        "polygon": [
          { "x": 0.09318832, "y": 0.59746164 },
          { "x": 0.10867184, "y": 0.5974487 },
          { "x": 0.108680375, "y": 0.60580605 },
          { "x": 0.09319681, "y": 0.605819 }
        ]
      },
      "id": "1554c939-bda4-424f-b419-18bad857609f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.55309,
      "text": "89",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014040644,
          "height": 0.008434348,
          "left": 0.11269365,
          "top": 0.5974806
        },
        "polygon": [
          { "x": 0.11269365, "y": 0.59749234 },
          { "x": 0.12672564, "y": 0.5974806 },
          { "x": 0.1267343, "y": 0.60590315 },
          { "x": 0.112702265, "y": 0.6059149 }
        ]
      },
      "id": "ac59d317-c028-434f-8d38-1e8a27651f87",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.744026,
      "text": "L.Farrell,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0487318,
          "height": 0.00999919,
          "left": 0.13181126,
          "top": 0.59739053
        },
        "polygon": [
          { "x": 0.13181126, "y": 0.59743136 },
          { "x": 0.1805326, "y": 0.59739053 },
          { "x": 0.18054305, "y": 0.6073489 },
          { "x": 0.13182151, "y": 0.60738975 }
        ]
      },
      "id": "e55b4a84-6756-486f-959a-3980682a0ed2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.647224,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0153842475,
          "height": 0.008351151,
          "left": 0.18547486,
          "top": 0.5975959
        },
        "polygon": [
          { "x": 0.18547486, "y": 0.59760875 },
          { "x": 0.2008503, "y": 0.5975959 },
          { "x": 0.20085911, "y": 0.60593414 },
          { "x": 0.18548363, "y": 0.605947 }
        ]
      },
      "id": "f864cb9e-1d89-49a0-b459-9be7ab4b1efa",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.21287,
      "text": "91",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01370535,
          "height": 0.0085284365,
          "left": 0.20449762,
          "top": 0.5975482
        },
        "polygon": [
          { "x": 0.20449762, "y": 0.59755963 },
          { "x": 0.2181939, "y": 0.5975482 },
          { "x": 0.21820296, "y": 0.60606515 },
          { "x": 0.20450664, "y": 0.6060766 }
        ]
      },
      "id": "7ed444b2-f897-43b1-9678-347f9fde63de",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.136635,
      "text": "D.Smoot,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05178753,
          "height": 0.009870948,
          "left": 0.22402649,
          "top": 0.59752494
        },
        "polygon": [
          { "x": 0.22402649, "y": 0.59756833 },
          { "x": 0.27580333, "y": 0.59752494 },
          { "x": 0.27581403, "y": 0.60735255 },
          { "x": 0.22403698, "y": 0.6073959 }
        ]
      },
      "id": "e91a5d06-7421-45b0-a57f-94c0b4f765dd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.41443,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01484632,
          "height": 0.008240184,
          "left": 0.2810311,
          "top": 0.59767264
        },
        "polygon": [
          { "x": 0.2810311, "y": 0.59768504 },
          { "x": 0.29586843, "y": 0.59767264 },
          { "x": 0.29587743, "y": 0.60590035 },
          { "x": 0.28104007, "y": 0.6059128 }
        ]
      },
      "id": "c4be38b0-ad4a-4bf8-86a8-bc9040bc1c0e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.54956,
      "text": "96",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014395402,
          "height": 0.008527194,
          "left": 0.30008125,
          "top": 0.5974418
        },
        "polygon": [
          { "x": 0.30008125, "y": 0.59745383 },
          { "x": 0.31446728, "y": 0.5974418 },
          { "x": 0.31447667, "y": 0.6059569 },
          { "x": 0.30009058, "y": 0.605969 }
        ]
      },
      "id": "c1c94cbd-eab6-471f-a3a7-44c272a9eb0a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 92.74684,
      "text": "A.Gotsis,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.049869627,
          "height": 0.010006327,
          "left": 0.3185182,
          "top": 0.5974363
        },
        "polygon": [
          { "x": 0.3185182, "y": 0.5974781 },
          { "x": 0.3683766, "y": 0.5974363 },
          { "x": 0.36838782, "y": 0.60740083 },
          { "x": 0.3185292, "y": 0.6074426 }
        ]
      },
      "id": "ec251010-eed3-458c-9ca7-dae54765d32a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82522,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015425888,
          "height": 0.008315156,
          "left": 0.3732594,
          "top": 0.5975532
        },
        "polygon": [
          { "x": 0.3732594, "y": 0.59756607 },
          { "x": 0.3886759, "y": 0.5975532 },
          { "x": 0.3886853, "y": 0.6058554 },
          { "x": 0.37326872, "y": 0.60586834 }
        ]
      },
      "id": "cd325292-916e-44fa-8909-b25d95fa4cec",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84925,
      "text": "99",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014246745,
          "height": 0.008612762,
          "left": 0.39235568,
          "top": 0.59752464
        },
        "polygon": [
          { "x": 0.39235568, "y": 0.59753656 },
          { "x": 0.40659264, "y": 0.59752464 },
          { "x": 0.4066024, "y": 0.6061255 },
          { "x": 0.3923654, "y": 0.6061374 }
        ]
      },
      "id": "981b4292-0ed0-49ab-8d27-e1a60dc03b4a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.83425,
      "text": "J.Ledbetter",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06482687,
          "height": 0.008591755,
          "left": 0.4106574,
          "top": 0.59746057
        },
        "polygon": [
          { "x": 0.4106574, "y": 0.59751487 },
          { "x": 0.47547433, "y": 0.59746057 },
          { "x": 0.47548425, "y": 0.605998 },
          { "x": 0.41066712, "y": 0.60605234 }
        ]
      },
      "id": "a40ba6ef-d53e-4379-8052-573d882ddabd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.26675,
      "text": "S.Thomas,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.058258463,
          "height": 0.009949588,
          "left": 0.50823647,
          "top": 0.59750164
        },
        "polygon": [
          { "x": 0.50823647, "y": 0.59755045 },
          { "x": 0.5664831, "y": 0.59750164 },
          { "x": 0.56649494, "y": 0.60740244 },
          { "x": 0.50824815, "y": 0.6074512 }
        ]
      },
      "id": "3e7b8d9d-5592-4b9d-856b-b07708b61991",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.75739,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015409946,
          "height": 0.008268726,
          "left": 0.5714111,
          "top": 0.59765106
        },
        "polygon": [
          { "x": 0.5714111, "y": 0.59766394 },
          { "x": 0.586811, "y": 0.59765106 },
          { "x": 0.586821, "y": 0.6059069 },
          { "x": 0.571421, "y": 0.6059198 }
        ]
      },
      "id": "9443eadf-25c2-4126-80d1-35018343c889",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.40477,
      "text": "97",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014071209,
          "height": 0.0084945755,
          "left": 0.59069586,
          "top": 0.59750897
        },
        "polygon": [
          { "x": 0.59069586, "y": 0.59752077 },
          { "x": 0.6047568, "y": 0.59750897 },
          { "x": 0.6047671, "y": 0.6059918 },
          { "x": 0.59070617, "y": 0.6060036 }
        ]
      },
      "id": "174e3931-8140-442b-a5f6-1cecba248e2f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.20003,
      "text": "N.Shepherd,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07009975,
          "height": 0.01047633,
          "left": 0.60933006,
          "top": 0.5974525
        },
        "polygon": [
          { "x": 0.60933006, "y": 0.59751123 },
          { "x": 0.67941684, "y": 0.5974525 },
          { "x": 0.6794298, "y": 0.6078701 },
          { "x": 0.60934275, "y": 0.6079288 }
        ]
      },
      "id": "1397397b-76ca-4065-b44f-20f0b66c95c2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.81982,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015214402,
          "height": 0.008236962,
          "left": 0.6845799,
          "top": 0.5976097
        },
        "polygon": [
          { "x": 0.6845799, "y": 0.59762245 },
          { "x": 0.699784, "y": 0.5976097 },
          { "x": 0.6997943, "y": 0.6058339 },
          { "x": 0.68459016, "y": 0.60584664 }
        ]
      },
      "id": "4f628817-ce3f-4cba-9022-d42e6205912b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.76272,
      "text": "99",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013923845,
          "height": 0.008449816,
          "left": 0.7038596,
          "top": 0.59757274
        },
        "polygon": [
          { "x": 0.7038596, "y": 0.59758437 },
          { "x": 0.71777284, "y": 0.59757274 },
          { "x": 0.7177835, "y": 0.6060109 },
          { "x": 0.70387024, "y": 0.60602254 }
        ]
      },
      "id": "1638afb6-8dd0-4528-bfe7-3f51a45d9506",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.667984,
      "text": "V.Curry",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04366619,
          "height": 0.010468297,
          "left": 0.72166806,
          "top": 0.59750247
        },
        "polygon": [
          { "x": 0.72166806, "y": 0.59753907 },
          { "x": 0.7653209, "y": 0.59750247 },
          { "x": 0.76533425, "y": 0.60793424 },
          { "x": 0.72168124, "y": 0.6079708 }
        ]
      },
      "id": "3d6acee3-7eea-4514-ace7-0b3f683d1d67",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.7202,
      "text": "Did",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021250835,
          "height": 0.008661717,
          "left": 0.22422193,
          "top": 0.6176175
        },
        "polygon": [
          { "x": 0.22422193, "y": 0.61763525 },
          { "x": 0.24546348, "y": 0.6176175 },
          { "x": 0.24547277, "y": 0.6262614 },
          { "x": 0.22423115, "y": 0.6262792 }
        ]
      },
      "id": "882d6320-8fa1-4dea-8af2-71b8da0ba4fc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.65627,
      "text": "Not",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023548594,
          "height": 0.008458269,
          "left": 0.24987657,
          "top": 0.6178155
        },
        "polygon": [
          { "x": 0.24987657, "y": 0.6178352 },
          { "x": 0.273416, "y": 0.6178155 },
          { "x": 0.27342516, "y": 0.6262541 },
          { "x": 0.24988565, "y": 0.6262738 }
        ]
      },
      "id": "aa3f0fd4-c8e9-4a67-bce2-1eca3b38299f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.729256,
      "text": "Play",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027338265,
          "height": 0.010438682,
          "left": 0.277506,
          "top": 0.61776906
        },
        "polygon": [
          { "x": 0.277506, "y": 0.61779195 },
          { "x": 0.30483282, "y": 0.61776906 },
          { "x": 0.30484426, "y": 0.62818485 },
          { "x": 0.27751732, "y": 0.62820774 }
        ]
      },
      "id": "de8cf2e3-6dc8-4e0c-b0fd-4adf9cc82225",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86588,
      "text": "Did",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021555679,
          "height": 0.0086970385,
          "left": 0.6948996,
          "top": 0.6175839
        },
        "polygon": [
          { "x": 0.6948996, "y": 0.61760193 },
          { "x": 0.7164444, "y": 0.6175839 },
          { "x": 0.7164553, "y": 0.6262629 },
          { "x": 0.69491047, "y": 0.6262809 }
        ]
      },
      "id": "27b71c81-b96c-45ee-bd88-622e5bf5e601",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90373,
      "text": "Not",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023910645,
          "height": 0.008722565,
          "left": 0.7205427,
          "top": 0.61773336
        },
        "polygon": [
          { "x": 0.7205427, "y": 0.6177534 },
          { "x": 0.7444423, "y": 0.61773336 },
          { "x": 0.7444534, "y": 0.6264359 },
          { "x": 0.7205537, "y": 0.6264559 }
        ]
      },
      "id": "358f6223-0d0b-41cb-8ef1-018f8359b06d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79681,
      "text": "Play",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02738129,
          "height": 0.010446622,
          "left": 0.7481888,
          "top": 0.6177333
        },
        "polygon": [
          { "x": 0.7481888, "y": 0.6177562 },
          { "x": 0.7755567, "y": 0.6177333 },
          { "x": 0.77557003, "y": 0.62815696 },
          { "x": 0.748202, "y": 0.6281799 }
        ]
      },
      "id": "c1502b97-92ed-4327-b91b-28574e4f79e8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.6339,
      "text": "QB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01692239,
          "height": 0.009908394,
          "left": 0.50626206,
          "top": 0.6360907
        },
        "polygon": [
          { "x": 0.50626206, "y": 0.6361048 },
          { "x": 0.52317274, "y": 0.6360907 },
          { "x": 0.5231844, "y": 0.64598495 },
          { "x": 0.5062737, "y": 0.6459991 }
        ]
      },
      "id": "744cca36-74e0-4473-ba32-a234ff432134",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.13051,
      "text": "19",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013346688,
          "height": 0.008025385,
          "left": 0.5281065,
          "top": 0.6361943
        },
        "polygon": [
          { "x": 0.5281065, "y": 0.63620543 },
          { "x": 0.54144365, "y": 0.6361943 },
          { "x": 0.5414532, "y": 0.6442085 },
          { "x": 0.528116, "y": 0.64421964 }
        ]
      },
      "id": "4899243c-c4f3-446d-9585-358b61f925b2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.685616,
      "text": "J.Flacco",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.045563076,
          "height": 0.008459745,
          "left": 0.5453232,
          "top": 0.6359422
        },
        "polygon": [
          { "x": 0.5453232, "y": 0.63598037 },
          { "x": 0.5908761, "y": 0.6359422 },
          { "x": 0.5908863, "y": 0.6443638 },
          { "x": 0.54533327, "y": 0.64440197 }
        ]
      },
      "id": "b62b2021-2a9c-4d80-b809-201914d0f899",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.20129,
      "text": "Not",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023569094,
          "height": 0.008187626,
          "left": 0.23077552,
          "top": 0.65669554
        },
        "polygon": [
          { "x": 0.23077552, "y": 0.6567153 },
          { "x": 0.25433582, "y": 0.65669554 },
          { "x": 0.2543446, "y": 0.6648634 },
          { "x": 0.23078425, "y": 0.66488314 }
        ]
      },
      "id": "33e55b64-12aa-4a3f-8964-bd7b38be85eb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92229,
      "text": "Active",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04105103,
          "height": 0.008475727,
          "left": 0.25751463,
          "top": 0.6565674
        },
        "polygon": [
          { "x": 0.25751463, "y": 0.6566017 },
          { "x": 0.29855642, "y": 0.6565674 },
          { "x": 0.29856566, "y": 0.6650088 },
          { "x": 0.25752375, "y": 0.6650431 }
        ]
      },
      "id": "dd7527fe-0380-4151-b0d7-507f750604b9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.66402,
      "text": "Not",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023481207,
          "height": 0.008225345,
          "left": 0.70152354,
          "top": 0.65667564
        },
        "polygon": [
          { "x": 0.70152354, "y": 0.65669525 },
          { "x": 0.72499436, "y": 0.65667564 },
          { "x": 0.72500473, "y": 0.66488135 },
          { "x": 0.70153385, "y": 0.66490096 }
        ]
      },
      "id": "c29088f9-b53b-4c94-a75c-c63b4f92653c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94113,
      "text": "Active",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.040566165,
          "height": 0.008568323,
          "left": 0.7286216,
          "top": 0.6565311
        },
        "polygon": [
          { "x": 0.7286216, "y": 0.65656507 },
          { "x": 0.76917684, "y": 0.6565311 },
          { "x": 0.76918775, "y": 0.6650655 },
          { "x": 0.7286324, "y": 0.66509944 }
        ]
      },
      "id": "186e68a6-de0e-4572-8205-8e6700e8f0de",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84586,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020781394,
          "height": 0.008344275,
          "left": 0.03516902,
          "top": 0.6748609
        },
        "polygon": [
          { "x": 0.03516902, "y": 0.67487824 },
          { "x": 0.05594208, "y": 0.6748609 },
          { "x": 0.055950414, "y": 0.6831878 },
          { "x": 0.035177283, "y": 0.6832051 }
        ]
      },
      "id": "08228fd6-5ef8-4046-ae00-d8a6922d4603",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.2951,
      "text": "14",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013749355,
          "height": 0.008331958,
          "left": 0.060294732,
          "top": 0.6749069
        },
        "polygon": [
          { "x": 0.060294732, "y": 0.6749184 },
          { "x": 0.074035704, "y": 0.6749069 },
          { "x": 0.074044086, "y": 0.68322736 },
          { "x": 0.060303073, "y": 0.68323886 }
        ]
      },
      "id": "4a8cb099-0f98-46a2-a144-3ea2a4fec037",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.49898,
      "text": "K.Pryor,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04483596,
          "height": 0.010103415,
          "left": 0.07830631,
          "top": 0.6748043
        },
        "polygon": [
          { "x": 0.07830631, "y": 0.67484176 },
          { "x": 0.12313194, "y": 0.6748043 },
          { "x": 0.12314227, "y": 0.6848702 },
          { "x": 0.07831647, "y": 0.6849077 }
        ]
      },
      "id": "943bf267-ca96-4a52-9687-a304534fbabd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.28764,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015616827,
          "height": 0.008202622,
          "left": 0.12777574,
          "top": 0.6749238
        },
        "polygon": [
          { "x": 0.12777574, "y": 0.67493683 },
          { "x": 0.1433841, "y": 0.6749238 },
          { "x": 0.14339256, "y": 0.68311334 },
          { "x": 0.12778416, "y": 0.6831264 }
        ]
      },
      "id": "44033571-a9b2-4cb8-93ad-0b7f6b3e6995",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.45082,
      "text": "30",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013931535,
          "height": 0.008401793,
          "left": 0.14741237,
          "top": 0.6748361
        },
        "polygon": [
          { "x": 0.14741237, "y": 0.6748477 },
          { "x": 0.16133517, "y": 0.6748361 },
          { "x": 0.16134392, "y": 0.6832262 },
          { "x": 0.14742108, "y": 0.68323785 }
        ]
      },
      "id": "d1c7a1d6-0d76-4cd7-8c23-9a14f3826c93",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.77667,
      "text": "Mo.Brown,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.056842588,
          "height": 0.009828231,
          "left": 0.1695346,
          "top": 0.6747924
        },
        "polygon": [
          { "x": 0.1695346, "y": 0.6748399 },
          { "x": 0.22636674, "y": 0.6747924 },
          { "x": 0.22637717, "y": 0.68457305 },
          { "x": 0.16954482, "y": 0.6846206 }
        ]
      },
      "id": "0a03005d-2da4-4679-8587-9fccce4e4770",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.94051,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01570718,
          "height": 0.008103379,
          "left": 0.2312595,
          "top": 0.6749952
        },
        "polygon": [
          { "x": 0.2312595, "y": 0.6750083 },
          { "x": 0.24695797, "y": 0.6749952 },
          { "x": 0.24696667, "y": 0.68308544 },
          { "x": 0.23126815, "y": 0.68309855 }
        ]
      },
      "id": "f3088d26-be9b-4d85-b7ec-1634b2784510",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.2014,
      "text": "34",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014094509,
          "height": 0.008389028,
          "left": 0.25106823,
          "top": 0.67479604
        },
        "polygon": [
          { "x": 0.25106823, "y": 0.67480785 },
          { "x": 0.26515368, "y": 0.67479604 },
          { "x": 0.26516274, "y": 0.6831733 },
          { "x": 0.25107726, "y": 0.68318504 }
        ]
      },
      "id": "f0d2b777-0ec0-4414-ba1d-4550abd671df",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 94.61649,
      "text": "G.Junior,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05036068,
          "height": 0.009844214,
          "left": 0.26961756,
          "top": 0.6746804
        },
        "polygon": [
          { "x": 0.26961756, "y": 0.6747225 },
          { "x": 0.31996742, "y": 0.6746804 },
          { "x": 0.31997824, "y": 0.68448246 },
          { "x": 0.2696282, "y": 0.6845246 }
        ]
      },
      "id": "2dd402ef-cc21-47f9-88fa-7b40f10cec13",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.728714,
      "text": "OLB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023405902,
          "height": 0.008170296,
          "left": 0.3247826,
          "top": 0.6749434
        },
        "polygon": [
          { "x": 0.3247826, "y": 0.674963 },
          { "x": 0.34817943, "y": 0.6749434 },
          { "x": 0.34818852, "y": 0.68309414 },
          { "x": 0.32479164, "y": 0.6831137 }
        ]
      },
      "id": "43c60ae3-e10e-40c0-b91a-73d1283747eb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85795,
      "text": "44",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014500909,
          "height": 0.008194547,
          "left": 0.35208324,
          "top": 0.67486656
        },
        "polygon": [
          { "x": 0.35208324, "y": 0.6748787 },
          { "x": 0.36657494, "y": 0.67486656 },
          { "x": 0.36658412, "y": 0.683049 },
          { "x": 0.35209236, "y": 0.6830611 }
        ]
      },
      "id": "6ea47ec2-48ff-4b35-81b7-ac1194f2f17d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.506676,
      "text": "T.Walker,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053538863,
          "height": 0.009844772,
          "left": 0.37147373,
          "top": 0.6747416
        },
        "polygon": [
          { "x": 0.37147373, "y": 0.6747864 },
          { "x": 0.42500138, "y": 0.6747416 },
          { "x": 0.4250126, "y": 0.68454164 },
          { "x": 0.37148476, "y": 0.6845864 }
        ]
      },
      "id": "62dc6853-8d28-4e7f-9ded-8faab5f2512d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.43008,
      "text": "OLB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023191346,
          "height": 0.008188792,
          "left": 0.42984083,
          "top": 0.6748811
        },
        "polygon": [
          { "x": 0.42984083, "y": 0.67490053 },
          { "x": 0.45302275, "y": 0.6748811 },
          { "x": 0.4530322, "y": 0.6830505 },
          { "x": 0.42985022, "y": 0.6830699 }
        ]
      },
      "id": "357fed77-c996-442e-b0f7-23ca94ca8a1c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.8825,
      "text": "47",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014363884,
          "height": 0.008189965,
          "left": 0.45710838,
          "top": 0.67478096
        },
        "polygon": [
          { "x": 0.45710838, "y": 0.674793 },
          { "x": 0.47146276, "y": 0.67478096 },
          { "x": 0.47147226, "y": 0.68295896 },
          { "x": 0.45711786, "y": 0.68297094 }
        ]
      },
      "id": "092c876e-9630-466a-be3c-a0b6d58dba57",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.40521,
      "text": "QB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016678287,
          "height": 0.00957805,
          "left": 0.5065094,
          "top": 0.67506146
        },
        "polygon": [
          { "x": 0.5065094, "y": 0.6750754 },
          { "x": 0.52317643, "y": 0.67506146 },
          { "x": 0.52318776, "y": 0.68462557 },
          { "x": 0.5065207, "y": 0.6846395 }
        ]
      },
      "id": "0c61b324-dbe9-4b19-9bad-a2f7a2be5f31",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.952675,
      "text": "5",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067765317,
          "height": 0.008220948,
          "left": 0.5274221,
          "top": 0.6748661
        },
        "polygon": [
          { "x": 0.5274221, "y": 0.67487174 },
          { "x": 0.5341888, "y": 0.6748661 },
          { "x": 0.5341986, "y": 0.6830814 },
          { "x": 0.5274318, "y": 0.68308705 }
        ]
      },
      "id": "583c0f9e-fddc-4c74-a8fe-c30fd4609300",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.0752,
      "text": "M.White,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.050021965,
          "height": 0.009943307,
          "left": 0.5389992,
          "top": 0.67469084
        },
        "polygon": [
          { "x": 0.5389992, "y": 0.6747327 },
          { "x": 0.5890092, "y": 0.67469084 },
          { "x": 0.5890212, "y": 0.68459237 },
          { "x": 0.539011, "y": 0.68463415 }
        ]
      },
      "id": "f7617f14-476c-4389-ac34-1434519af3fc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79557,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02033563,
          "height": 0.008094181,
          "left": 0.59366506,
          "top": 0.6750572
        },
        "polygon": [
          { "x": 0.59366506, "y": 0.67507416 },
          { "x": 0.61399084, "y": 0.6750572 },
          { "x": 0.6140007, "y": 0.6831343 },
          { "x": 0.59367484, "y": 0.6831513 }
        ]
      },
      "id": "72166608-dc94-4694-af2d-e5f2d03f72a4",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.70371,
      "text": "11",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0129073365,
          "height": 0.008004487,
          "left": 0.61854863,
          "top": 0.67507124
        },
        "polygon": [
          { "x": 0.61854863, "y": 0.6750821 },
          { "x": 0.6314462, "y": 0.67507124 },
          { "x": 0.63145596, "y": 0.68306494 },
          { "x": 0.6185584, "y": 0.6830757 }
        ]
      },
      "id": "4749cedc-0284-4ef5-843f-62aaf8a5c190",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.49045,
      "text": "D.Mims,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04547671,
          "height": 0.0096601015,
          "left": 0.6366415,
          "top": 0.67483544
        },
        "polygon": [
          { "x": 0.6366415, "y": 0.6748735 },
          { "x": 0.6821062, "y": 0.67483544 },
          { "x": 0.6821182, "y": 0.6844575 },
          { "x": 0.6366533, "y": 0.6844955 }
        ]
      },
      "id": "5e65f3e4-a25c-4cb4-b83e-0ae68de56e9d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63071,
      "text": "WR",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020347418,
          "height": 0.007915706,
          "left": 0.68659663,
          "top": 0.6751215
        },
        "polygon": [
          { "x": 0.68659663, "y": 0.6751385 },
          { "x": 0.7069341, "y": 0.6751215 },
          { "x": 0.70694405, "y": 0.6830202 },
          { "x": 0.68660647, "y": 0.68303716 }
        ]
      },
      "id": "1868c956-cb0d-48fc-b4a0-5a48d9873125",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.74748,
      "text": "16",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013192471,
          "height": 0.007977439,
          "left": 0.71158385,
          "top": 0.67508215
        },
        "polygon": [
          { "x": 0.71158385, "y": 0.67509323 },
          { "x": 0.72476625, "y": 0.67508215 },
          { "x": 0.7247763, "y": 0.6830486 },
          { "x": 0.71159387, "y": 0.68305963 }
        ]
      },
      "id": "9e7ef6ac-897b-4987-84f9-7163cf3677fb",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.59864,
      "text": "J.Smith,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04617304,
          "height": 0.009692928,
          "left": 0.7286291,
          "top": 0.67486376
        },
        "polygon": [
          { "x": 0.7286291, "y": 0.6749024 },
          { "x": 0.77478975, "y": 0.67486376 },
          { "x": 0.77480215, "y": 0.6845181 },
          { "x": 0.72864133, "y": 0.6845567 }
        ]
      },
      "id": "7c13e659-ec82-4132-b23f-ead74f86e39e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63913,
      "text": "RB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015653407,
          "height": 0.007964514,
          "left": 0.7795764,
          "top": 0.67516845
        },
        "polygon": [
          { "x": 0.7795764, "y": 0.6751815 },
          { "x": 0.7952196, "y": 0.67516845 },
          { "x": 0.79522985, "y": 0.6831199 },
          { "x": 0.7795867, "y": 0.68313295 }
        ]
      },
      "id": "cd8cdc90-c195-4fd8-88c9-542bc3e3d835",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.14326,
      "text": "23",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013932521,
          "height": 0.008070802,
          "left": 0.79928553,
          "top": 0.6749969
        },
        "polygon": [
          { "x": 0.79928553, "y": 0.6750086 },
          { "x": 0.8132076, "y": 0.6749969 },
          { "x": 0.81321806, "y": 0.6830561 },
          { "x": 0.79929596, "y": 0.68306774 }
        ]
      },
      "id": "1fe827f7-6da5-4ea2-978e-e62364ce819b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.56726,
      "text": "J.Robinson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06646369,
          "height": 0.0097048655,
          "left": 0.8166972,
          "top": 0.67484975
        },
        "polygon": [
          { "x": 0.8166972, "y": 0.6749053 },
          { "x": 0.8831481, "y": 0.67484975 },
          { "x": 0.8831609, "y": 0.684499 },
          { "x": 0.8167097, "y": 0.6845546 }
        ]
      },
      "id": "5e80ee10-d1fe-4c76-8cfd-fc8dbc9f8552",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.698784,
      "text": "CB",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015397185,
          "height": 0.007971362,
          "left": 0.88817877,
          "top": 0.67508966
        },
        "polygon": [
          { "x": 0.88817877, "y": 0.67510253 },
          { "x": 0.90356535, "y": 0.67508966 },
          { "x": 0.90357596, "y": 0.6830481 },
          { "x": 0.8881894, "y": 0.683061 }
        ]
      },
      "id": "5c4f3b8b-a454-46b9-b9c0-9a75295fde7e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.502266,
      "text": "26",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0142801115,
          "height": 0.008017775,
          "left": 0.9074157,
          "top": 0.6749965
        },
        "polygon": [
          { "x": 0.9074157, "y": 0.6750084 },
          { "x": 0.92168504, "y": 0.6749965 },
          { "x": 0.92169577, "y": 0.68300235 },
          { "x": 0.90742636, "y": 0.6830143 }
        ]
      },
      "id": "577f82fb-faff-42f4-8803-171fd545627e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.81893,
      "text": "D.Dixon,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04810849,
          "height": 0.009951201,
          "left": 0.03626387,
          "top": 0.6868157
        },
        "polygon": [
          { "x": 0.03626387, "y": 0.6868559 },
          { "x": 0.08436233, "y": 0.6868157 },
          { "x": 0.08437236, "y": 0.6967266 },
          { "x": 0.036273703, "y": 0.69676685 }
        ]
      },
      "id": "0e5dd072-f95b-412d-9803-4b373753570a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.2843,
      "text": "OL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016419824,
          "height": 0.008219496,
          "left": 0.08893742,
          "top": 0.6869676
        },
        "polygon": [
          { "x": 0.08893742, "y": 0.6869813 },
          { "x": 0.10534888, "y": 0.6869676 },
          { "x": 0.105357245, "y": 0.6951734 },
          { "x": 0.08894573, "y": 0.6951871 }
        ]
      },
      "id": "d7389f3e-2c12-477c-bc48-394276ac2011",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 95.386696,
      "text": "74",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014250362,
          "height": 0.008304957,
          "left": 0.1090574,
          "top": 0.68685377
        },
        "polygon": [
          { "x": 0.1090574, "y": 0.6868657 },
          { "x": 0.12329925, "y": 0.68685377 },
          { "x": 0.12330776, "y": 0.6951468 },
          { "x": 0.10906587, "y": 0.6951587 }
        ]
      },
      "id": "7d540fab-5274-4ca3-9228-e11f1f7c28fd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.732216,
      "text": "C.Robinson,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06746689,
          "height": 0.009989085,
          "left": 0.1273731,
          "top": 0.68685824
        },
        "polygon": [
          { "x": 0.1273731, "y": 0.6869146 },
          { "x": 0.19482951, "y": 0.68685824 },
          { "x": 0.19483998, "y": 0.6967909 },
          { "x": 0.1273833, "y": 0.6968473 }
        ]
      },
      "id": "d02d563d-f86b-4efc-96be-a5a2d6a3061c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.621025,
      "text": "DL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015580409,
          "height": 0.008204061,
          "left": 0.20006253,
          "top": 0.6870169
        },
        "polygon": [
          { "x": 0.20006253, "y": 0.68702996 },
          { "x": 0.21563423, "y": 0.6870169 },
          { "x": 0.21564294, "y": 0.69520795 },
          { "x": 0.20007119, "y": 0.69522095 }
        ]
      },
      "id": "80edfbcc-09a0-4789-b88c-211066671a79",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.35438,
      "text": "94",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014475421,
          "height": 0.008460639,
          "left": 0.21919708,
          "top": 0.68689597
        },
        "polygon": [
          { "x": 0.21919708, "y": 0.68690807 },
          { "x": 0.23366347, "y": 0.68689597 },
          { "x": 0.2336725, "y": 0.6953445 },
          { "x": 0.21920608, "y": 0.6953566 }
        ]
      },
      "id": "53bc9950-9c51-4298-8236-502d0f3d7487",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.41876,
      "text": "F.Fatukasi",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0574838,
          "height": 0.008451962,
          "left": 0.2383966,
          "top": 0.6868543
        },
        "polygon": [
          { "x": 0.2383966, "y": 0.68690234 },
          { "x": 0.2958712, "y": 0.6868543 },
          { "x": 0.2958804, "y": 0.6952582 },
          { "x": 0.23840562, "y": 0.69530624 }
        ]
      },
      "id": "85caf3b5-a44e-493c-8aa6-5d6b36f8ec3f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.179085,
      "text": "B.Echols,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05088849,
          "height": 0.009933559,
          "left": 0.5069301,
          "top": 0.68683934
        },
        "polygon": [
          { "x": 0.5069301, "y": 0.68688184 },
          { "x": 0.5578068, "y": 0.68683934 },
          { "x": 0.55781865, "y": 0.6967303 },
          { "x": 0.5069418, "y": 0.6967729 }
        ]
      },
      "id": "a349a202-c9fe-405b-9fc4-2a5cf16e513b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 90.10756,
      "text": "S",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007601448,
          "height": 0.008216505,
          "left": 0.56232524,
          "top": 0.6869844
        },
        "polygon": [
          { "x": 0.56232524, "y": 0.6869908 },
          { "x": 0.5699168, "y": 0.6869844 },
          { "x": 0.5699267, "y": 0.6951946 },
          { "x": 0.5623351, "y": 0.6952009 }
        ]
      },
      "id": "dda0993b-00e0-43d3-a289-2454180dcb4e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 92.98474,
      "text": "29",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013765344,
          "height": 0.00836557,
          "left": 0.5739425,
          "top": 0.6868846
        },
        "polygon": [
          { "x": 0.5739425, "y": 0.6868961 },
          { "x": 0.58769774, "y": 0.6868846 },
          { "x": 0.5877078, "y": 0.6952386 },
          { "x": 0.57395256, "y": 0.6952501 }
        ]
      },
      "id": "e40b3956-f397-40e5-a25e-3b8d46657028",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.00891,
      "text": "L.Joyner,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05111327,
          "height": 0.01044013,
          "left": 0.5927763,
          "top": 0.68686867
        },
        "polygon": [
          { "x": 0.5927763, "y": 0.6869114 },
          { "x": 0.6438768, "y": 0.68686867 },
          { "x": 0.6438896, "y": 0.6972661 },
          { "x": 0.5927889, "y": 0.69730884 }
        ]
      },
      "id": "03fad22e-c412-43ee-b375-a4844994945c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.65795,
      "text": "TE",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.015653396,
          "height": 0.008326986,
          "left": 0.6479705,
          "top": 0.6869464
        },
        "polygon": [
          { "x": 0.6479705, "y": 0.68695945 },
          { "x": 0.6636136, "y": 0.6869464 },
          { "x": 0.6636239, "y": 0.6952603 },
          { "x": 0.64798075, "y": 0.69527334 }
        ]
      },
      "id": "16b42f57-0000-40de-9d28-dec2aaca0b0e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.36911,
      "text": "89",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013902343,
          "height": 0.008303685,
          "left": 0.66762733,
          "top": 0.68694216
        },
        "polygon": [
          { "x": 0.66762733, "y": 0.6869538 },
          { "x": 0.6815193, "y": 0.68694216 },
          { "x": 0.6815297, "y": 0.69523424 },
          { "x": 0.66763765, "y": 0.69524586 }
        ]
      },
      "id": "63e22705-d68f-48cd-84c2-f3666bbdc29f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.481674,
      "text": "J.Ruckert",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05389467,
          "height": 0.008548927,
          "left": 0.6856069,
          "top": 0.68685675
        },
        "polygon": [
          { "x": 0.6856069, "y": 0.6869018 },
          { "x": 0.7394908, "y": 0.68685675 },
          { "x": 0.7395016, "y": 0.6953606 },
          { "x": 0.6856175, "y": 0.69540566 }
        ]
      },
      "id": "ad19ff3a-408b-47b9-9ac5-d2143b56f2fa",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96235,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029963307,
          "height": 0.008139064,
          "left": 0.39840433,
          "top": 0.7065155
        },
        "polygon": [
          { "x": 0.39840433, "y": 0.7065406 },
          { "x": 0.42835835, "y": 0.7065155 },
          { "x": 0.42836764, "y": 0.71462953 },
          { "x": 0.39841354, "y": 0.71465456 }
        ]
      },
      "id": "bc1cc69a-f855-4373-98a3-852f11bb74b2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98102,
      "text": "Goals",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03558054,
          "height": 0.0080657,
          "left": 0.43252108,
          "top": 0.7065921
        },
        "polygon": [
          { "x": 0.43252108, "y": 0.7066218 },
          { "x": 0.46809226, "y": 0.7065921 },
          { "x": 0.4681016, "y": 0.71462804 },
          { "x": 0.43253028, "y": 0.7146578 }
        ]
      },
      "id": "43a40bf7-2a1d-4851-9094-78171ad80677",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79764,
      "text": "(made",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03802088,
          "height": 0.009955934,
          "left": 0.47231036,
          "top": 0.7066359
        },
        "polygon": [
          { "x": 0.47231036, "y": 0.70666766 },
          { "x": 0.51031953, "y": 0.7066359 },
          { "x": 0.5103313, "y": 0.71656 },
          { "x": 0.47232193, "y": 0.71659184 }
        ]
      },
      "id": "4c642259-3809-4061-a4ff-5f2ed7af1d4e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 64.78355,
      "text": "( )",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011903325,
          "height": 0.010085266,
          "left": 0.514424,
          "top": 0.7065568
        },
        "polygon": [
          { "x": 0.514424, "y": 0.70656675 },
          { "x": 0.52631545, "y": 0.7065568 },
          { "x": 0.5263274, "y": 0.7166321 },
          { "x": 0.51443595, "y": 0.7166421 }
        ]
      },
      "id": "5fcc8b08-2e84-45de-bba8-5a8597762e28",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.80481,
      "text": "&",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00935194,
          "height": 0.0082687745,
          "left": 0.53375375,
          "top": 0.7065376
        },
        "polygon": [
          { "x": 0.53375375, "y": 0.7065454 },
          { "x": 0.5430959, "y": 0.7065376 },
          { "x": 0.5431057, "y": 0.7147985 },
          { "x": 0.5337636, "y": 0.7148064 }
        ]
      },
      "id": "4db555e7-a196-4205-a41a-3930baf47e59",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93119,
      "text": "missed)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048815943,
          "height": 0.010026333,
          "left": 0.5468973,
          "top": 0.70653653
        },
        "polygon": [
          { "x": 0.5468973, "y": 0.70657736 },
          { "x": 0.59570116, "y": 0.70653653 },
          { "x": 0.59571326, "y": 0.7165221 },
          { "x": 0.5469092, "y": 0.71656287 }
        ]
      },
      "id": "eedbe452-9fec-4028-9484-a85fe03776ac",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.320786,
      "text": "R.Patterson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06255293,
          "height": 0.0084950235,
          "left": 0.03916038,
          "top": 0.7271703
        },
        "polygon": [
          { "x": 0.03916038, "y": 0.72722256 },
          { "x": 0.10170471, "y": 0.7271703 },
          { "x": 0.10171331, "y": 0.73561305 },
          { "x": 0.039168768, "y": 0.73566526 }
        ]
      },
      "id": "86d54210-4d7c-424d-8614-e4c3261fa862",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.855385,
      "text": "(32)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023281306,
          "height": 0.01104295,
          "left": 0.27581754,
          "top": 0.7267589
        },
        "polygon": [
          { "x": 0.27581754, "y": 0.7267783 },
          { "x": 0.29908678, "y": 0.7267589 },
          { "x": 0.29909885, "y": 0.73778236 },
          { "x": 0.27582952, "y": 0.73780185 }
        ]
      },
      "id": "458dc462-aa33-4897-980c-f19d6cf61a3e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89447,
      "text": "(45)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023630999,
          "height": 0.010671816,
          "left": 0.30423525,
          "top": 0.72696465
        },
        "polygon": [
          { "x": 0.30423525, "y": 0.7269844 },
          { "x": 0.32785445, "y": 0.72696465 },
          { "x": 0.32786626, "y": 0.7376167 },
          { "x": 0.30424696, "y": 0.73763645 }
        ]
      },
      "id": "9f17f2e1-ef66-4696-9a62-d5933a94aa62",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91661,
      "text": "44WL",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.033120923,
          "height": 0.00881077,
          "left": 0.3323121,
          "top": 0.7271581
        },
        "polygon": [
          { "x": 0.3323121, "y": 0.7271858 },
          { "x": 0.36542317, "y": 0.7271581 },
          { "x": 0.36543304, "y": 0.73594123 },
          { "x": 0.33232185, "y": 0.7359689 }
        ]
      },
      "id": "bd5e2455-3b2c-438a-b017-856edc53437f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93512,
      "text": "(41)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023745978,
          "height": 0.010784462,
          "left": 0.36925557,
          "top": 0.72701246
        },
        "polygon": [
          { "x": 0.36925557, "y": 0.7270323 },
          { "x": 0.39298934, "y": 0.72701246 },
          { "x": 0.39300156, "y": 0.7377771 },
          { "x": 0.36926764, "y": 0.7377969 }
        ]
      },
      "id": "7972517a-0829-4d87-bde7-58c65ebff862",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96796,
      "text": "(37)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023652377,
          "height": 0.010974507,
          "left": 0.39763844,
          "top": 0.7270099
        },
        "polygon": [
          { "x": 0.39763844, "y": 0.7270297 },
          { "x": 0.4212783, "y": 0.7270099 },
          { "x": 0.4212908, "y": 0.7379647 },
          { "x": 0.39765087, "y": 0.7379844 }
        ]
      },
      "id": "e1b0a4af-0235-4764-8570-70c06490d3f0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.22386,
      "text": "G.Zuerlein",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05876227,
          "height": 0.0085775675,
          "left": 0.50622666,
          "top": 0.72707564
        },
        "polygon": [
          { "x": 0.50622666, "y": 0.72712475 },
          { "x": 0.5649787, "y": 0.72707564 },
          { "x": 0.5649889, "y": 0.7356041 },
          { "x": 0.50623673, "y": 0.73565316 }
        ]
      },
      "id": "e5ea7ef8-fae3-4fe9-a430-7c6e1c498509",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.916504,
      "text": "(37)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023729268,
          "height": 0.010662768,
          "left": 0.7418018,
          "top": 0.7269756
        },
        "polygon": [
          { "x": 0.7418018, "y": 0.72699547 },
          { "x": 0.7655175, "y": 0.7269756 },
          { "x": 0.76553106, "y": 0.7376186 },
          { "x": 0.7418153, "y": 0.7376384 }
        ]
      },
      "id": "28e28569-945e-42ed-bbe0-7748a88bafcd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86888,
      "text": "1",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006967731,
          "height": 0.008101291,
          "left": 0.5442596,
          "top": 0.7479366
        },
        "polygon": [
          { "x": 0.5442596, "y": 0.7479424 },
          { "x": 0.5512177, "y": 0.7479366 },
          { "x": 0.55122733, "y": 0.75603205 },
          { "x": 0.54426926, "y": 0.7560379 }
        ]
      },
      "id": "2f9c3778-33c0-421c-8302-b76c59c52d74",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90107,
      "text": "2",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00809453,
          "height": 0.008121883,
          "left": 0.6224581,
          "top": 0.7479247
        },
        "polygon": [
          { "x": 0.6224581, "y": 0.7479314 },
          { "x": 0.6305427, "y": 0.7479247 },
          { "x": 0.63055265, "y": 0.7560398 },
          { "x": 0.62246805, "y": 0.75604653 }
        ]
      },
      "id": "8116d3ad-aaf0-4e5b-ba85-e94935d04bad",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.946884,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0077741286,
          "height": 0.008312236,
          "left": 0.70063925,
          "top": 0.74790585
        },
        "polygon": [
          { "x": 0.70063925, "y": 0.7479123 },
          { "x": 0.70840293, "y": 0.74790585 },
          { "x": 0.70841336, "y": 0.7562116 },
          { "x": 0.7006496, "y": 0.7562181 }
        ]
      },
      "id": "14c995c1-65db-4b40-ae82-243c500a869e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.960205,
      "text": "4",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.008578222,
          "height": 0.008114729,
          "left": 0.7788626,
          "top": 0.74794793
        },
        "polygon": [
          { "x": 0.7788626, "y": 0.7479551 },
          { "x": 0.78743035, "y": 0.74794793 },
          { "x": 0.7874408, "y": 0.75605553 },
          { "x": 0.77887297, "y": 0.7560627 }
        ]
      },
      "id": "351ef01b-a49b-4559-8748-10e7bd19ccb6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 94.51946,
      "text": "OT",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018404614,
          "height": 0.0085176155,
          "left": 0.8576599,
          "top": 0.74770904
        },
        "polygon": [
          { "x": 0.8576599, "y": 0.7477244 },
          { "x": 0.8760533, "y": 0.74770904 },
          { "x": 0.8760645, "y": 0.7562113 },
          { "x": 0.8576711, "y": 0.75622666 }
        ]
      },
      "id": "0a8ed7a8-d5bd-4f45-8dba-3a15c2b8c40a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89041,
      "text": "Total",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0333148,
          "height": 0.008373046,
          "left": 0.92033225,
          "top": 0.7479128
        },
        "polygon": [
          { "x": 0.92033225, "y": 0.74794066 },
          { "x": 0.95363575, "y": 0.7479128 },
          { "x": 0.953647, "y": 0.7562581 },
          { "x": 0.9203434, "y": 0.7562859 }
        ]
      },
      "id": "316970bd-7c1a-487d-b75a-fde6b1721a43",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.6462,
      "text": "VISITOR:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.053773314,
          "height": 0.008436883,
          "left": 0.035226602,
          "top": 0.764212
        },
        "polygon": [
          { "x": 0.035226602, "y": 0.76425695 },
          { "x": 0.08899141, "y": 0.764212 },
          { "x": 0.08899991, "y": 0.77260405 },
          { "x": 0.035234928, "y": 0.77264893 }
        ]
      },
      "id": "e806535c-f9f8-4673-8772-8e0a6c4595d3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.566635,
      "text": "Jacksonville",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06772882,
          "height": 0.00879677,
          "left": 0.14796782,
          "top": 0.76397586
        },
        "polygon": [
          { "x": 0.14796782, "y": 0.7640324 },
          { "x": 0.21568733, "y": 0.76397586 },
          { "x": 0.21569662, "y": 0.77271605 },
          { "x": 0.14797688, "y": 0.7727726 }
        ]
      },
      "id": "37ddae00-f0d3-4aa4-bb9b-4d261efa2181",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.970085,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044382375,
          "height": 0.010304293,
          "left": 0.21947184,
          "top": 0.7640838
        },
        "polygon": [
          { "x": 0.21947184, "y": 0.7641208 },
          { "x": 0.26384312, "y": 0.7640838 },
          { "x": 0.2638542, "y": 0.774351 },
          { "x": 0.21948276, "y": 0.7743881 }
        ]
      },
      "id": "c4a2d5e8-d1a0-4977-9249-b6341e4e6b3d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.915085,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0068591004,
          "height": 0.008500283,
          "left": 0.5447495,
          "top": 0.7628808
        },
        "polygon": [
          { "x": 0.5447495, "y": 0.7628865 },
          { "x": 0.5515985, "y": 0.7628808 },
          { "x": 0.5516086, "y": 0.77137536 },
          { "x": 0.54475963, "y": 0.7713811 }
        ]
      },
      "id": "e4aaaef2-80d2-4cf1-8f0b-0383ca8e22c3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97217,
      "text": "10",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013311316,
          "height": 0.0084789535,
          "left": 0.6171042,
          "top": 0.76297593
        },
        "polygon": [
          { "x": 0.6171042, "y": 0.762987 },
          { "x": 0.6304051, "y": 0.76297593 },
          { "x": 0.6304155, "y": 0.7714438 },
          { "x": 0.61711454, "y": 0.7714549 }
        ]
      },
      "id": "854861d6-a0cf-440f-8c2a-756bbd5af756",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93906,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067143557,
          "height": 0.008514854,
          "left": 0.7017214,
          "top": 0.7629204
        },
        "polygon": [
          { "x": 0.7017214, "y": 0.762926 },
          { "x": 0.70842505, "y": 0.7629204 },
          { "x": 0.7084357, "y": 0.7714296 },
          { "x": 0.70173204, "y": 0.7714352 }
        ]
      },
      "id": "e3e6bc56-711e-426c-bd5a-b2835e28fe44",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91135,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067182947,
          "height": 0.008531085,
          "left": 0.7801448,
          "top": 0.76291037
        },
        "polygon": [
          { "x": 0.7801448, "y": 0.76291597 },
          { "x": 0.7868521, "y": 0.76291037 },
          { "x": 0.7868631, "y": 0.77143586 },
          { "x": 0.7801558, "y": 0.77144146 }
        ]
      },
      "id": "ea08b56e-e38f-45db-a446-01c1659c6c40",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.56375,
      "text": "0",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069314707,
          "height": 0.008203592,
          "left": 0.8684069,
          "top": 0.7631158
        },
        "polygon": [
          { "x": 0.8684069, "y": 0.7631216 },
          { "x": 0.8753275, "y": 0.7631158 },
          { "x": 0.8753384, "y": 0.77131367 },
          { "x": 0.8684177, "y": 0.77131945 }
        ]
      },
      "id": "c0b9ed96-41a8-47e5-a4b1-e4d3c9d1051d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96421,
      "text": "19",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01306598,
          "height": 0.008366497,
          "left": 0.9407905,
          "top": 0.76310116
        },
        "polygon": [
          { "x": 0.9407905, "y": 0.76311207 },
          { "x": 0.95384514, "y": 0.76310116 },
          { "x": 0.95385647, "y": 0.7714568 },
          { "x": 0.94080174, "y": 0.7714677 }
        ]
      },
      "id": "c614e840-dfb7-4be2-8479-35da97e49d7a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.6237,
      "text": "HOME:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03871002,
          "height": 0.008379164,
          "left": 0.035705697,
          "top": 0.77940595
        },
        "polygon": [
          { "x": 0.035705697, "y": 0.77943826 },
          { "x": 0.07440731, "y": 0.77940595 },
          { "x": 0.07441572, "y": 0.7877528 },
          { "x": 0.035713978, "y": 0.7877851 }
        ]
      },
      "id": "389f8549-374b-4841-a9df-57ae90ba6f96",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.966415,
      "text": "New",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025069147,
          "height": 0.008279289,
          "left": 0.14864524,
          "top": 0.77944
        },
        "polygon": [
          { "x": 0.14864524, "y": 0.7794609 },
          { "x": 0.17370574, "y": 0.77944 },
          { "x": 0.17371438, "y": 0.7876983 },
          { "x": 0.14865379, "y": 0.78771925 }
        ]
      },
      "id": "5ffbc247-423e-457c-8feb-9aaf9a8dc3e1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.77942,
      "text": "York",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026852904,
          "height": 0.008542539,
          "left": 0.17698054,
          "top": 0.7792639
        },
        "polygon": [
          { "x": 0.17698054, "y": 0.7792863 },
          { "x": 0.20382443, "y": 0.7792639 },
          { "x": 0.20383345, "y": 0.78778404 },
          { "x": 0.17698948, "y": 0.78780645 }
        ]
      },
      "id": "ec484aa6-e0a1-488c-bcca-f4401f74d859",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.83938,
      "text": "Jets",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.022747627,
          "height": 0.008422337,
          "left": 0.20741639,
          "top": 0.7794737
        },
        "polygon": [
          { "x": 0.20741639, "y": 0.7794927 },
          { "x": 0.23015502, "y": 0.7794737 },
          { "x": 0.230164, "y": 0.787877 },
          { "x": 0.20742528, "y": 0.78789604 }
        ]
      },
      "id": "e8ed3ddf-a329-4ab0-b010-ba7e2d03cb55",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87523,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0068391995,
          "height": 0.008536223,
          "left": 0.54478914,
          "top": 0.7780022
        },
        "polygon": [
          { "x": 0.54478914, "y": 0.7780079 },
          { "x": 0.5516181, "y": 0.7780022 },
          { "x": 0.5516283, "y": 0.78653276 },
          { "x": 0.54479927, "y": 0.7865384 }
        ]
      },
      "id": "bf7880f0-6da0-404c-9964-747508625875",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85413,
      "text": "0",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007238744,
          "height": 0.008272365,
          "left": 0.62321556,
          "top": 0.77815557
        },
        "polygon": [
          { "x": 0.62321556, "y": 0.7781616 },
          { "x": 0.63044417, "y": 0.77815557 },
          { "x": 0.6304543, "y": 0.7864219 },
          { "x": 0.6232256, "y": 0.7864279 }
        ]
      },
      "id": "8706e94d-26b9-4a6a-a28e-d580cd1331e4",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.619415,
      "text": "0",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00712728,
          "height": 0.008311645,
          "left": 0.7017081,
          "top": 0.7781725
        },
        "polygon": [
          { "x": 0.7017081, "y": 0.77817845 },
          { "x": 0.70882493, "y": 0.7781725 },
          { "x": 0.70883536, "y": 0.78647816 },
          { "x": 0.7017185, "y": 0.7864841 }
        ]
      },
      "id": "b13826aa-4cfe-494a-b960-6b8c350f851b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79558,
      "text": "0",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007258238,
          "height": 0.008366855,
          "left": 0.78010094,
          "top": 0.7781356
        },
        "polygon": [
          { "x": 0.78010094, "y": 0.7781417 },
          { "x": 0.7873484, "y": 0.7781356 },
          { "x": 0.7873592, "y": 0.7864964 },
          { "x": 0.7801117, "y": 0.7865025 }
        ]
      },
      "id": "63210e41-02d6-41aa-b635-29f16f9bd83c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.45665,
      "text": "0",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070045935,
          "height": 0.0081619425,
          "left": 0.8684292,
          "top": 0.7782439
        },
        "polygon": [
          { "x": 0.8684292, "y": 0.77824974 },
          { "x": 0.875423, "y": 0.7782439 },
          { "x": 0.8754338, "y": 0.7864 },
          { "x": 0.86844, "y": 0.7864058 }
        ]
      },
      "id": "81722ff0-db70-4fad-9e47-8bd9e79afbfe",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86285,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006931948,
          "height": 0.008364813,
          "left": 0.9468791,
          "top": 0.77815783
        },
        "polygon": [
          { "x": 0.9468791, "y": 0.7781636 },
          { "x": 0.9537997, "y": 0.77815783 },
          { "x": 0.95381105, "y": 0.78651685 },
          { "x": 0.94689035, "y": 0.7865226 }
        ]
      },
      "id": "d42cf449-9556-434c-a5f4-8456db0e8e8c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91707,
      "text": "Scoring",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04927607,
          "height": 0.0104378415,
          "left": 0.45564348,
          "top": 0.79884887
        },
        "polygon": [
          { "x": 0.45564348, "y": 0.79889 },
          { "x": 0.5049073, "y": 0.79884887 },
          { "x": 0.5049195, "y": 0.8092456 },
          { "x": 0.45565552, "y": 0.8092867 }
        ]
      },
      "id": "e373ac04-c1e9-402c-b4f8-050b1d9be60f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.7604,
      "text": "Plays",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.034215808,
          "height": 0.010534485,
          "left": 0.50936335,
          "top": 0.7987277
        },
        "polygon": [
          { "x": 0.50936335, "y": 0.79875624 },
          { "x": 0.54356664, "y": 0.7987277 },
          { "x": 0.54357916, "y": 0.80923367 },
          { "x": 0.50937575, "y": 0.80926216 }
        ]
      },
      "id": "52d24028-8adf-48c6-bc87-64ebd4839def",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89775,
      "text": "Team",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0365017,
          "height": 0.008620003,
          "left": 0.029818023,
          "top": 0.8188532
        },
        "polygon": [
          { "x": 0.029818023, "y": 0.81888366 },
          { "x": 0.06631109, "y": 0.8188532 },
          { "x": 0.06631972, "y": 0.82744277 },
          { "x": 0.029826527, "y": 0.8274732 }
        ]
      },
      "id": "35fc5127-55d7-4190-b4e8-b61d146cc9b5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89542,
      "text": "Qtr",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021797163,
          "height": 0.010184455,
          "left": 0.123867005,
          "top": 0.8189593
        },
        "polygon": [
          { "x": 0.123867005, "y": 0.8189775 },
          { "x": 0.14565364, "y": 0.8189593 },
          { "x": 0.14566417, "y": 0.8291256 },
          { "x": 0.12387744, "y": 0.82914376 }
        ]
      },
      "id": "2257af8e-2780-46e3-8f74-d2fbdf092233",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88497,
      "text": "Time",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.032624964,
          "height": 0.008288934,
          "left": 0.17895207,
          "top": 0.8191484
        },
        "polygon": [
          { "x": 0.17895207, "y": 0.8191756 },
          { "x": 0.21156827, "y": 0.8191484 },
          { "x": 0.21157703, "y": 0.82741016 },
          { "x": 0.17896074, "y": 0.82743734 }
        ]
      },
      "id": "4bcd0cfb-42ca-4fd2-a642-8880fa8d1fe9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89016,
      "text": "Play",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027173117,
          "height": 0.010283981,
          "left": 0.22253816,
          "top": 0.8190192
        },
        "polygon": [
          { "x": 0.22253816, "y": 0.81904185 },
          { "x": 0.24970023, "y": 0.8190192 },
          { "x": 0.24971128, "y": 0.82928056 },
          { "x": 0.2225491, "y": 0.8293032 }
        ]
      },
      "id": "7f7df0f3-17f6-4a13-b0b4-1bdaf8cb28f0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86073,
      "text": "Description",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.07438744,
          "height": 0.010278714,
          "left": 0.25389603,
          "top": 0.8189159
        },
        "polygon": [
          { "x": 0.25389603, "y": 0.81897795 },
          { "x": 0.32827213, "y": 0.8189159 },
          { "x": 0.32828346, "y": 0.8291326 },
          { "x": 0.25390702, "y": 0.82919466 }
        ]
      },
      "id": "3e100ef4-f49d-483c-addf-2c20de0ff94e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.622826,
      "text": "(Extra",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.040316388,
          "height": 0.01050017,
          "left": 0.3324934,
          "top": 0.8187485
        },
        "polygon": [
          { "x": 0.3324934, "y": 0.8187821 },
          { "x": 0.37279803, "y": 0.8187485 },
          { "x": 0.3728098, "y": 0.82921505 },
          { "x": 0.33250502, "y": 0.82924867 }
        ]
      },
      "id": "38134e0e-7a6d-49d5-8206-bdb4fde69919",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.681076,
      "text": "Point)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.039922558,
          "height": 0.010597075,
          "left": 0.3770382,
          "top": 0.8187708
        },
        "polygon": [
          { "x": 0.3770382, "y": 0.8188041 },
          { "x": 0.4169487, "y": 0.8187708 },
          { "x": 0.41696078, "y": 0.8293346 },
          { "x": 0.37705013, "y": 0.8293679 }
        ]
      },
      "id": "3bc163ba-d71b-41bb-9c7d-3e9b3583514c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.6676,
      "text": "(Drive",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04031925,
          "height": 0.010683066,
          "left": 0.42163935,
          "top": 0.8186515
        },
        "polygon": [
          { "x": 0.42163935, "y": 0.8186852 },
          { "x": 0.46194628, "y": 0.8186515 },
          { "x": 0.46195862, "y": 0.829301 },
          { "x": 0.42165154, "y": 0.8293346 }
        ]
      },
      "id": "29b03151-dc07-476f-b27d-0bf05ad8a780",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.16317,
      "text": "Info)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.033102255,
          "height": 0.010646004,
          "left": 0.46556172,
          "top": 0.8187508
        },
        "polygon": [
          { "x": 0.46556172, "y": 0.8187784 },
          { "x": 0.4986515, "y": 0.8187508 },
          { "x": 0.49866396, "y": 0.8293692 },
          { "x": 0.46557403, "y": 0.8293968 }
        ]
      },
      "id": "cdea9c7b-0587-4ab5-9d60-db83616acb82",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87301,
      "text": "Visitor",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.043205585,
          "height": 0.008739974,
          "left": 0.861915,
          "top": 0.818792
        },
        "polygon": [
          { "x": 0.861915, "y": 0.81882805 },
          { "x": 0.905109, "y": 0.818792 },
          { "x": 0.90512055, "y": 0.82749593 },
          { "x": 0.86192644, "y": 0.82753193 }
        ]
      },
      "id": "128a7358-edfb-4b11-a3b8-8d4d25a67919",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93953,
      "text": "Home",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.037714407,
          "height": 0.008480726,
          "left": 0.9211383,
          "top": 0.8190263
        },
        "polygon": [
          { "x": 0.9211383, "y": 0.81905776 },
          { "x": 0.95884126, "y": 0.8190263 },
          { "x": 0.9588527, "y": 0.82747555 },
          { "x": 0.9211496, "y": 0.827507 }
        ]
      },
      "id": "9f54f38e-4e08-4f3a-a9f2-251403e622ac",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.86573,
      "text": "Jets",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023096275,
          "height": 0.008165104,
          "left": 0.030324413,
          "top": 0.83716977
        },
        "polygon": [
          { "x": 0.030324413, "y": 0.837189 },
          { "x": 0.053412545, "y": 0.83716977 },
          { "x": 0.05342069, "y": 0.84531564 },
          { "x": 0.030332478, "y": 0.8453349 }
        ]
      },
      "id": "fd9b65ff-ed72-44e1-9507-67cee3e593e1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.7647,
      "text": "1",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.005536359,
          "height": 0.007869147,
          "left": 0.1385431,
          "top": 0.8372375
        },
        "polygon": [
          { "x": 0.1385431, "y": 0.83724207 },
          { "x": 0.14407131, "y": 0.8372375 },
          { "x": 0.14407945, "y": 0.845102 },
          { "x": 0.13855122, "y": 0.8451066 }
        ]
      },
      "id": "2be8ec8d-ca52-4210-b417-381999df829b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.79063,
      "text": "11:37",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.031860076,
          "height": 0.007726806,
          "left": 0.17928347,
          "top": 0.8371832
        },
        "polygon": [
          { "x": 0.17928347, "y": 0.8372097 },
          { "x": 0.21113537, "y": 0.8371832 },
          { "x": 0.21114355, "y": 0.8448834 },
          { "x": 0.17929155, "y": 0.84490997 }
        ]
      },
      "id": "abdc1d82-c10b-4796-abb0-672b8646ad32",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 97.08458,
      "text": "G.Zuerlein",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.058529466,
          "height": 0.008276827,
          "left": 0.22215652,
          "top": 0.83692306
        },
        "polygon": [
          { "x": 0.22215652, "y": 0.8369719 },
          { "x": 0.28067702, "y": 0.83692306 },
          { "x": 0.280686, "y": 0.84515107 },
          { "x": 0.22216529, "y": 0.8451999 }
        ]
      },
      "id": "f43df7fb-00ef-412f-b6cd-7b1afd189ec5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.815765,
      "text": "37",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014000021,
          "height": 0.008157063,
          "left": 0.28501627,
          "top": 0.83696175
        },
        "polygon": [
          { "x": 0.28501627, "y": 0.83697337 },
          { "x": 0.29900736, "y": 0.83696175 },
          { "x": 0.2990163, "y": 0.84510714 },
          { "x": 0.28502515, "y": 0.84511876 }
        ]
      },
      "id": "7eaa9f22-4442-43b3-9895-0449760fe819",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.67091,
      "text": "yd.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017721053,
          "height": 0.009984082,
          "left": 0.30248055,
          "top": 0.8371438
        },
        "polygon": [
          { "x": 0.30248055, "y": 0.83715856 },
          { "x": 0.32019058, "y": 0.8371438 },
          { "x": 0.32020158, "y": 0.84711313 },
          { "x": 0.3024915, "y": 0.8471279 }
        ]
      },
      "id": "353e55a2-9078-4e09-9f17-3d4517e228d0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96003,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026309635,
          "height": 0.008365698,
          "left": 0.32536623,
          "top": 0.83689165
        },
        "polygon": [
          { "x": 0.32536623, "y": 0.8369136 },
          { "x": 0.35166657, "y": 0.83689165 },
          { "x": 0.35167587, "y": 0.8452354 },
          { "x": 0.32537547, "y": 0.84525734 }
        ]
      },
      "id": "bbc9c2ab-2a51-4025-8f1c-c8faa7cfec0f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9641,
      "text": "Goal",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025428496,
          "height": 0.008313705,
          "left": 0.35600057,
          "top": 0.83687717
        },
        "polygon": [
          { "x": 0.35600057, "y": 0.8368984 },
          { "x": 0.38141972, "y": 0.83687717 },
          { "x": 0.38142908, "y": 0.8451697 },
          { "x": 0.35600984, "y": 0.8451909 }
        ]
      },
      "id": "e080e6ae-963c-473e-8aa9-c66214a5e17b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.219025,
      "text": "(4--3,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03186462,
          "height": 0.010520161,
          "left": 0.38591886,
          "top": 0.83668303
        },
        "polygon": [
          { "x": 0.38591886, "y": 0.8367096 },
          { "x": 0.4177715, "y": 0.83668303 },
          { "x": 0.41778347, "y": 0.8471767 },
          { "x": 0.38593072, "y": 0.8472032 }
        ]
      },
      "id": "8104a54e-5993-4835-9652-627296433323",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.84408,
      "text": "1:59)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029839976,
          "height": 0.01049232,
          "left": 0.42319453,
          "top": 0.8368518
        },
        "polygon": [
          { "x": 0.42319453, "y": 0.83687663 },
          { "x": 0.4530224, "y": 0.8368518 },
          { "x": 0.45303452, "y": 0.84731925 },
          { "x": 0.4232065, "y": 0.8473441 }
        ]
      },
      "id": "090e5b9b-81f0-416d-a86c-a0aa4e2c22b6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.49641,
      "text": "0",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007076769,
          "height": 0.008152759,
          "left": 0.8977385,
          "top": 0.83699113
        },
        "polygon": [
          { "x": 0.8977385, "y": 0.83699703 },
          { "x": 0.9048044, "y": 0.83699113 },
          { "x": 0.90481526, "y": 0.845138 },
          { "x": 0.89774936, "y": 0.8451439 }
        ]
      },
      "id": "30e354e1-2803-4104-9f5a-137fbc3c42a6",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91322,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006439364,
          "height": 0.008259486,
          "left": 0.9520789,
          "top": 0.83701247
        },
        "polygon": [
          { "x": 0.9520789, "y": 0.83701783 },
          { "x": 0.95850706, "y": 0.83701247 },
          { "x": 0.95851827, "y": 0.8452666 },
          { "x": 0.95209, "y": 0.84527194 }
        ]
      },
      "id": "58549768-e080-4767-bf24-56ef0ec4dfbd",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.51195,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04491803,
          "height": 0.010122062,
          "left": 0.030188411,
          "top": 0.8522552
        },
        "polygon": [
          { "x": 0.030188411, "y": 0.85229266 },
          { "x": 0.07509628, "y": 0.8522552 },
          { "x": 0.07510644, "y": 0.86233985 },
          { "x": 0.030198397, "y": 0.8623773 }
        ]
      },
      "id": "b52a4fe1-78dd-4922-bc1d-c4fba0633f2a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.68671,
      "text": "1",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0053152516,
          "height": 0.007956583,
          "left": 0.13870354,
          "top": 0.8522976
        },
        "polygon": [
          { "x": 0.13870354, "y": 0.8523021 },
          { "x": 0.14401056, "y": 0.8522976 },
          { "x": 0.14401878, "y": 0.8602498 },
          { "x": 0.13871175, "y": 0.8602542 }
        ]
      },
      "id": "f76aaaec-9f2f-4514-9282-7264dcf43bea",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.78173,
      "text": "7:15",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025565319,
          "height": 0.007949185,
          "left": 0.18550828,
          "top": 0.8522362
        },
        "polygon": [
          { "x": 0.18550828, "y": 0.8522575 },
          { "x": 0.21106519, "y": 0.8522362 },
          { "x": 0.2110736, "y": 0.86016405 },
          { "x": 0.18551661, "y": 0.8601854 }
        ]
      },
      "id": "8d087120-029f-4da7-b377-5056212cb2fc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.00801,
      "text": "R.Patterson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06625304,
          "height": 0.008321897,
          "left": 0.22206686,
          "top": 0.852071
        },
        "polygon": [
          { "x": 0.22206686, "y": 0.8521262 },
          { "x": 0.2883109, "y": 0.852071 },
          { "x": 0.28831992, "y": 0.8603377 },
          { "x": 0.22207567, "y": 0.86039287 }
        ]
      },
      "id": "62331c20-a3f7-4ec8-9c07-65ca242ec800",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.888435,
      "text": "32",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013819731,
          "height": 0.008316825,
          "left": 0.29264402,
          "top": 0.85206676
        },
        "polygon": [
          { "x": 0.29264402, "y": 0.85207826 },
          { "x": 0.30645463, "y": 0.85206676 },
          { "x": 0.30646375, "y": 0.86037207 },
          { "x": 0.29265308, "y": 0.86038357 }
        ]
      },
      "id": "ca45e914-3abb-4a9b-a8a2-60f064834545",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.520775,
      "text": "yd.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01651866,
          "height": 0.010095337,
          "left": 0.31055993,
          "top": 0.85242057
        },
        "polygon": [
          { "x": 0.31055993, "y": 0.85243434 },
          { "x": 0.32706743, "y": 0.85242057 },
          { "x": 0.32707858, "y": 0.86250216 },
          { "x": 0.310571, "y": 0.8625159 }
        ]
      },
      "id": "7877c4d1-b90c-4757-8d81-bf436afe14f9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94393,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026543986,
          "height": 0.00851847,
          "left": 0.33285087,
          "top": 0.8519781
        },
        "polygon": [
          { "x": 0.33285087, "y": 0.85200024 },
          { "x": 0.35938534, "y": 0.8519781 },
          { "x": 0.35939485, "y": 0.8604745 },
          { "x": 0.3328603, "y": 0.86049664 }
        ]
      },
      "id": "1d423e7d-c663-46ec-9dfb-67299223a590",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.971306,
      "text": "Goal",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02528496,
          "height": 0.008476024,
          "left": 0.36382368,
          "top": 0.85198116
        },
        "polygon": [
          { "x": 0.36382368, "y": 0.85200226 },
          { "x": 0.38909906, "y": 0.85198116 },
          { "x": 0.38910863, "y": 0.86043614 },
          { "x": 0.36383316, "y": 0.8604572 }
        ]
      },
      "id": "0c03790e-9a2a-454e-b659-66b517a60800",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.60092,
      "text": "(10-61,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04123518,
          "height": 0.010514481,
          "left": 0.39363524,
          "top": 0.8518208
        },
        "polygon": [
          { "x": 0.39363524, "y": 0.8518552 },
          { "x": 0.43485838, "y": 0.8518208 },
          { "x": 0.43487042, "y": 0.862301 },
          { "x": 0.39364713, "y": 0.8623353 }
        ]
      },
      "id": "21048cec-741b-4920-9d5d-7d38cdeb24e4",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.627396,
      "text": "4:22)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030821798,
          "height": 0.010560493,
          "left": 0.43951103,
          "top": 0.85180515
        },
        "polygon": [
          { "x": 0.43951103, "y": 0.85183084 },
          { "x": 0.47032058, "y": 0.85180515 },
          { "x": 0.47033283, "y": 0.86234 },
          { "x": 0.43952316, "y": 0.86236566 }
        ]
      },
      "id": "e187702f-dd04-43a1-abba-d1c0ce70df48",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.929504,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0066704964,
          "height": 0.008338333,
          "left": 0.8979409,
          "top": 0.8520611
        },
        "polygon": [
          { "x": 0.8979409, "y": 0.85206664 },
          { "x": 0.90460026, "y": 0.8520611 },
          { "x": 0.9046114, "y": 0.8603939 },
          { "x": 0.89795196, "y": 0.8603994 }
        ]
      },
      "id": "9ae60bc0-42ac-4408-8713-95dab99b9652",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92485,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006415628,
          "height": 0.008304224,
          "left": 0.95210874,
          "top": 0.8520663
        },
        "polygon": [
          { "x": 0.95210874, "y": 0.8520716 },
          { "x": 0.95851314, "y": 0.8520663 },
          { "x": 0.95852435, "y": 0.86036515 },
          { "x": 0.95211995, "y": 0.8603705 }
        ]
      },
      "id": "fe847bcf-65e1-48dd-bd4c-573d4cbdc332",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.68132,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044924248,
          "height": 0.010144344,
          "left": 0.030152448,
          "top": 0.86740726
        },
        "polygon": [
          { "x": 0.030152448, "y": 0.8674447 },
          { "x": 0.07506651, "y": 0.86740726 },
          { "x": 0.07507669, "y": 0.8775142 },
          { "x": 0.030162456, "y": 0.87755156 }
        ]
      },
      "id": "fc056a05-cf08-4380-9e52-f916e4722f67",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89903,
      "text": "2",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006816239,
          "height": 0.008061267,
          "left": 0.13786559,
          "top": 0.86732537
        },
        "polygon": [
          { "x": 0.13786559, "y": 0.867331 },
          { "x": 0.14467348, "y": 0.86732537 },
          { "x": 0.14468183, "y": 0.87538093 },
          { "x": 0.1378739, "y": 0.8753866 }
        ]
      },
      "id": "3c6f23fd-7297-4d15-ae75-441d4e067f35",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.88903,
      "text": "11:26",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.031889096,
          "height": 0.007936857,
          "left": 0.17927386,
          "top": 0.86734915
        },
        "polygon": [
          { "x": 0.17927386, "y": 0.86737573 },
          { "x": 0.21115457, "y": 0.86734915 },
          { "x": 0.21116295, "y": 0.87525946 },
          { "x": 0.17928216, "y": 0.87528604 }
        ]
      },
      "id": "100a92c5-489d-43ff-bb95-5b5406c87103",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.36389,
      "text": "T.Lawrence",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06666328,
          "height": 0.008262337,
          "left": 0.22181301,
          "top": 0.86727715
        },
        "polygon": [
          { "x": 0.22181301, "y": 0.8673327 },
          { "x": 0.28846732, "y": 0.86727715 },
          { "x": 0.2884763, "y": 0.87548393 },
          { "x": 0.22182176, "y": 0.8755395 }
        ]
      },
      "id": "5db2d59e-5772-406a-933a-3ec40ed868ed",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.82468,
      "text": "1",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0052521015,
          "height": 0.0078902235,
          "left": 0.29335618,
          "top": 0.86758435
        },
        "polygon": [
          { "x": 0.29335618, "y": 0.8675887 },
          { "x": 0.29859963, "y": 0.86758435 },
          { "x": 0.29860827, "y": 0.8754702 },
          { "x": 0.2933648, "y": 0.8754746 }
        ]
      },
      "id": "2c899919-67cd-4e39-95ab-9477643f744f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63782,
      "text": "yd.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017949682,
          "height": 0.0100196265,
          "left": 0.30272862,
          "top": 0.86736536
        },
        "polygon": [
          { "x": 0.30272862, "y": 0.8673803 },
          { "x": 0.32066727, "y": 0.86736536 },
          { "x": 0.3206783, "y": 0.87737006 },
          { "x": 0.3027396, "y": 0.877385 }
        ]
      },
      "id": "6456d9e1-d026-4e23-b75f-5403ae4852e5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98697,
      "text": "run",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.019014092,
          "height": 0.006556477,
          "left": 0.32546857,
          "top": 0.8690122
        },
        "polygon": [
          { "x": 0.32546857, "y": 0.86902803 },
          { "x": 0.3444754, "y": 0.8690122 },
          { "x": 0.34448266, "y": 0.87555283 },
          { "x": 0.3254758, "y": 0.8755687 }
        ]
      },
      "id": "b4857aae-e461-4859-a646-54418148c622",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.63033,
      "text": "(R.Patterson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.070976906,
          "height": 0.010392839,
          "left": 0.34922072,
          "top": 0.8670473
        },
        "polygon": [
          { "x": 0.34922072, "y": 0.86710644 },
          { "x": 0.4201858, "y": 0.8670473 },
          { "x": 0.42019764, "y": 0.877381 },
          { "x": 0.34923226, "y": 0.87744015 }
        ]
      },
      "id": "90210722-0b23-44a1-8c99-6a8d096b9fec",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.758675,
      "text": "kick)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026355047,
          "height": 0.010530969,
          "left": 0.42457533,
          "top": 0.86700845
        },
        "polygon": [
          { "x": 0.42457533, "y": 0.8670304 },
          { "x": 0.45091823, "y": 0.86700845 },
          { "x": 0.45093036, "y": 0.87751746 },
          { "x": 0.42458737, "y": 0.8775394 }
        ]
      },
      "id": "59217553-86ad-4774-b7e6-4dbcd52fc000",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 98.369865,
      "text": "(16-96,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.041250277,
          "height": 0.010612418,
          "left": 0.4560056,
          "top": 0.866951
        },
        "polygon": [
          { "x": 0.4560056, "y": 0.8669854 },
          { "x": 0.49724346, "y": 0.866951 },
          { "x": 0.4972559, "y": 0.877529 },
          { "x": 0.45601785, "y": 0.8775634 }
        ]
      },
      "id": "0a155696-eb9b-4390-9188-21ab06a6c4b9",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 88.0367,
      "text": "8:15)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0313104,
          "height": 0.0106427735,
          "left": 0.50115126,
          "top": 0.86699396
        },
        "polygon": [
          { "x": 0.50115126, "y": 0.86702 },
          { "x": 0.53244907, "y": 0.86699396 },
          { "x": 0.53246164, "y": 0.8776106 },
          { "x": 0.5011637, "y": 0.87763673 }
        ]
      },
      "id": "b5cbe6cc-dbbc-46af-a636-d6c2769567a2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97979,
      "text": "10",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013342257,
          "height": 0.008153199,
          "left": 0.891566,
          "top": 0.86732936
        },
        "polygon": [
          { "x": 0.891566, "y": 0.86734045 },
          { "x": 0.9048974, "y": 0.86732936 },
          { "x": 0.90490824, "y": 0.8754714 },
          { "x": 0.89157677, "y": 0.87548256 }
        ]
      },
      "id": "f0864c22-44d3-457b-8888-e2bb678c6cce",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92178,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0064942213,
          "height": 0.008292732,
          "left": 0.9520469,
          "top": 0.86717796
        },
        "polygon": [
          { "x": 0.9520469, "y": 0.8671833 },
          { "x": 0.9585299, "y": 0.86717796 },
          { "x": 0.9585411, "y": 0.8754653 },
          { "x": 0.9520581, "y": 0.8754707 }
        ]
      },
      "id": "1064902a-8718-4bde-a205-55a240ce0c29",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.5414,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.044960234,
          "height": 0.010217017,
          "left": 0.030154737,
          "top": 0.8825205
        },
        "polygon": [
          { "x": 0.030154737, "y": 0.8825579 },
          { "x": 0.07510471, "y": 0.8825205 },
          { "x": 0.07511497, "y": 0.8927001 },
          { "x": 0.030164817, "y": 0.8927375 }
        ]
      },
      "id": "c7dcf892-92c2-4af9-a3ba-0c263b8a98e8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.87713,
      "text": "2",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0068176785,
          "height": 0.008075381,
          "left": 0.13787349,
          "top": 0.8824247
        },
        "polygon": [
          { "x": 0.13787349, "y": 0.8824304 },
          { "x": 0.14468281, "y": 0.8824247 },
          { "x": 0.14469117, "y": 0.8904944 },
          { "x": 0.13788182, "y": 0.89050007 }
        ]
      },
      "id": "6081c2d0-78fc-47c5-a4bd-162c89d32a9c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90021,
      "text": "2:55",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02529681,
          "height": 0.008033327,
          "left": 0.18567604,
          "top": 0.8825389
        },
        "polygon": [
          { "x": 0.18567604, "y": 0.88255996 },
          { "x": 0.21096435, "y": 0.8825389 },
          { "x": 0.21097285, "y": 0.89055115 },
          { "x": 0.18568446, "y": 0.89057225 }
        ]
      },
      "id": "b5a98fa6-4052-4d02-bf26-f02e0ecbbb4b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.3129,
      "text": "R.Patterson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.065997414,
          "height": 0.008329753,
          "left": 0.22232209,
          "top": 0.88244087
        },
        "polygon": [
          { "x": 0.22232209, "y": 0.8824959 },
          { "x": 0.28831047, "y": 0.88244087 },
          { "x": 0.2883195, "y": 0.89071566 },
          { "x": 0.22233091, "y": 0.8907706 }
        ]
      },
      "id": "1deb9a3b-c0f1-4b88-b5dd-e83ef966de5e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.91086,
      "text": "45",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014153945,
          "height": 0.00824207,
          "left": 0.29243502,
          "top": 0.8824537
        },
        "polygon": [
          { "x": 0.29243502, "y": 0.8824655 },
          { "x": 0.30657992, "y": 0.8824537 },
          { "x": 0.30658895, "y": 0.890684 },
          { "x": 0.29244402, "y": 0.89069575 }
        ]
      },
      "id": "53ca8b58-5f79-45d6-8106-dbcebd5440a7",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.5862,
      "text": "yd.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016606368,
          "height": 0.010052365,
          "left": 0.31061763,
          "top": 0.88263667
        },
        "polygon": [
          { "x": 0.31061763, "y": 0.8826505 },
          { "x": 0.32721287, "y": 0.88263667 },
          { "x": 0.327224, "y": 0.8926752 },
          { "x": 0.31062865, "y": 0.89268905 }
        ]
      },
      "id": "e7e54d3b-479b-4fad-8a3d-3c3ea69f9780",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.9723,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026419194,
          "height": 0.008422547,
          "left": 0.33296645,
          "top": 0.8822774
        },
        "polygon": [
          { "x": 0.33296645, "y": 0.8822994 },
          { "x": 0.35937622, "y": 0.8822774 },
          { "x": 0.35938564, "y": 0.890678 },
          { "x": 0.33297575, "y": 0.8907 }
        ]
      },
      "id": "5353a516-7346-4205-bb03-c46c7bdc2a8c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96821,
      "text": "Goal",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025297688,
          "height": 0.008320313,
          "left": 0.3638453,
          "top": 0.8823675
        },
        "polygon": [
          { "x": 0.3638453, "y": 0.88238853 },
          { "x": 0.3891336, "y": 0.8823675 },
          { "x": 0.389143, "y": 0.8906667 },
          { "x": 0.3638546, "y": 0.8906878 }
        ]
      },
      "id": "d3e8163d-b97d-4637-a55c-933afe3bc71a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.63009,
      "text": "(8-61,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.034060802,
          "height": 0.010321689,
          "left": 0.39375097,
          "top": 0.8821861
        },
        "polygon": [
          { "x": 0.39375097, "y": 0.8822145 },
          { "x": 0.42779997, "y": 0.8821861 },
          { "x": 0.42781177, "y": 0.8924794 },
          { "x": 0.39376262, "y": 0.8925078 }
        ]
      },
      "id": "4119e1d8-fe50-4fe7-a6c7-d38e4831775a",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.90863,
      "text": "4:44)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030839447,
          "height": 0.010648599,
          "left": 0.4323768,
          "top": 0.882102
        },
        "polygon": [
          { "x": 0.4323768, "y": 0.8821277 },
          { "x": 0.46320394, "y": 0.882102 },
          { "x": 0.46321627, "y": 0.89272493 },
          { "x": 0.43238902, "y": 0.8927506 }
        ]
      },
      "id": "60db2d38-9fef-4914-be8f-9ecdbac99961",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97853,
      "text": "13",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.012964973,
          "height": 0.008462844,
          "left": 0.8916091,
          "top": 0.8823973
        },
        "polygon": [
          { "x": 0.8916091, "y": 0.8824081 },
          { "x": 0.9045628, "y": 0.8823973 },
          { "x": 0.90457404, "y": 0.89084935 },
          { "x": 0.89162034, "y": 0.89086014 }
        ]
      },
      "id": "f5250cbd-1db8-45fd-b0b0-cd09c8c7147d",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94106,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0065430044,
          "height": 0.008307052,
          "left": 0.9520398,
          "top": 0.88248235
        },
        "polygon": [
          { "x": 0.9520398, "y": 0.88248783 },
          { "x": 0.9585715, "y": 0.88248235 },
          { "x": 0.95858276, "y": 0.89078397 },
          { "x": 0.952051, "y": 0.89078945 }
        ]
      },
      "id": "4e172ed0-f1f1-4ccf-a6c3-e79f066103a1",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.41166,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04493933,
          "height": 0.010196081,
          "left": 0.03010954,
          "top": 0.897651
        },
        "polygon": [
          { "x": 0.03010954, "y": 0.89768845 },
          { "x": 0.075038634, "y": 0.897651 },
          { "x": 0.07504887, "y": 0.9078097 },
          { "x": 0.030119598, "y": 0.9078471 }
        ]
      },
      "id": "eba997ab-021f-4598-916a-f5590e30fa87",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.89823,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0066853296,
          "height": 0.008195823,
          "left": 0.13795018,
          "top": 0.89758205
        },
        "polygon": [
          { "x": 0.13795018, "y": 0.8975876 },
          { "x": 0.14462703, "y": 0.89758205 },
          { "x": 0.14463551, "y": 0.9057723 },
          { "x": 0.13795865, "y": 0.9057779 }
        ]
      },
      "id": "b98a36c0-708a-4a53-9010-da315557be88",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.93266,
      "text": "7:06",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02568138,
          "height": 0.008102929,
          "left": 0.18558264,
          "top": 0.8976459
        },
        "polygon": [
          { "x": 0.18558264, "y": 0.8976673 },
          { "x": 0.21125543, "y": 0.8976459 },
          { "x": 0.21126401, "y": 0.90572745 },
          { "x": 0.18559113, "y": 0.9057488 }
        ]
      },
      "id": "93d4d692-3f00-4ecc-a4ac-01c75c3f40c3",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.00903,
      "text": "R.Patterson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06567128,
          "height": 0.008370803,
          "left": 0.22258036,
          "top": 0.8975473
        },
        "polygon": [
          { "x": 0.22258036, "y": 0.89760196 },
          { "x": 0.28824258, "y": 0.8975473 },
          { "x": 0.28825164, "y": 0.9058634 },
          { "x": 0.22258922, "y": 0.90591806 }
        ]
      },
      "id": "595d2713-3f88-408c-85a4-f7f1f9a966f0",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95647,
      "text": "41",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013642048,
          "height": 0.008138313,
          "left": 0.29242766,
          "top": 0.89763486
        },
        "polygon": [
          { "x": 0.29242766, "y": 0.89764625 },
          { "x": 0.3060608, "y": 0.89763486 },
          { "x": 0.30606973, "y": 0.90576184 },
          { "x": 0.29243654, "y": 0.9057732 }
        ]
      },
      "id": "a99b932a-c4ae-4bd8-be87-e365689690a5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.559044,
      "text": "yd.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016745966,
          "height": 0.010239967,
          "left": 0.31059423,
          "top": 0.8976479
        },
        "polygon": [
          { "x": 0.31059423, "y": 0.89766186 },
          { "x": 0.3273289, "y": 0.8976479 },
          { "x": 0.32734022, "y": 0.9078739 },
          { "x": 0.3106055, "y": 0.9078879 }
        ]
      },
      "id": "af6eb925-34e0-4f0b-af9b-e0d7f19d032f",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95627,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026431682,
          "height": 0.008438625,
          "left": 0.33295515,
          "top": 0.8974138
        },
        "polygon": [
          { "x": 0.33295515, "y": 0.8974358 },
          { "x": 0.3593774, "y": 0.8974138 },
          { "x": 0.35938683, "y": 0.9058304 },
          { "x": 0.33296448, "y": 0.90585244 }
        ]
      },
      "id": "ad47849a-3f7b-4e42-8ac8-1ab293201a58",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96454,
      "text": "Goal",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025330981,
          "height": 0.008391175,
          "left": 0.36383107,
          "top": 0.8974671
        },
        "polygon": [
          { "x": 0.36383107, "y": 0.8974882 },
          { "x": 0.3891526, "y": 0.8974671 },
          { "x": 0.38916206, "y": 0.9058372 },
          { "x": 0.36384046, "y": 0.9058582 }
        ]
      },
      "id": "bd0d0d58-1bf8-4e9a-b93b-1716a9692d11",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.42208,
      "text": "(12-49,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04121555,
          "height": 0.010412768,
          "left": 0.3935763,
          "top": 0.89741397
        },
        "polygon": [
          { "x": 0.3935763, "y": 0.8974483 },
          { "x": 0.43477994, "y": 0.89741397 },
          { "x": 0.43479186, "y": 0.90779245 },
          { "x": 0.39358807, "y": 0.9078267 }
        ]
      },
      "id": "3de66b47-c5f0-4272-aba9-a9d87f1c63b5",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.860214,
      "text": "6:24)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0298697,
          "height": 0.010155724,
          "left": 0.44013172,
          "top": 0.8974163
        },
        "polygon": [
          { "x": 0.44013172, "y": 0.89744115 },
          { "x": 0.46998963, "y": 0.8974163 },
          { "x": 0.47000143, "y": 0.9075471 },
          { "x": 0.44014338, "y": 0.90757203 }
        ]
      },
      "id": "d4525d8a-a87a-4aae-9020-868a1ee889cc",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.98462,
      "text": "16",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013300996,
          "height": 0.0082540875,
          "left": 0.89164513,
          "top": 0.89760196
        },
        "polygon": [
          { "x": 0.89164513, "y": 0.897613 },
          { "x": 0.9049351, "y": 0.89760196 },
          { "x": 0.9049461, "y": 0.905845 },
          { "x": 0.89165604, "y": 0.905856 }
        ]
      },
      "id": "565a8e3b-c79d-4d59-b744-716f2a08975e",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92974,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0065149902,
          "height": 0.00830794,
          "left": 0.95210505,
          "top": 0.8976081
        },
        "polygon": [
          { "x": 0.95210505, "y": 0.8976135 },
          { "x": 0.95860875, "y": 0.8976081 },
          { "x": 0.95862, "y": 0.9059106 },
          { "x": 0.95211625, "y": 0.90591604 }
        ]
      },
      "id": "be36ecdc-2594-407d-9543-7d38f2ac55de",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.629616,
      "text": "Jaguars",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.045039903,
          "height": 0.010050713,
          "left": 0.03001716,
          "top": 0.91288394
        },
        "polygon": [
          { "x": 0.03001716, "y": 0.9129215 },
          { "x": 0.07504697, "y": 0.91288394 },
          { "x": 0.07505707, "y": 0.9228972 },
          { "x": 0.030027073, "y": 0.92293465 }
        ]
      },
      "id": "ec8d9ab8-4107-417c-84d6-457cb1f9cd4c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94321,
      "text": "4",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007362896,
          "height": 0.00791848,
          "left": 0.13785395,
          "top": 0.9127729
        },
        "polygon": [
          { "x": 0.13785395, "y": 0.91277903 },
          { "x": 0.14520866, "y": 0.9127729 },
          { "x": 0.14521685, "y": 0.92068523 },
          { "x": 0.13786212, "y": 0.9206914 }
        ]
      },
      "id": "5e0c6269-aa30-4098-8923-3dfb7230b1f7",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.96514,
      "text": "3:46",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025749212,
          "height": 0.008150673,
          "left": 0.1856604,
          "top": 0.91277856
        },
        "polygon": [
          { "x": 0.1856604, "y": 0.9128 },
          { "x": 0.21140099, "y": 0.91277856 },
          { "x": 0.21140961, "y": 0.9209078 },
          { "x": 0.18566896, "y": 0.92092925 }
        ]
      },
      "id": "85665499-a8ff-4339-92b2-c0ebac2c402b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.39026,
      "text": "R.Patterson",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06621158,
          "height": 0.008430831,
          "left": 0.22218865,
          "top": 0.91276747
        },
        "polygon": [
          { "x": 0.22218865, "y": 0.91282254 },
          { "x": 0.28839108, "y": 0.91276747 },
          { "x": 0.28840023, "y": 0.9211432 },
          { "x": 0.22219758, "y": 0.9211983 }
        ]
      },
      "id": "de1970a8-4a4e-4ecd-b524-84c24ed4f2e2",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.889565,
      "text": "37",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013753538,
          "height": 0.008533538,
          "left": 0.29266012,
          "top": 0.9125821
        },
        "polygon": [
          { "x": 0.29266012, "y": 0.91259354 },
          { "x": 0.3064043, "y": 0.9125821 },
          { "x": 0.30641365, "y": 0.9211042 },
          { "x": 0.29266942, "y": 0.92111564 }
        ]
      },
      "id": "59f99cc1-e9ac-4c85-83c5-5b35bea67e4b",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.70795,
      "text": "yd.",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016789163,
          "height": 0.010158944,
          "left": 0.31056723,
          "top": 0.9128195
        },
        "polygon": [
          { "x": 0.31056723, "y": 0.9128335 },
          { "x": 0.3273452, "y": 0.9128195 },
          { "x": 0.3273564, "y": 0.9229645 },
          { "x": 0.3105784, "y": 0.92297846 }
        ]
      },
      "id": "fab18abb-518a-41ee-8a6a-ec8f03fe2a07",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.95989,
      "text": "Field",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026386222,
          "height": 0.008481469,
          "left": 0.33292264,
          "top": 0.91254264
        },
        "polygon": [
          { "x": 0.33292264, "y": 0.9125646 },
          { "x": 0.35929936, "y": 0.91254264 },
          { "x": 0.35930884, "y": 0.92100215 },
          { "x": 0.332932, "y": 0.9210241 }
        ]
      },
      "id": "edf38e01-a29b-4fad-bcb1-e344db67e226",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.97909,
      "text": "Goal",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025383206,
          "height": 0.008509328,
          "left": 0.36381027,
          "top": 0.91258836
        },
        "polygon": [
          { "x": 0.36381027, "y": 0.91260946 },
          { "x": 0.38918385, "y": 0.91258836 },
          { "x": 0.38919348, "y": 0.92107654 },
          { "x": 0.36381978, "y": 0.92109764 }
        ]
      },
      "id": "6b8b864d-a8ac-4c8e-9926-13aad466c154",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.35776,
      "text": "(4-5,",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026928574,
          "height": 0.01056676,
          "left": 0.39371145,
          "top": 0.91236883
        },
        "polygon": [
          { "x": 0.39371145, "y": 0.91239125 },
          { "x": 0.42062798, "y": 0.91236883 },
          { "x": 0.42064002, "y": 0.9229132 },
          { "x": 0.3937234, "y": 0.9229356 }
        ]
      },
      "id": "76876a86-8385-44af-b760-7b2c50b79290",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.83815,
      "text": "0:24)",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.030561997,
          "height": 0.010659362,
          "left": 0.42543072,
          "top": 0.9124195
        },
        "polygon": [
          { "x": 0.42543072, "y": 0.91244495 },
          { "x": 0.45598042, "y": 0.9124195 },
          { "x": 0.45599273, "y": 0.92305344 },
          { "x": 0.4254429, "y": 0.9230789 }
        ]
      },
      "id": "463faecf-976c-4f7d-b4c9-13e165c23333",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.983315,
      "text": "19",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013289341,
          "height": 0.008312448,
          "left": 0.89163077,
          "top": 0.91279274
        },
        "polygon": [
          { "x": 0.89163077, "y": 0.9128038 },
          { "x": 0.9049091, "y": 0.91279274 },
          { "x": 0.90492016, "y": 0.9210941 },
          { "x": 0.8916418, "y": 0.9211052 }
        ]
      },
      "id": "de5e93c0-2ddd-47d5-963e-c45b09902a32",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92856,
      "text": "3",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006551048,
          "height": 0.008426328,
          "left": 0.9520673,
          "top": 0.91270036
        },
        "polygon": [
          { "x": 0.9520673, "y": 0.9127058 },
          { "x": 0.95860696, "y": 0.91270036 },
          { "x": 0.95861834, "y": 0.92112124 },
          { "x": 0.9520787, "y": 0.92112666 }
        ]
      },
      "id": "3aff2692-77eb-4f53-9b2f-ca456e697643",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.951195,
      "text": "Paid",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0239317,
          "height": 0.008500676,
          "left": 0.030847928,
          "top": 0.92900705
        },
        "polygon": [
          { "x": 0.030847928, "y": 0.92902696 },
          { "x": 0.054771148, "y": 0.92900705 },
          { "x": 0.054779626, "y": 0.9374878 },
          { "x": 0.030856328, "y": 0.9375077 }
        ]
      },
      "id": "91419419-6e0d-4528-aaa1-05702a9e0125",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.016235,
      "text": "Attendance:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06883073,
          "height": 0.008732762,
          "left": 0.058867056,
          "top": 0.92881805
        },
        "polygon": [
          { "x": 0.058867056, "y": 0.9288753 },
          { "x": 0.12768885, "y": 0.92881805 },
          { "x": 0.12769778, "y": 0.93749356 },
          { "x": 0.058875743, "y": 0.9375508 }
        ]
      },
      "id": "67c08c73-f680-4fd6-8e14-b832a4d7810c",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.94732,
      "text": "70,043",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.039100796,
          "height": 0.009529579,
          "left": 0.132635,
          "top": 0.929135
        },
        "polygon": [
          { "x": 0.132635, "y": 0.92916757 },
          { "x": 0.17172585, "y": 0.929135 },
          { "x": 0.1717358, "y": 0.9386321 },
          { "x": 0.13264477, "y": 0.9386646 }
        ]
      },
      "id": "88f535d9-9185-47ad-aad0-7fd58dd36b59",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.85568,
      "text": "Time:",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03242919,
          "height": 0.008417238,
          "left": 0.89537424,
          "top": 0.9287311
        },
        "polygon": [
          { "x": 0.89537424, "y": 0.928758 },
          { "x": 0.92779213, "y": 0.9287311 },
          { "x": 0.9278034, "y": 0.93712133 },
          { "x": 0.8953854, "y": 0.9371483 }
        ]
      },
      "id": "202efc33-86d0-4173-8d53-95765e9251d8",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "WORD",
      "confidence": 99.92204,
      "text": "2:53",
      "textType": "PRINTED",
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025716234,
          "height": 0.008468219,
          "left": 0.9330729,
          "top": 0.92873085
        },
        "polygon": [
          { "x": 0.9330729, "y": 0.92875224 },
          { "x": 0.9587777, "y": 0.92873085 },
          { "x": 0.9587891, "y": 0.93717766 },
          { "x": 0.93308425, "y": 0.93719906 }
        ]
      },
      "id": "b7574a49-f0e0-493a-896b-41cc3318d540",
      "relationships": null,
      "entityTypes": null,
      "selectionStatus": null,
      "page": 1,
      "query": null
    },
    {
      "blockType": "PAGE",
      "confidence": null,
      "text": null,
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": { "width": 1.0, "height": 1.0, "left": 0.0, "top": 0.0 },
        "polygon": [
          { "x": 0.0, "y": 2.9089935e-7 },
          { "x": 1.0, "y": 0.0 },
          { "x": 1.0, "y": 1.0 },
          { "x": 4.1779188e-7, "y": 1.0 }
        ]
      },
      "id": "1462775d-fc0a-4b26-befc-1392cf193b00",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "1d340026-a860-48dd-9007-fc6c0c681755",
            "edbb56ea-37c1-4bf2-986f-0f1e79ddc283",
            "cff84b1f-9976-4784-a0e6-d795e7505caa",
            "ab0b4359-e478-4544-9194-d8fa25f2504c",
            "b534ebfc-a5f0-46c1-aedc-fb2ce9e5ac3f",
            "48b2998e-a39b-4a35-acd8-28911a3debc6",
            "f156b725-b7cf-41d4-bccd-cede158f362f",
            "93af8dd0-e734-4958-b446-bf5077cea66a",
            "0230f226-88f2-4904-b1dd-29550a736361",
            "2f2df0ad-be09-4301-9bc2-0da78602f33b",
            "1f319f5d-a397-458f-b6be-5f6b2de4cfb4",
            "a47434e6-34a5-41b1-ab38-6f5707f548f6",
            "9ff1ba47-b9f4-4f3d-a0cd-4ebe08157299",
            "e80db046-0c7f-400b-8c1f-98237cc7954d",
            "6a6c3059-d35c-40dc-a791-e44f6b861e04",
            "0378c529-31ab-4287-9921-17bbc22c24b0",
            "6f36ee60-7cac-425d-ac8d-98ca18af324f",
            "3cab7a51-b1be-4722-b72c-b39b8c48b533",
            "1cff0408-db89-49ed-bb51-0b8e7f8a3ad4",
            "d4428837-821b-43ae-bdb4-223bbcb05f38",
            "7fa99926-b672-41ce-90f3-c8e2ed322526",
            "67957e78-6848-4c0c-ae21-002e9d968256",
            "16663bf3-d9d0-4ff2-a5ae-777218a239c7",
            "3af8fd01-c5ac-422f-8184-e0a8c53f8844",
            "cb99ca82-9d86-4cae-9996-4706352d34f0",
            "a88d2a67-ada0-4d8f-85dd-167ccc3fa731",
            "e8c0e507-680c-45e4-80c4-6146f75b3ff7",
            "3a5c0154-69f3-4561-a68d-93b1a85b42f5",
            "be432f1f-9b32-43d8-b03d-c4f80c70a938",
            "71110b40-fd08-40ff-897c-e801a9981406",
            "0a64c3f0-bd92-4fa5-8bb0-134848f6f3e3",
            "964db4fb-b540-4d91-9a66-e3de9769577e",
            "a4082258-4a6c-464a-a9c3-abb17f3ddce2",
            "de201b53-1cbf-4156-99b4-14fb93679e40",
            "87fb8a9d-9d48-49a5-91cc-8062e7605736",
            "82dc9d35-a7fd-435e-8c7f-6ddd92d43a9e",
            "1fdd7fa7-ea9f-481b-927e-8da61bec9a41",
            "8eefd441-c977-4832-a43d-b139148716cd",
            "79f65381-0a6e-4cde-ab66-c5a2eb4197fa",
            "66bda997-f10b-4f80-91fa-f1bdc520dd24",
            "2b10d6d6-64b1-40d1-9278-3792ad8f6e07",
            "da4bf8e5-e4d0-4418-98db-9cb998f902e7",
            "4018313e-5c62-4204-8bbe-9d870b47c15a",
            "aa7d9082-eaf4-4026-9f76-773566fa466d",
            "efca61dc-41c0-40e6-96a9-33ba9de61aa8",
            "112f62c6-7f5b-4fc3-aefe-88009598917e",
            "4dfaf5b1-9171-4057-a5a4-952b05d30d03",
            "0433163f-4f79-4b6b-8d07-159177086709",
            "e7267284-e47a-45f8-bee1-d13e877933d2",
            "4d706280-e9fa-44d4-99d7-c549fba21d1c",
            "5263d690-2174-4804-92e3-6a1a3eac8deb",
            "fb116bdb-756e-40b3-9016-734d70bf2b2f",
            "1c9641e5-7659-447c-a073-4300414a1f4c",
            "c4be5b6b-3c88-4189-ba7f-1358798f0e7a",
            "77259fca-86c7-4ec0-a02b-2b92f870d9e3",
            "c0502015-63b4-403d-baad-cb54affad99d",
            "bde00ee7-a183-43f3-bd44-65c0d1107bdb",
            "74d0a713-910f-498e-b1f1-1efda3b463c1",
            "3e8c06d9-e19a-4322-890e-383e57a4c393",
            "e387f032-153a-42b8-a6b3-c348d6c208cb",
            "5c92105d-0d1c-4083-95c0-825e34d4f5b5",
            "dbf0873d-ae9b-4631-a350-368f1f7b677a",
            "d96469b4-32bf-42e5-ba75-01e418e73e98",
            "341f5192-fcb7-4464-b5ea-574b4d6fdf6b",
            "9fa45812-7864-4df7-9b09-783bf1cad270",
            "39c94e28-3a1b-4d96-8a6c-9c7fdefb6c39",
            "4d483a7b-e969-4353-b10e-2ceee09e37d2",
            "a6856fcb-8ff2-49ce-bd31-3aa87c94f619",
            "79f37eba-9fa6-4cab-a6a2-0440a9f96db0",
            "08e5b55d-0ee0-4209-a803-89f1d3b233f8",
            "26b4f24b-8b0b-448f-95da-3cb2041d1cce",
            "0befe16e-50b1-4b06-bc33-d81694282bd3",
            "203a769c-c9be-40b5-97dd-abf0a42d31e2",
            "cbe7445a-4135-474d-87ad-f52f58dea1e3",
            "d3a37dbb-da06-40b1-9ecc-147cf0b56b00",
            "f23001a4-3294-4f76-a610-19572f7289d1",
            "25e43caf-8f7f-44be-b5c3-910a130dd4fe",
            "b136704e-0aec-42c4-a045-6319bb3871d7",
            "3d98b48f-fc07-4185-a24e-fb95dfdc08ae",
            "7fcaef54-1c66-433b-8c5a-eeda3ecb1a11",
            "4c28e4cd-1191-4fbe-8d68-864fe153c5df",
            "85d5e18f-2bf7-411c-85f7-49e0db620af4",
            "bffcbd3f-1eab-45b9-991b-8328f6849dcb",
            "1e77e6c7-7404-41c6-8acc-f37bd38bf04d",
            "cb6c9135-2916-42ed-b6b9-92eeb3aec0a9",
            "7fe23360-d92c-49f2-8c33-b1f06512937a",
            "7a230f57-35ce-42bb-8ae1-46f540f68a24",
            "8b36ca09-20aa-4659-a492-84ba837e1f03",
            "6110e76d-6b2a-451c-a43c-a153cd846194",
            "8792ceb1-7f01-4234-af56-580b42de1c02",
            "20750314-5da7-441c-aa24-2a4071e0e87e",
            "93d113c4-1a2f-4bcc-b337-24f031256ef6",
            "2e822922-008a-4240-ba35-ba6fe54b55b5",
            "7d3f4289-f620-415d-8560-ef2b087d316f",
            "8ad66045-546a-43c5-bf18-88e40e31abd7",
            "9cdec078-4c62-4f6c-a09f-2342b2da5920",
            "528ed405-880c-4d99-9a9b-6bb57cb1096a",
            "fa997b14-5f65-48ad-8634-dac8b0686624",
            "5d7f227a-e5dc-4d95-a3d8-9fc482439fd5",
            "25a359f5-9b32-4c10-b5ea-3912dcc570e9",
            "13980f63-f106-4636-b45c-a787e839e4aa",
            "85a57e8d-6e27-4f12-9d6e-7fef65af8a23",
            "00e19e32-7a96-46c9-bb0b-a18cdd976cc8",
            "a65ea7ba-f317-4f60-88fe-afcdffd47767",
            "680719ba-7beb-416a-83b0-ccc0dcc7da3b",
            "ca281646-66a1-4d64-9af2-0d90687468b2",
            "2c253ce9-0f84-4faf-acfe-e1b3a67c8fa6",
            "032fb9df-6959-4117-91ff-7640fd158901",
            "db71dc25-5a80-41b3-a459-49ef68912927",
            "80791553-c843-4028-ae9c-ed8d9e922279",
            "a63c81ed-6a12-44c6-932a-be74b0475013",
            "68a0199a-4c46-4393-9ede-794b8b2aa14e",
            "54745801-5ab5-4836-ab11-bc8e2cdec12b",
            "a707e496-1a75-44d9-95ba-432cee1082f8",
            "abb776ed-d0c9-4bf7-868c-63dea0b4256b",
            "dcc5b0e6-a172-48e9-8b8b-d6413836c150",
            "062a1288-9d4d-41e5-845b-e5ff7ee62d8d",
            "d4c439f4-829c-453e-b697-fdcb79c52d7d",
            "c1be4062-55f5-4ff2-a63c-3eb5779a2a92",
            "7ecc097e-e9d0-4644-b405-56568e5dcd6e",
            "0d743e5b-671a-4e03-a569-cbfc19a2ccee",
            "439e0950-8d5c-42d3-b7d7-eb3ef31f5175",
            "50431ff5-5b28-4b92-95a6-790e5be32bf2",
            "76428da7-5ccb-4c69-b018-8126af92c3c3",
            "eabc3d4a-8358-44a4-b958-d5832b84d6a3",
            "6a7ff031-5a39-4fe1-a8c3-5835205b04dd",
            "5f45126e-cc13-426c-b691-abcebb4bf980",
            "933fafbf-a022-471d-b6e3-570ba63727dc",
            "f1086545-24a3-453c-832c-cecc2cb2b71c",
            "620c5840-b4c7-4dc5-aa1a-3f05049a7162",
            "0af8b26d-31d6-4a91-95ac-c2685bf38263",
            "0b11c3bd-1541-41e9-878e-54f261054711",
            "e29e31cc-bf7f-40c1-9084-dcfebba3ba66",
            "e1109f83-913e-4949-837c-a24188bbd987",
            "fc8ebe64-4f79-4c5c-8d7e-811dfc4ace96",
            "1579396a-eb4f-4b36-b563-93b72d005c4c",
            "57dfd738-55eb-4c4a-8452-59f46239022d",
            "5b0ba7c5-59f5-4384-aea4-ba2491bf1b35",
            "be3473e3-e528-4739-9379-6b90a09d3e71",
            "63086094-c0ae-43fd-8fad-4f0e556bcfc8",
            "3c31c5bb-6183-45e8-bb80-effdbe12874e",
            "72b5df58-003f-4f4e-adc8-de8bee520c73",
            "feb979ed-3557-405f-9000-44be8b74f594",
            "a97eaff1-16de-43f8-beeb-2c75ccaf6c9f",
            "0c5b8338-9bc7-425f-a028-809752415912",
            "9f4d7c3e-c406-4c8c-a68c-94ca512dd6a4",
            "1f7ec284-5729-43a2-8450-d1543ec73de6",
            "6ebba1dd-cff2-491c-8351-57d1d8b88348",
            "61d943c6-ced4-4727-8890-54c461d04f35",
            "3a9d86cf-f8c8-4096-9d50-07d45314eca3",
            "53b516da-15d3-47cb-aea9-e7cfe58ad4b1",
            "efa3b187-8acc-4bd0-b993-86bc99b15862",
            "100ce53e-5316-4832-84c8-5c07bcbb3e80",
            "1aed30ad-3d46-4129-80a0-79bba1f41fc9",
            "47d16539-4f18-4370-a7e1-63a99f55dd33",
            "e9cffe70-b61f-456f-8d09-bd122a6f87a6",
            "16c3be0e-d449-4765-9d4b-2d53a5ac3b13",
            "4952c703-6401-4272-822c-72549b8d948f",
            "f6b6c868-2c0a-403c-8b47-ef49c7a9eb4a",
            "e5e113b4-c487-4f8a-833f-740b1ac237f1",
            "ec8b49fb-2424-4843-8381-eaf8dc6568d5",
            "c418a4d8-ebb1-4f4d-925d-a7ad689f333f",
            "04ea9c68-6228-4781-9a2e-0c1eea25ed37",
            "0dc8bac8-7f61-401c-ab21-de92a0d24cb1",
            "6f58aa22-5123-4b81-b9c9-3f9cad6185cb",
            "e121313d-4686-420c-b61f-52bd90f9eff6",
            "2693d964-81af-44dc-a34b-1b4e1112c4bb",
            "d601b946-94d6-48ea-a1ae-491f3ebf360e",
            "f11374b2-611b-4b95-b4dd-f6202f295a5f",
            "57eff05a-c5f6-49ce-842e-4e850017358f",
            "0ace52ea-72a0-4a17-af2e-bb0f775c9da1",
            "eff0c886-3bd5-47de-80f2-b62881cb3eb5",
            "8ebac256-1ecd-401c-aaee-e07291f86370",
            "d7d6bc5a-b7f0-42a7-972c-edf8c65773c5",
            "c60fcc65-05fe-4009-9aaf-bbdd2ad54e3d",
            "a9177dfb-d1b0-416c-9a49-6851d1f93517",
            "6b783ffe-5bf9-497b-8551-8603eeba5703",
            "87539085-afec-452c-b4f7-7857936a8807",
            "27f2ddb0-9043-415e-8799-bbe49369fde9",
            "b05c0684-cd19-447e-a6b2-d0fd96ca4091",
            "401ebc08-3c5b-4724-8a72-569f1c277f73",
            "371cf3fd-a56a-4d9c-9c47-99afef92c9d7",
            "5ffa48b2-f65c-4bfe-8102-b14beef38c34",
            "6ef70731-9bc5-4a8e-b672-b926031ff3f4",
            "dc4a2b1b-bf30-45ba-928b-5f8444f47d02",
            "db8223d6-b2c2-4a63-a2f8-8042e3495fdf",
            "05d8f567-8d34-496b-9230-aed47939208c",
            "c4317200-c08a-4eab-af8b-c6211f67804d",
            "e4e987d8-2d35-4c60-afcd-2ceecb96f4d7",
            "f5f21c2c-f72e-4c7c-aa7a-781a2adb1e28",
            "44fadf46-c3d5-4c98-b729-dfeee834ee83",
            "06488f75-a4e0-42e9-85ab-7ba04200e6c2",
            "5d079e11-ff0c-4b89-863c-d1674c662b51",
            "0fa6f2f7-63e2-4c03-a8c4-975a6fde7293",
            "9505ffe9-4bf5-41b0-bc6d-1ea2f413c3a5",
            "79c4960e-d753-4901-9441-e86d94ea9904",
            "20ef9438-3a06-417e-a582-252362bc5c89",
            "8f934027-787a-4874-8a50-36a3a8a46665",
            "40ff8412-8d9a-4459-a5b9-7bd887414655",
            "3e111658-b2e9-4aa6-9043-a9221fd429c6",
            "112b369a-1efd-4a14-8c81-0c7aea163f08",
            "9b582d3b-ce28-41b5-a5c1-93f4377f0af8",
            "d004ddf3-038f-45a7-9cb9-a497449ae361",
            "d88080e6-9c3b-4591-9891-bbd624a5bdfc",
            "cd8d85c8-670b-4735-b92f-23cfe9feeefe",
            "8bf111b5-5165-4d64-bccc-af8b62fb1675",
            "97c22d3f-437d-44ea-8eec-bb163956562d",
            "d8c121e4-01ac-41ae-ba34-21dc3a60e66d",
            "9737a24f-ff2c-40f4-a57b-7955e18851cd",
            "c38b0653-69de-4e49-829d-62aa56a8b76c",
            "5701b842-74ca-45e5-8ecf-d1db196b30d0",
            "9e2d153a-06ab-4bd2-9550-0bdd8ffd9adf",
            "d7099f32-16a9-47c0-b9fd-74ef236b967c",
            "63024206-ecbc-4059-9495-13306897b51a",
            "b56eadbe-ea0f-4d8c-b83e-363d1f10dcfe",
            "9d7815b9-3290-4303-9247-f2c2c45cb7f8",
            "f0a44ec7-889b-45c9-8633-3b95a2b84ef2",
            "1f404a10-9513-407f-97f8-5b23ef9263d0",
            "a6750628-b7ba-44f0-9881-1ba0b3428d40",
            "1982e0cf-b4e2-449d-9c07-60f3041d48b7",
            "415e39e3-25a5-4554-ab8f-f733bb2c197b",
            "20851861-5661-42d1-8713-d537e3187f07",
            "974cc069-f6cb-403e-b811-60b6ea92b3c8",
            "c076ccd4-e99e-4c10-bd97-0e73385d39e8",
            "438cf6ee-1bf3-4bd1-ad1b-9cf1402c1203",
            "c8f4198a-03db-4979-bf85-327212f6f4ed",
            "a4b45057-5f56-408a-961f-074f0e599489",
            "1ead0ec0-9f56-4c83-b061-13d2a6e43f41",
            "c2edd376-253e-4139-8617-e63426fba2b2",
            "d9b4ed26-2173-4b50-a9bb-0b69e6f65074",
            "ddd845b3-d5c1-4010-ba01-b4a085d10895",
            "a647aa7a-3c02-402b-88a5-7e809d35ca90",
            "fea025fe-37e9-43dd-aad0-2f92515c8ec0",
            "d9046fba-d39e-44d9-aada-d55f453c79eb",
            "7bef17f0-f49d-4e7d-b5ef-e08157beb54c",
            "2bd21128-ea78-4dd5-85d5-3e75f1996842",
            "54fa8803-bed9-4791-8a53-319a68db5d56",
            "db2d7899-86e5-4a51-be40-2486e124606b",
            "5559e171-e083-4c5c-becf-cb416cef5cb3",
            "990433f5-49ba-4172-8218-abffa69ee56b",
            "b13fd86b-08a6-4ead-a4ae-e0ebc920298f",
            "c0c672cc-1451-4e9e-ac3b-2b3a6374e8d0",
            "d3c8844f-d2da-4659-9d83-c3f7a936ce53",
            "ab429c75-0f40-4067-9e25-e203d5731178",
            "60c215d0-9ca6-4f44-b509-08824d04296d",
            "eaefa503-c38d-4085-bcb8-c1e499579dfb",
            "ea9bfc65-cef3-4221-913f-d163fb991e90",
            "688bba1b-0aad-476e-afff-5de9ff693cf3",
            "485ed8e5-14d9-48d4-83d1-34e2ccdf7576",
            "3685b2a2-92dd-4559-883d-552a90378bf5",
            "70063f62-babe-43c7-ac77-86b2ef92cb79",
            "a02bf34c-d0c0-48f2-a96c-3e8cbaa53118",
            "8749a1c1-691f-4539-bfe0-f16d19085fce",
            "6c8ae2e9-0751-4e45-bb9b-83823445246a",
            "0125be1a-f3a1-4b6d-8288-32706006a858",
            "4e7b21ff-cd1a-433d-856f-a98fd8ec51a7",
            "7e620c8f-de11-47c6-b031-99faa48245bc",
            "a46c6f62-dd00-471b-a9f8-91906fc27c40",
            "7f8acb51-385e-4edc-b80f-ce890471c9d0",
            "15858512-8dda-46b5-b072-9fbfe14eced9",
            "b39883bc-b4f5-4508-850a-50b0750af8dc",
            "43e564f0-d69e-4f5e-ab3e-b5fb0656fae5",
            "9762d369-3d99-4415-983e-96f7a0cae01e",
            "277fd738-7079-4549-8966-e8f4c389ef8a",
            "8b54e762-a505-47da-9f24-77889588d09a",
            "328254da-f5f0-41f9-854a-5f7b7c35392b",
            "eb380ef6-b3c0-4026-962f-b72b0cc99754",
            "160d2eee-1214-4c1a-afc0-7cee08854331",
            "bff4a88d-2c0e-4589-9220-947f9f977c01",
            "d68e1d7a-3813-438a-9e75-bd1511057a58",
            "312747d6-ee60-4d76-a0ca-08dfb196f4de",
            "26d4d4ff-d132-4f77-a82e-f08bfa590f32",
            "4977a83f-72b8-473d-89a5-cd11b8e3553b",
            "c3e12adb-5a8c-4e48-928e-9ce715ddce5d",
            "c30cf822-2043-4800-b6c5-898971cd8b49",
            "ca0d89cf-b0fe-4ebc-a674-668750ea8966",
            "f5d0efd0-e910-41c4-9104-ff758b375b97",
            "febbb3aa-04d1-4302-aa42-a3bcb5aa4c7e",
            "68de354f-38aa-4ffa-84ab-cabff6a5d1a0",
            "9db08c24-a0a1-4633-aa13-07ba1b8aebc0",
            "d3b42b02-fc83-4794-ac7b-552c18668853",
            "558c0bad-f2bd-4573-816b-610def53e835",
            "072ac7ed-b352-42fe-92b3-aec2174eeef8",
            "be422604-8076-4524-8ecb-2f465cce7cb0",
            "2a269e40-72f7-4048-8557-fb9f19a02102",
            "a6351745-4f31-4dc0-b13b-6e0da54f33c8",
            "412cc8a2-1bac-4ba6-8975-9a19d8fc4a32",
            "70f93d06-3371-4f5e-a6dc-2a7c1a30b55e",
            "b523da08-4e32-48ea-863a-3c3160b19bc1",
            "3f3da54e-b429-4d27-98de-7fbcabb6c73b",
            "c8a49c5e-d055-4995-9e47-8d0da560f16a",
            "c0ccb29e-6747-4bf2-b836-141b1344e1af",
            "959698ef-5e33-404b-974f-0df70d317d65",
            "004d6623-2818-4f30-b3c1-71cb0ffc5f19",
            "6a40ed02-0382-4b78-b762-6e60f427de3d",
            "4b96eab9-a14c-40e6-8640-ff122f2ff429",
            "9c642b28-4519-4aa1-9abe-e367b5326e78",
            "cf3cbe4a-a86b-49e2-88da-fae43e8e7c8e",
            "0ac97c86-a815-48db-81b4-ef15ce8a12c4",
            "8b04a6e0-ba1c-4f0a-b03a-3d54998176bb",
            "600df5ea-02d6-4334-b1a5-4267b7f5a87a",
            "c896a1b1-fa26-4398-a3df-e34115b898e2",
            "7079142c-f2ff-4161-b658-abfd530363cb",
            "da00c465-a08c-434f-9d47-91574c9e4d6d",
            "ce7ced9c-102a-4fef-9329-6029e8bd25d1",
            "298fe159-adfd-4e59-bd01-8a1bee2a8273",
            "1a5bf23a-4832-4f3c-9f4d-1fb0e14365b1",
            "b4bf89aa-c36b-4bd2-a6da-82db088b3c02",
            "eaa2a5e5-2830-430c-beda-3510de162a01",
            "f19c1d29-24e9-467c-afc2-3a79f64c9edf",
            "89c0d6ed-dfc4-4238-b0d5-bf6d56c30c1f",
            "712579e7-4826-480b-84e6-d22a78daba3e",
            "34b79432-4c4c-4300-a3f5-db380544631c",
            "a3a14c22-87a2-4fd1-a50c-02704a259c6d",
            "4f179a19-ea69-4756-a347-5d6b4ba06991",
            "b6cbb549-47e9-4a8b-af73-ff9dd44a6930",
            "3814557f-da5b-4328-94c5-7819f2cc5bde",
            "911b8938-69a8-458f-bc35-3cb69d58e342",
            "81921b90-177c-497c-b7aa-11f0a9c4488a",
            "752fd352-e558-4bb9-ae87-fef993675704",
            "c80c51d8-fef4-4a4a-81aa-26849b88be1d",
            "c00404d8-756e-4c3d-89fe-6902e1186746",
            "0c6bcc77-c632-418f-97cf-f2d8e238d576",
            "79d57733-fced-4ed1-9488-3025bce109e6",
            "8cd7e4b7-8637-41c8-a60f-70b337c51012",
            "fe16f683-915e-423e-9200-5680de40b27a",
            "b9e7875b-dd58-4cac-b4a2-904982273461",
            "b0f9cf63-fc22-43dd-b29f-4eba3d0f9b15",
            "3c4f4f13-85f5-47ed-b02a-26552d901292",
            "738505e0-f375-4619-a43e-5190cdb36ec0",
            "19cf241b-71d4-4656-b278-2b14fefdc2b5",
            "46e11900-2209-4f2d-b9ca-a642db093901",
            "c9dbb403-7d4b-4d7e-9a01-84b47928dee0",
            "092c4ceb-0b7c-4918-a641-5115b09b27fd",
            "4450ffff-9542-4b7e-992f-29718d55dd71",
            "e81f4e0b-99f6-49a4-8e40-1a0f1dfc1591",
            "4aa9cd66-16e4-4b9e-9010-efb7d2b2dd68",
            "cbc525a6-8207-454b-a211-bed4aa2197f1",
            "e69ff5cb-eb96-4930-b10c-53b08071ff99",
            "8800eaa0-043a-484e-896c-8237c7ef146e",
            "b3d6c487-ca9b-4794-b701-ff46190ab7e0",
            "b10df278-d23e-4759-a644-246524f44289",
            "26ecacf1-cebb-4a3d-bbce-ee449cf6ac84",
            "7d449a10-0e00-4d45-8aad-247f8b194344",
            "55d7f178-e656-4fd5-81f3-c1c09503ece3",
            "5042118e-ad8c-4110-b3ce-f0aa0684c052",
            "044c5322-7e11-427b-9724-c67c44da69c4",
            "aca7ab62-d7b3-4054-b9e2-e0eb8047be41",
            "13f6c14a-c7f4-4113-8839-8c732eb2350f",
            "109af14f-35df-48e1-9217-89d178d24490",
            "6f220292-8205-4b30-9816-48333e1cccab",
            "21687a11-f2e5-4854-8794-8571de3afb77",
            "162a922a-34f0-4ffe-83d2-745b51a70417",
            "16118a47-7139-47de-aac3-36b746259461",
            "0394cfe3-316d-4975-b680-8bb727bf075f",
            "a555d9cb-1053-44c7-a9af-3e122e28004e",
            "25997142-4987-41cd-9271-ecc4ce308e1d",
            "10d61acf-12fe-43cd-8b2d-ab0019876f95",
            "58066d3c-f758-4e99-b417-08ce6ba8a719",
            "38ee54fb-dd06-4659-90d3-e59ea82b05e1",
            "8139615a-6cb6-45c7-9422-2e2108df00b6",
            "0dfbd3fa-43e9-4f3d-ab75-cb52bd45d8c6",
            "de1e42a1-4a6c-4b58-b474-dfcd791812d3",
            "547f063a-601e-421f-8ae1-0f0fa7fb3af6",
            "f98d3c17-7dbd-4bba-9c36-cab50b702636",
            "4c140cbe-bfcc-46a7-aa9c-6b2a5c7f3fe3",
            "2709e7fc-7fdd-4194-8240-8cf0ab8db788",
            "dffe2ab8-e5d8-4d1c-9e75-b84345d3993e",
            "5efbe66a-6dd9-4fac-a3d4-5c2876e81b0e",
            "725a107b-dbab-42df-b923-36e7a1dc21a9",
            "dd5e890a-11f5-4dac-ac5a-9c4289b603e1",
            "6db59f41-b5cf-4143-9ced-93d12243cb84",
            "33964c64-e714-46c0-aa4a-9e2adafe7a68",
            "75676668-ae44-4e11-9422-e5097ba012a6",
            "c419e6e5-1bb6-4bdf-bfb8-387e9ff097a7",
            "8faac5b6-32ba-44cb-a5ca-bdfacb1579c4",
            "1beb5977-506b-479a-b00d-5910090be2e7",
            "2bb2e458-513c-4a2a-b763-806967f40f01",
            "0f7fd8a3-08f1-4ef2-9db4-12531e49321b",
            "6d1673e6-ce9b-4189-85db-6c11513aef86",
            "840fe55c-6e91-4004-83da-513bd7dfc1e0",
            "c0e817f1-0b0a-47df-b6eb-79947a9d4fb2",
            "80809e0b-0873-49a1-9e57-0d96263fe1aa",
            "0d105749-8d21-4908-b006-a28d94a2aec6",
            "2a73ddce-c7ea-42c7-aedc-52dc76e2ca98",
            "20d51dd2-7ff0-4021-9371-d9613890d5a1",
            "af97ffac-71d5-48f3-94bf-aedead1cae3d",
            "f13d02c3-d468-4d8a-bbf1-df05abd960d4",
            "6764d910-a083-4a9d-a10d-e2f3ec63a1b4",
            "6da1ed63-496c-40d4-85bf-745d49486360",
            "ce8c7811-e5b8-48c6-b0b6-0c20fe9a4780",
            "6591108c-bb6b-4f65-ab88-070343d62f33",
            "948655e0-6b63-4228-ba53-ad976a696e5d",
            "b6a5d1f9-d2b8-4cf1-92be-b4d6112f418c",
            "ab72a765-a7ea-4fd5-925e-96b3a59bcaf3",
            "ecdace8b-b0f4-485c-9975-98cb67365a94",
            "04e64edb-f051-4c4e-8f3b-bb927101aa28",
            "fd4c6b5d-853c-4c7e-b45b-96c55bf23dad",
            "f79219cf-63eb-40d5-9483-7eb9807f9d4b",
            "47c705e1-f188-452c-a095-a220c7b2ef4f",
            "b88ff63d-8046-41e1-b950-e06ca635b5be",
            "b4415898-78ea-42fb-83c2-7b74aef94db0",
            "58838dce-1b9a-4e3b-b7ed-5148dbc52477",
            "07259b8b-0453-42c6-8311-45f16e1157d2",
            "49df4fdd-3e69-4e09-9be5-ca7d70c1120b",
            "cee87b80-88b5-4a02-b012-fe63ae894f8a",
            "f2653627-c63c-4a7d-aa8a-b6734df302ab",
            "a1f94a47-6441-49fa-be05-944e6220054d",
            "54d6367b-9cb8-434d-971a-013ece4d144e",
            "51400c90-d5e7-4886-819c-5d3087dd55c1",
            "ece28852-db49-4cbc-a90a-c31efef2e01b",
            "a01c402b-c0aa-4bb5-9584-4cf1d21c8f15",
            "dd6f77d1-6f7b-4371-8075-ebb3c76b6fa4",
            "04ce7012-2188-4c4d-bb99-0c5e6db96ed1",
            "ca21ae67-8dce-4e12-8c5e-82daf3ae9da5",
            "2cefdb4f-a3ad-4b9d-b4f1-53331f822cb7",
            "68818ca3-740b-4ca7-bf55-9c34c074a455",
            "615cbc22-290a-4f7c-94b2-5697fe797b1e",
            "b346853b-c683-4a0f-a308-9b2c51f0a282",
            "bea3d2e0-e3ea-469b-a6e5-0e71823bdedb",
            "752d0c3e-fabf-4d76-9de8-224fca7a70a6",
            "97d5e93a-0f8c-4ed0-95de-322d739ed553",
            "0d4e518b-3c8d-4106-bbd7-05c574c5dd0a",
            "0b0c5bc0-92e8-4377-b7cd-2b76e673f5a6",
            "5a3f1854-1a70-44e7-a6a3-412147858027",
            "654a14b9-a200-4571-8360-97f1e6209c34",
            "389f12f7-1a51-417e-9845-45d41740ed8d",
            "7cad815d-b00d-43c4-af79-17610d6adde4",
            "416ee8d4-469b-4e56-aa33-413d30c8ec7b",
            "cb862d71-afc3-4695-a600-83d23d896446",
            "8855f7d9-6539-47ff-890a-1ff966ad59de",
            "dbe947c3-b3b9-4f06-8163-79b4ecc98574",
            "af3a97d5-26f2-453b-bfcd-2cf7c46557a9",
            "280f545b-af66-4c70-ac0d-5bd7a4a1cbbb",
            "93927d7c-6dca-4477-bd90-61bb1c75db65",
            "0c6f9ad1-0bf9-41a0-ae50-04c1e5cadb14",
            "2c781bec-f35a-426d-838e-351a97dd2115",
            "8bae8757-8304-4487-9492-a9c94730c034",
            "1a99edc5-7037-4700-b340-3232ae6c58a3",
            "137099f0-3ac1-4a09-bdc1-4688da96f483",
            "88147c26-f775-4895-a074-29fe2ea626c1",
            "9b8948f8-94a2-4b3a-834a-db6a2e23214a",
            "e8115372-f320-4505-8424-3595b3972d8e",
            "72bc1e0c-a018-46d5-b102-e3d76f85cacd",
            "d53e096c-df6b-4e5b-af5b-38e32834f48f",
            "537ca034-f3f7-46e0-bcc0-8e4a6d1e6be8",
            "e5e09c98-54bf-4f65-b5cf-fded4acb874b",
            "3d62deb4-e31b-4672-90fc-ce9539e6bddd",
            "56a9ed7f-1a16-4b05-b454-0aa23fcffeb1",
            "07e3dfa3-38b2-4e15-a9c1-336b30ac1dc7",
            "2584577a-684a-487d-86f9-9703139fc5d2",
            "59d8cff0-cd59-48b3-87a6-aaecb87051cc",
            "615aaca1-03d4-4f10-aabe-6163c5375269",
            "7afbc167-967c-4e9d-a06d-78304ba80040",
            "a3cbe443-b617-44e6-9f6e-325fb8bb158c",
            "457ac4b7-45ad-49cf-8638-7b76e80161de",
            "3a95e2a1-cf24-4f20-a6bc-7ff926462454",
            "5f4001c7-8732-482f-abc3-0ee94d08bbf9",
            "db1442d8-5cfb-4510-aed0-0125bed61deb",
            "5f4026a9-a833-4821-99ac-fd99bc2a70d2",
            "c3adc9c9-41a1-4c46-b6fa-9edae306e7ce",
            "38abbeea-2e5c-40d7-a875-0364e75b165e",
            "e14cff8c-2bc6-4067-ac0f-c7f7303eb707",
            "e161a728-a726-4a3e-bde8-d77f5b3834a0",
            "323b610e-bc8a-43ed-8330-bfc7ab8fddce",
            "1f76c8fa-efec-44a1-895f-fbed444c2c98",
            "ef8a7aca-4a5d-4ad7-a3c0-dc3c5568f957",
            "620451a2-cb42-4733-a9c8-a9b1dbedd894",
            "25866085-91e6-40f7-bd14-65daf54f92b4",
            "e6860954-3941-4110-bc2b-85bc67ce34f4",
            "6931bf72-3832-4d1c-a731-bbab664ac424",
            "c3ee811f-450f-4139-8e80-72e6f6aab96c",
            "3039a481-c1c5-4c21-9c52-eaa6b551b79d",
            "c44d9cf0-3b24-4632-8e30-48b89c291fd7",
            "63324a2f-2476-409d-b0cc-31cb5a0e953d",
            "055ada48-892a-441b-a38a-e31515c9afc7",
            "40894ed0-cf00-48eb-b781-553fc757e489",
            "d8f0a5ac-e376-4672-ae71-68e9a4f644eb",
            "7f412451-bcf1-45ce-8309-51c5ca0550f9",
            "c68c41e1-1cac-46c1-aece-b513475250a6",
            "a08f591f-03fd-4bad-a52b-9f07a11e36e5",
            "1513ea34-7409-403e-b973-16936a22e383",
            "1bb93370-c140-4206-8e67-ff274f8ecc86",
            "76c3960a-b201-4d44-a7a7-b924315d4e64",
            "893bb28f-e679-4a61-af3d-ded6532c98c7",
            "ee459aec-6d42-4ca2-aadf-042a29cf6c62",
            "114609e4-e4b4-4474-a1f0-a012478d38a0",
            "2d9daa5d-01a3-4e04-a7e1-f6def4bb52c9",
            "70945f3e-d2ee-4143-a762-95469eb70f33",
            "9ff22fb7-52fb-469d-8677-66a1e579810e",
            "f8f2723e-6f7b-4c1e-964c-b2ed58c17d0f",
            "909bad9a-5b8b-4bdc-a9c5-b54452145d69",
            "8870d28f-7d9a-4f2f-978a-52c85f330d64",
            "414edecf-526a-4187-aef5-0d6cd0650a2d",
            "e4bfe0d3-65e6-4106-93e3-23b99e0cca89",
            "64e578a1-593e-4b86-89ea-3161d9d82c95",
            "ff3a9f2b-2cac-44a4-8065-a08d2b58f3c5",
            "e664247c-ac4c-4696-b92a-3b7a55dce0de",
            "0e53769a-bbfc-4804-88b5-180bea7bbc47",
            "eb400764-5921-4a75-a378-036648149a32",
            "9ba3ccca-a5e0-40a1-9cb8-343cc53ba49d",
            "3de4b86e-6e6c-4077-a65e-34808e168233",
            "9c3fa56e-7c5d-4f11-b242-aea448b0534a",
            "bc74be2c-402b-4100-897a-971abbf23374",
            "0cff6ebf-53d1-4547-89c8-2134c9f97f78",
            "66d6945a-f407-4312-906a-d4327f5c9666",
            "5aacdb94-e97e-4b28-b131-92fb7d87b485",
            "4c078013-7ca4-4227-92b7-0101f4562d40",
            "fdabbbb1-797a-4de7-8e5b-ff50d7e2e9fe",
            "3e6f3693-58a2-4281-95ed-d0ccc738557b",
            "ed156579-37ec-416f-b00f-328c31bba0be",
            "7b8a2c22-808e-4958-9931-013f041c19e3",
            "f42d9ccc-7ad0-4aff-8819-78a71ffbd707",
            "3272b01f-2d82-4e7f-af20-520d2b69b667",
            "0f88226b-2802-4e90-991c-ab7acdbf0a90",
            "5928e623-a8b9-4b91-8e8d-b87187e9dda1",
            "8b66e21c-b2ab-4097-bb98-7cc1abe22904",
            "c7990160-e5c0-4a43-b960-4adb643374b9",
            "bcde0970-be84-4a02-b8a4-e21d13511fbb",
            "8429f57e-3418-4715-b4e2-59c164768c92",
            "06e65d40-16a5-4834-a32c-00ee83eac834",
            "c63ffe31-23b9-4383-987b-7b06eb67197e",
            "c3d1e35e-df71-4c5c-8171-8d132d735849",
            "d7da399b-c514-40b2-a12e-c1ec4ab6ee87",
            "b74cba51-345b-4ded-bd4c-5aa86d0ae13c",
            "a836a39d-d8ac-4118-824c-226df2c9e3b0",
            "3efe3e12-459e-43ca-8ab7-28ff29408e11",
            "47fe11a7-3406-482a-8cc5-362a1707bfb4",
            "ec00f412-def4-4b6f-8ae2-0870b3acbed0",
            "590b947c-2a88-4c81-9a77-a42187c322a6",
            "46fa2f12-02c4-4993-bb95-9ca70b3d6d17",
            "c504f955-b06e-4f1e-bd80-dec6631cc6e6",
            "b02cd689-808d-4c53-b77a-513ed6e43a58",
            "893d88e2-1c0d-4c90-a1b4-60ed44c4e49f",
            "c1dbddcf-1f76-4330-81d5-cf73cf313cbb",
            "5b0b98c4-b717-4b02-8b35-e1299cf04bd9",
            "cf2475cf-2192-4bfd-ae88-21b121a5d717",
            "521b81b4-cdbe-4cc2-ae37-c2009761a483",
            "d3f5180d-7e6c-47bd-aedf-f8010d9a359b",
            "c4b71ee1-179b-4d10-8441-a539ad3d0764",
            "ac18e1b4-ff8b-4b63-8104-2fc03844fc2d",
            "bd7c5a7b-8950-4f1f-a504-21d248cd65fe",
            "ddc90ea9-5504-40a4-b7cc-d08d4042375d",
            "503fd740-f284-4fe8-864d-30f361a26352",
            "9e6e292b-2af6-4132-af07-54ea0ebf1785",
            "2e53db84-c5fa-4636-b8fa-b240b7d04958",
            "6e932e1a-b223-4ea3-b38a-7ae31d409597",
            "4aebda56-a2ac-4c29-95ef-8348460912d1",
            "293b3fd8-5738-4225-b74b-68c5ff6e2474",
            "3841d7a0-c443-4010-8590-c1b937f11166",
            "f2d9407b-9fd3-4f76-ae08-dc176da79866",
            "ffc102b9-3258-485b-a6af-c22bb78b09cd",
            "2d26fb75-0076-42b0-97be-ac4bc963e4db",
            "cefe20c3-daa3-4e49-a074-b8680b863fdf",
            "f556bd6a-8827-4c00-9e2b-4400753ff724",
            "b91f3b81-d5a1-4a92-90d0-5c304488c287",
            "f9c79d9c-cf9b-45ae-a1c4-43f2da789aa0",
            "d54817cf-5897-45b4-a7ce-b089571a39e3",
            "767bc9e9-8d5a-484e-a598-011f0e6c6a4c",
            "f8fd2a34-2675-4f90-8c8f-a48b9a184894",
            "f0114caa-a5ff-418c-be6a-076e1947a98b",
            "12822853-0165-4065-a8ca-ff8250875063",
            "3c5a9fad-7593-4db2-afa3-798b3db4f52f",
            "de666230-066f-40b3-ace4-1df68f5e1abe",
            "108271d3-a81a-4510-bc64-a003b09cf043",
            "41f59a1b-00d3-472a-9dcd-523fb182541e",
            "bd3ad041-c397-44de-967c-65f40b310b27",
            "e581d915-e8c5-4797-9f4d-445fca31975f",
            "e23285a5-e182-4959-bf35-4b0b79590e3f",
            "c5de886c-9d58-4cf7-a5ec-de82818cb47a",
            "451a21b4-99be-462e-961f-03df634f014d",
            "bcd4fb82-f13e-4f4f-b2a9-415c4e4b1b09",
            "74884c74-a7e8-4c51-b7cf-127c1ad3d736",
            "276311e6-981e-4841-bfdc-35d75df9d0a8",
            "72da9613-de0b-42ee-b488-3f0758b4c588",
            "500d5bd3-bf78-41aa-9534-a9f56cf6e0c6",
            "4138a7c5-6ee6-44d2-940d-b398152e7fda",
            "441f95e2-eb06-4392-9ae1-8eccd3866401",
            "5549460e-632c-4f57-9ed2-2b8a428636c1",
            "615ac6a2-907d-46f2-9dbe-01e6a8ac3366",
            "7c785cdf-ad39-4fa1-b6b9-3fd11223f2cd",
            "a7c3e615-180a-4656-b7fe-65efab8a8fa6",
            "4812cc41-bbdf-4eb2-8b70-a7f5df7d80af",
            "bb041c29-b8b6-4606-b7d9-65c3c1417416",
            "e8ebe2cc-b3f4-4f72-b880-85b3b8e1627c",
            "af52442b-d4bc-4bb2-9709-1bda6e3db054",
            "f0f72d04-5145-4c2b-9cbc-4a840734bca6",
            "aa29e331-9579-4b34-baf6-eb57628192b4",
            "146bf6ca-15c6-4c32-beb2-873ab99cdea6",
            "bb91f56e-7ee5-4c24-85ac-6a009ed9d90e",
            "2c3774db-89a4-44ee-a660-c0a9cba5a523",
            "18219dbc-15e6-414c-8204-46818ab10fd3",
            "d1b3021d-acc4-4df4-9d04-02aeb96de981",
            "fd4199d4-9527-4568-ba3f-0342bc436b0c",
            "c8c6c12c-4324-49cc-a8e4-366e11448f11",
            "3d09aebd-3f37-4d7b-bafc-4fe90469a2a6",
            "64ceabab-3805-4ee8-8c6d-f1e0bf647a31",
            "826d16f0-b52f-444a-8404-1b50bcc635d3",
            "dd98d272-2438-493a-ad3b-8da5a8bed11d",
            "c68e4228-3e3e-40b1-9ab1-958ee46c5eb4",
            "985ded71-2999-4715-811b-42f45ac2deb9",
            "e447f359-7a8a-417f-a578-db94d08fb900",
            "bc464aaa-750c-4e14-be2f-9f2093d0ac96",
            "a37d705f-733f-48c7-b342-9ff231e8453b",
            "961778a5-d0e3-409f-a7fc-5c065d28c552",
            "3a8a61db-511e-41ee-bbaa-7084f4a47699",
            "c8e6c376-7158-4812-b60d-e649b972d330",
            "d7c18769-869d-46ed-bdd6-667d70f4f3c4",
            "e7026bb2-55e3-4a25-b5f0-a846d01604d2"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 96.629906,
      "text": "Jacksonville Jaguars vs New York Jets",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.2508666,
          "height": 0.010716813,
          "left": 0.37393934,
          "top": 0.025767839
        },
        "polygon": [
          { "x": 0.37393934, "y": 0.025945503 },
          { "x": 0.6247996, "y": 0.025767839 },
          { "x": 0.6248059, "y": 0.036307734 },
          { "x": 0.3739451, "y": 0.03648465 }
        ]
      },
      "id": "1d340026-a860-48dd-9007-fc6c0c681755",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "beb4464b-72b7-4cfb-b4f2-e7577e2751a3",
            "6153456c-829f-4c9b-b1f9-09bafc85ed31",
            "93ca989a-d607-427a-bf0d-994fceffd260",
            "a60271b6-65da-41fe-8bb6-2c8ca93da4cd",
            "78c06033-17bc-4d5e-93bc-14db23769d78",
            "492167c2-a0c5-4eb5-b325-ada9495ebf99"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.74945,
      "text": "12/22/2022 at MetLife Stadium",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.20904034,
          "height": 0.009798345,
          "left": 0.39530283,
          "top": 0.040987637
        },
        "polygon": [
          { "x": 0.39530283, "y": 0.041134782 },
          { "x": 0.6043374, "y": 0.040987637 },
          { "x": 0.6043432, "y": 0.05063941 },
          { "x": 0.39530814, "y": 0.05078598 }
        ]
      },
      "id": "edbb56ea-37c1-4bf2-986f-0f1e79ddc283",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "8543cf6b-b2c3-42a7-8353-1c7299f57c62",
            "04697cd3-44f7-4aff-979b-97a2f573c75c",
            "82d99282-c685-4a0d-a8a1-a61b7db6d1ad",
            "abecfed0-f714-423a-9106-113bc21f4b82"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.891075,
      "text": "Final Individual Statistics",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.33224788,
          "height": 0.016855601,
          "left": 0.3340894,
          "top": 0.058207568
        },
        "polygon": [
          { "x": 0.3340894, "y": 0.058439814 },
          { "x": 0.6663271, "y": 0.058207568 },
          { "x": 0.66633725, "y": 0.074832484 },
          { "x": 0.33409834, "y": 0.07506317 }
        ]
      },
      "id": "cff84b1f-9976-4784-a0e6-d795e7505caa",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "52d24472-0d6b-4506-8764-c1128772680a",
            "22ad4ad0-a133-4bad-b756-96c7e6ee91ba",
            "34866464-a3d0-46ee-aac5-8d19e535f1f1"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.639046,
      "text": "Jacksonville Jaguars",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.16894771,
          "height": 0.013275986,
          "left": 0.17344591,
          "top": 0.08276078
        },
        "polygon": [
          { "x": 0.17344591, "y": 0.08287771 },
          { "x": 0.34238654, "y": 0.08276078 },
          { "x": 0.34239364, "y": 0.09592046 },
          { "x": 0.17345251, "y": 0.09603676 }
        ]
      },
      "id": "ab0b4359-e478-4544-9194-d8fa25f2504c",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "3114ff5e-aca0-4145-b2e3-30137c3ee450",
            "214368f8-12ce-40aa-9923-773f953656ff"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.780014,
      "text": "New York Jets",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11679513,
          "height": 0.010589217,
          "left": 0.679949,
          "top": 0.082910925
        },
        "polygon": [
          { "x": 0.679949, "y": 0.08299174 },
          { "x": 0.79673743, "y": 0.082910925 },
          { "x": 0.79674417, "y": 0.09341966 },
          { "x": 0.6799555, "y": 0.09350014 }
        ]
      },
      "id": "b534ebfc-a5f0-46c1-aedc-fb2ce9e5ac3f",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "9d9c78af-7a45-47f6-b132-b6da61d696be",
            "10272db2-623d-4ed3-be96-7f4c2991fd25",
            "c37dcc9e-60f0-4e49-8433-106cc3e938f0"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9493,
      "text": "RUSHING",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06332019,
          "height": 0.008318521,
          "left": 0.030870762,
          "top": 0.10067865
        },
        "polygon": [
          { "x": 0.030870762, "y": 0.10072216 },
          { "x": 0.09418695, "y": 0.10067865 },
          { "x": 0.094190955, "y": 0.10895381 },
          { "x": 0.030874653, "y": 0.10899717 }
        ]
      },
      "id": "48b2998e-a39b-4a35-acd8-28911a3debc6",
      "relationships": [
        { "type": "CHILD", "ids": ["c36899d6-2066-406c-9f76-75a0c2a600fd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.84084,
      "text": "ATT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025511459,
          "height": 0.008186394,
          "left": 0.27157885,
          "top": 0.10069691
        },
        "polygon": [
          { "x": 0.27157885, "y": 0.10071444 },
          { "x": 0.29708597, "y": 0.10069691 },
          { "x": 0.2970903, "y": 0.108865835 },
          { "x": 0.2715831, "y": 0.10888331 }
        ]
      },
      "id": "f156b725-b7cf-41d4-bccd-cede158f362f",
      "relationships": [
        { "type": "CHILD", "ids": ["5bd19877-488e-46a2-9f50-5bbde3ccca4d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.778564,
      "text": "YDS",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027236579,
          "height": 0.008295615,
          "left": 0.32018417,
          "top": 0.100574374
        },
        "polygon": [
          { "x": 0.32018417, "y": 0.10059309 },
          { "x": 0.34741628, "y": 0.100574374 },
          { "x": 0.34742075, "y": 0.10885134 },
          { "x": 0.3201886, "y": 0.10886999 }
        ]
      },
      "id": "93af8dd0-e734-4958-b446-bf5077cea66a",
      "relationships": [
        { "type": "CHILD", "ids": ["1eeeb766-6a6b-4dc5-a68d-df4b32db7e7d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94664,
      "text": "AVG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027564123,
          "height": 0.008172621,
          "left": 0.36607704,
          "top": 0.10061931
        },
        "polygon": [
          { "x": 0.36607704, "y": 0.10063825 },
          { "x": 0.39363667, "y": 0.10061931 },
          { "x": 0.39364117, "y": 0.10877306 },
          { "x": 0.36608148, "y": 0.10879193 }
        ]
      },
      "id": "0230f226-88f2-4904-b1dd-29550a736361",
      "relationships": [
        { "type": "CHILD", "ids": ["78f7ae9c-d7e3-4e28-9f3d-8ac4b23b1ffa"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93652,
      "text": "LG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01687999,
          "height": 0.008131756,
          "left": 0.42721075,
          "top": 0.100639425
        },
        "polygon": [
          { "x": 0.42721075, "y": 0.10065102 },
          { "x": 0.4440862, "y": 0.100639425 },
          { "x": 0.44409075, "y": 0.10875963 },
          { "x": 0.42721528, "y": 0.10877118 }
        ]
      },
      "id": "2f2df0ad-be09-4301-9bc2-0da78602f33b",
      "relationships": [
        { "type": "CHILD", "ids": ["f0800915-d382-4f37-b344-989c9279578f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95087,
      "text": "TD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018233312,
          "height": 0.007923082,
          "left": 0.46727568,
          "top": 0.100734204
        },
        "polygon": [
          { "x": 0.46727568, "y": 0.10074673 },
          { "x": 0.48550448, "y": 0.100734204 },
          { "x": 0.48550898, "y": 0.108644806 },
          { "x": 0.46728015, "y": 0.108657286 }
        ]
      },
      "id": "1f319f5d-a397-458f-b6be-5f6b2de4cfb4",
      "relationships": [
        { "type": "CHILD", "ids": ["19dff740-7810-4852-aae3-c7d057d3c4d3"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94609,
      "text": "RUSHING",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06323053,
          "height": 0.008324537,
          "left": 0.50666696,
          "top": 0.100609936
        },
        "polygon": [
          { "x": 0.50666696, "y": 0.10065337 },
          { "x": 0.56989264, "y": 0.100609936 },
          { "x": 0.5698975, "y": 0.10889118 },
          { "x": 0.5066717, "y": 0.10893447 }
        ]
      },
      "id": "a47434e6-34a5-41b1-ab38-6f5707f548f6",
      "relationships": [
        { "type": "CHILD", "ids": ["1c57ef5f-e490-41a4-9d60-020b009efddc"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.79075,
      "text": "ATT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02595038,
          "height": 0.008081506,
          "left": 0.74716544,
          "top": 0.10070211
        },
        "polygon": [
          { "x": 0.74716544, "y": 0.10071993 },
          { "x": 0.7731107, "y": 0.10070211 },
          { "x": 0.7731158, "y": 0.10876585 },
          { "x": 0.7471705, "y": 0.10878362 }
        ]
      },
      "id": "9ff1ba47-b9f4-4f3d-a0cd-4ebe08157299",
      "relationships": [
        { "type": "CHILD", "ids": ["fc36c00e-c853-4703-a322-0414905b0f2b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.80621,
      "text": "YDS",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027246386,
          "height": 0.008254482,
          "left": 0.79573363,
          "top": 0.10062406
        },
        "polygon": [
          { "x": 0.79573363, "y": 0.10064278 },
          { "x": 0.82297474, "y": 0.10062406 },
          { "x": 0.82298005, "y": 0.1088599 },
          { "x": 0.7957389, "y": 0.108878545 }
        ]
      },
      "id": "e80db046-0c7f-400b-8c1f-98237cc7954d",
      "relationships": [
        { "type": "CHILD", "ids": ["b96c6a47-f26e-4217-a1d0-fba040160c7c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.955124,
      "text": "AVG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02764088,
          "height": 0.008120094,
          "left": 0.8418414,
          "top": 0.10064234
        },
        "polygon": [
          { "x": 0.8418414, "y": 0.10066132 },
          { "x": 0.869477, "y": 0.10064234 },
          { "x": 0.8694823, "y": 0.10874351 },
          { "x": 0.84184664, "y": 0.108762436 }
        ]
      },
      "id": "6a6c3059-d35c-40dc-a791-e44f6b861e04",
      "relationships": [
        { "type": "CHILD", "ids": ["9e572a71-a554-43b1-8d8c-239059e3418b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93616,
      "text": "LG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016559677,
          "height": 0.008244549,
          "left": 0.9028616,
          "top": 0.10059877
        },
        "polygon": [
          { "x": 0.9028616, "y": 0.10061014 },
          { "x": 0.9194158, "y": 0.10059877 },
          { "x": 0.91942126, "y": 0.10883198 },
          { "x": 0.902867, "y": 0.10884332 }
        ]
      },
      "id": "0378c529-31ab-4287-9921-17bbc22c24b0",
      "relationships": [
        { "type": "CHILD", "ids": ["2a31a1b1-e756-4f10-8e6d-63175d8d1104"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95426,
      "text": "TD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018193487,
          "height": 0.00809383,
          "left": 0.9430541,
          "top": 0.10067905
        },
        "polygon": [
          { "x": 0.9430541, "y": 0.100691535 },
          { "x": 0.96124214, "y": 0.10067905 },
          { "x": 0.96124756, "y": 0.108760424 },
          { "x": 0.9430595, "y": 0.108772874 }
        ]
      },
      "id": "6f36ee60-7cac-425d-ac8d-98ca18af324f",
      "relationships": [
        { "type": "CHILD", "ids": ["c5f0436b-0440-453b-b6e5-db103eb2ae37"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.25138,
      "text": "T.Etienne",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.055045627,
          "height": 0.008448913,
          "left": 0.030528199,
          "top": 0.11873914
        },
        "polygon": [
          { "x": 0.030528199, "y": 0.11877669 },
          { "x": 0.08556977, "y": 0.11873914 },
          { "x": 0.08557382, "y": 0.12715065 },
          { "x": 0.030532155, "y": 0.12718806 }
        ]
      },
      "id": "3cab7a51-b1be-4722-b72c-b39b8c48b533",
      "relationships": [
        { "type": "CHILD", "ids": ["7cbbaa20-4d86-4dc3-8b10-368090f0b8b6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.91164,
      "text": "22",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013786593,
          "height": 0.008267937,
          "left": 0.2825525,
          "top": 0.11880463
        },
        "polygon": [
          { "x": 0.2825525, "y": 0.118814036 },
          { "x": 0.29633474, "y": 0.11880463 },
          { "x": 0.2963391, "y": 0.1270632 },
          { "x": 0.28255683, "y": 0.12707257 }
        ]
      },
      "id": "1cff0408-db89-49ed-bb51-0b8e7f8a3ad4",
      "relationships": [
        { "type": "CHILD", "ids": ["4c85eaaf-91ae-4cfc-a7bd-0248bb3fce8f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.967865,
      "text": "83",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013855694,
          "height": 0.008246318,
          "left": 0.33302602,
          "top": 0.11888352
        },
        "polygon": [
          { "x": 0.33302602, "y": 0.11889296 },
          { "x": 0.34687728, "y": 0.11888352 },
          { "x": 0.34688172, "y": 0.12712042 },
          { "x": 0.33303046, "y": 0.12712984 }
        ]
      },
      "id": "d4428837-821b-43ae-bdb4-223bbcb05f38",
      "relationships": [
        { "type": "CHILD", "ids": ["a6dabbe0-8294-44b5-ae12-743b3017f823"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96984,
      "text": "3.8",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018089026,
          "height": 0.008524849,
          "left": 0.37565172,
          "top": 0.118694365
        },
        "polygon": [
          { "x": 0.37565172, "y": 0.1187067 },
          { "x": 0.39373606, "y": 0.118694365 },
          { "x": 0.39374074, "y": 0.12720692 },
          { "x": 0.37565637, "y": 0.12721922 }
        ]
      },
      "id": "7fa99926-b672-41ce-90f3-c8e2ed322526",
      "relationships": [
        { "type": "CHILD", "ids": ["8da799e8-9b93-472c-ba92-b9b9a0705cf5"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97249,
      "text": "19",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013474266,
          "height": 0.008318897,
          "left": 0.43046147,
          "top": 0.118863225
        },
        "polygon": [
          { "x": 0.43046147, "y": 0.11887241 },
          { "x": 0.44393104, "y": 0.118863225 },
          { "x": 0.44393572, "y": 0.12717296 },
          { "x": 0.4304661, "y": 0.12718213 }
        ]
      },
      "id": "67957e78-6848-4c0c-ae21-002e9d968256",
      "relationships": [
        { "type": "CHILD", "ids": ["4083382a-10f6-442b-97fb-40dd32daf7d8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76559,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070111463,
          "height": 0.008002108,
          "left": 0.47851232,
          "top": 0.11905746
        },
        "polygon": [
          { "x": 0.47851232, "y": 0.11906224 },
          { "x": 0.48551887, "y": 0.11905746 },
          { "x": 0.48552346, "y": 0.12705481 },
          { "x": 0.47851685, "y": 0.12705956 }
        ]
      },
      "id": "16663bf3-d9d0-4ff2-a5ae-777218a239c7",
      "relationships": [
        { "type": "CHILD", "ids": ["81c73e48-449a-41a2-a1c5-afbe0363991e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.168495,
      "text": "C.Streveler",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06310398,
          "height": 0.008746873,
          "left": 0.50650656,
          "top": 0.11855008
        },
        "polygon": [
          { "x": 0.50650656, "y": 0.11859311 },
          { "x": 0.5696054, "y": 0.11855008 },
          { "x": 0.56961054, "y": 0.12725407 },
          { "x": 0.50651157, "y": 0.12729695 }
        ]
      },
      "id": "3af8fd01-c5ac-422f-8184-e0a8c53f8844",
      "relationships": [
        { "type": "CHILD", "ids": ["b85dd474-72a3-4dd8-b917-241409406c65"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.977196,
      "text": "9",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070813233,
          "height": 0.008206604,
          "left": 0.7652056,
          "top": 0.118930295
        },
        "polygon": [
          { "x": 0.7652056, "y": 0.118935116 },
          { "x": 0.77228177, "y": 0.118930295 },
          { "x": 0.77228695, "y": 0.12713209 },
          { "x": 0.7652108, "y": 0.1271369 }
        ]
      },
      "id": "cb99ca82-9d86-4cae-9996-4706352d34f0",
      "relationships": [
        { "type": "CHILD", "ids": ["2fd5349e-a883-4c5a-b820-c800da9ea0f0"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98514,
      "text": "54",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013977434,
          "height": 0.0082926415,
          "left": 0.8089073,
          "top": 0.11883553
        },
        "polygon": [
          { "x": 0.8089073, "y": 0.11884506 },
          { "x": 0.8228794, "y": 0.11883553 },
          { "x": 0.82288474, "y": 0.12711868 },
          { "x": 0.80891263, "y": 0.12712817 }
        ]
      },
      "id": "a88d2a67-ada0-4d8f-85dd-167ccc3fa731",
      "relationships": [
        { "type": "CHILD", "ids": ["737029ef-7417-40ff-8b0a-e8e3ebe54906"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9768,
      "text": "6.0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018257927,
          "height": 0.0083645955,
          "left": 0.85129565,
          "top": 0.11876723
        },
        "polygon": [
          { "x": 0.85129565, "y": 0.11877968 },
          { "x": 0.86954814, "y": 0.11876723 },
          { "x": 0.8695536, "y": 0.12711942 },
          { "x": 0.85130113, "y": 0.12713183 }
        ]
      },
      "id": "e8c0e507-680c-45e4-80c4-6146f75b3ff7",
      "relationships": [
        { "type": "CHILD", "ids": ["24cde0c7-71b9-4c8d-8cbe-e12b2cc805b9"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98139,
      "text": "14",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0132470755,
          "height": 0.008154375,
          "left": 0.9063393,
          "top": 0.11888356
        },
        "polygon": [
          { "x": 0.9063393, "y": 0.11889259 },
          { "x": 0.91958094, "y": 0.11888356 },
          { "x": 0.91958636, "y": 0.12702893 },
          { "x": 0.90634465, "y": 0.12703793 }
        ]
      },
      "id": "3a5c0154-69f3-4561-a68d-93b1a85b42f5",
      "relationships": [
        { "type": "CHILD", "ids": ["fa712d01-942e-4f16-844d-f8110d461f02"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.735504,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007199733,
          "height": 0.008130793,
          "left": 0.95427805,
          "top": 0.118939266
        },
        "polygon": [
          { "x": 0.95427805, "y": 0.11894417 },
          { "x": 0.96147233, "y": 0.118939266 },
          { "x": 0.9614778, "y": 0.12706517 },
          { "x": 0.95428354, "y": 0.12707005 }
        ]
      },
      "id": "be432f1f-9b32-43d8-b03d-c4f80c70a938",
      "relationships": [
        { "type": "CHILD", "ids": ["4011bab6-e958-4ddd-a247-9220ce515269"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.47023,
      "text": "T.Lawrence",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06774046,
          "height": 0.008747728,
          "left": 0.02995048,
          "top": 0.13375464
        },
        "polygon": [
          { "x": 0.02995048, "y": 0.13380055 },
          { "x": 0.09768673, "y": 0.13375464 },
          { "x": 0.09769095, "y": 0.14245662 },
          { "x": 0.029954571, "y": 0.14250237 }
        ]
      },
      "id": "71110b40-fd08-40ff-897c-e801a9981406",
      "relationships": [
        { "type": "CHILD", "ids": ["c59f404a-0c15-4504-8ce8-8a5790a8b18b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.90992,
      "text": "7",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0071775587,
          "height": 0.008120947,
          "left": 0.28944525,
          "top": 0.13395691
        },
        "polygon": [
          { "x": 0.28944525, "y": 0.13396177 },
          { "x": 0.2966185, "y": 0.13395691 },
          { "x": 0.2966228, "y": 0.14207302 },
          { "x": 0.2894495, "y": 0.14207786 }
        ]
      },
      "id": "0a64c3f0-bd92-4fa5-8bb0-134848f6f3e3",
      "relationships": [
        { "type": "CHILD", "ids": ["5d7f8421-a453-4298-bb75-5c8894c2c42f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.8804,
      "text": "51",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013188369,
          "height": 0.008324276,
          "left": 0.33325294,
          "top": 0.13398474
        },
        "polygon": [
          { "x": 0.33325294, "y": 0.13399367 },
          { "x": 0.3464368, "y": 0.13398474 },
          { "x": 0.3464413, "y": 0.14230011 },
          { "x": 0.3332574, "y": 0.14230901 }
        ]
      },
      "id": "964db4fb-b540-4d91-9a66-e3de9769577e",
      "relationships": [
        { "type": "CHILD", "ids": ["828357e7-57df-48ed-8929-fd744d7ce1a1"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.952484,
      "text": "7.3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017824875,
          "height": 0.008414025,
          "left": 0.3756309,
          "top": 0.13392755
        },
        "polygon": [
          { "x": 0.3756309, "y": 0.13393962 },
          { "x": 0.39345115, "y": 0.13392755 },
          { "x": 0.39345577, "y": 0.14232954 },
          { "x": 0.37563547, "y": 0.14234157 }
        ]
      },
      "id": "a4082258-4a6c-464a-a9c3-abb17f3ddce2",
      "relationships": [
        { "type": "CHILD", "ids": ["b241ca10-a045-4a2e-9f42-afc8663eb777"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95264,
      "text": "15",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013497399,
          "height": 0.008209742,
          "left": 0.430552,
          "top": 0.13406804
        },
        "polygon": [
          { "x": 0.430552, "y": 0.13407719 },
          { "x": 0.4440448, "y": 0.13406804 },
          { "x": 0.4440494, "y": 0.14226867 },
          { "x": 0.43055657, "y": 0.14227779 }
        ]
      },
      "id": "de201b53-1cbf-4156-99b4-14fb93679e40",
      "relationships": [
        { "type": "CHILD", "ids": ["51da1c47-689c-4bbb-991a-7653fe1026f5"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.897156,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0056555187,
          "height": 0.008102313,
          "left": 0.47925195,
          "top": 0.13417833
        },
        "polygon": [
          { "x": 0.47925195, "y": 0.13418216 },
          { "x": 0.48490283, "y": 0.13417833 },
          { "x": 0.48490745, "y": 0.14227682 },
          { "x": 0.47925654, "y": 0.14228064 }
        ]
      },
      "id": "87fb8a9d-9d48-49a5-91cc-8062e7605736",
      "relationships": [
        { "type": "CHILD", "ids": ["e49ec060-2864-49c3-b9df-69baf9a23eae"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.53875,
      "text": "T.Johnson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.058874108,
          "height": 0.008580948,
          "left": 0.5058426,
          "top": 0.13381489
        },
        "polygon": [
          { "x": 0.5058426, "y": 0.13385479 },
          { "x": 0.56471175, "y": 0.13381489 },
          { "x": 0.56471676, "y": 0.14235608 },
          { "x": 0.5058476, "y": 0.14239584 }
        ]
      },
      "id": "82dc9d35-a7fd-435e-8c7f-6ddd92d43a9e",
      "relationships": [
        { "type": "CHILD", "ids": ["d982a32b-539b-4fcd-a4fb-78bef32b35a4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93347,
      "text": "2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069116782,
          "height": 0.008038885,
          "left": 0.7654544,
          "top": 0.13411641
        },
        "polygon": [
          { "x": 0.7654544, "y": 0.13412109 },
          { "x": 0.772361, "y": 0.13411641 },
          { "x": 0.7723661, "y": 0.14215063 },
          { "x": 0.7654595, "y": 0.14215529 }
        ]
      },
      "id": "1fdd7fa7-ea9f-481b-927e-8da61bec9a41",
      "relationships": [
        { "type": "CHILD", "ids": ["a6e9a2f9-5985-4bca-86fc-dd553f4708dc"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94213,
      "text": "7",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0073909103,
          "height": 0.008103148,
          "left": 0.81551427,
          "top": 0.13402894
        },
        "polygon": [
          { "x": 0.81551427, "y": 0.13403395 },
          { "x": 0.82289994, "y": 0.13402894 },
          { "x": 0.8229052, "y": 0.14212711 },
          { "x": 0.81551945, "y": 0.14213209 }
        ]
      },
      "id": "8eefd441-c977-4832-a43d-b139148716cd",
      "relationships": [
        { "type": "CHILD", "ids": ["62104052-2244-4405-91f4-98dce796f4f6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97241,
      "text": "3.5",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017980218,
          "height": 0.008252972,
          "left": 0.8514394,
          "top": 0.1342092
        },
        "polygon": [
          { "x": 0.8514394, "y": 0.13422137 },
          { "x": 0.86941427, "y": 0.1342092 },
          { "x": 0.86941963, "y": 0.14245003 },
          { "x": 0.8514448, "y": 0.14246216 }
        ]
      },
      "id": "79f65381-0a6e-4cde-ab66-c5a2eb4197fa",
      "relationships": [
        { "type": "CHILD", "ids": ["6a0c55ba-2914-4352-b9d1-e79a11534dbd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95561,
      "text": "6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070114415,
          "height": 0.00816241,
          "left": 0.91255647,
          "top": 0.13399132
        },
        "polygon": [
          { "x": 0.91255647, "y": 0.13399607 },
          { "x": 0.9195625, "y": 0.13399132 },
          { "x": 0.91956794, "y": 0.142149 },
          { "x": 0.9125619, "y": 0.14215373 }
        ]
      },
      "id": "66bda997-f10b-4f80-91fa-f1bdc520dd24",
      "relationships": [
        { "type": "CHILD", "ids": ["f5a9e410-a77f-487c-a21e-3a63d5da0b81"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.77944,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007028851,
          "height": 0.007966463,
          "left": 0.9542863,
          "top": 0.13428414
        },
        "polygon": [
          { "x": 0.9542863, "y": 0.1342889 },
          { "x": 0.9613098, "y": 0.13428414 },
          { "x": 0.96131516, "y": 0.14224586 },
          { "x": 0.95429164, "y": 0.14225061 }
        ]
      },
      "id": "2b10d6d6-64b1-40d1-9278-3792ad8f6e07",
      "relationships": [
        { "type": "CHILD", "ids": ["0c927674-f663-4bbf-9d47-8e8d6760438f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87579,
      "text": "J.Hasty",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04261515,
          "height": 0.010205532,
          "left": 0.030080544,
          "top": 0.1490717
        },
        "polygon": [
          { "x": 0.030080544, "y": 0.1491004 },
          { "x": 0.072690815, "y": 0.1490717 },
          { "x": 0.072695695, "y": 0.15924865 },
          { "x": 0.030085327, "y": 0.15927723 }
        ]
      },
      "id": "da4bf8e5-e4d0-4418-98db-9cb998f902e7",
      "relationships": [
        { "type": "CHILD", "ids": ["802276db-80bb-4669-bba7-482ffaae0558"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94018,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0064976267,
          "height": 0.00820136,
          "left": 0.28973222,
          "top": 0.14919843
        },
        "polygon": [
          { "x": 0.28973222, "y": 0.14920281 },
          { "x": 0.29622552, "y": 0.14919843 },
          { "x": 0.29622987, "y": 0.15739544 },
          { "x": 0.28973654, "y": 0.15739979 }
        ]
      },
      "id": "4018313e-5c62-4204-8bbe-9d870b47c15a",
      "relationships": [
        { "type": "CHILD", "ids": ["cf27655c-9200-481c-b245-702236594593"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9849,
      "text": "10",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013471848,
          "height": 0.00820061,
          "left": 0.33377802,
          "top": 0.14925106
        },
        "polygon": [
          { "x": 0.33377802, "y": 0.14926012 },
          { "x": 0.34724545, "y": 0.14925106 },
          { "x": 0.34724987, "y": 0.15744263 },
          { "x": 0.33378243, "y": 0.15745166 }
        ]
      },
      "id": "aa7d9082-eaf4-4026-9f76-773566fa466d",
      "relationships": [
        { "type": "CHILD", "ids": ["20f95448-2dd7-43e7-a31f-0e2c7b698c01"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94925,
      "text": "3.3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017788492,
          "height": 0.008453,
          "left": 0.375682,
          "top": 0.14902993
        },
        "polygon": [
          { "x": 0.375682, "y": 0.14904189 },
          { "x": 0.39346585, "y": 0.14902993 },
          { "x": 0.39347047, "y": 0.15747099 },
          { "x": 0.3756866, "y": 0.15748292 }
        ]
      },
      "id": "efca61dc-41c0-40e6-96a9-33ba9de61aa8",
      "relationships": [
        { "type": "CHILD", "ids": ["813fb0f4-6bd4-452c-ad07-12c543de367d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97236,
      "text": "6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0072253156,
          "height": 0.008341952,
          "left": 0.43682083,
          "top": 0.1490317
        },
        "polygon": [
          { "x": 0.43682083, "y": 0.14903656 },
          { "x": 0.4440415, "y": 0.1490317 },
          { "x": 0.44404617, "y": 0.15736881 },
          { "x": 0.4368255, "y": 0.15737365 }
        ]
      },
      "id": "112f62c6-7f5b-4fc3-aefe-88009598917e",
      "relationships": [
        { "type": "CHILD", "ids": ["a66e3b7f-6cf0-4bc9-89d8-aecf559c93d8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.63108,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007029392,
          "height": 0.0081963325,
          "left": 0.47857282,
          "top": 0.14921877
        },
        "polygon": [
          { "x": 0.47857282, "y": 0.1492235 },
          { "x": 0.48559752, "y": 0.14921877 },
          { "x": 0.4856022, "y": 0.15741038 },
          { "x": 0.47857746, "y": 0.1574151 }
        ]
      },
      "id": "4dfaf5b1-9171-4057-a5a4-952b05d30d03",
      "relationships": [
        { "type": "CHILD", "ids": ["0988684b-1346-4f06-aad5-13d8b32c0e46"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.58202,
      "text": "Mi.Carter",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.052300587,
          "height": 0.008290964,
          "left": 0.5066458,
          "top": 0.14919114
        },
        "polygon": [
          { "x": 0.5066458, "y": 0.14922635 },
          { "x": 0.55894154, "y": 0.14919114 },
          { "x": 0.5589464, "y": 0.15744701 },
          { "x": 0.50665057, "y": 0.1574821 }
        ]
      },
      "id": "0433163f-4f79-4b6b-8d07-159177086709",
      "relationships": [
        { "type": "CHILD", "ids": ["7dc3367e-5e3f-4522-96be-cd7323acce9f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.80316,
      "text": "2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067185177,
          "height": 0.007969294,
          "left": 0.76560324,
          "top": 0.1492244
        },
        "polygon": [
          { "x": 0.76560324, "y": 0.14922893 },
          { "x": 0.77231675, "y": 0.1492244 },
          { "x": 0.77232176, "y": 0.15718919 },
          { "x": 0.7656083, "y": 0.1571937 }
        ]
      },
      "id": "e7267284-e47a-45f8-bee1-d13e877933d2",
      "relationships": [
        { "type": "CHILD", "ids": ["b46d9114-c9e7-49a6-9a8a-d942be8a0cd7"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97188,
      "text": "6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007006082,
          "height": 0.00812298,
          "left": 0.8158155,
          "top": 0.14911859
        },
        "polygon": [
          { "x": 0.8158155, "y": 0.1491233 },
          { "x": 0.8228164, "y": 0.14911859 },
          { "x": 0.8228216, "y": 0.15723686 },
          { "x": 0.81582075, "y": 0.15724155 }
        ]
      },
      "id": "4d706280-e9fa-44d4-99d7-c549fba21d1c",
      "relationships": [
        { "type": "CHILD", "ids": ["3ec41671-4f7f-43ac-b876-f95a3d85bc59"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.983505,
      "text": "3.0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018027514,
          "height": 0.008217358,
          "left": 0.8514902,
          "top": 0.1492956
        },
        "polygon": [
          { "x": 0.8514902, "y": 0.14930773 },
          { "x": 0.8695123, "y": 0.1492956 },
          { "x": 0.8695177, "y": 0.15750086 },
          { "x": 0.8514955, "y": 0.15751296 }
        ]
      },
      "id": "5263d690-2174-4804-92e3-6a1a3eac8deb",
      "relationships": [
        { "type": "CHILD", "ids": ["9d87a507-cf54-4b68-85e2-fd64f9b25763"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.928856,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006496515,
          "height": 0.008098535,
          "left": 0.9126191,
          "top": 0.1493499
        },
        "polygon": [
          { "x": 0.9126191, "y": 0.14935426 },
          { "x": 0.91911024, "y": 0.1493499 },
          { "x": 0.91911566, "y": 0.15744407 },
          { "x": 0.9126245, "y": 0.15744843 }
        ]
      },
      "id": "fb116bdb-756e-40b3-9016-734d70bf2b2f",
      "relationships": [
        { "type": "CHILD", "ids": ["bc06907e-925f-4afc-b8c2-93d41432c72b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.77215,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069992407,
          "height": 0.007981281,
          "left": 0.95435786,
          "top": 0.14942452
        },
        "polygon": [
          { "x": 0.95435786, "y": 0.14942923 },
          { "x": 0.96135175, "y": 0.14942452 },
          { "x": 0.9613571, "y": 0.15740111 },
          { "x": 0.9543633, "y": 0.15740581 }
        ]
      },
      "id": "1c9641e5-7659-447c-a073-4300414a1f4c",
      "relationships": [
        { "type": "CHILD", "ids": ["0dc73226-14b5-48e1-9a98-64801f263863"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.98246,
      "text": "S.Conner",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05256376,
          "height": 0.008594126,
          "left": 0.030767279,
          "top": 0.16402572
        },
        "polygon": [
          { "x": 0.030767279, "y": 0.1640609 },
          { "x": 0.08332691, "y": 0.16402572 },
          { "x": 0.08333104, "y": 0.1725848 },
          { "x": 0.030771304, "y": 0.17261985 }
        ]
      },
      "id": "c4be5b6b-3c88-4189-ba7f-1358798f0e7a",
      "relationships": [
        { "type": "CHILD", "ids": ["d7eff14f-f47d-42ba-91ff-f0a1d9f49996"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.8914,
      "text": "2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067851907,
          "height": 0.008036404,
          "left": 0.2897013,
          "top": 0.16443889
        },
        "polygon": [
          { "x": 0.2897013, "y": 0.16444343 },
          { "x": 0.29648224, "y": 0.16443889 },
          { "x": 0.2964865, "y": 0.17247078 },
          { "x": 0.28970554, "y": 0.1724753 }
        ]
      },
      "id": "77259fca-86c7-4ec0-a02b-2b92f870d9e3",
      "relationships": [
        { "type": "CHILD", "ids": ["58a9b673-1841-47d2-8272-ce896d0c67d5"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.892654,
      "text": "5",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006714143,
          "height": 0.008152063,
          "left": 0.34057865,
          "top": 0.16435008
        },
        "polygon": [
          { "x": 0.34057865, "y": 0.16435458 },
          { "x": 0.34728837, "y": 0.16435008 },
          { "x": 0.34729278, "y": 0.17249767 },
          { "x": 0.34058303, "y": 0.17250215 }
        ]
      },
      "id": "c0502015-63b4-403d-baad-cb54affad99d",
      "relationships": [
        { "type": "CHILD", "ids": ["467f4b04-4e56-4e89-ac5c-c838732c8f87"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95091,
      "text": "2.5",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018057227,
          "height": 0.008284753,
          "left": 0.37567574,
          "top": 0.16433714
        },
        "polygon": [
          { "x": 0.37567574, "y": 0.16434921 },
          { "x": 0.3937284, "y": 0.16433714 },
          { "x": 0.39373296, "y": 0.17260985 },
          { "x": 0.37568027, "y": 0.17262189 }
        ]
      },
      "id": "bde00ee7-a183-43f3-bd44-65c0d1107bdb",
      "relationships": [
        { "type": "CHILD", "ids": ["92918763-daf9-43f6-b19e-017cb737d6c0"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.925735,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067807627,
          "height": 0.008212495,
          "left": 0.43693575,
          "top": 0.16432887
        },
        "polygon": [
          { "x": 0.43693575, "y": 0.1643334 },
          { "x": 0.4437119, "y": 0.16432887 },
          { "x": 0.4437165, "y": 0.17253685 },
          { "x": 0.43694034, "y": 0.17254137 }
        ]
      },
      "id": "74d0a713-910f-498e-b1f1-1efda3b463c1",
      "relationships": [
        { "type": "CHILD", "ids": ["833bbe4d-69d0-44d2-946f-a277d3ea8fa0"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.697334,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070151677,
          "height": 0.007994932,
          "left": 0.478567,
          "top": 0.16448773
        },
        "polygon": [
          { "x": 0.478567, "y": 0.16449243 },
          { "x": 0.4855776, "y": 0.16448773 },
          { "x": 0.48558217, "y": 0.17247799 },
          { "x": 0.47857153, "y": 0.17248267 }
        ]
      },
      "id": "3e8c06d9-e19a-4322-890e-383e57a4c393",
      "relationships": [
        { "type": "CHILD", "ids": ["d91eebbc-3572-407f-bf3c-b501ea82362e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.62727,
      "text": "Z.Wilson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04834003,
          "height": 0.00841092,
          "left": 0.50665647,
          "top": 0.16423205
        },
        "polygon": [
          { "x": 0.50665647, "y": 0.16426438 },
          { "x": 0.5549916, "y": 0.16423205 },
          { "x": 0.5549965, "y": 0.17261074 },
          { "x": 0.5066613, "y": 0.17264296 }
        ]
      },
      "id": "e387f032-153a-42b8-a6b3-c348d6c208cb",
      "relationships": [
        { "type": "CHILD", "ids": ["c6935cb8-309b-4a39-ac0d-b77240cd0764"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.90973,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0059101814,
          "height": 0.007741589,
          "left": 0.7659708,
          "top": 0.16471115
        },
        "polygon": [
          { "x": 0.7659708, "y": 0.1647151 },
          { "x": 0.7718761, "y": 0.16471115 },
          { "x": 0.77188104, "y": 0.1724488 },
          { "x": 0.7659757, "y": 0.17245273 }
        ]
      },
      "id": "5c92105d-0d1c-4083-95c0-825e34d4f5b5",
      "relationships": [
        { "type": "CHILD", "ids": ["a2cfece8-a6cf-45e8-b329-15c4492de324"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92144,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0057518044,
          "height": 0.00777172,
          "left": 0.8166217,
          "top": 0.164691
        },
        "polygon": [
          { "x": 0.8166217, "y": 0.16469485 },
          { "x": 0.82236856, "y": 0.164691 },
          { "x": 0.82237357, "y": 0.17245889 },
          { "x": 0.8166267, "y": 0.17246272 }
        ]
      },
      "id": "dbf0873d-ae9b-4631-a350-368f1f7b677a",
      "relationships": [
        { "type": "CHILD", "ids": ["7c0aaa4b-2ce0-4bbd-8e71-658a6212f32e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98434,
      "text": "1.0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0174079,
          "height": 0.00800058,
          "left": 0.85217255,
          "top": 0.16453467
        },
        "polygon": [
          { "x": 0.85217255, "y": 0.16454631 },
          { "x": 0.8695752, "y": 0.16453467 },
          { "x": 0.86958045, "y": 0.17252365 },
          { "x": 0.85217774, "y": 0.17253526 }
        ]
      },
      "id": "d96469b4-32bf-42e5-ba75-01e418e73e98",
      "relationships": [
        { "type": "CHILD", "ids": ["208da0e9-7691-4b16-a732-a1d2c42cae63"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89903,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0054293475,
          "height": 0.007893579,
          "left": 0.9133361,
          "top": 0.16464649
        },
        "polygon": [
          { "x": 0.9133361, "y": 0.16465013 },
          { "x": 0.9187602, "y": 0.16464649 },
          { "x": 0.9187654, "y": 0.17253646 },
          { "x": 0.91334134, "y": 0.17254007 }
        ]
      },
      "id": "341f5192-fcb7-4464-b5ea-574b4d6fdf6b",
      "relationships": [
        { "type": "CHILD", "ids": ["537e80c0-9564-4a2a-ac83-4e802997e5ea"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.81535,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069823754,
          "height": 0.0078105987,
          "left": 0.95437026,
          "top": 0.16462676
        },
        "polygon": [
          { "x": 0.95437026, "y": 0.16463143 },
          { "x": 0.96134734, "y": 0.16462676 },
          { "x": 0.9613526, "y": 0.1724327 },
          { "x": 0.9543755, "y": 0.17243735 }
        ]
      },
      "id": "9fa45812-7864-4df7-9b09-783bf1cad270",
      "relationships": [
        { "type": "CHILD", "ids": ["822f9e55-b8d4-47c9-8ec7-515935af3751"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.53029,
      "text": "C.Kirk",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.034304563,
          "height": 0.008289037,
          "left": 0.030565418,
          "top": 0.17934048
        },
        "polygon": [
          { "x": 0.030565418, "y": 0.17936328 },
          { "x": 0.06486603, "y": 0.17934048 },
          { "x": 0.06486998, "y": 0.18760678 },
          { "x": 0.030569306, "y": 0.18762952 }
        ]
      },
      "id": "39c94e28-3a1b-4d96-8a6c-9c7fdefb6c39",
      "relationships": [
        { "type": "CHILD", "ids": ["8f779d8d-c643-4648-95cf-6780148e6c13"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.83055,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.005809049,
          "height": 0.0077056824,
          "left": 0.2903218,
          "top": 0.1799638
        },
        "polygon": [
          { "x": 0.2903218, "y": 0.17996766 },
          { "x": 0.29612678, "y": 0.1799638 },
          { "x": 0.29613087, "y": 0.18766564 },
          { "x": 0.29032588, "y": 0.18766949 }
        ]
      },
      "id": "4d483a7b-e969-4353-b10e-2ceee09e37d2",
      "relationships": [
        { "type": "CHILD", "ids": ["b8f62003-2e64-4e4b-a0c8-f11f24f0519a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94278,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0074896165,
          "height": 0.007938113,
          "left": 0.34001172,
          "top": 0.17944086
        },
        "polygon": [
          { "x": 0.34001172, "y": 0.17944583 },
          { "x": 0.34749705, "y": 0.17944086 },
          { "x": 0.34750134, "y": 0.18737401 },
          { "x": 0.340016, "y": 0.18737897 }
        ]
      },
      "id": "a6856fcb-8ff2-49ce-bd31-3aa87c94f619",
      "relationships": [
        { "type": "CHILD", "ids": ["5db15631-557d-4c10-85d4-3d489d315b62"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98841,
      "text": "4.0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018121483,
          "height": 0.008131616,
          "left": 0.37564614,
          "top": 0.17962706
        },
        "polygon": [
          { "x": 0.37564614, "y": 0.1796391 },
          { "x": 0.39376315, "y": 0.17962706 },
          { "x": 0.39376763, "y": 0.18774667 },
          { "x": 0.37565058, "y": 0.18775867 }
        ]
      },
      "id": "79f37eba-9fa6-4cab-a6a2-0440a9f96db0",
      "relationships": [
        { "type": "CHILD", "ids": ["171c0e31-836d-46ed-98f4-92a960f3740b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.969604,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00753467,
          "height": 0.007930521,
          "left": 0.43665293,
          "top": 0.1794414
        },
        "polygon": [
          { "x": 0.43665293, "y": 0.17944641 },
          { "x": 0.44418314, "y": 0.1794414 },
          { "x": 0.4441876, "y": 0.18736693 },
          { "x": 0.43665737, "y": 0.18737192 }
        ]
      },
      "id": "08e5b55d-0ee0-4209-a803-89f1d3b233f8",
      "relationships": [
        { "type": "CHILD", "ids": ["fe5ecb95-bcf9-4773-a347-398ad9012f43"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76534,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0070359474,
          "height": 0.007865415,
          "left": 0.4785762,
          "top": 0.17978506
        },
        "polygon": [
          { "x": 0.4785762, "y": 0.17978974 },
          { "x": 0.48560768, "y": 0.17978506 },
          { "x": 0.48561218, "y": 0.18764582 },
          { "x": 0.47858068, "y": 0.18765047 }
        ]
      },
      "id": "26b4f24b-8b0b-448f-95da-3cb2041d1cce",
      "relationships": [
        { "type": "CHILD", "ids": ["93203e64-bf35-45ad-ad60-4155eca75400"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.94821,
      "text": "Z.Knight",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.048503377,
          "height": 0.010178109,
          "left": 0.5063362,
          "top": 0.17938799
        },
        "polygon": [
          { "x": 0.5063362, "y": 0.17942022 },
          { "x": 0.55483365, "y": 0.17938799 },
          { "x": 0.5548396, "y": 0.189534 },
          { "x": 0.50634205, "y": 0.18956609 }
        ]
      },
      "id": "0befe16e-50b1-4b06-bc33-d81694282bd3",
      "relationships": [
        { "type": "CHILD", "ids": ["5ea228f8-79bb-468b-8553-17c8ad4ef155"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97588,
      "text": "6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069610616,
          "height": 0.007956004,
          "left": 0.7655249,
          "top": 0.17967093
        },
        "polygon": [
          { "x": 0.7655249, "y": 0.17967555 },
          { "x": 0.77248096, "y": 0.17967093 },
          { "x": 0.772486, "y": 0.18762232 },
          { "x": 0.76552993, "y": 0.18762693 }
        ]
      },
      "id": "203a769c-c9be-40b5-97dd-abf0a42d31e2",
      "relationships": [
        { "type": "CHILD", "ids": ["cd1b0d12-05c1-4189-9954-8b24b5f7baa6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.714645,
      "text": "-2",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011690173,
          "height": 0.007754484,
          "left": 0.8110115,
          "top": 0.17975594
        },
        "polygon": [
          { "x": 0.8110115, "y": 0.1797637 },
          { "x": 0.8226967, "y": 0.17975594 },
          { "x": 0.82270163, "y": 0.18750268 },
          { "x": 0.81101644, "y": 0.18751042 }
        ]
      },
      "id": "cbe7445a-4135-474d-87ad-f52f58dea1e3",
      "relationships": [
        { "type": "CHILD", "ids": ["fbad7b17-5046-4a41-874d-aeb4a51c5df9"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 96.06559,
      "text": "-0.3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.022581523,
          "height": 0.008138044,
          "left": 0.8469999,
          "top": 0.1795756
        },
        "polygon": [
          { "x": 0.8469999, "y": 0.17959061 },
          { "x": 0.8695761, "y": 0.1795756 },
          { "x": 0.8695814, "y": 0.18769869 },
          { "x": 0.8470052, "y": 0.18771365 }
        ]
      },
      "id": "d3a37dbb-da06-40b1-9ecc-147cf0b56b00",
      "relationships": [
        { "type": "CHILD", "ids": ["8eeb10a2-890e-4dfa-8e82-428b98a60261"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96278,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007137041,
          "height": 0.007834069,
          "left": 0.9125898,
          "top": 0.17970176
        },
        "polygon": [
          { "x": 0.9125898, "y": 0.1797065 },
          { "x": 0.91972166, "y": 0.17970176 },
          { "x": 0.91972685, "y": 0.1875311 },
          { "x": 0.91259503, "y": 0.18753582 }
        ]
      },
      "id": "f23001a4-3294-4f76-a610-19572f7289d1",
      "relationships": [
        { "type": "CHILD", "ids": ["aa882b02-6e57-4f97-bd97-bb0abcac1ebf"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.7955,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007128026,
          "height": 0.007875025,
          "left": 0.9543753,
          "top": 0.17972267
        },
        "polygon": [
          { "x": 0.9543753, "y": 0.17972739 },
          { "x": 0.9614981, "y": 0.17972267 },
          { "x": 0.9615034, "y": 0.18759297 },
          { "x": 0.95438063, "y": 0.18759769 }
        ]
      },
      "id": "25e43caf-8f7f-44be-b5c3-910a130dd4fe",
      "relationships": [
        { "type": "CHILD", "ids": ["10e71e79-a8dd-41e1-84a0-5b257ed7c9b5"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.629875,
      "text": "C.Beathard",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06333078,
          "height": 0.008578029,
          "left": 0.030847263,
          "top": 0.19441406
        },
        "polygon": [
          { "x": 0.030847263, "y": 0.19445589 },
          { "x": 0.0941739, "y": 0.19441406 },
          { "x": 0.094178036, "y": 0.2029504 },
          { "x": 0.030851277, "y": 0.20299208 }
        ]
      },
      "id": "b136704e-0aec-42c4-a045-6319bb3871d7",
      "relationships": [
        { "type": "CHILD", "ids": ["d2bfd457-69c9-496a-848a-6a91ecb75e3f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93437,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006709394,
          "height": 0.008000377,
          "left": 0.28967786,
          "top": 0.19490036
        },
        "polygon": [
          { "x": 0.28967786, "y": 0.19490479 },
          { "x": 0.29638302, "y": 0.19490036 },
          { "x": 0.29638726, "y": 0.20289633 },
          { "x": 0.2896821, "y": 0.20290074 }
        ]
      },
      "id": "3d98b48f-fc07-4185-a24e-fb95dfdc08ae",
      "relationships": [
        { "type": "CHILD", "ids": ["0f315de6-8b8f-4e57-9985-a70f3966b905"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.79299,
      "text": "-3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01161177,
          "height": 0.007842385,
          "left": 0.3353298,
          "top": 0.19501792
        },
        "polygon": [
          { "x": 0.3353298, "y": 0.1950256 },
          { "x": 0.34693733, "y": 0.19501792 },
          { "x": 0.34694156, "y": 0.20285267 },
          { "x": 0.335334, "y": 0.20286031 }
        ]
      },
      "id": "7fcaef54-1c66-433b-8c5a-eeda3ecb1a11",
      "relationships": [
        { "type": "CHILD", "ids": ["eb9886c0-3580-4575-9445-8b7cddb398a9"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94075,
      "text": "-1.0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.022855993,
          "height": 0.008053634,
          "left": 0.37104714,
          "top": 0.19481146
        },
        "polygon": [
          { "x": 0.37104714, "y": 0.19482656 },
          { "x": 0.3938987, "y": 0.19481146 },
          { "x": 0.39390314, "y": 0.20285006 },
          { "x": 0.37105152, "y": 0.20286511 }
        ]
      },
      "id": "4c28e4cd-1191-4fbe-8d68-864fe153c5df",
      "relationships": [
        { "type": "CHILD", "ids": ["90a565c9-1d00-4617-b06c-ccaaa8f0ef13"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.15307,
      "text": "-1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011583455,
          "height": 0.0074069486,
          "left": 0.43183103,
          "top": 0.19525978
        },
        "polygon": [
          { "x": 0.43183103, "y": 0.19526744 },
          { "x": 0.44341034, "y": 0.19525978 },
          { "x": 0.44341448, "y": 0.20265912 },
          { "x": 0.43183514, "y": 0.20266673 }
        ]
      },
      "id": "85d5e18f-2bf7-411c-85f7-49e0db620af4",
      "relationships": [
        { "type": "CHILD", "ids": ["3f13f45f-14bb-4f67-b15c-0707c308ea76"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.74231,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007019753,
          "height": 0.007815197,
          "left": 0.47860196,
          "top": 0.19490777
        },
        "polygon": [
          { "x": 0.47860196, "y": 0.1949124 },
          { "x": 0.48561725, "y": 0.19490777 },
          { "x": 0.48562172, "y": 0.20271835 },
          { "x": 0.4786064, "y": 0.20272297 }
        ]
      },
      "id": "bffcbd3f-1eab-45b9-991b-8328f6849dcb",
      "relationships": [
        { "type": "CHILD", "ids": ["72d053a3-b62e-41f2-8b9d-5a88b68c75fd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.16786,
      "text": "Z.Jones",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0440725,
          "height": 0.008170606,
          "left": 0.030382901,
          "top": 0.21009304
        },
        "polygon": [
          { "x": 0.030382901, "y": 0.21012196 },
          { "x": 0.0744515, "y": 0.21009304 },
          { "x": 0.0744554, "y": 0.21823482 },
          { "x": 0.030386731, "y": 0.21826364 }
        ]
      },
      "id": "1e77e6c7-7404-41c6-8acc-f37bd38bf04d",
      "relationships": [
        { "type": "CHILD", "ids": ["d43459f5-6a07-416a-87f4-32faa1f8669c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87905,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0059515224,
          "height": 0.0077352286,
          "left": 0.29021043,
          "top": 0.21047321
        },
        "polygon": [
          { "x": 0.29021043, "y": 0.21047711 },
          { "x": 0.29615787, "y": 0.21047321 },
          { "x": 0.29616195, "y": 0.21820454 },
          { "x": 0.2902145, "y": 0.21820843 }
        ]
      },
      "id": "cb6c9135-2916-42ed-b6b9-92eeb3aec0a9",
      "relationships": [
        { "type": "CHILD", "ids": ["86c26f6f-6394-4eed-a24a-d2c818a31b4b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.77086,
      "text": "-3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011385957,
          "height": 0.007769922,
          "left": 0.33555952,
          "top": 0.2103627
        },
        "polygon": [
          { "x": 0.33555952, "y": 0.21037017 },
          { "x": 0.34694126, "y": 0.2103627 },
          { "x": 0.34694546, "y": 0.21812518 },
          { "x": 0.33556366, "y": 0.21813263 }
        ]
      },
      "id": "7fe23360-d92c-49f2-8c33-b1f06512937a",
      "relationships": [
        { "type": "CHILD", "ids": ["4ef1ea80-9e63-414d-8cd6-648288d11c71"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95606,
      "text": "-3.0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02280285,
          "height": 0.008117832,
          "left": 0.37130594,
          "top": 0.2100997
        },
        "polygon": [
          { "x": 0.37130594, "y": 0.21011466 },
          { "x": 0.39410433, "y": 0.2100997 },
          { "x": 0.3941088, "y": 0.21820262 },
          { "x": 0.37131035, "y": 0.21821752 }
        ]
      },
      "id": "7a230f57-35ce-42bb-8ae1-46f540f68a24",
      "relationships": [
        { "type": "CHILD", "ids": ["060e1c2c-37fe-415d-bcda-24abd0d0733c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.50664,
      "text": "-3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.011229808,
          "height": 0.007950467,
          "left": 0.4322608,
          "top": 0.21028818
        },
        "polygon": [
          { "x": 0.4322608, "y": 0.21029556 },
          { "x": 0.44348615, "y": 0.21028818 },
          { "x": 0.44349062, "y": 0.21823132 },
          { "x": 0.43226525, "y": 0.21823865 }
        ]
      },
      "id": "8b36ca09-20aa-4659-a492-84ba837e1f03",
      "relationships": [
        { "type": "CHILD", "ids": ["371e5af5-a3a9-402c-8209-958915799021"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.650215,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007064601,
          "height": 0.007908379,
          "left": 0.4785942,
          "top": 0.21027765
        },
        "polygon": [
          { "x": 0.4785942, "y": 0.21028228 },
          { "x": 0.4856543, "y": 0.21027765 },
          { "x": 0.4856588, "y": 0.21818142 },
          { "x": 0.4785987, "y": 0.21818602 }
        ]
      },
      "id": "6110e76d-6b2a-451c-a43c-a153cd846194",
      "relationships": [
        { "type": "CHILD", "ids": ["44a65329-6e67-4796-bb9b-aec160bcfd09"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93451,
      "text": "Total",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029521944,
          "height": 0.008274992,
          "left": 0.029957296,
          "top": 0.22514842
        },
        "polygon": [
          { "x": 0.029957296, "y": 0.22516768 },
          { "x": 0.059475306, "y": 0.22514842 },
          { "x": 0.05947924, "y": 0.23340425 },
          { "x": 0.029961178, "y": 0.23342343 }
        ]
      },
      "id": "8792ceb1-7f01-4234-af56-580b42de1c02",
      "relationships": [
        { "type": "CHILD", "ids": ["21aa35bd-8574-4401-98de-fcf50d511663"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97933,
      "text": "39",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013785112,
          "height": 0.00824136,
          "left": 0.28280827,
          "top": 0.22526677
        },
        "polygon": [
          { "x": 0.28280827, "y": 0.22527575 },
          { "x": 0.29658902, "y": 0.22526677 },
          { "x": 0.29659337, "y": 0.23349918 },
          { "x": 0.2828126, "y": 0.23350812 }
        ]
      },
      "id": "20750314-5da7-441c-aa24-2a4071e0e87e",
      "relationships": [
        { "type": "CHILD", "ids": ["3a831eed-1df3-4a63-9faf-5296df98f715"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.797745,
      "text": "147",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020752508,
          "height": 0.00798798,
          "left": 0.3265975,
          "top": 0.22525181
        },
        "polygon": [
          { "x": 0.3265975, "y": 0.22526534 },
          { "x": 0.3473457, "y": 0.22525181 },
          { "x": 0.34735, "y": 0.23322631 },
          { "x": 0.32660177, "y": 0.23323978 }
        ]
      },
      "id": "93d113c4-1a2f-4bcc-b337-24f031256ef6",
      "relationships": [
        { "type": "CHILD", "ids": ["ebf245e9-740b-4b7b-9ca2-01efff8c6c2f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.95912,
      "text": "3.8",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01819836,
          "height": 0.008179869,
          "left": 0.3754955,
          "top": 0.22519654
        },
        "polygon": [
          { "x": 0.3754955, "y": 0.2252084 },
          { "x": 0.39368936, "y": 0.22519654 },
          { "x": 0.39369386, "y": 0.23336458 },
          { "x": 0.37549996, "y": 0.2333764 }
        ]
      },
      "id": "2e822922-008a-4240-ba35-ba6fe54b55b5",
      "relationships": [
        { "type": "CHILD", "ids": ["f19bf906-4af1-4780-a764-c56abefb06f8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9874,
      "text": "19",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013578917,
          "height": 0.00813834,
          "left": 0.43041736,
          "top": 0.22526672
        },
        "polygon": [
          { "x": 0.43041736, "y": 0.22527558 },
          { "x": 0.44399172, "y": 0.22526672 },
          { "x": 0.44399628, "y": 0.23339625 },
          { "x": 0.43042192, "y": 0.23340507 }
        ]
      },
      "id": "7d3f4289-f620-415d-8560-ef2b087d316f",
      "relationships": [
        { "type": "CHILD", "ids": ["13456a6c-834b-4202-aadf-4f332abe9c99"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.897705,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.005629623,
          "height": 0.007988952,
          "left": 0.4793559,
          "top": 0.22541422
        },
        "polygon": [
          { "x": 0.4793559, "y": 0.22541788 },
          { "x": 0.48498097, "y": 0.22541422 },
          { "x": 0.48498553, "y": 0.23339953 },
          { "x": 0.47936046, "y": 0.23340318 }
        ]
      },
      "id": "8ad66045-546a-43c5-bf18-88e40e31abd7",
      "relationships": [
        { "type": "CHILD", "ids": ["83bdf36e-3e70-4d32-b522-a2bf76af2344"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95796,
      "text": "Total",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02886926,
          "height": 0.0081931325,
          "left": 0.50607735,
          "top": 0.22523457
        },
        "polygon": [
          { "x": 0.50607735, "y": 0.22525339 },
          { "x": 0.53494185, "y": 0.22523457 },
          { "x": 0.5349466, "y": 0.23340896 },
          { "x": 0.50608206, "y": 0.2334277 }
        ]
      },
      "id": "9cdec078-4c62-4f6c-a09f-2342b2da5920",
      "relationships": [
        { "type": "CHILD", "ids": ["f6659965-6f3f-4db2-8d08-69b5b3533412"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9802,
      "text": "20",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0142288115,
          "height": 0.008067697,
          "left": 0.7581059,
          "top": 0.22524305
        },
        "polygon": [
          { "x": 0.7581059, "y": 0.22525232 },
          { "x": 0.77232957, "y": 0.22524305 },
          { "x": 0.77233464, "y": 0.2333015 },
          { "x": 0.75811094, "y": 0.23331074 }
        ]
      },
      "id": "528ed405-880c-4d99-9a9b-6bb57cb1096a",
      "relationships": [
        { "type": "CHILD", "ids": ["42de58a1-f75d-4e5c-948a-9f3214d51c21"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.978966,
      "text": "66",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013974922,
          "height": 0.008144538,
          "left": 0.80888814,
          "top": 0.22515532
        },
        "polygon": [
          { "x": 0.80888814, "y": 0.22516443 },
          { "x": 0.8228578, "y": 0.22515532 },
          { "x": 0.82286304, "y": 0.23329078 },
          { "x": 0.8088933, "y": 0.23329985 }
        ]
      },
      "id": "fa997b14-5f65-48ad-8634-dac8b0686624",
      "relationships": [
        { "type": "CHILD", "ids": ["bca9b87d-76a1-4f98-b06a-24ea08424cfc"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 93.634125,
      "text": "3.3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017915258,
          "height": 0.008223301,
          "left": 0.85126454,
          "top": 0.22516182
        },
        "polygon": [
          { "x": 0.85126454, "y": 0.2251735 },
          { "x": 0.8691744, "y": 0.22516182 },
          { "x": 0.86917984, "y": 0.2333735 },
          { "x": 0.8512699, "y": 0.23338513 }
        ]
      },
      "id": "5d7f227a-e5dc-4d95-a3d8-9fc482439fd5",
      "relationships": [
        { "type": "CHILD", "ids": ["9888d629-ea71-444e-ab1b-286f23cb7897"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97393,
      "text": "14",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013469765,
          "height": 0.007996084,
          "left": 0.9061479,
          "top": 0.22529082
        },
        "polygon": [
          { "x": 0.9061479, "y": 0.2252996 },
          { "x": 0.91961235, "y": 0.22529082 },
          { "x": 0.91961765, "y": 0.23327816 },
          { "x": 0.9061532, "y": 0.2332869 }
        ]
      },
      "id": "25a359f5-9b32-4c10-b5ea-3912dcc570e9",
      "relationships": [
        { "type": "CHILD", "ids": ["bba228a6-ecf4-4864-a32a-5d2358cf1aec"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.84331,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0073322235,
          "height": 0.007862212,
          "left": 0.95424604,
          "top": 0.22538632
        },
        "polygon": [
          { "x": 0.95424604, "y": 0.2253911 },
          { "x": 0.961573, "y": 0.22538632 },
          { "x": 0.9615783, "y": 0.23324378 },
          { "x": 0.95425135, "y": 0.23324853 }
        ]
      },
      "id": "13980f63-f106-4636-b45c-a787e839e4aa",
      "relationships": [
        { "type": "CHILD", "ids": ["59956c8b-bcdf-4742-b78b-50825eafe9e4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9477,
      "text": "PASSING",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06001099,
          "height": 0.008175899,
          "left": 0.030729994,
          "top": 0.2507249
        },
        "polygon": [
          { "x": 0.030729994, "y": 0.2507636 },
          { "x": 0.09073705, "y": 0.2507249 },
          { "x": 0.090740986, "y": 0.25886226 },
          { "x": 0.03073382, "y": 0.25890082 }
        ]
      },
      "id": "85a57e8d-6e27-4f12-9d6e-7fef65af8a23",
      "relationships": [
        { "type": "CHILD", "ids": ["47aa9211-00fe-4a10-a76b-39b924ccc53b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.71985,
      "text": "ATT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025601279,
          "height": 0.007995222,
          "left": 0.1835365,
          "top": 0.2507994
        },
        "polygon": [
          { "x": 0.1835365, "y": 0.2508159 },
          { "x": 0.20913371, "y": 0.2507994 },
          { "x": 0.20913778, "y": 0.25877815 },
          { "x": 0.18354052, "y": 0.2587946 }
        ]
      },
      "id": "00e19e32-7a96-46c9-bb0b-a18cdd976cc8",
      "relationships": [
        { "type": "CHILD", "ids": ["39bedf69-7ba6-4b49-9385-98a8ba2b575b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.831726,
      "text": "CMP",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.028633354,
          "height": 0.008126859,
          "left": 0.22411434,
          "top": 0.25068542
        },
        "polygon": [
          { "x": 0.22411434, "y": 0.25070387 },
          { "x": 0.25274348, "y": 0.25068542 },
          { "x": 0.25274768, "y": 0.2587939 },
          { "x": 0.2241185, "y": 0.25881228 }
        ]
      },
      "id": "a65ea7ba-f317-4f60-88fe-afcdffd47767",
      "relationships": [
        { "type": "CHILD", "ids": ["6ad5da0d-4035-40ad-a8fd-f15639154fc4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.80497,
      "text": "YDS",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027537677,
          "height": 0.008071284,
          "left": 0.26970133,
          "top": 0.2507285
        },
        "polygon": [
          { "x": 0.26970133, "y": 0.25074625 },
          { "x": 0.29723474, "y": 0.2507285 },
          { "x": 0.297239, "y": 0.2587821 },
          { "x": 0.26970553, "y": 0.25879976 }
        ]
      },
      "id": "680719ba-7beb-416a-83b0-ccc0dcc7da3b",
      "relationships": [
        { "type": "CHILD", "ids": ["8e4f2ee4-c5af-4ae0-8cef-083c0e5cd4bb"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.82114,
      "text": "SK/YD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.042924743,
          "height": 0.009710298,
          "left": 0.30938208,
          "top": 0.2505725
        },
        "polygon": [
          { "x": 0.30938208, "y": 0.25060016 },
          { "x": 0.3523016, "y": 0.2505725 },
          { "x": 0.35230684, "y": 0.26025525 },
          { "x": 0.30938724, "y": 0.26028278 }
        ]
      },
      "id": "ca281646-66a1-4d64-9af2-0d90687468b2",
      "relationships": [
        { "type": "CHILD", "ids": ["4083997c-e9e5-4c9d-95c3-1ec7390163a1"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93009,
      "text": "TD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018197613,
          "height": 0.007936652,
          "left": 0.3619429,
          "top": 0.25078702
        },
        "polygon": [
          { "x": 0.3619429, "y": 0.25079873 },
          { "x": 0.38013616, "y": 0.25078702 },
          { "x": 0.38014048, "y": 0.25871196 },
          { "x": 0.36194718, "y": 0.25872368 }
        ]
      },
      "id": "2c253ce9-0f84-4faf-acfe-e1b3a67c8fa6",
      "relationships": [
        { "type": "CHILD", "ids": ["4db59ccb-3235-4e2c-a792-8fc5520b726c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.934494,
      "text": "LG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01662928,
          "height": 0.008099947,
          "left": 0.39622036,
          "top": 0.25065833
        },
        "polygon": [
          { "x": 0.39622036, "y": 0.25066906 },
          { "x": 0.41284513, "y": 0.25065833 },
          { "x": 0.41284963, "y": 0.2587476 },
          { "x": 0.3962248, "y": 0.25875828 }
        ]
      },
      "id": "032fb9df-6959-4117-91ff-7640fd158901",
      "relationships": [
        { "type": "CHILD", "ids": ["77f7d8fb-2a55-48b2-a8d3-c2599723a2b9"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93186,
      "text": "IN",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016094761,
          "height": 0.007965546,
          "left": 0.42259613,
          "top": 0.25076237
        },
        "polygon": [
          { "x": 0.42259613, "y": 0.25077274 },
          { "x": 0.43868643, "y": 0.25076237 },
          { "x": 0.4386909, "y": 0.2587176 },
          { "x": 0.42260057, "y": 0.25872794 }
        ]
      },
      "id": "db71dc25-5a80-41b3-a459-49ef68912927",
      "relationships": [
        { "type": "CHILD", "ids": ["3417edfd-ce1e-46d6-a7d9-2b437a1a9024"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96103,
      "text": "RT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017353183,
          "height": 0.0081421165,
          "left": 0.4686932,
          "top": 0.2506673
        },
        "polygon": [
          { "x": 0.4686932, "y": 0.25067848 },
          { "x": 0.48604172, "y": 0.2506673 },
          { "x": 0.48604637, "y": 0.25879827 },
          { "x": 0.4686978, "y": 0.25880942 }
        ]
      },
      "id": "80791553-c843-4028-ae9c-ed8d9e922279",
      "relationships": [
        { "type": "CHILD", "ids": ["00a27edc-5d13-4ad5-b7ab-033a6492176d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.969574,
      "text": "PASSING",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.059932888,
          "height": 0.008260646,
          "left": 0.50660187,
          "top": 0.25064683
        },
        "polygon": [
          { "x": 0.50660187, "y": 0.25068545 },
          { "x": 0.5665299, "y": 0.25064683 },
          { "x": 0.56653476, "y": 0.258869 },
          { "x": 0.5066066, "y": 0.25890747 }
        ]
      },
      "id": "a63c81ed-6a12-44c6-932a-be74b0475013",
      "relationships": [
        { "type": "CHILD", "ids": ["55365448-1a6d-484b-96f8-ec32b6ae3586"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.801865,
      "text": "ATT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025926052,
          "height": 0.008080782,
          "left": 0.6590034,
          "top": 0.2507471
        },
        "polygon": [
          { "x": 0.6590034, "y": 0.25076383 },
          { "x": 0.6849244, "y": 0.2507471 },
          { "x": 0.68492943, "y": 0.25881127 },
          { "x": 0.65900826, "y": 0.25882792 }
        ]
      },
      "id": "68a0199a-4c46-4393-9ede-794b8b2aa14e",
      "relationships": [
        { "type": "CHILD", "ids": ["e499a2c5-6e91-4004-a35f-2402e1588e2c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.86177,
      "text": "CMP",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02876831,
          "height": 0.008215471,
          "left": 0.69984674,
          "top": 0.25058436
        },
        "polygon": [
          { "x": 0.69984674, "y": 0.2506029 },
          { "x": 0.7286099, "y": 0.25058436 },
          { "x": 0.72861505, "y": 0.25878134 },
          { "x": 0.6998518, "y": 0.25879982 }
        ]
      },
      "id": "54745801-5ab5-4836-ab11-bc8e2cdec12b",
      "relationships": [
        { "type": "CHILD", "ids": ["4ee44c6e-808d-424c-8be0-f21e14dde9e4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89978,
      "text": "YDS",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027307054,
          "height": 0.008223961,
          "left": 0.7454615,
          "top": 0.25063357
        },
        "polygon": [
          { "x": 0.7454615, "y": 0.25065115 },
          { "x": 0.7727634, "y": 0.25063357 },
          { "x": 0.77276856, "y": 0.25884 },
          { "x": 0.74546665, "y": 0.25885752 }
        ]
      },
      "id": "a707e496-1a75-44d9-95ba-432cee1082f8",
      "relationships": [
        { "type": "CHILD", "ids": ["8470eeae-1c8f-4193-854c-3d61d7aeb2d8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.812454,
      "text": "SK/YD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.043437127,
          "height": 0.009806004,
          "left": 0.7849188,
          "top": 0.25054052
        },
        "polygon": [
          { "x": 0.7849188, "y": 0.2505685 },
          { "x": 0.8283496, "y": 0.25054052 },
          { "x": 0.8283559, "y": 0.26031867 },
          { "x": 0.78492504, "y": 0.26034653 }
        ]
      },
      "id": "abb776ed-d0c9-4bf7-868c-63dea0b4256b",
      "relationships": [
        { "type": "CHILD", "ids": ["88c25e47-df11-41c5-87cd-efc79b1c3604"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87516,
      "text": "TD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018246705,
          "height": 0.007990042,
          "left": 0.8375714,
          "top": 0.2507338
        },
        "polygon": [
          { "x": 0.8375714, "y": 0.25074553 },
          { "x": 0.85581285, "y": 0.2507338 },
          { "x": 0.85581803, "y": 0.2587121 },
          { "x": 0.8375765, "y": 0.25872383 }
        ]
      },
      "id": "dcc5b0e6-a172-48e9-8b8b-d6413836c150",
      "relationships": [
        { "type": "CHILD", "ids": ["2b02ae51-35ac-4c38-9805-7345c8b3cb32"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.876045,
      "text": "LG IN",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.042654585,
          "height": 0.008164585,
          "left": 0.8716996,
          "top": 0.2505851
        },
        "polygon": [
          { "x": 0.8716996, "y": 0.2506126 },
          { "x": 0.9143488, "y": 0.2505851 },
          { "x": 0.9143542, "y": 0.25872228 },
          { "x": 0.87170494, "y": 0.2587497 }
        ]
      },
      "id": "062a1288-9d4d-41e5-845b-e5ff7ee62d8d",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "11b37a54-2d12-46f1-a6f5-eafa792d8077",
            "89fb6271-b158-465a-b9c3-0307fda43c83"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.970276,
      "text": "RT",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.017492866,
          "height": 0.008095872,
          "left": 0.9443775,
          "top": 0.25072652
        },
        "polygon": [
          { "x": 0.9443775, "y": 0.2507378 },
          { "x": 0.9618649, "y": 0.25072652 },
          { "x": 0.9618704, "y": 0.25881118 },
          { "x": 0.94438297, "y": 0.2588224 }
        ]
      },
      "id": "d4c439f4-829c-453e-b697-fdcb79c52d7d",
      "relationships": [
        { "type": "CHILD", "ids": ["967af85f-950f-499b-a003-e4051c5fab33"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.406395,
      "text": "T.Lawrence",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.06539112,
          "height": 0.008511173,
          "left": 0.031693768,
          "top": 0.2687899
        },
        "polygon": [
          { "x": 0.031693768, "y": 0.2688317 },
          { "x": 0.09708078, "y": 0.2687899 },
          { "x": 0.09708489, "y": 0.27725938 },
          { "x": 0.031697754, "y": 0.27730104 }
        ]
      },
      "id": "c1be4062-55f5-4ff2-a63c-3eb5779a2a92",
      "relationships": [
        { "type": "CHILD", "ids": ["59e81d5e-de47-4846-9acf-e21a3ff6c4dd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95922,
      "text": "31",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013396919,
          "height": 0.008312194,
          "left": 0.19440708,
          "top": 0.2687922
        },
        "polygon": [
          { "x": 0.19440708, "y": 0.26880077 },
          { "x": 0.20779976, "y": 0.2687922 },
          { "x": 0.207804, "y": 0.27709585 },
          { "x": 0.19441128, "y": 0.2771044 }
        ]
      },
      "id": "7ecc097e-e9d0-4644-b405-56568e5dcd6e",
      "relationships": [
        { "type": "CHILD", "ids": ["512e2f5b-5ca2-4024-978e-5db5e2a9afbd"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95711,
      "text": "20",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014036487,
          "height": 0.008340722,
          "left": 0.23864335,
          "top": 0.2687959
        },
        "polygon": [
          { "x": 0.23864335, "y": 0.26880488 },
          { "x": 0.2526755, "y": 0.2687959 },
          { "x": 0.25267982, "y": 0.27712768 },
          { "x": 0.23864764, "y": 0.27713662 }
        ]
      },
      "id": "0d743e5b-671a-4e03-a569-cbfc19a2ccee",
      "relationships": [
        { "type": "CHILD", "ids": ["9ad47402-306c-4337-afd3-8f94824a393e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95507,
      "text": "229",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021113586,
          "height": 0.008302924,
          "left": 0.27541825,
          "top": 0.26891223
        },
        "polygon": [
          { "x": 0.27541825, "y": 0.26892573 },
          { "x": 0.29652745, "y": 0.26891223 },
          { "x": 0.29653183, "y": 0.2772017 },
          { "x": 0.27542257, "y": 0.27721515 }
        ]
      },
      "id": "439e0950-8d5c-42d3-b7d7-eb3ef31f5175",
      "relationships": [
        { "type": "CHILD", "ids": ["07f39aa1-ed02-4e4e-88d4-09276093909c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.969475,
      "text": "1/11",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024908457,
          "height": 0.009983676,
          "left": 0.32240227,
          "top": 0.26854503
        },
        "polygon": [
          { "x": 0.32240227, "y": 0.26856095 },
          { "x": 0.34730536, "y": 0.26854503 },
          { "x": 0.34731075, "y": 0.27851284 },
          { "x": 0.3224076, "y": 0.2785287 }
        ]
      },
      "id": "50431ff5-5b28-4b92-95a6-790e5be32bf2",
      "relationships": [
        { "type": "CHILD", "ids": ["35c0ec89-d903-4c03-ac3a-654971f695ce"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.83779,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0075053885,
          "height": 0.008161937,
          "left": 0.37071237,
          "top": 0.26894274
        },
        "polygon": [
          { "x": 0.37071237, "y": 0.26894754 },
          { "x": 0.3782133, "y": 0.26894274 },
          { "x": 0.37821776, "y": 0.27709988 },
          { "x": 0.3707168, "y": 0.27710468 }
        ]
      },
      "id": "76428da7-5ccb-4c69-b018-8126af92c3c3",
      "relationships": [
        { "type": "CHILD", "ids": ["f69d8661-93fb-4567-8271-da52114efb92"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96718,
      "text": "36",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014243196,
          "height": 0.008370041,
          "left": 0.3985662,
          "top": 0.2687932
        },
        "polygon": [
          { "x": 0.3985662, "y": 0.26880231 },
          { "x": 0.41280475, "y": 0.2687932 },
          { "x": 0.4128094, "y": 0.27715418 },
          { "x": 0.3985708, "y": 0.27716324 }
        ]
      },
      "id": "eabc3d4a-8358-44a4-b958-d5832b84d6a3",
      "relationships": [
        { "type": "CHILD", "ids": ["46e1ca17-424b-46eb-8e2f-fa62088cc196"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.64012,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007284395,
          "height": 0.008295838,
          "left": 0.43442205,
          "top": 0.2688701
        },
        "polygon": [
          { "x": 0.43442205, "y": 0.26887473 },
          { "x": 0.4417018, "y": 0.2688701 },
          { "x": 0.44170645, "y": 0.2771613 },
          { "x": 0.4344267, "y": 0.27716592 }
        ]
      },
      "id": "6a7ff031-5a39-4fe1-a8c3-5835205b04dd",
      "relationships": [
        { "type": "CHILD", "ids": ["6ac0fe3a-3612-41b7-8603-0240e6abd8fa"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97489,
      "text": "86.6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025123553,
          "height": 0.008358876,
          "left": 0.45807567,
          "top": 0.2687272
        },
        "polygon": [
          { "x": 0.45807567, "y": 0.26874328 },
          { "x": 0.48319447, "y": 0.2687272 },
          { "x": 0.4831992, "y": 0.27707008 },
          { "x": 0.45808038, "y": 0.27708608 }
        ]
      },
      "id": "5f45126e-cc13-426c-b691-abcebb4bf980",
      "relationships": [
        { "type": "CHILD", "ids": ["2bbeed52-81d5-4118-bb7e-da63c6f1456c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.574425,
      "text": "Z.Wilson",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.04895274,
          "height": 0.008458361,
          "left": 0.50614965,
          "top": 0.26876584
        },
        "polygon": [
          { "x": 0.50614965, "y": 0.26879716 },
          { "x": 0.55509746, "y": 0.26876584 },
          { "x": 0.5551024, "y": 0.27719304 },
          { "x": 0.50615454, "y": 0.2772242 }
        ]
      },
      "id": "933fafbf-a022-471d-b6e3-570ba63727dc",
      "relationships": [
        { "type": "CHILD", "ids": ["41062998-4f0c-49e1-ab78-97f8e8e0c472"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.972786,
      "text": "18",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013699179,
          "height": 0.008279438,
          "left": 0.67061925,
          "top": 0.26890633
        },
        "polygon": [
          { "x": 0.67061925, "y": 0.2689151 },
          { "x": 0.6843133, "y": 0.26890633 },
          { "x": 0.6843184, "y": 0.27717704 },
          { "x": 0.67062426, "y": 0.27718577 }
        ]
      },
      "id": "f1086545-24a3-453c-832c-cecc2cb2b71c",
      "relationships": [
        { "type": "CHILD", "ids": ["3bd70fc3-23b9-499f-a0cc-4f4a8594fa04"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94879,
      "text": "9",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0071659894,
          "height": 0.008350152,
          "left": 0.7213714,
          "top": 0.26883742
        },
        "polygon": [
          { "x": 0.7213714, "y": 0.268842 },
          { "x": 0.7285322, "y": 0.26883742 },
          { "x": 0.7285374, "y": 0.27718303 },
          { "x": 0.7213766, "y": 0.2771876 }
        ]
      },
      "id": "620c5840-b4c7-4dc5-aa1a-3f05049a7162",
      "relationships": [
        { "type": "CHILD", "ids": ["afe1cd6f-518b-4be1-b15a-a65db3921b9d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98127,
      "text": "92",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014103153,
          "height": 0.008310121,
          "left": 0.75829333,
          "top": 0.2688821
        },
        "polygon": [
          { "x": 0.75829333, "y": 0.2688911 },
          { "x": 0.7723912, "y": 0.2688821 },
          { "x": 0.7723965, "y": 0.27718323 },
          { "x": 0.7582986, "y": 0.2771922 }
        ]
      },
      "id": "0af8b26d-31d6-4a91-95ac-c2685bf38263",
      "relationships": [
        { "type": "CHILD", "ids": ["3adbf38a-f6d4-4818-864a-048ad9acb227"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96516,
      "text": "3/21",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025490053,
          "height": 0.009733382,
          "left": 0.80217093,
          "top": 0.26859573
        },
        "polygon": [
          { "x": 0.80217093, "y": 0.26861203 },
          { "x": 0.8276547, "y": 0.26859573 },
          { "x": 0.827661, "y": 0.2783129 },
          { "x": 0.80217713, "y": 0.2783291 }
        ]
      },
      "id": "0b11c3bd-1541-41e9-878e-54f261054711",
      "relationships": [
        { "type": "CHILD", "ids": ["7b8e5e1c-7934-476b-a8b8-f0687874f053"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.80361,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0072574364,
          "height": 0.008149217,
          "left": 0.8486904,
          "top": 0.2689362
        },
        "polygon": [
          { "x": 0.8486904, "y": 0.2689408 },
          { "x": 0.8559425, "y": 0.2689362 },
          { "x": 0.8559478, "y": 0.27708077 },
          { "x": 0.8486957, "y": 0.2770854 }
        ]
      },
      "id": "e29e31cc-bf7f-40c1-9084-dcfebba3ba66",
      "relationships": [
        { "type": "CHILD", "ids": ["57448937-3fef-4679-b2d6-288477b1585d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87956,
      "text": "27",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01423457,
          "height": 0.008303716,
          "left": 0.87424666,
          "top": 0.2687895
        },
        "polygon": [
          { "x": 0.87424666, "y": 0.26879862 },
          { "x": 0.8884758, "y": 0.2687895 },
          { "x": 0.8884812, "y": 0.27708417 },
          { "x": 0.8742521, "y": 0.27709323 }
        ]
      },
      "id": "e1109f83-913e-4949-837c-a24188bbd987",
      "relationships": [
        { "type": "CHILD", "ids": ["40ff4444-4bf2-4f56-b082-5ff1cd529cbc"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87663,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0059781293,
          "height": 0.008050283,
          "left": 0.90932065,
          "top": 0.26906496
        },
        "polygon": [
          { "x": 0.90932065, "y": 0.26906878 },
          { "x": 0.9152934, "y": 0.26906496 },
          { "x": 0.91529876, "y": 0.27711144 },
          { "x": 0.90932596, "y": 0.27711526 }
        ]
      },
      "id": "fc8ebe64-4f79-4c5c-8d7e-811dfc4ace96",
      "relationships": [
        { "type": "CHILD", "ids": ["e1a546b8-f825-45e5-97ef-aed6b9c65e30"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98062,
      "text": "41.9",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025494197,
          "height": 0.008132813,
          "left": 0.93594015,
          "top": 0.26897028
        },
        "polygon": [
          { "x": 0.93594015, "y": 0.26898658 },
          { "x": 0.9614289, "y": 0.26897028 },
          { "x": 0.96143436, "y": 0.27708685 },
          { "x": 0.9359456, "y": 0.2771031 }
        ]
      },
      "id": "1579396a-eb4f-4b36-b563-93b72d005c4c",
      "relationships": [
        { "type": "CHILD", "ids": ["0b26cb51-c330-40d5-ab58-1a7df8d63da6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.2178,
      "text": "C.Streveler",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0637336,
          "height": 0.008802081,
          "left": 0.5060771,
          "top": 0.2836549
        },
        "polygon": [
          { "x": 0.5060771, "y": 0.28369537 },
          { "x": 0.5698055, "y": 0.2836549 },
          { "x": 0.5698107, "y": 0.29241663 },
          { "x": 0.5060821, "y": 0.29245698 }
        ]
      },
      "id": "57dfd738-55eb-4c4a-8452-59f46239022d",
      "relationships": [
        { "type": "CHILD", "ids": ["64f7bcd8-9210-404b-89ca-144ce3d8e51a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96783,
      "text": "15",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013546858,
          "height": 0.00819463,
          "left": 0.67071015,
          "top": 0.28409395
        },
        "polygon": [
          { "x": 0.67071015, "y": 0.28410256 },
          { "x": 0.68425196, "y": 0.28409395 },
          { "x": 0.68425703, "y": 0.29228002 },
          { "x": 0.67071515, "y": 0.2922886 }
        ]
      },
      "id": "5b0ba7c5-59f5-4384-aea4-ba2491bf1b35",
      "relationships": [
        { "type": "CHILD", "ids": ["975e9b9c-9f4a-48bc-9f53-ff1b31e86288"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98718,
      "text": "10",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013350055,
          "height": 0.008074833,
          "left": 0.7151026,
          "top": 0.2841541
        },
        "polygon": [
          { "x": 0.7151026, "y": 0.28416255 },
          { "x": 0.7284477, "y": 0.2841541 },
          { "x": 0.7284527, "y": 0.29222047 },
          { "x": 0.7151076, "y": 0.2922289 }
        ]
      },
      "id": "be3473e3-e528-4739-9379-6b90a09d3e71",
      "relationships": [
        { "type": "CHILD", "ids": ["9683689d-0b9e-4128-a306-4f09a8f34c17"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98844,
      "text": "90",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014260189,
          "height": 0.008265966,
          "left": 0.758291,
          "top": 0.2841212
        },
        "polygon": [
          { "x": 0.758291, "y": 0.28413025 },
          { "x": 0.772546, "y": 0.2841212 },
          { "x": 0.7725512, "y": 0.29237813 },
          { "x": 0.75829625, "y": 0.29238716 }
        ]
      },
      "id": "63086094-c0ae-43fd-8fad-4f0e556bcfc8",
      "relationships": [
        { "type": "CHILD", "ids": ["bd51abc0-dd4f-4bce-a97b-a87948955430"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.91192,
      "text": "0/0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.019008175,
          "height": 0.009437636,
          "left": 0.80937696,
          "top": 0.28398767
        },
        "polygon": [
          { "x": 0.80937696, "y": 0.28399974 },
          { "x": 0.82837903, "y": 0.28398767 },
          { "x": 0.8283851, "y": 0.29341328 },
          { "x": 0.809383, "y": 0.29342532 }
        ]
      },
      "id": "3c31c5bb-6183-45e8-bb80-effdbe12874e",
      "relationships": [
        { "type": "CHILD", "ids": ["1e1d2818-256d-45f8-a3a4-7c020269661b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.49247,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069769416,
          "height": 0.008040586,
          "left": 0.8488624,
          "top": 0.28409922
        },
        "polygon": [
          { "x": 0.8488624, "y": 0.28410366 },
          { "x": 0.8558341, "y": 0.28409922 },
          { "x": 0.8558394, "y": 0.2921354 },
          { "x": 0.84886765, "y": 0.2921398 }
        ]
      },
      "id": "72b5df58-003f-4f4e-adc8-de8bee520c73",
      "relationships": [
        { "type": "CHILD", "ids": ["04bbf7ef-b574-4298-b4eb-2e77f3747a60"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97955,
      "text": "30",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013882801,
          "height": 0.0082266545,
          "left": 0.87452036,
          "top": 0.2840568
        },
        "polygon": [
          { "x": 0.87452036, "y": 0.28406563 },
          { "x": 0.8883977, "y": 0.2840568 },
          { "x": 0.8884031, "y": 0.29227468 },
          { "x": 0.8745257, "y": 0.29228348 }
        ]
      },
      "id": "feb979ed-3557-405f-9000-44be8b74f594",
      "relationships": [
        { "type": "CHILD", "ids": ["15d7b2b8-2bc6-445b-b7ce-c3cf1120505e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.754616,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0072349566,
          "height": 0.008121771,
          "left": 0.9086665,
          "top": 0.28407398
        },
        "polygon": [
          { "x": 0.9086665, "y": 0.28407857 },
          { "x": 0.91589606, "y": 0.28407398 },
          { "x": 0.9159015, "y": 0.29219118 },
          { "x": 0.9086719, "y": 0.29219574 }
        ]
      },
      "id": "a97eaff1-16de-43f8-beeb-2c75ccaf6c9f",
      "relationships": [
        { "type": "CHILD", "ids": ["bfdb4683-9746-4dd4-a9c6-773153a33121"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.978386,
      "text": "82.6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025459725,
          "height": 0.008197047,
          "left": 0.9361853,
          "top": 0.28406098
        },
        "polygon": [
          { "x": 0.9361853, "y": 0.28407714 },
          { "x": 0.9616395, "y": 0.28406098 },
          { "x": 0.961645, "y": 0.29224193 },
          { "x": 0.9361908, "y": 0.29225802 }
        ]
      },
      "id": "0c5b8338-9bc7-425f-a028-809752415912",
      "relationships": [
        { "type": "CHILD", "ids": ["fc8548cc-706f-4eb8-ad97-b167b3b3f05c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94512,
      "text": "Total",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029657232,
          "height": 0.008664178,
          "left": 0.029921692,
          "top": 0.29897937
        },
        "polygon": [
          { "x": 0.029921692, "y": 0.2989981 },
          { "x": 0.0595748, "y": 0.29897937 },
          { "x": 0.05957892, "y": 0.3076249 },
          { "x": 0.029925756, "y": 0.30764356 }
        ]
      },
      "id": "9f4d7c3e-c406-4c8c-a68c-94ca512dd6a4",
      "relationships": [
        { "type": "CHILD", "ids": ["6d09480b-07f8-429d-a360-c5dd0f725fce"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96107,
      "text": "31",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013542965,
          "height": 0.008462884,
          "left": 0.19434081,
          "top": 0.29901785
        },
        "polygon": [
          { "x": 0.19434081, "y": 0.2990264 },
          { "x": 0.20787947, "y": 0.29901785 },
          { "x": 0.20788378, "y": 0.30747223 },
          { "x": 0.19434509, "y": 0.30748072 }
        ]
      },
      "id": "1f7ec284-5729-43a2-8450-d1543ec73de6",
      "relationships": [
        { "type": "CHILD", "ids": ["df051a5b-c850-498f-b9bc-b6349edcd594"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95669,
      "text": "20",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014055189,
          "height": 0.008281781,
          "left": 0.23861587,
          "top": 0.29912847
        },
        "polygon": [
          { "x": 0.23861587, "y": 0.29913732 },
          { "x": 0.25266677, "y": 0.29912847 },
          { "x": 0.25267106, "y": 0.30740142 },
          { "x": 0.23862013, "y": 0.30741024 }
        ]
      },
      "id": "6ebba1dd-cff2-491c-8351-57d1d8b88348",
      "relationships": [
        { "type": "CHILD", "ids": ["219ab8f5-d61b-4436-9206-d8196791a007"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.94595,
      "text": "229",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.021081923,
          "height": 0.008339116,
          "left": 0.2753878,
          "top": 0.2991469
        },
        "polygon": [
          { "x": 0.2753878, "y": 0.2991602 },
          { "x": 0.2964653, "y": 0.2991469 },
          { "x": 0.29646972, "y": 0.30747277 },
          { "x": 0.27539214, "y": 0.30748603 }
        ]
      },
      "id": "61d943c6-ced4-4727-8890-54c461d04f35",
      "relationships": [
        { "type": "CHILD", "ids": ["91eb6491-273a-456c-8c54-9f844122c657"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96858,
      "text": "1/11",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.024635581,
          "height": 0.009532064,
          "left": 0.3226274,
          "top": 0.29918906
        },
        "polygon": [
          { "x": 0.3226274, "y": 0.2992046 },
          { "x": 0.34725782, "y": 0.29918906 },
          { "x": 0.34726298, "y": 0.30870563 },
          { "x": 0.3226325, "y": 0.30872113 }
        ]
      },
      "id": "3a9d86cf-f8c8-4096-9d50-07d45314eca3",
      "relationships": [
        { "type": "CHILD", "ids": ["aa26557c-7c37-47d5-937c-32294efce4df"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.88574,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0074200844,
          "height": 0.008340351,
          "left": 0.3707338,
          "top": 0.29913127
        },
        "polygon": [
          { "x": 0.3707338, "y": 0.29913595 },
          { "x": 0.3781493, "y": 0.29913127 },
          { "x": 0.37815386, "y": 0.30746695 },
          { "x": 0.37073833, "y": 0.3074716 }
        ]
      },
      "id": "53b516da-15d3-47cb-aea9-e7cfe58ad4b1",
      "relationships": [
        { "type": "CHILD", "ids": ["d50c7cd2-8096-4ff4-8012-7c487f004ae2"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97299,
      "text": "36",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014277902,
          "height": 0.008500039,
          "left": 0.39854518,
          "top": 0.29900292
        },
        "polygon": [
          { "x": 0.39854518, "y": 0.29901192 },
          { "x": 0.41281837, "y": 0.29900292 },
          { "x": 0.41282308, "y": 0.30749398 },
          { "x": 0.39854985, "y": 0.30750296 }
        ]
      },
      "id": "efa3b187-8acc-4bd0-b993-86bc99b15862",
      "relationships": [
        { "type": "CHILD", "ids": ["4341ed69-67fa-427a-a82a-6f88037258b5"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.82919,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007316333,
          "height": 0.008269843,
          "left": 0.43439728,
          "top": 0.29919228
        },
        "polygon": [
          { "x": 0.43439728, "y": 0.2991969 },
          { "x": 0.44170898, "y": 0.29919228 },
          { "x": 0.44171363, "y": 0.30745754 },
          { "x": 0.4344019, "y": 0.30746213 }
        ]
      },
      "id": "100ce53e-5316-4832-84c8-5c07bcbb3e80",
      "relationships": [
        { "type": "CHILD", "ids": ["350f6d15-96ba-4e05-a025-899c96911a32"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98923,
      "text": "86.6",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025294013,
          "height": 0.008383435,
          "left": 0.4579496,
          "top": 0.29906535
        },
        "polygon": [
          { "x": 0.4579496, "y": 0.29908133 },
          { "x": 0.48323885, "y": 0.29906535 },
          { "x": 0.4832436, "y": 0.30743292 },
          { "x": 0.45795432, "y": 0.3074488 }
        ]
      },
      "id": "1aed30ad-3d46-4129-80a0-79bba1f41fc9",
      "relationships": [
        { "type": "CHILD", "ids": ["f56c55b6-fcab-4831-be95-e9574a3c0419"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96949,
      "text": "Total",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.029023435,
          "height": 0.008433243,
          "left": 0.5060182,
          "top": 0.29902494
        },
        "polygon": [
          { "x": 0.5060182, "y": 0.29904324 },
          { "x": 0.5350368, "y": 0.29902494 },
          { "x": 0.5350417, "y": 0.30743992 },
          { "x": 0.5060231, "y": 0.30745816 }
        ]
      },
      "id": "47d16539-4f18-4370-a7e1-63a99f55dd33",
      "relationships": [
        { "type": "CHILD", "ids": ["70643802-59e7-4439-87db-c84a19c9fcb4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96174,
      "text": "33",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013811994,
          "height": 0.00831369,
          "left": 0.6702196,
          "top": 0.29917735
        },
        "polygon": [
          { "x": 0.6702196, "y": 0.29918608 },
          { "x": 0.6840265, "y": 0.29917735 },
          { "x": 0.6840316, "y": 0.30748236 },
          { "x": 0.67022467, "y": 0.30749103 }
        ]
      },
      "id": "e9cffe70-b61f-456f-8d09-bd122a6f87a6",
      "relationships": [
        { "type": "CHILD", "ids": ["d1c47dd6-776e-4735-9230-217693214c21"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.98736,
      "text": "19",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013235721,
          "height": 0.008105282,
          "left": 0.7151854,
          "top": 0.29933336
        },
        "polygon": [
          { "x": 0.7151854, "y": 0.2993417 },
          { "x": 0.7284161, "y": 0.29933336 },
          { "x": 0.72842115, "y": 0.30743033 },
          { "x": 0.7151905, "y": 0.30743864 }
        ]
      },
      "id": "16c3be0e-d449-4765-9d4b-2d53a5ac3b13",
      "relationships": [
        { "type": "CHILD", "ids": ["82dd455d-75d6-4e6f-81be-53c183ff01b8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.97771,
      "text": "182",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020309212,
          "height": 0.008108016,
          "left": 0.75200397,
          "top": 0.29925317
        },
        "polygon": [
          { "x": 0.75200397, "y": 0.29926598 },
          { "x": 0.77230805, "y": 0.29925317 },
          { "x": 0.7723132, "y": 0.30734843 },
          { "x": 0.75200903, "y": 0.3073612 }
        ]
      },
      "id": "4952c703-6401-4272-822c-72549b8d948f",
      "relationships": [
        { "type": "CHILD", "ids": ["12bf4605-5a85-4dd9-bbbb-0e455084f157"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.96479,
      "text": "3/21",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025433835,
          "height": 0.009807055,
          "left": 0.80216366,
          "top": 0.29890725
        },
        "polygon": [
          { "x": 0.80216366, "y": 0.2989233 },
          { "x": 0.8275912, "y": 0.29890725 },
          { "x": 0.8275975, "y": 0.30869836 },
          { "x": 0.8021699, "y": 0.30871433 }
        ]
      },
      "id": "f6b6c868-2c0a-403c-8b47-ef49c7a9eb4a",
      "relationships": [
        { "type": "CHILD", "ids": ["0f0fbe5d-827c-4aeb-9e10-bbd7f817453c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.64558,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0071184593,
          "height": 0.008167198,
          "left": 0.8488334,
          "top": 0.2992361
        },
        "polygon": [
          { "x": 0.8488334, "y": 0.29924056 },
          { "x": 0.85594654, "y": 0.2992361 },
          { "x": 0.85595185, "y": 0.30739883 },
          { "x": 0.84883875, "y": 0.3074033 }
        ]
      },
      "id": "e5e113b4-c487-4f8a-833f-740b1ac237f1",
      "relationships": [
        { "type": "CHILD", "ids": ["063997f7-016e-4afa-a39c-e7da31b7094f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95896,
      "text": "30",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013831599,
          "height": 0.008178436,
          "left": 0.8745703,
          "top": 0.29923093
        },
        "polygon": [
          { "x": 0.8745703, "y": 0.29923964 },
          { "x": 0.88839656, "y": 0.29923093 },
          { "x": 0.8884019, "y": 0.30740067 },
          { "x": 0.8745757, "y": 0.30740938 }
        ]
      },
      "id": "ec8b49fb-2424-4843-8381-eaf8dc6568d5",
      "relationships": [
        { "type": "CHILD", "ids": ["f854c199-803d-4fe4-b7f9-39aad0fdbb09"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.87852,
      "text": "1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.005916001,
          "height": 0.00800214,
          "left": 0.90934706,
          "top": 0.29936734
        },
        "polygon": [
          { "x": 0.90934706, "y": 0.29937106 },
          { "x": 0.91525775, "y": 0.29936734 },
          { "x": 0.91526306, "y": 0.30736575 },
          { "x": 0.90935236, "y": 0.30736947 }
        ]
      },
      "id": "c418a4d8-ebb1-4f4d-925d-a7ad689f333f",
      "relationships": [
        { "type": "CHILD", "ids": ["aaa26783-16dc-4ea8-adfe-13569a84f5f9"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.76688,
      "text": "60.4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.025259955,
          "height": 0.008132922,
          "left": 0.93627155,
          "top": 0.29921898
        },
        "polygon": [
          { "x": 0.93627155, "y": 0.29923493 },
          { "x": 0.961526, "y": 0.29921898 },
          { "x": 0.96153146, "y": 0.30733603 },
          { "x": 0.936277, "y": 0.30735192 }
        ]
      },
      "id": "04ea9c68-6228-4781-9a2e-0c1eea25ed37",
      "relationships": [
        { "type": "CHILD", "ids": ["e2652489-b524-46b7-911d-ad82b7338699"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.922935,
      "text": "PASS RECEIVING",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.113259204,
          "height": 0.008384837,
          "left": 0.030840052,
          "top": 0.32551742
        },
        "polygon": [
          { "x": 0.030840052, "y": 0.32558802 },
          { "x": 0.14409514, "y": 0.32551742 },
          { "x": 0.14409925, "y": 0.33383188 },
          { "x": 0.030843962, "y": 0.33390224 }
        ]
      },
      "id": "0dc8bac8-7f61-401c-ab21-de92a0d24cb1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "de2f2cf3-8201-4754-bb2c-485f1eadda10",
            "859a4c9c-865c-4386-a94f-d26440a4cd99"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.8659,
      "text": "TAR",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027019385,
          "height": 0.00815225,
          "left": 0.2260013,
          "top": 0.32567227
        },
        "polygon": [
          { "x": 0.2260013, "y": 0.3256891 },
          { "x": 0.25301647, "y": 0.32567227 },
          { "x": 0.2530207, "y": 0.33380774 },
          { "x": 0.22600548, "y": 0.33382452 }
        ]
      },
      "id": "6f58aa22-5123-4b81-b9c9-3f9cad6185cb",
      "relationships": [
        { "type": "CHILD", "ids": ["16ce22e3-77f4-49f8-921b-78aa59336824"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.827545,
      "text": "REC",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026229423,
          "height": 0.008197897,
          "left": 0.27125773,
          "top": 0.32559803
        },
        "polygon": [
          { "x": 0.27125773, "y": 0.3256144 },
          { "x": 0.29748282, "y": 0.32559803 },
          { "x": 0.29748714, "y": 0.33377963 },
          { "x": 0.27126202, "y": 0.33379593 }
        ]
      },
      "id": "e121313d-4686-420c-b61f-52bd90f9eff6",
      "relationships": [
        { "type": "CHILD", "ids": ["a201cba0-f2da-4ad6-9a5f-b510de4f70e4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.80975,
      "text": "YDS",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027398104,
          "height": 0.008215088,
          "left": 0.31995654,
          "top": 0.3255275
        },
        "polygon": [
          { "x": 0.31995654, "y": 0.32554457 },
          { "x": 0.3473502, "y": 0.3255275 },
          { "x": 0.34735462, "y": 0.33372557 },
          { "x": 0.3199609, "y": 0.3337426 }
        ]
      },
      "id": "2693d964-81af-44dc-a34b-1b4e1112c4bb",
      "relationships": [
        { "type": "CHILD", "ids": ["73472ebb-714c-4375-a8f3-f3189d81c4f7"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92306,
      "text": "AVG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027662273,
          "height": 0.0081654135,
          "left": 0.3660645,
          "top": 0.3255685
        },
        "polygon": [
          { "x": 0.3660645, "y": 0.32558575 },
          { "x": 0.3937223, "y": 0.3255685 },
          { "x": 0.39372677, "y": 0.33371675 },
          { "x": 0.36606893, "y": 0.33373392 }
        ]
      },
      "id": "d601b946-94d6-48ea-a1ae-491f3ebf360e",
      "relationships": [
        { "type": "CHILD", "ids": ["5d0bf218-fd29-4905-ad0a-03aea1bdccde"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92308,
      "text": "LG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016858,
          "height": 0.008098344,
          "left": 0.4272091,
          "top": 0.3255495
        },
        "polygon": [
          { "x": 0.4272091, "y": 0.32556003 },
          { "x": 0.44406256, "y": 0.3255495 },
          { "x": 0.4440671, "y": 0.3336374 },
          { "x": 0.4272136, "y": 0.33364788 }
        ]
      },
      "id": "f11374b2-611b-4b95-b4dd-f6202f295a5f",
      "relationships": [
        { "type": "CHILD", "ids": ["c1577786-3ea8-4b26-bf6b-b1af03c4b899"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.937584,
      "text": "TD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018018894,
          "height": 0.00791118,
          "left": 0.46751788,
          "top": 0.32564354
        },
        "polygon": [
          { "x": 0.46751788, "y": 0.32565477 },
          { "x": 0.48553225, "y": 0.32564354 },
          { "x": 0.48553678, "y": 0.33354354 },
          { "x": 0.46752235, "y": 0.33355471 }
        ]
      },
      "id": "57eff05a-c5f6-49ce-842e-4e850017358f",
      "relationships": [
        { "type": "CHILD", "ids": ["65e5a858-d852-4884-ad5a-314237cb4b44"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.885864,
      "text": "PASS RECEIVING",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.11292412,
          "height": 0.008261041,
          "left": 0.5067027,
          "top": 0.32551143
        },
        "polygon": [
          { "x": 0.5067027, "y": 0.32558182 },
          { "x": 0.61962193, "y": 0.32551143 },
          { "x": 0.6196268, "y": 0.33370233 },
          { "x": 0.50670743, "y": 0.33377245 }
        ]
      },
      "id": "0ace52ea-72a0-4a17-af2e-bb0f775c9da1",
      "relationships": [
        {
          "type": "CHILD",
          "ids": [
            "013d9255-4f53-48b7-b15c-ce780c01659f",
            "f5b37be5-fa6a-405f-8b56-f6b307d3aeef"
          ]
        }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.877205,
      "text": "TAR",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.02699698,
          "height": 0.008086907,
          "left": 0.70281184,
          "top": 0.3256331
        },
        "polygon": [
          { "x": 0.70281184, "y": 0.32564995 },
          { "x": 0.72980374, "y": 0.3256331 },
          { "x": 0.7298088, "y": 0.33370325 },
          { "x": 0.7028168, "y": 0.33372003 }
        ]
      },
      "id": "eff0c886-3bd5-47de-80f2-b62881cb3eb5",
      "relationships": [
        { "type": "CHILD", "ids": ["4c9ea8bf-1ce0-40e9-8393-d513e8ae785c"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.905624,
      "text": "REC",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.026316429,
          "height": 0.008164085,
          "left": 0.7464749,
          "top": 0.32552528
        },
        "polygon": [
          { "x": 0.7464749, "y": 0.3255417 },
          { "x": 0.7727862, "y": 0.32552528 },
          { "x": 0.7727913, "y": 0.33367303 },
          { "x": 0.74648005, "y": 0.3336894 }
        ]
      },
      "id": "8ebac256-1ecd-401c-aaee-e07291f86370",
      "relationships": [
        { "type": "CHILD", "ids": ["250f261e-eeb8-4108-aa4b-0ca685b53a1a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.86609,
      "text": "YDS",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027438406,
          "height": 0.008252706,
          "left": 0.7956757,
          "top": 0.3254855
        },
        "polygon": [
          { "x": 0.7956757, "y": 0.3255026 },
          { "x": 0.8231088, "y": 0.3254855 },
          { "x": 0.8231141, "y": 0.33372116 },
          { "x": 0.79568094, "y": 0.3337382 }
        ]
      },
      "id": "d7d6bc5a-b7f0-42a7-972c-edf8c65773c5",
      "relationships": [
        { "type": "CHILD", "ids": ["7a51c569-aaa8-4a77-adc7-ad50a304de97"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93375,
      "text": "AVG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.027574046,
          "height": 0.008201663,
          "left": 0.8417915,
          "top": 0.32544544
        },
        "polygon": [
          { "x": 0.8417915, "y": 0.3254626 },
          { "x": 0.86936015, "y": 0.32544544 },
          { "x": 0.8693655, "y": 0.33362997 },
          { "x": 0.8417968, "y": 0.3336471 }
        ]
      },
      "id": "c60fcc65-05fe-4009-9aaf-bbdd2ad54e3d",
      "relationships": [
        { "type": "CHILD", "ids": ["5a5b4564-2233-43a9-8f2e-4426962d4142"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.939354,
      "text": "LG",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.016444389,
          "height": 0.008168593,
          "left": 0.9017753,
          "top": 0.32548168
        },
        "polygon": [
          { "x": 0.9017753, "y": 0.32549194 },
          { "x": 0.91821426, "y": 0.32548168 },
          { "x": 0.9182197, "y": 0.33364007 },
          { "x": 0.90178066, "y": 0.33365026 }
        ]
      },
      "id": "a9177dfb-d1b0-416c-9a49-6851d1f93517",
      "relationships": [
        { "type": "CHILD", "ids": ["14331a44-54a6-4e99-ba7d-f7058ab7ba83"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.93856,
      "text": "TD",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018272368,
          "height": 0.007963026,
          "left": 0.94300294,
          "top": 0.32560775
        },
        "polygon": [
          { "x": 0.94300294, "y": 0.32561913 },
          { "x": 0.9612699, "y": 0.32560775 },
          { "x": 0.9612753, "y": 0.33355942 },
          { "x": 0.9430083, "y": 0.33357075 }
        ]
      },
      "id": "6b783ffe-5bf9-497b-8551-8603eeba5703",
      "relationships": [
        { "type": "CHILD", "ids": ["95d3cd02-a8e9-4bff-8584-c7731ed89c97"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.82697,
      "text": "E.Engram",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0553197,
          "height": 0.010260643,
          "left": 0.030687228,
          "top": 0.34294802
        },
        "polygon": [
          { "x": 0.030687228, "y": 0.34298223 },
          { "x": 0.08600199, "y": 0.34294802 },
          { "x": 0.08600693, "y": 0.3531746 },
          { "x": 0.030692035, "y": 0.35320866 }
        ]
      },
      "id": "87539085-afec-452c-b4f7-7857936a8807",
      "relationships": [
        { "type": "CHILD", "ids": ["5869977b-8f8d-45a9-b682-d9654dd9b6da"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.951614,
      "text": "8",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0069947513,
          "height": 0.008271535,
          "left": 0.24702445,
          "top": 0.34308726
        },
        "polygon": [
          { "x": 0.24702445, "y": 0.3430916 },
          { "x": 0.2540149, "y": 0.34308726 },
          { "x": 0.2540192, "y": 0.3513545 },
          { "x": 0.24702874, "y": 0.3513588 }
        ]
      },
      "id": "27f2ddb0-9043-415e-8799-bbe49369fde9",
      "relationships": [
        { "type": "CHILD", "ids": ["8fe312b9-f85a-4c6f-86ff-01dc34bce344"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.836136,
      "text": "7",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.007229333,
          "height": 0.008232402,
          "left": 0.2894406,
          "top": 0.342977
        },
        "polygon": [
          { "x": 0.2894406, "y": 0.34298146 },
          { "x": 0.29666558, "y": 0.342977 },
          { "x": 0.29666993, "y": 0.35120496 },
          { "x": 0.28944495, "y": 0.3512094 }
        ]
      },
      "id": "b05c0684-cd19-447e-a6b2-d0fd96ca4091",
      "relationships": [
        { "type": "CHILD", "ids": ["bee902f6-4582-4f2f-ab80-c3376c2409eb"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9711,
      "text": "113",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.020355944,
          "height": 0.00836143,
          "left": 0.3265859,
          "top": 0.34301278
        },
        "polygon": [
          { "x": 0.3265859, "y": 0.34302536 },
          { "x": 0.34693733, "y": 0.34301278 },
          { "x": 0.34694183, "y": 0.35136166 },
          { "x": 0.32659036, "y": 0.3513742 }
        ]
      },
      "id": "401ebc08-3c5b-4724-8a72-569f1c277f73",
      "relationships": [
        { "type": "CHILD", "ids": ["1e15b842-bc90-4112-9a5c-09696bca784b"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.95672,
      "text": "16.1",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.023672512,
          "height": 0.008390174,
          "left": 0.36923462,
          "top": 0.34294572
        },
        "polygon": [
          { "x": 0.36923462, "y": 0.3429604 },
          { "x": 0.39290252, "y": 0.34294572 },
          { "x": 0.39290714, "y": 0.35132134 },
          { "x": 0.36923918, "y": 0.3513359 }
        ]
      },
      "id": "371cf3fd-a56a-4d9c-9c47-99afef92c9d7",
      "relationships": [
        { "type": "CHILD", "ids": ["c10ac0e5-1339-45ec-81d0-faea69d460f9"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9802,
      "text": "36",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0140601015,
          "height": 0.008481131,
          "left": 0.42991245,
          "top": 0.34289438
        },
        "polygon": [
          { "x": 0.42991245, "y": 0.34290305 },
          { "x": 0.4439678, "y": 0.34289438 },
          { "x": 0.44397253, "y": 0.35136682 },
          { "x": 0.42991716, "y": 0.3513755 }
        ]
      },
      "id": "5ffa48b2-f65c-4bfe-8102-b14beef38c34",
      "relationships": [
        { "type": "CHILD", "ids": ["862f1d99-2db7-41d5-88b9-96e7e49cd655"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.721344,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0072519537,
          "height": 0.008165783,
          "left": 0.47853,
          "top": 0.343137
        },
        "polygon": [
          { "x": 0.47853, "y": 0.34314147 },
          { "x": 0.4857773, "y": 0.343137 },
          { "x": 0.48578194, "y": 0.3512983 },
          { "x": 0.47853464, "y": 0.35130277 }
        ]
      },
      "id": "6ef70731-9bc5-4a8e-b672-b926031ff3f4",
      "relationships": [
        { "type": "CHILD", "ids": ["7f0efae3-52cb-444a-80b2-8a3db92799be"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.06233,
      "text": "Mi.Carter",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.05211737,
          "height": 0.008519147,
          "left": 0.5066888,
          "top": 0.34304273
        },
        "polygon": [
          { "x": 0.5066888, "y": 0.34307495 },
          { "x": 0.5588012, "y": 0.34304273 },
          { "x": 0.5588062, "y": 0.35152975 },
          { "x": 0.50669366, "y": 0.35156187 }
        ]
      },
      "id": "dc4a2b1b-bf30-45ba-928b-5f8444f47d02",
      "relationships": [
        { "type": "CHILD", "ids": ["bc649d74-1935-4533-93eb-4290b257106f"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.90364,
      "text": "5",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067892885,
          "height": 0.008299563,
          "left": 0.7226693,
          "top": 0.3430037
        },
        "polygon": [
          { "x": 0.7226693, "y": 0.34300786 },
          { "x": 0.72945344, "y": 0.3430037 },
          { "x": 0.7294586, "y": 0.35129908 },
          { "x": 0.7226745, "y": 0.35130325 }
        ]
      },
      "id": "db8223d6-b2c2-4a63-a2f8-8042e3495fdf",
      "relationships": [
        { "type": "CHILD", "ids": ["52d38b1e-b8fb-4f86-8c1f-514ac722287d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.88386,
      "text": "5",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006861917,
          "height": 0.008416921,
          "left": 0.7654022,
          "top": 0.34297785
        },
        "polygon": [
          { "x": 0.7654022, "y": 0.3429821 },
          { "x": 0.77225876, "y": 0.34297785 },
          { "x": 0.7722641, "y": 0.35139057 },
          { "x": 0.7654075, "y": 0.35139477 }
        ]
      },
      "id": "05d8f567-8d34-496b-9230-aed47939208c",
      "relationships": [
        { "type": "CHILD", "ids": ["0df4e07c-6186-4d76-a66e-c893587af0de"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.960045,
      "text": "44",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014374238,
          "height": 0.00845857,
          "left": 0.80846214,
          "top": 0.34288493
        },
        "polygon": [
          { "x": 0.80846214, "y": 0.3428938 },
          { "x": 0.822831, "y": 0.34288493 },
          { "x": 0.8228364, "y": 0.35133463 },
          { "x": 0.80846757, "y": 0.35134348 }
        ]
      },
      "id": "c4317200-c08a-4eab-af8b-c6211f67804d",
      "relationships": [
        { "type": "CHILD", "ids": ["77209298-c2b6-4d7c-b87c-995270907444"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.951225,
      "text": "8.8",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.01835188,
          "height": 0.008537945,
          "left": 0.8512754,
          "top": 0.34287113
        },
        "polygon": [
          { "x": 0.8512754, "y": 0.34288248 },
          { "x": 0.8696217, "y": 0.34287113 },
          { "x": 0.8696273, "y": 0.35139778 },
          { "x": 0.851281, "y": 0.35140908 }
        ]
      },
      "id": "e4e987d8-2d35-4c60-afcd-2ceecb96f4d7",
      "relationships": [
        { "type": "CHILD", "ids": ["5eb65b6e-cffb-4e38-8fb0-dca4ca212227"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.92665,
      "text": "12",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013325194,
          "height": 0.008378648,
          "left": 0.9049583,
          "top": 0.34304553
        },
        "polygon": [
          { "x": 0.9049583, "y": 0.3430538 },
          { "x": 0.918278, "y": 0.34304553 },
          { "x": 0.9182835, "y": 0.351416 },
          { "x": 0.90496385, "y": 0.3514242 }
        ]
      },
      "id": "f5f21c2c-f72e-4c7c-aa7a-781a2adb1e28",
      "relationships": [
        { "type": "CHILD", "ids": ["1af66bb6-7fd4-45c8-910a-6886b9d0d95e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.72309,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0073965956,
          "height": 0.008230712,
          "left": 0.95434237,
          "top": 0.34312677
        },
        "polygon": [
          { "x": 0.95434237, "y": 0.34313133 },
          { "x": 0.9617334, "y": 0.34312677 },
          { "x": 0.96173894, "y": 0.35135293 },
          { "x": 0.9543479, "y": 0.3513575 }
        ]
      },
      "id": "44fadf46-c3d5-4c98-b729-dfeee834ee83",
      "relationships": [
        { "type": "CHILD", "ids": ["743a49ed-76ca-494a-b2ff-1a247966e1c1"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 97.67773,
      "text": "T.Etienne",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054772653,
          "height": 0.008621757,
          "left": 0.030513808,
          "top": 0.35833743
        },
        "polygon": [
          { "x": 0.030513808, "y": 0.35837108 },
          { "x": 0.08528232, "y": 0.35833743 },
          { "x": 0.08528646, "y": 0.3669257 },
          { "x": 0.030517846, "y": 0.36695918 }
        ]
      },
      "id": "06488f75-a4e0-42e9-85ab-7ba04200e6c2",
      "relationships": [
        { "type": "CHILD", "ids": ["136aef5f-79c2-427f-9b9b-05e5bc77eac4"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.926216,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.006785888,
          "height": 0.008419945,
          "left": 0.24703693,
          "top": 0.3584418
        },
        "polygon": [
          { "x": 0.24703693, "y": 0.35844597 },
          { "x": 0.25381845, "y": 0.3584418 },
          { "x": 0.25382283, "y": 0.3668576 },
          { "x": 0.2470413, "y": 0.36686176 }
        ]
      },
      "id": "5d079e11-ff0c-4b89-863c-d1674c662b51",
      "relationships": [
        { "type": "CHILD", "ids": ["15011ac8-52f9-4106-9d41-63caebfd65c2"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.85239,
      "text": "3",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0067552673,
          "height": 0.008440958,
          "left": 0.28946403,
          "top": 0.3584299
        },
        "polygon": [
          { "x": 0.28946403, "y": 0.35843405 },
          { "x": 0.29621482, "y": 0.3584299 },
          { "x": 0.2962193, "y": 0.36686674 },
          { "x": 0.28946847, "y": 0.36687085 }
        ]
      },
      "id": "0fa6f2f7-63e2-4c03-a8c4-975a6fde7293",
      "relationships": [
        { "type": "CHILD", "ids": ["1c55911f-ffe4-4e53-abed-a4f95383f05d"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.969376,
      "text": "29",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0141425785,
          "height": 0.008502936,
          "left": 0.33302143,
          "top": 0.35848773
        },
        "polygon": [
          { "x": 0.33302143, "y": 0.3584964 },
          { "x": 0.34715942, "y": 0.35848773 },
          { "x": 0.347164, "y": 0.366982 },
          { "x": 0.333026, "y": 0.36699066 }
        ]
      },
      "id": "9505ffe9-4bf5-41b0-bc6d-1ea2f413c3a5",
      "relationships": [
        { "type": "CHILD", "ids": ["4bbbf0a1-81c3-4fe4-a203-7b90e9c9e763"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.950554,
      "text": "9.7",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018226618,
          "height": 0.008538614,
          "left": 0.37552518,
          "top": 0.35848024
        },
        "polygon": [
          { "x": 0.37552518, "y": 0.35849142 },
          { "x": 0.3937471, "y": 0.35848024 },
          { "x": 0.3937518, "y": 0.3670077 },
          { "x": 0.37552983, "y": 0.36701885 }
        ]
      },
      "id": "79c4960e-d753-4901-9441-e86d94ea9904",
      "relationships": [
        { "type": "CHILD", "ids": ["e11c7590-7650-4db3-81d8-b6c9309a204a"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.89776,
      "text": "22",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014160058,
          "height": 0.008397705,
          "left": 0.42971808,
          "top": 0.35844833
        },
        "polygon": [
          { "x": 0.42971808, "y": 0.358457 },
          { "x": 0.4438734, "y": 0.35844833 },
          { "x": 0.4438781, "y": 0.36683735 },
          { "x": 0.42972276, "y": 0.36684602 }
        ]
      },
      "id": "20ef9438-3a06-417e-a582-252362bc5c89",
      "relationships": [
        { "type": "CHILD", "ids": ["ed6495af-c885-4ea2-9a85-d3f491cfcf97"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.715515,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0073012877,
          "height": 0.008261621,
          "left": 0.4785186,
          "top": 0.35853034
        },
        "polygon": [
          { "x": 0.4785186, "y": 0.35853484 },
          { "x": 0.48581517, "y": 0.35853034 },
          { "x": 0.48581988, "y": 0.36678752 },
          { "x": 0.47852328, "y": 0.36679196 }
        ]
      },
      "id": "8f934027-787a-4874-8a50-36a3a8a46665",
      "relationships": [
        { "type": "CHILD", "ids": ["0e7ec2bc-9e3d-4b54-aa73-6fd2d2daf9e6"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 98.074394,
      "text": "T.Conklin",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.054044634,
          "height": 0.008561374,
          "left": 0.5057927,
          "top": 0.3583208
        },
        "polygon": [
          { "x": 0.5057927, "y": 0.358354 },
          { "x": 0.5598323, "y": 0.3583208 },
          { "x": 0.5598373, "y": 0.36684912 },
          { "x": 0.50579756, "y": 0.36688218 }
        ]
      },
      "id": "40ff8412-8d9a-4459-a5b9-7bd887414655",
      "relationships": [
        { "type": "CHILD", "ids": ["d99b2bb0-8ea4-40f9-ba8a-9ef171b87231"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.963,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.00742932,
          "height": 0.007920934,
          "left": 0.72239566,
          "top": 0.35858825
        },
        "polygon": [
          { "x": 0.72239566, "y": 0.3585928 },
          { "x": 0.7298201, "y": 0.35858825 },
          { "x": 0.729825, "y": 0.36650464 },
          { "x": 0.7224006, "y": 0.3665092 }
        ]
      },
      "id": "3e111658-b2e9-4aa6-9043-a9221fd429c6",
      "relationships": [
        { "type": "CHILD", "ids": ["f6cd0c9e-9f03-4fbe-b849-ed270e35c38e"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9506,
      "text": "4",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0073382854,
          "height": 0.007939912,
          "left": 0.7650984,
          "top": 0.3586058
        },
        "polygon": [
          { "x": 0.7650984, "y": 0.3586103 },
          { "x": 0.7724317, "y": 0.3586058 },
          { "x": 0.7724367, "y": 0.3665412 },
          { "x": 0.7651034, "y": 0.3665457 }
        ]
      },
      "id": "112b369a-1efd-4a14-8c81-0c7aea163f08",
      "relationships": [
        { "type": "CHILD", "ids": ["a800093f-a200-41c0-8752-4ed02c9c98ee"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.9515,
      "text": "34",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.014139007,
          "height": 0.0084850965,
          "left": 0.80859065,
          "top": 0.3583941
        },
        "polygon": [
          { "x": 0.80859065, "y": 0.35840276 },
          { "x": 0.8227242, "y": 0.3583941 },
          { "x": 0.8227297, "y": 0.36687052 },
          { "x": 0.80859613, "y": 0.36687917 }
        ]
      },
      "id": "9b582d3b-ce28-41b5-a5c1-93f4377f0af8",
      "relationships": [
        { "type": "CHILD", "ids": ["97c930dc-7a45-4cbc-b77f-661b283372c8"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 92.55342,
      "text": "8.5",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.018080877,
          "height": 0.008377082,
          "left": 0.85129577,
          "top": 0.35847765
        },
        "polygon": [
          { "x": 0.85129577, "y": 0.35848874 },
          { "x": 0.8693711, "y": 0.35847765 },
          { "x": 0.8693766, "y": 0.36684367 },
          { "x": 0.8513012, "y": 0.36685473 }
        ]
      },
      "id": "d004ddf3-038f-45a7-9cb9-a497449ae361",
      "relationships": [
        { "type": "CHILD", "ids": ["8eea839f-09cf-44a0-8eba-2d65005ca1da"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.857605,
      "text": "27",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.013951541,
          "height": 0.008177582,
          "left": 0.9043253,
          "top": 0.35853678
        },
        "polygon": [
          { "x": 0.9043253, "y": 0.35854533 },
          { "x": 0.91827136, "y": 0.35853678 },
          { "x": 0.91827685, "y": 0.36670583 },
          { "x": 0.9043307, "y": 0.36671436 }
        ]
      },
      "id": "d88080e6-9c3b-4591-9891-bbd624a5bdfc",
      "relationships": [
        { "type": "CHILD", "ids": ["83aa5173-4a8a-443c-8044-f2bb771ca150"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.73082,
      "text": "0",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.0071397847,
          "height": 0.0081560835,
          "left": 0.95440644,
          "top": 0.35866395
        },
        "polygon": [
          { "x": 0.95440644, "y": 0.35866833 },
          { "x": 0.9615407, "y": 0.35866395 },
          { "x": 0.96154624, "y": 0.3668157 },
          { "x": 0.9544119, "y": 0.36682004 }
        ]
      },
      "id": "cd8d85c8-670b-4735-b92f-23cfe9feeefe",
      "relationships": [
        { "type": "CHILD", "ids": ["a4b0f87d-177b-48df-8db6-6ee58f3c8781"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    },
    {
      "blockType": "LINE",
      "confidence": 99.57201,
      "text": "C.Kirk",
      "textType": null,
      "rowIndex": null,
      "columnIndex": null,
      "rowSpan": null,
      "columnSpan": null,
      "geometry": {
        "boundingBox": {
          "width": 0.03407295,
          "height": 0.008579961,
          "left": 0.03052813,
          "top": 0.3735511
        },
        "polygon": [
          { "x": 0.03052813, "y": 0.37357187 },
          { "x": 0.06459699, "y": 0.3735511 },
          { "x": 0.06460108, "y": 0.38211036 },
          { "x": 0.030532155, "y": 0.38213107 }
        ]
      },
      "id": "8bf111b5-5165-4d64-bccc-af8b62fb1675",
      "relationships": [
        { "type": "CHILD", "ids": ["9803b4e8-eb3b-47a6-8808-d22d60dfc616"] }
      ],
      "entityTypes": null,
      "selectionStatus": null,
      "page": 2,
      "query": null
    }
  ],
  "warnings": null,
  "statusMessage": null,
  "detectDocumentTextModelVersion": "1.0"
}
"""
    }
