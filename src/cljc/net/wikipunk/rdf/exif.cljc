(ns net.wikipunk.rdf.exif
  "http://www.w3.org/2003/12/exif/ns"
  {:dc11/description
   ["Exifフォーマットの写真からデータを取りだしてRDFで表現するため、Exif 2.2の全てのタグをRDFプロパティとして定義し、さらにそれを記述するのに必要な語彙を追加したボキャブラリ"
    "Vocabulary to describe an Exif format picture data. All Exif 2.2 tags are defined as RDF properties, as well as several terms to help this schema."
    "Vocabulaire pour décrire les données Exif d'une photographie. Toutes les balises Exif 2.2 sont définies comme des propriétés RDF, ainsi que plusieurs termes pour donner de l'aide."],
   :dc11/source "http://tsc.jeita.or.jp/avs/data/cp3451.pdf",
   :dc11/title "Exif data description vocabulary",
   :dcterms/created "2003-07-18",
   :dcterms/modified "2003-08-19",
   :foaf/maker "urn:pin:MK705",
   :owl/versionInfo "Experimental version.",
   :rdf/ns-prefix-map {"dc11"    "http://purl.org/dc/elements/1.1/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "ex"      "http://example.org/",
                       "exif"    "http://www.w3.org/2003/12/exif/ns#",
                       "foaf"    "http://xmlns.com/foaf/0.1/",
                       "owl"     "http://www.w3.org/2002/07/owl#",
                       "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs"    "http://www.w3.org/2000/01/rdf-schema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "exif",
   :rdfa/uri "http://www.w3.org/2003/12/exif/ns"})

(def IFD
  "An Image File Directory"
  {:db/ident        :exif/IFD,
   :rdf/type        :rdfs/Class,
   :rdfs/comment    "An Image File Directory",
   :rdfs/label      "IFD",
   :rdfs/subClassOf [:rdfs/Resource :exif/IFD]})

(def _unknown
  "An Exif tag whose meaning is not known"
  {:db/ident           :exif/_unknown,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An Exif tag whose meaning is not known",
   :rdfs/label         "Unknown tag",
   :rdfs/subPropertyOf :exif/_unknown})

(def apertureValue
  "レンズ絞り値（APEX値）。この値のルート2のベキ乗を取ると、通常の絞り値となる。例えば'5'の場合だと√2^5=F5.6 The lens aperture. The unit is the APEX value."
  {:db/ident :exif/apertureValue,
   :exif/tagNumber "37378",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["レンズ絞り値（APEX値）。この値のルート2のベキ乗を取ると、通常の絞り値となる。例えば'5'の場合だと√2^5=F5.6"
    "The lens aperture. The unit is the APEX value."],
   :rdfs/label "ApertureValue",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/apertureValue :exif/exifAttribute]})

(def artist
  "Person who created the image"
  {:db/ident           :exif/artist,
   :exif/tagNumber     "315",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Person who created the image",
   :rdfs/label         "Artist",
   :rdfs/subPropertyOf [:dc11/creator :exif/exifAttribute :exif/artist]})

(def bitsPerSample
  "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/bitsPerSample,
   :exif/tagNumber "258",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The number of bits per image component. In this standard each component of the image is 8 bits, so the value for this tag is 8. See also SamplesPerPixel. In JPEG compressed data a JPEG marker is used instead of this tag.",
   :rdfs/label "BitsPerSample",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/imageDataStruct
                        :exif/bitsPerSample
                        :exif/exifAttribute]})

(def brightnessValue
  "画像撮影時の撮影対象物の明るさ（APEX値）。EVにするにはISO感度の値を足す必要があり、Ev:Exposure, Bv:BrightnessValue, Sv:SensitivityValueとしてEv=Bv+Sv Sv=log^2(ISOSpeedRating/3.125)という計算式を使う。ISO感度100の場合Sv=5、ISO200の場合Sv=6、ISO125ではSv=5.32 The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated."
  {:db/ident :exif/brightnessValue,
   :exif/tagNumber "37379",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像撮影時の撮影対象物の明るさ（APEX値）。EVにするにはISO感度の値を足す必要があり、Ev:Exposure, Bv:BrightnessValue, Sv:SensitivityValueとしてEv=Bv+Sv Sv=log^2(ISOSpeedRating/3.125)という計算式を使う。ISO感度100の場合Sv=5、ISO200の場合Sv=6、ISO125ではSv=5.32"
    "The value of brightness. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99. Note that if the numerator of the recorded value is FFFFFFFF.H, Unknown shall be indicated."],
   :rdfs/label "BrightnessValue",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/brightnessValue :exif/exifAttribute]})

(def cfaPattern
  "CCDに付いているColor filter array(CFA)のパターン。例えば普通のRGBフィルターだと、CFAPatternのデータは 02 02 00 01 01 02 The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods."
  {:db/ident :exif/cfaPattern,
   :exif/tagNumber "41730",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["CCDに付いているColor filter array(CFA)のパターン。例えば普通のRGBフィルターだと、CFAPatternのデータは 02 02 00 01 01 02"
    "The color filter array (CFA) geometric pattern of the image sensor when a one-chip color area sensor is used. It does not apply to all sensing methods."],
   :rdfs/label "CFAPattern",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/cfaPattern :exif/exifAttribute]})

(def colorSpace
  "使われる色空間。通常sRGB The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment."
  {:db/ident :exif/colorSpace,
   :exif/tagNumber "40961",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["使われる色空間。通常sRGB"
    "The color space information tag (ColorSpace) is always recorded as the color space specifier. Normally sRGB (=1) is used to define the color space based on the PC monitor conditions and environment."],
   :rdfs/label "ColorSpace",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/colorSpace :exif/exifAttribute]})

(def componentsConfiguration
  "圧縮データがYCC以外の並びの場合、4バイトでその並びを示す。それぞれの値は0:not exist,1:Y,2:Cb,3:Cr,4:R,5:G,6:B Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences."
  {:db/ident :exif/componentsConfiguration,
   :exif/tagNumber "37121",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["圧縮データがYCC以外の並びの場合、4バイトでその並びを示す。それぞれの値は0:not exist,1:Y,2:Cb,3:Cr,4:R,5:G,6:B"
    "Information specific to compressed data. The channels of each component are arranged in order from the 1st component to the 4th. For uncompressed data the data arrangement is given in the PhotometricInterpretation tag. However, since PhotometricInterpretation can only express the order of Y,Cb and Cr, this tag is provided for cases when compressed data uses components other than Y, Cb, and Cr and to enable support of other sequences."],
   :rdfs/label "ComponentsConfiguration",
   :rdfs/subPropertyOf
   [:exif/imageConfig :exif/componentsConfiguration :exif/exifAttribute]})

(def compressedBitsPerPixel
  "画像の圧縮率 Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel."
  {:db/ident :exif/compressedBitsPerPixel,
   :exif/tagNumber "37122",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像の圧縮率"
    "Information specific to compressed data. The compression mode used for a compressed image is indicated in unit bits per pixel."],
   :rdfs/label "CompressedBitsPerPixel",
   :rdfs/subPropertyOf
   [:exif/imageConfig :exif/compressedBitsPerPixel :exif/exifAttribute]})

(def compression
  "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6."
  {:db/ident :exif/compression,
   :exif/tagNumber "259",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The compression scheme used for the image data. When a primary image is JPEG compressed, this designation is not necessary and is omitted. When thumbnails use JPEG compression, this tag value is set to 6.",
   :rdfs/label "Compression",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/compression :exif/exifAttribute]})

(def contrast
  "The direction of contrast processing applied by the camera when the image was shot."
  {:db/ident :exif/contrast,
   :exif/tagNumber "41992",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The direction of contrast processing applied by the camera when the image was shot.",
   :rdfs/label "Contrast",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/contrast :exif/exifAttribute]})

(def copyright
  "この画像の撮影者および編集者の著作権情報 Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image."
  {:db/ident :exif/copyright,
   :exif/tagNumber "33432",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["この画像の撮影者および編集者の著作権情報"
    "Copyright information. In this standard the tag is used to indicate both the photographer and editor copyrights. It is the copyright notice of the person or organization claiming rights to the image."],
   :rdfs/label "Copyright",
   :rdfs/subPropertyOf [:dc11/rights :exif/exifAttribute :exif/copyright]})

(def customRendered
  "特別なレンダリング処理を行っているかどうか The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing."
  {:db/ident :exif/customRendered,
   :exif/tagNumber "41985",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["特別なレンダリング処理を行っているかどうか"
    "The use of special processing on image data, such as rendering geared to output. When special processing is performed, the reader is expected to disable or minimize any further processing."],
   :rdfs/label "CustomRendered",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/customRendered :exif/exifAttribute]})

(def datatype
  "The Exif field data type, such as ascii, byte, short etc."
  {:db/ident :exif/datatype,
   :rdf/type :rdf/Property,
   :rdfs/comment "The Exif field data type, such as ascii, byte, short etc.",
   :rdfs/label "Data Type",
   :rdfs/subPropertyOf [:dc11/type :exif/datatype]})

(def date
  "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format"
  {:db/ident :exif/date,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "a date information. Usually saved as YYYY:MM:DD (HH:MM:SS) format in Exif data, but represented here as W3C-DTF format",
   :rdfs/label "Date",
   :rdfs/subPropertyOf [:dc11/date :exif/date]})

(def dateAndOrTime
  "An attribute relating to Date and/or Time"
  {:db/ident           :exif/dateAndOrTime,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to Date and/or Time",
   :rdfs/label         "Date and/or Time",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/dateAndOrTime]})

(def dateTime
  "この画像が作成（あるいは最後に変更された）日時。通常はDateTimeOriginaと同じ値 The date and time of image creation. In this standard it is the date and time the file was changed."
  {:db/ident :exif/dateTime,
   :exif/tagNumber "306",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["この画像が作成（あるいは最後に変更された）日時。通常はDateTimeOriginaと同じ値"
    "The date and time of image creation. In this standard it is the date and time the file was changed."],
   :rdfs/label "DateTime",
   :rdfs/subPropertyOf
   [:exif/date :exif/exifAttribute :exif/dateTime :dc11/date]})

(def dateTimeDigitized
  "画像がデジタル化された日時。デジカメ画像なら通常DateTimeOriginalと同じ値 The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents."
  {:db/ident :exif/dateTimeDigitized,
   :exif/tagNumber "36868",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像がデジタル化された日時。デジカメ画像なら通常DateTimeOriginalと同じ値"
    "The date and time when the image was stored as digital data. If, for example, an image was captured by DSC and at the same time the file was recorded, then the DateTimeOriginal and DateTimeDigitized will have the same contents."],
   :rdfs/label "DateTimeDigitized",
   :rdfs/subPropertyOf [:exif/date
                        :exif/dateAndOrTime
                        :exif/dateTimeDigitized
                        :dc11/date
                        :exif/exifAttribute]})

(def dateTimeOriginal
  "オリジナル画像が作成（撮影）された日時 The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded."
  {:db/ident :exif/dateTimeOriginal,
   :exif/tagNumber "36867",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["オリジナル画像が作成（撮影）された日時"
    "The date and time when the original image data was generated. For a DSC the date and time the picture was taken are recorded."],
   :rdfs/label "DateTimeOriginal",
   :rdfs/subPropertyOf [:exif/date
                        :exif/dateAndOrTime
                        :exif/dateTimeOriginal
                        :dc11/date
                        :exif/exifAttribute]})

(def deviceSettingDescription
  "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader."
  {:db/ident :exif/deviceSettingDescription,
   :exif/tagNumber "41995",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Information on the picture-taking conditions of a particular camera model. The tag is used only to indicate the picture-taking conditions in the reader.",
   :rdfs/label "DeviceSettingDescription",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/deviceSettingDescription :exif/exifAttribute]})

(def digitalZoomRatio
  "デジタルズームが使われた場合、その比率 The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used."
  {:db/ident :exif/digitalZoomRatio,
   :exif/tagNumber "41988",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["デジタルズームが使われた場合、その比率"
    "The digital zoom ratio when the image was shot. If the numerator of the recorded value is 0, this indicates that digital zoom was not used."],
   :rdfs/label "DigitalZoomRatio",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/digitalZoomRatio :exif/exifAttribute]})

(def exifAttribute
  "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags."
  {:db/ident :exif/exifAttribute,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A property that connects an IFD to one of its entries. Super property which integrates all Exif tags.",
   :rdfs/domain :exif/IFD,
   :rdfs/label "Exif Attribute",
   :rdfs/subPropertyOf :exif/exifAttribute})

(def exifVersion
  "Exif形式のバージョン Exif Version"
  {:db/ident           :exif/exifVersion,
   :exif/tagNumber     "36864",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["Exif形式のバージョン" "Exif Version"],
   :rdfs/label         "ExifVersion",
   :rdfs/subPropertyOf [:exif/versionInfo
                        :exif/exifVersion
                        :exif/exifAttribute]})

(def exif_IFD_Pointer
  "Exif IFDへのポインタ A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information."
  {:db/ident :exif/exif_IFD_Pointer,
   :exif/tagNumber "34665",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Exif IFDへのポインタ"
    "A pointer to the Exif IFD, which is a set of tags for recording Exif-specific attribute information."],
   :rdfs/label "Exif IFD Pointer",
   :rdfs/subPropertyOf
   [:exif/ifdPointer :exif/exif_IFD_Pointer :exif/exifAttribute]})

(def exifdata
  "An Exif IFD data entry"
  {:db/ident           :exif/exifdata,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An Exif IFD data entry",
   :rdfs/label         "Exif data",
   :rdfs/subPropertyOf :exif/exifdata})

(def exposureBiasValue
  "撮影時の露光補正量。単位はAPEX値(EV) The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99."
  {:db/ident :exif/exposureBiasValue,
   :exif/tagNumber "37380",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["撮影時の露光補正量。単位はAPEX値(EV)"
    "The exposure bias. The unit is the APEX value. Ordinarily it is given in the range of -99.99 to 99.99."],
   :rdfs/label "ExposureBiasValue",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureBiasValue :exif/exifAttribute]})

(def exposureIndex
  "CCD感度。データ形式が符号なし分数である事を除き、ISOSpeedRatingsと同じ The exposure index selected on the camera or input device at the time the image is captured."
  {:db/ident :exif/exposureIndex,
   :exif/tagNumber "41493",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["CCD感度。データ形式が符号なし分数である事を除き、ISOSpeedRatingsと同じ"
    "The exposure index selected on the camera or input device at the time the image is captured."],
   :rdfs/label "ExposureIndex",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureIndex :exif/exifAttribute]})

(def exposureMode
  "露光モード the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings."
  {:db/ident :exif/exposureMode,
   :exif/tagNumber "41986",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["露光モード"
    "the exposure mode set when the image was shot. In auto-bracketing mode, the camera shoots a series of frames of the same scene at different exposure settings."],
   :rdfs/label "ExposureMode",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureMode :exif/exifAttribute]})

(def exposureProgram
  "露光制御のモード The class of the program used by the camera to set exposure when the picture is taken."
  {:db/ident :exif/exposureProgram,
   :exif/tagNumber "34850",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["露光制御のモード"
    "The class of the program used by the camera to set exposure when the picture is taken."],
   :rdfs/label "ExposureProgram",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/exposureProgram :exif/exifAttribute]})

(def exposureTime
  "露光時間（シャッター速度の逆数）。単位は秒 Exposure time, given in seconds (sec)."
  {:db/ident           :exif/exposureTime,
   :exif/tagNumber     "33434",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["露光時間（シャッター速度の逆数）。単位は秒"
                        "Exposure time, given in seconds (sec)."],
   :rdfs/label         "ExposureTime",
   :rdfs/subPropertyOf [:exif/seconds
                        :exif/pictTaking
                        :exif/exposureTime
                        :exif/exifAttribute]})

(def fNumber
  "レンズのF値 F number"
  {:db/ident           :exif/fNumber,
   :exif/tagNumber     "33437",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["レンズのF値" "F number"],
   :rdfs/label         "FNumber",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/fNumber :exif/exifAttribute]})

(def fileSource
  "画像がどういうデバイスから得られたか。通常3=DSC The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC."
  {:db/ident :exif/fileSource,
   :exif/tagNumber "41728",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像がどういうデバイスから得られたか。通常3=DSC"
    "The image source. If a DSC recorded the image, this tag value of this tag always be set to 3, indicating that the image was recorded on a DSC."],
   :rdfs/label "FileSource",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/fileSource :exif/exifAttribute]})

(def flash
  "フラッシュ発光の状態 The status of flash when the image was shot."
  {:db/ident           :exif/flash,
   :exif/tagNumber     "37385",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["フラッシュ発光の状態"
                        "The status of flash when the image was shot."],
   :rdfs/label         "Flash",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/flash :exif/exifAttribute]})

(def flashEnergy
  "BCPSによるストロボの強度 The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS)."
  {:db/ident :exif/flashEnergy,
   :exif/tagNumber "41483",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["BCPSによるストロボの強度"
    "The strobe energy at the time the image is captured, as measured in Beam Candle Power Seconds (BCPS)."],
   :rdfs/label "FlashEnergy",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/flashEnergy :exif/exifAttribute]})

(def flashpixVersion
  "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII."
  {:db/ident :exif/flashpixVersion,
   :exif/tagNumber "40960",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Flashpix format version supported by a FPXR file. If the FPXR function supports Flashpix format Ver. 1.0, this is indicated similarly to ExifVersion by recording \"0100\" as 4-byte ASCII.",
   :rdfs/label "FlashpixVersion",
   :rdfs/subPropertyOf
   [:exif/versionInfo :exif/flashpixVersion :exif/exifAttribute]})

(def focalLength
  "レンズの焦点距離。単位はmm The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera."
  {:db/ident :exif/focalLength,
   :exif/tagNumber "37386",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["レンズの焦点距離。単位はmm"
    "The actual focal length of the lens, in mm. Conversion is not made to the focal length of a 35 mm film camera."],
   :rdfs/label "FocalLength",
   :rdfs/subPropertyOf [:exif/mm
                        :exif/pictTaking
                        :exif/focalLength
                        :exif/length
                        :exif/exifAttribute]})

(def focalLengthIn35mmFilm
  "35mm換算した焦点距離 The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag."
  {:db/ident :exif/focalLengthIn35mmFilm,
   :exif/tagNumber "41989",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["35mm換算した焦点距離"
    "The equivalent focal length assuming a 35mm film camera, in mm. A value of 0 means the focal length is unknown. Note that this tag differs from the FocalLength tag."],
   :rdfs/label "FocalLengthIn35mmFilm",
   :rdfs/subPropertyOf [:exif/length
                        :exif/pictTaking
                        :exif/focalLengthIn35mmFilm
                        :exif/exifAttribute]})

(def focalPlaneResolutionUnit
  "CCD画素密度の単位 The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit."
  {:db/ident :exif/focalPlaneResolutionUnit,
   :exif/tagNumber "41488",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["CCD画素密度の単位"
    "The unit for measuring FocalPlaneXResolution and FocalPlaneYResolution. This value is the same as the ResolutionUnit."],
   :rdfs/label "FocalPlaneResolutionUnit",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/focalPlaneResolutionUnit :exif/exifAttribute]})

(def focalPlaneXResolution
  "撮影画像のCCD位置での水平解像度。この値とFocalPlaneYResolution、FocalLengthを使うと、レンズ焦点距離の35mmカメラ換算値が計算できる。例えば200万画素機を使いVGAモードの画像を撮ったような場合はこの値はVGAの解像度でリサンプルされた値になっており、CCDの画素ピッチそのままの値ではないので注意が必要 The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane."
  {:db/ident :exif/focalPlaneXResolution,
   :exif/tagNumber "41486",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["撮影画像のCCD位置での水平解像度。この値とFocalPlaneYResolution、FocalLengthを使うと、レンズ焦点距離の35mmカメラ換算値が計算できる。例えば200万画素機を使いVGAモードの画像を撮ったような場合はこの値はVGAの解像度でリサンプルされた値になっており、CCDの画素ピッチそのままの値ではないので注意が必要"
    "The number of pixels in the image width (X) direction per FocalPlaneResolutionUnit on the camera focal plane."],
   :rdfs/label "FocalPlaneXResolution",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/pictTaking
                        :exif/focalPlaneXResolution
                        :exif/exifAttribute]})

(def focalPlaneYResolution
  "撮影画像のCCD位置での垂直解像度 The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane."
  {:db/ident :exif/focalPlaneYResolution,
   :exif/tagNumber "41487",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["撮影画像のCCD位置での垂直解像度"
    "The number of pixels in the image height (Y) direction per FocalPlaneResolutionUnit on the camera focal plane."],
   :rdfs/label "FocalPlaneYResolution",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/pictTaking
                        :exif/focalPlaneYResolution
                        :exif/exifAttribute]})

(def gainControl
  "The degree of overall image gain adjustment."
  {:db/ident           :exif/gainControl,
   :exif/tagNumber     "41991",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The degree of overall image gain adjustment.",
   :rdfs/label         "GainControl",
   :rdfs/subPropertyOf [:exif/pictTaking
                        :exif/gainControl
                        :exif/exifAttribute]})

(def geo
  "Geometric data such as latitude, longitude and altitude. Usually saved as rational number."
  {:db/ident :exif/geo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Geometric data such as latitude, longitude and altitude. Usually saved as rational number.",
   :rdfs/label "Geometric data",
   :rdfs/subPropertyOf :exif/geo})

(def gpsAltitude
  "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters."
  {:db/ident :exif/gpsAltitude,
   :exif/tagNumber "6",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The altitude based on the reference in GPSAltitudeRef. Altitude is expressed as one RATIONAL value. The reference unit is meters.",
   :rdfs/label "GPSAltitude",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsAltitude :exif/exifAttribute]})

(def gpsAltitudeRef
  "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters."
  {:db/ident :exif/gpsAltitudeRef,
   :exif/tagNumber "5",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the altitude used as the reference altitude. If the reference is sea level and the altitude is above sea level, 0 is given. If the altitude is below sea level, a value of 1 is given and the altitude is indicated as an absolute value in the GPSAltitude tag. The reference unit is meters.",
   :rdfs/label "GPSAltitudeRef",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsAltitudeRef :exif/exifAttribute]})

(def gpsAreaInformation
  "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area."
  {:db/ident :exif/gpsAreaInformation,
   :exif/tagNumber "28",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A character string recording the name of the GPS area. The first byte indicates the character code used, and this is followed by the name of the GPS area.",
   :rdfs/label "GPSAreaInformation",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsAreaInformation :exif/exifAttribute]})

(def gpsDOP
  "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement."
  {:db/ident :exif/gpsDOP,
   :exif/tagNumber "11",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The GPS DOP (data degree of precision). An HDOP value is written during two-dimensional measurement, and PDOP during three-dimensional measurement.",
   :rdfs/label "GPSDOP",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsDOP :exif/exifAttribute]})

(def gpsDateStamp
  "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF"
  {:db/ident :exif/gpsDateStamp,
   :exif/tagNumber "29",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "date and time information relative to UTC (Coordinated Universal Time). The record format is \"YYYY:MM:DD\" while converted to W3C-DTF to use in RDF",
   :rdfs/label "GPSDateStamp",
   :rdfs/subPropertyOf [:exif/date
                        :exif/gpsInfo
                        :exif/gpsDateStamp
                        :dc11/date
                        :exif/exifAttribute]})

(def gpsDestBearing
  "The bearing to the destination point. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsDestBearing,
   :exif/tagNumber "24",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The bearing to the destination point. The range of values is from 0.00 to 359.99.",
   :rdfs/label "GPSDestBearing",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDestBearing :exif/exifAttribute]})

(def gpsDestBearingRef
  "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsDestBearingRef,
   :exif/tagNumber "23",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the reference used for giving the bearing to the destination point. 'T' denotes true direction and 'M' is magnetic direction.",
   :rdfs/label "GPSDestBearingRef",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDestBearingRef :exif/exifAttribute]})

(def gpsDestDistance
  "The distance to the destination point."
  {:db/ident           :exif/gpsDestDistance,
   :exif/tagNumber     "26",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The distance to the destination point.",
   :rdfs/label         "GPSDestDistance",
   :rdfs/subPropertyOf [:exif/gpsInfo
                        :exif/gpsDestDistance
                        :exif/exifAttribute]})

(def gpsDestDistanceRef
  "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots."
  {:db/ident :exif/gpsDestDistanceRef,
   :exif/tagNumber "25",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the unit used to express the distance to the destination point. 'K', 'M' and 'N' represent kilometers, miles and knots.",
   :rdfs/label "GPSDestDistanceRef",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDestDistanceRef :exif/exifAttribute]})

(def gpsDestLatitude
  "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLatitude,
   :exif/tagNumber "20",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Latitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.",
   :rdfs/label "GPSDestLatitude",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsDestLatitude :exif/exifAttribute]})

(def gpsDestLatitudeRef
  "Reference for latitude of destination"
  {:db/ident           :exif/gpsDestLatitudeRef,
   :exif/tagNumber     "19",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Reference for latitude of destination",
   :rdfs/label         "GPSDestLatitudeRef",
   :rdfs/subPropertyOf [:exif/gpsInfo
                        :exif/gpsDestLatitudeRef
                        :exif/exifAttribute]})

(def gpsDestLongitude
  "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsDestLongitude,
   :exif/tagNumber "22",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Longitude of destination, expressed as three values giving the degrees, minutes, and seconds, respectively.",
   :rdfs/label "GPSDestLongitude",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsDestLongitude :exif/exifAttribute]})

(def gpsDestLongitudeRef
  "Reference for longitude of destination"
  {:db/ident           :exif/gpsDestLongitudeRef,
   :exif/tagNumber     "21",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Reference for longitude of destination",
   :rdfs/label         "GPSDestLongitudeRef",
   :rdfs/subPropertyOf [:exif/gpsInfo
                        :exif/gpsDestLongitudeRef
                        :exif/exifAttribute]})

(def gpsDifferential
  "Indicates whether differential correction is applied to the GPS receiver."
  {:db/ident :exif/gpsDifferential,
   :exif/tagNumber "30",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates whether differential correction is applied to the GPS receiver.",
   :rdfs/label "GPSDifferential",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsDifferential :exif/exifAttribute]})

(def gpsImgDirection
  "The direction of the image when it was captured. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsImgDirection,
   :exif/tagNumber "17",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The direction of the image when it was captured. The range of values is from 0.00 to 359.99.",
   :rdfs/label "GPSImgDirection",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsImgDirection :exif/exifAttribute]})

(def gpsImgDirectionRef
  "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsImgDirectionRef,
   :exif/tagNumber "16",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The reference for giving the direction of the image when it is captured. 'T' denotes true direction and 'M' is magnetic direction.",
   :rdfs/label "GPSImgDirectionRef",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsImgDirectionRef :exif/exifAttribute]})

(def gpsInfo
  "An attribute relating to GPS information"
  {:db/ident           :exif/gpsInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to GPS information",
   :rdfs/label         "GPS Info",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/gpsInfo]})

(def gpsInfo_IFD_Pointer
  "GPS IFDへのポインタ A pointer to the GPS IFD, which is a set of tags for recording GPS information."
  {:db/ident :exif/gpsInfo_IFD_Pointer,
   :exif/tagNumber "34853",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["GPS IFDへのポインタ"
    "A pointer to the GPS IFD, which is a set of tags for recording GPS information."],
   :rdfs/label "GPSInfo IFD Pointer",
   :rdfs/subPropertyOf
   [:exif/ifdPointer :exif/gpsInfo_IFD_Pointer :exif/exifAttribute]})

(def gpsLatitude
  "緯度 The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsLatitude,
   :exif/tagNumber "2",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["緯度"
    "The latitude, expressed as three values giving the degrees, minutes, and seconds, respectively."],
   :rdfs/label "GPSLatitude",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsLatitude :exif/exifAttribute]})

(def gpsLatitudeRef
  "緯度の北緯もしくは南緯 Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude."
  {:db/ident :exif/gpsLatitudeRef,
   :exif/tagNumber "1",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["緯度の北緯もしくは南緯"
    "Indicates whether the latitude is north or south latitude. The ASCII value 'N' indicates north latitude, and 'S' is south latitude."],
   :rdfs/label "GPSLatitudeRef",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsLatitudeRef :exif/exifAttribute]})

(def gpsLongitude
  "経度 The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively."
  {:db/ident :exif/gpsLongitude,
   :exif/tagNumber "4",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["経度"
    "The longitude, expressed as three values giving the degrees, minutes, and seconds, respectively."],
   :rdfs/label "GPSLongitude",
   :rdfs/subPropertyOf
   [:exif/geo :exif/gpsInfo :exif/gpsLongitude :exif/exifAttribute]})

(def gpsLongitudeRef
  "経度の東経もしくは西経 Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude."
  {:db/ident :exif/gpsLongitudeRef,
   :exif/tagNumber "3",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["経度の東経もしくは西経"
    "Indicates whether the longitude is east or west longitude. ASCII 'E' indicates east longitude, and 'W' is west longitude."],
   :rdfs/label "GPSLongitudeRef",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsLongitudeRef :exif/exifAttribute]})

(def gpsMapDatum
  "測地系。日本なら'TOKYO'もしくは'WGS-84' The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded."
  {:db/ident :exif/gpsMapDatum,
   :exif/tagNumber "18",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["測地系。日本なら'TOKYO'もしくは'WGS-84'"
    "The geodetic survey data used by the GPS receiver. If the survey data is restricted to Japan, the value of this tag is 'TOKYO' or 'WGS-84'. If a GPS Info tag is recorded, it is strongly recommended that this tag be recorded."],
   :rdfs/label "GPSMapDatum",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsMapDatum :exif/exifAttribute]})

(def gpsMeasureMode
  "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress."
  {:db/ident :exif/gpsMeasureMode,
   :exif/tagNumber "10",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The GPS measurement mode. '2' means two-dimensional measurement and '3' means three-dimensional measurement is in progress.",
   :rdfs/label "GPSMeasureMode",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsMeasureMode :exif/exifAttribute]})

(def gpsProcessingMethod
  "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method."
  {:db/ident :exif/gpsProcessingMethod,
   :exif/tagNumber "27",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A character string recording the name of the method used for location finding. The first byte indicates the character code used, and this is followed by the name of the method.",
   :rdfs/label "GPSProcessingMethod",
   :rdfs/subPropertyOf
   [:exif/gpsInfo :exif/gpsProcessingMethod :exif/exifAttribute]})

(def gpsSatellites
  "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL."
  {:db/ident :exif/gpsSatellites,
   :exif/tagNumber "8",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The GPS satellites used for measurements. This tag can be used to describe the number of satellites, their ID number, angle of elevation, azimuth, SNR and other information in ASCII notation. The format is not specified. If the GPS receiver is incapable of taking measurements, value of the tag shall be set to NULL.",
   :rdfs/label "GPSSatellites",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsSatellites :exif/exifAttribute]})

(def gpsSpeed
  "The speed of GPS receiver movement."
  {:db/ident           :exif/gpsSpeed,
   :exif/tagNumber     "13",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The speed of GPS receiver movement.",
   :rdfs/label         "GPSSpeed",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsSpeed :exif/exifAttribute]})

(def gpsSpeedRef
  "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots."
  {:db/ident :exif/gpsSpeedRef,
   :exif/tagNumber "12",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The unit used to express the GPS receiver speed of movement. 'K' 'M' and 'N' represents kilometers per hour, miles per hour, and knots.",
   :rdfs/label "GPSSpeedRef",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsSpeedRef :exif/exifAttribute]})

(def gpsStatus
  "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability."
  {:db/ident :exif/gpsStatus,
   :exif/tagNumber "9",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The status of the GPS receiver when the image is recorded. 'A' means measurement is in progress, and 'V' means the measurement is Interoperability.",
   :rdfs/label "GPSStatus",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsStatus :exif/exifAttribute]})

(def gpsTimeStamp
  "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second."
  {:db/ident :exif/gpsTimeStamp,
   :exif/tagNumber "7",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The time as UTC (Coordinated Universal Time). TimeStamp is expressed as three RATIONAL values giving the hour, minute, and second.",
   :rdfs/label "GPSTimeStamp",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsTimeStamp :exif/exifAttribute]})

(def gpsTrack
  "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99."
  {:db/ident :exif/gpsTrack,
   :exif/tagNumber "15",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The direction of GPS receiver movement. The range of values is from 0.00 to 359.99.",
   :rdfs/label "GPSTrack",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsTrack :exif/exifAttribute]})

(def gpsTrackRef
  "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction."
  {:db/ident :exif/gpsTrackRef,
   :exif/tagNumber "14",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The reference for giving the direction of GPS receiver movement. 'T' denotes true direction and 'M' is magnetic direction.",
   :rdfs/label "GPSTrackRef",
   :rdfs/subPropertyOf [:exif/gpsInfo :exif/gpsTrackRef :exif/exifAttribute]})

(def gpsVersionID
  "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present."
  {:db/ident :exif/gpsVersionID,
   :exif/tagNumber "0",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The version of GPSInfoIFD. The version is given as 2.2.0.0. This tag is mandatory when GPSInfo tag is present.",
   :rdfs/label "GPSVersionID",
   :rdfs/subPropertyOf
   [:exif/versionInfo :exif/gpsInfo :exif/gpsVersionID :exif/exifAttribute]})

(def height
  "Height of an object"
  {:db/ident           :exif/height,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Height of an object",
   :rdfs/label         "Height",
   :rdfs/subPropertyOf [:exif/length :exif/height]})

(def ifdPointer
  "A tag that refers a child IFD"
  {:db/ident           :exif/ifdPointer,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A tag that refers a child IFD",
   :rdfs/label         "IFD Pointer",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/ifdPointer]})

(def imageConfig
  "An attribute relating to Image Configuration"
  {:db/ident           :exif/imageConfig,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to Image Configuration",
   :rdfs/label         "Image Config",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/imageConfig]})

(def imageDataCharacter
  "An attribute relating to image data characteristics"
  {:db/ident           :exif/imageDataCharacter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to image data characteristics",
   :rdfs/label         "Image Data Character",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/imageDataCharacter]})

(def imageDataStruct
  "An attribute relating to image data structure"
  {:db/ident           :exif/imageDataStruct,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to image data structure",
   :rdfs/label         "Image Data Structure",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/imageDataStruct]})

(def imageDescription
  "この画像についての説明。漢字等の2バイト文字の使用は禁止 A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used."
  {:db/ident :exif/imageDescription,
   :exif/tagNumber "270",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["この画像についての説明。漢字等の2バイト文字の使用は禁止"
    "A character string giving the title of the image. It may be a comment such as \"1988 company picnic\" or the like. Two-byte character codes cannot be used. When a 2-byte code is necessary, the Exif Private tag UserComment is to be used."],
   :rdfs/label "ImageDescription",
   :rdfs/subPropertyOf
   [:dc11/title :exif/exifAttribute :exif/imageDescription]})

(def imageLength
  "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used."
  {:db/ident :exif/imageLength,
   :exif/tagNumber "257",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Image height. The number of rows of image data. In JPEG compressed data a JPEG marker is used.",
   :rdfs/label "ImageLength",
   :rdfs/subPropertyOf [:exif/height
                        :exif/imageDataStruct
                        :exif/imageLength
                        :exif/length
                        :exif/exifAttribute]})

(def imageUniqueID
  "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length."
  {:db/ident :exif/imageUniqueID,
   :exif/tagNumber "42016",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An identifier assigned uniquely to each image. It is recorded as an ASCII string equivalent to hexadecimal notation and 128-bit fixed length.",
   :rdfs/label "ImageUniqueID",
   :rdfs/subPropertyOf
   [:dc11/identifier :exif/exifAttribute :exif/imageUniqueID]})

(def imageWidth
  "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/imageWidth,
   :exif/tagNumber "256",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Image width. The number of columns of image data, equal to the number of pixels per row. In JPEG compressed data a JPEG marker is used instead of this tag.",
   :rdfs/label "ImageWidth",
   :rdfs/subPropertyOf [:exif/width
                        :exif/imageDataStruct
                        :exif/imageWidth
                        :exif/length
                        :exif/exifAttribute]})

(def interopInfo
  "An attribute relating to Interoperability. Tags stored in Interoperability IFD may be defined dependently to each Interoperability rule."
  {:db/ident :exif/interopInfo,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "An attribute relating to Interoperability. Tags stored in\nInteroperability IFD may be defined dependently to each Interoperability rule.",
   :rdfs/label "Interoperability Info",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/interopInfo]})

(def interoperabilityIndex
  "メイン画像のInteroperability IFDで、データの内容がExifR98 v1.0準拠の場合は、'R98'の文字列。サムネィル画像のInteroperability IFDの場合は、'THM'の文字列 Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System."
  {:db/ident :exif/interoperabilityIndex,
   :exif/tagNumber "1",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["メイン画像のInteroperability IFDで、データの内容がExifR98 v1.0準拠の場合は、'R98'の文字列。サムネィル画像のInteroperability IFDの場合は、'THM'の文字列"
    "Indicates the identification of the Interoperability rule. 'R98' = conforming to R98 file specification of Recommended Exif Interoperability Rules (ExifR98) or to DCF basic file stipulated by Design Rule for Camera File System. 'THM' = conforming to DCF thumbnail file stipulated by Design rule for Camera File System."],
   :rdfs/label "InteroperabilityIndex",
   :rdfs/subPropertyOf
   [:exif/interopInfo :exif/interoperabilityIndex :exif/exifAttribute]})

(def interoperabilityVersion
  "データの内容がExifR98 v1.0準拠の場合は、'0100'の文字列。 Interoperability Version"
  {:db/ident           :exif/interoperabilityVersion,
   :exif/tagNumber     "2",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["データの内容がExifR98 v1.0準拠の場合は、'0100'の文字列。"
                        "Interoperability Version"],
   :rdfs/label         "InteroperabilityVersion",
   :rdfs/subPropertyOf [:exif/interopInfo
                        :exif/interoperabilityVersion
                        :exif/exifAttribute]})

(def interoperability_IFD_Pointer
  "Interoperability IFDへのポインタ A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability"
  {:db/ident :exif/interoperability_IFD_Pointer,
   :exif/tagNumber "40965",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["Interoperability IFDへのポインタ"
    "A pointer to the Interoperability IFD, which is composed of tags storing the information to ensure the Interoperability"],
   :rdfs/label "Interoperability IFD Pointer",
   :rdfs/subPropertyOf
   [:exif/ifdPointer :exif/interoperability_IFD_Pointer :exif/exifAttribute]})

(def isoSpeedRatings
  "CCD感度の銀塩フィルム換算値 Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232."
  {:db/ident :exif/isoSpeedRatings,
   :exif/tagNumber "34855",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["CCD感度の銀塩フィルム換算値"
    "Indicates the ISO Speed and ISO Latitude of the camera or input device as specified in ISO 12232."],
   :rdfs/label "ISOSpeedRatings",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/isoSpeedRatings :exif/exifAttribute]})

(def jpegInterchangeFormat
  "圧縮されたサムネイルへのオフセット The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data."
  {:db/ident :exif/jpegInterchangeFormat,
   :exif/tagNumber "513",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["圧縮されたサムネイルへのオフセット"
    "The offset to the start byte (SOI) of JPEG compressed thumbnail data. This is not used for primary image JPEG data."],
   :rdfs/label "JPEGInterchangeFormat",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/jpegInterchangeFormat :exif/exifAttribute]})

(def jpegInterchangeFormatLength
  "圧縮されたサムネイルのサイズ The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data."
  {:db/ident :exif/jpegInterchangeFormatLength,
   :exif/tagNumber "514",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["圧縮されたサムネイルのサイズ"
    "The number of bytes of JPEG compressed thumbnail data. This is not used for primary image JPEG data."],
   :rdfs/label "JPEGInterchangeFormatLength",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/jpegInterchangeFormatLength :exif/exifAttribute]})

(def length
  "Length of an object. Could be a subProperty of other general schema."
  {:db/ident :exif/length,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Length of an object. Could be a subProperty of other general schema.",
   :rdfs/label "Length",
   :rdfs/subPropertyOf :exif/length})

(def lightSource
  "光源。これはマニュアルでホワイトバランスを設定した場合のモード値となる Light source such as Daylight, Tungsten, Flash etc."
  {:db/ident           :exif/lightSource,
   :exif/tagNumber     "37384",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["光源。これはマニュアルでホワイトバランスを設定した場合のモード値となる"
                        "Light source such as Daylight, Tungsten, Flash etc."],
   :rdfs/label         "LightSource",
   :rdfs/subPropertyOf [:exif/pictTaking
                        :exif/lightSource
                        :exif/exifAttribute]})

(def make
  "カメラのメーカー名。DCFでは必須 Manufacturer of image input equipment"
  {:db/ident           :exif/make,
   :exif/tagNumber     "271",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["カメラのメーカー名。DCFでは必須"
                        "Manufacturer of image input equipment"],
   :rdfs/label         "Make",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute :exif/make]})

(def makerNote
  "カメラの内部情報等、メーカー依存データ Manufacturer notes"
  {:db/ident           :exif/makerNote,
   :exif/tagNumber     "37500",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["カメラの内部情報等、メーカー依存データ" "Manufacturer notes"],
   :rdfs/label         "MakerNote",
   :rdfs/subPropertyOf [:exif/userInfo :exif/makerNote :exif/exifAttribute]})

(def maxApertureValue
  "レンズの開放F値。ApertureValue同様、ルート2のベキ乗を取ると通常の絞り値に換算できる The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range."
  {:db/ident :exif/maxApertureValue,
   :exif/tagNumber "37381",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["レンズの開放F値。ApertureValue同様、ルート2のベキ乗を取ると通常の絞り値に換算できる"
    "The smallest F number of the lens. The unit is the APEX value. Ordinarily it is given in the range of 00.00 to 99.99, but it is not limited to this range."],
   :rdfs/label "MaxApertureValue",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/maxApertureValue :exif/exifAttribute]})

(def meter
  "A length with unit of meter"
  {:db/ident           :exif/meter,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A length with unit of meter",
   :rdfs/label         "Meter",
   :rdfs/subPropertyOf [:exif/length :exif/meter]})

(def meteringMode
  "自動露出の測光モード Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc."
  {:db/ident :exif/meteringMode,
   :exif/tagNumber "37383",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["自動露出の測光モード"
    "Metering mode, such as CenterWeightedAverage, Spot, MultiSpot,Pattern, Partial etc."],
   :rdfs/label "MeteringMode",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/meteringMode :exif/exifAttribute]})

(def mm
  "A length with unit of mm"
  {:db/ident           :exif/mm,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A length with unit of mm",
   :rdfs/label         "Milimeter",
   :rdfs/subPropertyOf [:exif/length :exif/mm]})

(def model
  "カメラの機種名。DCFでは必須 Model of image input equipment"
  {:db/ident           :exif/model,
   :exif/tagNumber     "272",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["カメラの機種名。DCFでは必須" "Model of image input equipment"],
   :rdfs/label         "Model",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute :exif/model]})

(def oecf
  "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values."
  {:db/ident :exif/oecf,
   :exif/tagNumber "34856",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the Opto-Electric Conversion Function (OECF) specified in ISO 14524. OECF is the relationship between the camera optical input and the image values.",
   :rdfs/label "OECF",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/oecf :exif/exifAttribute]})

(def orientation
  "画像データがどこ(top-leftなど）を起点として、どの向きで格納されているか The image orientation viewed in terms of rows and columns."
  {:db/ident :exif/orientation,
   :exif/tagNumber "274",
   :rdf/type :rdf/Property,
   :rdfs/comment ["画像データがどこ(top-leftなど）を起点として、どの向きで格納されているか"
                  "The image orientation viewed in terms of rows and columns."],
   :rdfs/label "Orientation",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/orientation :exif/exifAttribute]})

(def photometricInterpretation
  "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/photometricInterpretation,
   :exif/tagNumber "262",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Pixel composition. In JPEG compressed data a JPEG marker is used instead of this tag.",
   :rdfs/label "PhotometricInterpretation",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/photometricInterpretation :exif/exifAttribute]})

(def pictTaking
  "An attribute relating to Picture-Taking Conditions"
  {:db/ident           :exif/pictTaking,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to Picture-Taking Conditions",
   :rdfs/label         "PictTaking",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/pictTaking]})

(def pimBrightness
  "Brightness info for print image matching"
  {:db/ident           :exif/pimBrightness,
   :exif/tagNumber     "10",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Brightness info for print image matching",
   :rdfs/label         "PrintIM Brightness",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimBrightness :exif/exifAttribute]})

(def pimColorBalance
  "ColorBalance info for print image matching"
  {:db/ident           :exif/pimColorBalance,
   :exif/tagNumber     "11",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "ColorBalance info for print image matching",
   :rdfs/label         "PrintIM ColorBalance",
   :rdfs/subPropertyOf [:exif/pimInfo
                        :exif/pimColorBalance
                        :exif/exifAttribute]})

(def pimContrast
  "Contrast info for print image matching"
  {:db/ident           :exif/pimContrast,
   :exif/tagNumber     "9",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Contrast info for print image matching",
   :rdfs/label         "PrintIM Contrast",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimContrast :exif/exifAttribute]})

(def pimInfo
  "An attribute relating to print image matching"
  {:db/ident           :exif/pimInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to print image matching",
   :rdfs/label         "PIM Info",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/pimInfo]})

(def pimSaturation
  "Saturation info for print image matching"
  {:db/ident           :exif/pimSaturation,
   :exif/tagNumber     "12",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Saturation info for print image matching",
   :rdfs/label         "PrintIM Saturation",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimSaturation :exif/exifAttribute]})

(def pimSharpness
  "Sharpness info for print image matching"
  {:db/ident           :exif/pimSharpness,
   :exif/tagNumber     "13",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Sharpness info for print image matching",
   :rdfs/label         "PrintIM Sharpness",
   :rdfs/subPropertyOf [:exif/pimInfo :exif/pimSharpness :exif/exifAttribute]})

(def pixelXDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file."
  {:db/ident :exif/pixelXDimension,
   :exif/tagNumber "40962",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Information specific to compressed data. When a compressed file is recorded, the valid width of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file.",
   :rdfs/label "PixelXDimension",
   :rdfs/subPropertyOf [:exif/width
                        :exif/imageConfig
                        :exif/pixelXDimension
                        :exif/length
                        :exif/exifAttribute]})

(def pixelYDimension
  "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF."
  {:db/ident :exif/pixelYDimension,
   :exif/tagNumber "40963",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Information specific to compressed data. When a compressed file is recorded, the valid height of the meaningful image shall be recorded in this tag, whether or not there is padding data or a restart marker. This tag should not exist in an uncompressed file. Since data padding is unnecessary in the vertical direction, the number of lines recorded in this valid image height tag will in fact be the same as that recorded in the SOF.",
   :rdfs/label "PixelYDimension",
   :rdfs/subPropertyOf [:exif/height
                        :exif/imageConfig
                        :exif/pixelYDimension
                        :exif/length
                        :exif/exifAttribute]})

(def planarConfiguration
  "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed."
  {:db/ident :exif/planarConfiguration,
   :exif/tagNumber "284",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates whether pixel components are recorded in chunky or planar format. In JPEG compressed files a JPEG marker is used instead of this tag. If this field does not exist, the TIFF default of 1 (chunky) is assumed.",
   :rdfs/label "PlanarConfiguration",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/planarConfiguration :exif/exifAttribute]})

(def primaryChromaticities
  "原色の色度。CCIR REcommendation 709 primariesを使っている場合は、'640/1000,330/1000,300/1000,600/1000,150/1000,60/1000'という値。通常はColorSpaceタグがあるので不要 The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/primaryChromaticities,
   :exif/tagNumber "319",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["原色の色度。CCIR REcommendation 709 primariesを使っている場合は、'640/1000,330/1000,300/1000,600/1000,150/1000,60/1000'という値。通常はColorSpaceタグがあるので不要"
    "The chromaticity of the three primary colors of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."],
   :rdfs/label "PrimaryChromaticities",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/primaryChromaticities :exif/exifAttribute]})

(def printImageMatching_IFD_Pointer
  "A pointer to the print image matching IFD"
  {:db/ident           :exif/printImageMatching_IFD_Pointer,
   :exif/tagNumber     "50341",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "A pointer to the print image matching IFD",
   :rdfs/label         "PrintImageMatching IFD Pointer",
   :rdfs/subPropertyOf [:exif/ifdPointer
                        :exif/printImageMatching_IFD_Pointer
                        :exif/exifAttribute]})

(def recOffset
  "An attribute relating to recording offset"
  {:db/ident           :exif/recOffset,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to recording offset",
   :rdfs/label         "Recording Offset",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/recOffset]})

(def referenceBlackWhite
  "画像情報の黒点・白点値。YCbCr形式の場合、最初の２つの値がY(輝度)の黒点・白点、次がCb、最後がCrとなり、デフォルト値は'0,255,0,128,0,128'。RGB形式の場合はR、G、Bの順で黒点・白点値が並んでおり、デフォルト値は'0,255,0,255,0,255'。 The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions."
  {:db/ident :exif/referenceBlackWhite,
   :exif/tagNumber "532",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像情報の黒点・白点値。YCbCr形式の場合、最初の２つの値がY(輝度)の黒点・白点、次がCb、最後がCrとなり、デフォルト値は'0,255,0,128,0,128'。RGB形式の場合はR、G、Bの順で黒点・白点値が並んでおり、デフォルト値は'0,255,0,255,0,255'。"
    "The reference black point value and reference white point value. The color space is declared in a color space information tag, with the default being the value that gives the optimal image characteristics Interoperability these conditions."],
   :rdfs/label "ReferenceBlackWhite",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/referenceBlackWhite :exif/exifAttribute]})

(def relatedFile
  "Tag Relating to Related File Information"
  {:db/ident           :exif/relatedFile,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Tag Relating to Related File Information",
   :rdfs/label         "Related File",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/relatedFile]})

(def relatedImageFileFormat
  "画像フォーマットを'Exif JPEG Ver. 2.1'などの文字列で示す。通常はサムネィル画像に使う Related image file format"
  {:db/ident           :exif/relatedImageFileFormat,
   :exif/tagNumber     "4096",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["画像フォーマットを'Exif JPEG Ver. 2.1'などの文字列で示す。通常はサムネィル画像に使う"
                        "Related image file format"],
   :rdfs/label         "RelatedImageFileFormat",
   :rdfs/subPropertyOf [:exif/interopInfo
                        :exif/relatedImageFileFormat
                        :exif/exifAttribute]})

(def relatedImageLength
  "画像高。通常はサムネイル画像のInteroperability IFDに使う Related image length"
  {:db/ident           :exif/relatedImageLength,
   :exif/tagNumber     "4098",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["画像高。通常はサムネイル画像のInteroperability IFDに使う"
                        "Related image length"],
   :rdfs/label         "RelatedImageLength",
   :rdfs/subPropertyOf [:exif/height
                        :exif/interopInfo
                        :exif/relatedImageLength
                        :exif/length
                        :exif/exifAttribute]})

(def relatedImageWidth
  "画像幅。通常はサムネイル画像のInteroperability IFDに使う Related image width"
  {:db/ident           :exif/relatedImageWidth,
   :exif/tagNumber     "4097",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["画像幅。通常はサムネイル画像のInteroperability IFDに使う"
                        "Related image width"],
   :rdfs/label         "RelatedImageWidth",
   :rdfs/subPropertyOf [:exif/width
                        :exif/interopInfo
                        :exif/relatedImageWidth
                        :exif/length
                        :exif/exifAttribute]})

(def relatedSoundFile
  "画像と一緒に音声録音できる機種の場合に、音声ファイルの名前 Related audio file"
  {:db/ident           :exif/relatedSoundFile,
   :exif/tagNumber     "40964",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["画像と一緒に音声録音できる機種の場合に、音声ファイルの名前" "Related audio file"],
   :rdfs/label         "RelatedSoundFile",
   :rdfs/subPropertyOf [:exif/relatedFile
                        :exif/relatedSoundFile
                        :exif/exifAttribute]})

(def resolution
  "a rational number representing a resolution. Could be a subProperty of other general schema."
  {:db/ident :exif/resolution,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "a rational number representing a resolution. Could be a subProperty of other general schema.",
   :rdfs/label "Resolution",
   :rdfs/subPropertyOf :exif/resolution})

(def resolutionUnit
  "XResolution/YResolutionの解像度の単位 The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated."
  {:db/ident :exif/resolutionUnit,
   :exif/tagNumber "296",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["XResolution/YResolutionの解像度の単位"
    "The unit for measuring XResolution and YResolution. The same unit is used for both XResolution and YResolution. If the image resolution in unknown, 2 (inches) is designated."],
   :rdfs/label "ResolutionUnit",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/resolutionUnit :exif/exifAttribute]})

(def rowsPerStrip
  "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/rowsPerStrip,
   :exif/tagNumber "278",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The number of rows per strip. This is the number of rows in the image of one strip when an image is divided into strips. With JPEG compressed data this designation is not needed and is omitted.",
   :rdfs/label "RowsPerStrip",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/rowsPerStrip :exif/exifAttribute]})

(def samplesPerPixel
  "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/samplesPerPixel,
   :exif/tagNumber "277",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The number of components per pixel. Since this standard applies to RGB and YCbCr images, the value set for this tag is 3. In JPEG compressed data a JPEG marker is used instead of this tag.",
   :rdfs/label "SamplesPerPixel",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/samplesPerPixel :exif/exifAttribute]})

(def saturation
  "The direction of saturation processing applied by the camera when the image was shot."
  {:db/ident :exif/saturation,
   :exif/tagNumber "41993",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The direction of saturation processing applied by the camera when the image was shot.",
   :rdfs/label "Saturation",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/saturation :exif/exifAttribute]})

(def sceneCaptureType
  "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag."
  {:db/ident :exif/sceneCaptureType,
   :exif/tagNumber "41990",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The type of scene that was shot. It can also be used to record the mode in which the image was shot, such as Landscape, Portrait etc. Note that this differs from the scene type (SceneType) tag.",
   :rdfs/label "SceneCaptureType",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/sceneCaptureType :exif/exifAttribute]})

(def sceneType
  "画像がどうやって撮られたか。デジカメの場合は通常1=A directly photographed image The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed."
  {:db/ident :exif/sceneType,
   :exif/tagNumber "41729",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像がどうやって撮られたか。デジカメの場合は通常1=A directly photographed image"
    "The type of scene. If a DSC recorded the image, this tag value shall always be set to 1, indicating that the image was directly photographed."],
   :rdfs/label "SceneType",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/sceneType :exif/exifAttribute]})

(def seconds
  "a mesurement of time length with unit of second"
  {:db/ident           :exif/seconds,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "a mesurement of time length with unit of second",
   :rdfs/label         "Seconds",
   :rdfs/subPropertyOf :exif/seconds})

(def sensingMethod
  "イメージセンサーの形式。One-chip color area sensor、Color sequential area sensor、Trilinear sensorなど The image sensor type on the camera or input device, such as One-chip color area sensor etc."
  {:db/ident :exif/sensingMethod,
   :exif/tagNumber "41495",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["イメージセンサーの形式。One-chip color area sensor、Color sequential area sensor、Trilinear sensorなど"
    "The image sensor type on the camera or input device, such as One-chip color area sensor etc."],
   :rdfs/label "SensingMethod",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/sensingMethod :exif/exifAttribute]})

(def sharpness
  "The direction of sharpness processing applied by the camera when the image was shot."
  {:db/ident :exif/sharpness,
   :exif/tagNumber "41994",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The direction of sharpness processing applied by the camera when the image was shot.",
   :rdfs/label "Sharpness",
   :rdfs/subPropertyOf [:exif/pictTaking :exif/sharpness :exif/exifAttribute]})

(def shutterSpeedValue
  "シャッター速度（APEX値）。この値の2のベキ乗をとって逆数にすると、通常のシャッター速度表示になる。例えば'4'の場合だと1/(2^4)=1/16秒 Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting"
  {:db/ident :exif/shutterSpeedValue,
   :exif/tagNumber "37377",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["シャッター速度（APEX値）。この値の2のベキ乗をとって逆数にすると、通常のシャッター速度表示になる。例えば'4'の場合だと1/(2^4)=1/16秒"
    "Shutter speed. The unit is the APEX (Additive System of Photographic Exposure) setting"],
   :rdfs/label "ShutterSpeedValue",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/shutterSpeedValue :exif/exifAttribute]})

(def software
  "デジカメ（もしくは入力機器）の内蔵ソフトウェア/ファームウェアの名称とバージョン The name and version of the software or firmware of the camera or image input device used to generate the image."
  {:db/ident :exif/software,
   :exif/tagNumber "305",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["デジカメ（もしくは入力機器）の内蔵ソフトウェア/ファームウェアの名称とバージョン"
    "The name and version of the software or firmware of the camera or image input device used to generate the image."],
   :rdfs/label "Software",
   :rdfs/subPropertyOf [:rdfs/label :exif/exifAttribute :exif/software]})

(def spatialFrequencyResponse
  "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233."
  {:db/ident :exif/spatialFrequencyResponse,
   :exif/tagNumber "41484",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "This tag records the camera or input device spatial frequency table and SFR values in the direction of image width, image height, and diagonal direction, as specified in ISO 12233.",
   :rdfs/label "SpatialFrequencyResponse",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/spatialFrequencyResponse :exif/exifAttribute]})

(def spectralSensitivity
  "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee."
  {:db/ident :exif/spectralSensitivity,
   :exif/tagNumber "34852",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "Indicates the spectral sensitivity of each channel of the camera used. The tag value is an ASCII string compatible with the standard developed by the ASTM Technical committee.",
   :rdfs/label "SpectralSensitivity",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/spectralSensitivity :exif/exifAttribute]})

(def stripByteCounts
  "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripByteCounts,
   :exif/tagNumber "279",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The total number of bytes in each strip. With JPEG compressed data this designation is not needed and is omitted.",
   :rdfs/label "StripByteCounts",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/stripByteCounts :exif/exifAttribute]})

(def stripOffsets
  "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted."
  {:db/ident :exif/stripOffsets,
   :exif/tagNumber "273",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "For each strip, the byte offset of that strip. With JPEG compressed data this designation is not needed and is omitted.",
   :rdfs/label "StripOffsets",
   :rdfs/subPropertyOf
   [:exif/recOffset :exif/stripOffsets :exif/exifAttribute]})

(def subSecTime
  "DateTime subseconds"
  {:db/ident           :exif/subSecTime,
   :exif/tagNumber     "37520",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "DateTime subseconds",
   :rdfs/label         "SubSecTime",
   :rdfs/subPropertyOf [:exif/subsecond
                        :exif/dateAndOrTime
                        :exif/subSecTime
                        :exif/exifAttribute]})

(def subSecTimeDigitized
  "DateTimeDigitized subseconds"
  {:db/ident           :exif/subSecTimeDigitized,
   :exif/tagNumber     "37522",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "DateTimeDigitized subseconds",
   :rdfs/label         "SubSecTimeDigitized",
   :rdfs/subPropertyOf [:exif/subsecond
                        :exif/dateAndOrTime
                        :exif/subSecTimeDigitized
                        :exif/exifAttribute]})

(def subSecTimeOriginal
  "DateTimeOriginal subseconds"
  {:db/ident           :exif/subSecTimeOriginal,
   :exif/tagNumber     "37521",
   :rdf/type           :rdf/Property,
   :rdfs/comment       "DateTimeOriginal subseconds",
   :rdfs/label         "SubSecTimeOriginal",
   :rdfs/subPropertyOf [:exif/subsecond
                        :exif/dateAndOrTime
                        :exif/subSecTimeOriginal
                        :exif/exifAttribute]})

(def subjectArea
  "画面中の主たる被写体の位置。2値によるXY座標、3値による円、4値による長方形座標の3通りの示し方がある The location and area of the main subject in the overall scene."
  {:db/ident :exif/subjectArea,
   :exif/tagNumber "37396",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画面中の主たる被写体の位置。2値によるXY座標、3値による円、4値による長方形座標の3通りの示し方がある"
    "The location and area of the main subject in the overall scene."],
   :rdfs/label "SubjectArea",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/subjectArea :exif/exifAttribute]})

(def subjectDistance
  "被写体までの距離。単位はm The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated."
  {:db/ident :exif/subjectDistance,
   :exif/tagNumber "37382",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["被写体までの距離。単位はm"
    "The distance to the subject, given in meters. Note that if the numerator of the recorded value is FFFFFFFF.H, Infinity shall be indicated; and if the numerator is 0, Distance unknown shall be indicated."],
   :rdfs/label "SubjectDistance",
   :rdfs/subPropertyOf [:exif/meter
                        :exif/pictTaking
                        :exif/subjectDistance
                        :exif/length
                        :exif/exifAttribute]})

(def subjectDistanceRange
  "The distance to the subject, such as Macro, Close View or Distant View."
  {:db/ident :exif/subjectDistanceRange,
   :exif/tagNumber "41996",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The distance to the subject, such as Macro, Close View or Distant View.",
   :rdfs/label "SubjectDistanceRange",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/subjectDistanceRange :exif/exifAttribute]})

(def subjectLocation
  "画面中の主要被写体のXY座標 The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number."
  {:db/ident :exif/subjectLocation,
   :exif/tagNumber "41492",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画面中の主要被写体のXY座標"
    "The location of the main subject in the scene. The value of this tag represents the pixel at the center of the main subject relative to the left edge, prior to rotation processing as per the Rotation tag. The first value indicates the X column number and second indicates the Y row number."],
   :rdfs/label "SubjectLocation",
   :rdfs/subPropertyOf
   [:exif/pictTaking :exif/subjectLocation :exif/exifAttribute]})

(def subsecond
  {:db/ident :exif/subsecond,
   :rdf/type :rdf/Property,
   :rdfs/subPropertyOf :exif/subsecond})

(def subseconds
  "A tag used to record fractions of seconds for a date property"
  {:db/ident :exif/subseconds,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A tag used to record fractions of seconds for a date property",
   :rdfs/label "Subseconds",
   :rdfs/subPropertyOf :exif/subseconds})

(def tag_number
  "The Exif tag number"
  {:db/ident           :exif/tag_number,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "The Exif tag number",
   :rdfs/label         "Tag number",
   :rdfs/subPropertyOf [:dc11/identifier :exif/tag_number]})

(def tagid
  "The Exif tag number with context prefix, such as IFD type or maker name"
  {:db/ident :exif/tagid,
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The Exif tag number with context prefix, such as IFD type or maker name",
   :rdfs/label "Tag ID",
   :rdfs/subPropertyOf [:exif/tag_number :exif/tagid :dc11/identifier]})

(def transferFunction
  "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/transferFunction,
   :exif/tagNumber "301",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "A transfer function for the image, described in tabular style. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace).",
   :rdfs/label "TransferFunction",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/transferFunction :exif/exifAttribute]})

(def userComment
  "ユーザーコメント。ImageDescriptionタグと違って、こちらはJIS2バイトコード、Unicode等での記述が許されており、最初の8バイトが文字コード A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area."
  {:db/ident :exif/userComment,
   :exif/tagNumber "37510",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["ユーザーコメント。ImageDescriptionタグと違って、こちらはJIS2バイトコード、Unicode等での記述が許されており、最初の8バイトが文字コード"
    "A tag for Exif users to write keywords or comments on the image besides those in ImageDescription, and without the character code limitations of the ImageDescription tag. The character code used in the UserComment tag is identified based on an ID code in a fixed 8-byte area at the start of the tag data area."],
   :rdfs/label "UserComment",
   :rdfs/subPropertyOf [:exif/userInfo :exif/userComment :exif/exifAttribute]})

(def userInfo
  "An attribute relating to User Information"
  {:db/ident           :exif/userInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to User Information",
   :rdfs/label         "User Info",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/userInfo]})

(def versionInfo
  "An attribute relating to Version"
  {:db/ident           :exif/versionInfo,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "An attribute relating to Version",
   :rdfs/label         "Version Info",
   :rdfs/subPropertyOf [:exif/exifAttribute :exif/versionInfo]})

(def whiteBalance
  "ホワイトバランスのモード The white balance mode set when the image was shot."
  {:db/ident           :exif/whiteBalance,
   :exif/tagNumber     "41987",
   :rdf/type           :rdf/Property,
   :rdfs/comment       ["ホワイトバランスのモード"
                        "The white balance mode set when the image was shot."],
   :rdfs/label         "WhiteBalance",
   :rdfs/subPropertyOf [:exif/pictTaking
                        :exif/whiteBalance
                        :exif/exifAttribute]})

(def whitePoint
  "白点の色度。CIE Standard Illuminant D65(いわゆる昼光色の世界標準値)を使っていれば、'3127/10000,3290/10000'という値。通常はColorSpaceタグがあるので不要 The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."
  {:db/ident :exif/whitePoint,
   :exif/tagNumber "318",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["白点の色度。CIE Standard Illuminant D65(いわゆる昼光色の世界標準値)を使っていれば、'3127/10000,3290/10000'という値。通常はColorSpaceタグがあるので不要"
    "The chromaticity of the white point of the image. Normally this tag is not necessary, since color space is specified in the color space information tag (ColorSpace)."],
   :rdfs/label "WhitePoint",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/whitePoint :exif/exifAttribute]})

(def width
  "Width of an object"
  {:db/ident           :exif/width,
   :rdf/type           :rdf/Property,
   :rdfs/comment       "Width of an object",
   :rdfs/label         "Width",
   :rdfs/subPropertyOf [:exif/length :exif/width]})

(def xResolution
  "画像の表示・印刷時の水平解像度 The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated."
  {:db/ident :exif/xResolution,
   :exif/tagNumber "282",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像の表示・印刷時の水平解像度"
    "The number of pixels per ResolutionUnit in the ImageWidth direction. When the image resolution is unknown, 72 [dpi] is designated."],
   :rdfs/label "XResolution",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/imageDataStruct
                        :exif/xResolution
                        :exif/exifAttribute]})

(def yCbCrCoefficients
  "RGB形式からYCbCr形式に変換するための3つの係数。通常は0.299、0.587、0.114という値 The matrix coefficients for transformation from RGB to YCbCr image data."
  {:db/ident :exif/yCbCrCoefficients,
   :exif/tagNumber "529",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["RGB形式からYCbCr形式に変換するための3つの係数。通常は0.299、0.587、0.114という値"
    "The matrix coefficients for transformation from RGB to YCbCr image data."],
   :rdfs/label "YCbCrCoefficients",
   :rdfs/subPropertyOf
   [:exif/imageDataCharacter :exif/yCbCrCoefficients :exif/exifAttribute]})

(def yCbCrPositioning
  "色情報のサンプリングを間引きしている場合に、色情報のサンプルポイントがどこになるか。1='centered'なら点集合の中央、2＝'co-sited'なら点集合の原点 The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data."
  {:db/ident :exif/yCbCrPositioning,
   :exif/tagNumber "531",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["色情報のサンプリングを間引きしている場合に、色情報のサンプルポイントがどこになるか。1='centered'なら点集合の中央、2＝'co-sited'なら点集合の原点"
    "The position of chrominance components in relation to the luminance component. This field is designated only for JPEG compressed data or uncompressed YCbCr data."],
   :rdfs/label "YCbCrPositioning",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/yCbCrPositioning :exif/exifAttribute]})

(def yCbCrSubSampling
  "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag."
  {:db/ident :exif/yCbCrSubSampling,
   :exif/tagNumber "530",
   :rdf/type :rdf/Property,
   :rdfs/comment
   "The sampling ratio of chrominance components in relation to the luminance component. In JPEG compressed data a JPEG marker is used instead of this tag.",
   :rdfs/label "YCbCrSubSampling",
   :rdfs/subPropertyOf
   [:exif/imageDataStruct :exif/yCbCrSubSampling :exif/exifAttribute]})

(def yResolution
  "画像の表示・印刷時の垂直解像度 The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated."
  {:db/ident :exif/yResolution,
   :exif/tagNumber "283",
   :rdf/type :rdf/Property,
   :rdfs/comment
   ["画像の表示・印刷時の垂直解像度"
    "The number of pixels per ResolutionUnit in the ImageLength direction. The same value as XResolution is designated."],
   :rdfs/label "YResolution",
   :rdfs/subPropertyOf [:exif/resolution
                        :exif/imageDataStruct
                        :exif/yResolution
                        :exif/exifAttribute]})